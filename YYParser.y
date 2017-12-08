%{
import java.io.*;
import java.util.ArrayList;
%}

%token <EVal> COMMENT FLOAT_KW INT_KW BOOLEAN_KW CHAR_KW AKULAD_BAZ_KW AKULAD_BASTE_KW 
ADD_KW SWITCH_KW END_KW DEFAULT_KW BREAK_KW 
RETURN_KW COMMA PROGRAM_KW STRUCT_KW CONSTANT_KW IF_KW THEN_KW ELSE_KW AND_KW OR_KW 
NOT_KW WHILE_KW NOGHTE_VIRGUL ADAD SHENASE HARFE_SABET 
KEY_KW MORE_THAN_KW NOGHTE_KW MULTIPLY_KW BRACKET_BASTE_KW BRACKET_BAZ_KW PARANTHESIS_BASTE_KW PARANTHESIS_BAZ_KW
TRUE_KW QUESTION_KW EQUAL_EQUAL_KW EQUAL_KW DEVIDE_KW DEVIDE_EQUAL_KW OR_ELSE_KW FALSE_KW AND_THEN_KW MINUS_KW DONOGHTE_KW LESS_EQUAL_KW
MOD_KW LESS_THAN_KW MORE_EQUAL_KW 
PLUS_EQUAL_KW PLUS_PLUS_KW MINUS_MINUS_KW MINUS_EQUAL_KW MULTIPLY_EQUAL_KW 
ADAD_ASHARI

%type <EVal> saved_boolean ebarat ebarateSade ebarateRabetei ebarateRiaziManteghi amel ebarateYegani taghirnapazir tarifha tarif jens tarifeMoteghayyer tarifhayeMoteghayyerha tarifeMeghdareAvalie tarifeShenaseMoteghayer tarifeMoteghayyerMahdud
meghdareSabet taghirpazir
%type <EVal> saved_identifier
%type <EVal> saved_integer
%type <EVal> saved_real
%type <EVal> saved_char
%type <EVal> M N

%code {

	public static final String TYPE_STRING_INTEGER = "int";
	public static final String TYPE_STRING_REAL = "double";
	public static final String TYPE_STRING_CHAR = "char";
	public static final String TYPE_STRING_BOOLEAN = "int";

	private static final String tempStr = "tempVar";
	public static final String startStr = "StartVar";
	public static final String sizeStr = "SizeVar";
	public static final String indexStr = "IndexVar";
	public static final String condStr = "ConditionVar";
	
	public static String lexIdentifier;
	public static int lexInt;
	public static double lexReal;
	public static boolean lexBoolean;
	public static char lexChar;

	private ArrayList<Quadruple> quadruples = new ArrayList<>();
	private SymbolTable symbolTable = new SymbolTable();
	public static PrintStream writer;

	private int tempCounter = 0;

	public String fileAddress;

	public static void main(String args[]) throws IOException {
        YYParser yyparser;
        final Yylex lexer;

        String inputCode = "code.txt";
        String outputCode = "out.c";
        String output = "output.txt";

        if (args.length == 1) {
            inputCode = args[0];
            outputCode = args[0] + ".c";
            output = args[0] + ".txt";
        }
        if (args.length == 2) {
            inputCode = args[0];
            outputCode = args[1];
            output = args[0] + ".txt";
        }
        if (args.length == 3) {
            inputCode = args[0];
            outputCode = args[1];
            output = args[2];
        }

        writer = new PrintStream(new File(output));
        lexer = new Yylex(new InputStreamReader(new FileInputStream(inputCode)));

        yyparser = new YYParser(new Lexer() {

            @Override
            public int yylex() {
                int yyl_return = -1;
                try {
                    yyl_return = lexer.yylex();
                } catch (IOException e) {
                    System.err.println("IO error: " + e);
                }
                return yyl_return;
            }

            @Override
            public void yyerror(String error) {
                System.err.println("Error! " + error);
            }

            @Override
            public Object getLVal() {
                return null;
            }
        });
        yyparser.fileAddress = outputCode;
        yyparser.parse();

        return;
	}

	private void emit(String operation, String arg0, String arg1, String result) {
		quadruples.add(new Quadruple(operation, arg0, arg1, result));
	}

	private void backpatch(ArrayList<Integer> list, int quadNumber) {
		for (int i = 0; i < list.size(); i++)
			quadruples.get(list.get(i)).result = String.valueOf(quadNumber);
	}

	private void backpatch(int quadNumber, int destination) {
		quadruples.get(quadNumber).result = String.valueOf(destination);
	}

	private String newTemp(int type, boolean array) {
		String name = tempStr + tempCounter++;
		symbolTable.addToSymbolTable(name, type, array);
		return name;
	}

	private int nextQuad() {
		return quadruples.size();
	}

	private String getTypeString(int typeCode){
		switch(typeCode){
			case EVal.TYPE_CODE_INTEGER:
				return TYPE_STRING_INTEGER;
			case EVal.TYPE_CODE_REAL:
				return TYPE_STRING_REAL;
			case EVal.TYPE_CODE_CHAR:
				return TYPE_STRING_CHAR;
			case EVal.TYPE_CODE_BOOLEAN:
				return TYPE_STRING_BOOLEAN;
			case EVal.TYPE_CODE_UNKNOWN:
			case EVal.TYPE_CODE_RANGE:
			default:
				return null;
		}
	}

	private void exportIntermediateCode() {
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream(fileAddress));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			dos.writeBytes("#include <stdio.h>\n\nint main() {\n\t// ////////////////// Symbol Table \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ \\\\\n\n");
			dos.writeBytes(symbolTable.toString());
			dos.writeBytes("\n\t// ////////////////// Quadruples \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ \\\\\n\n");
			// Backpatch of error controllers.
			backpatch(EVal.arrayIndexOutOfBoundList, (quadruples.size() + 1)); // Array index out of bound error.
			backpatch(EVal.invalidArraySizeList, (quadruples.size() + 2)); // Invalid array size error.
			for (int i = 0; i < quadruples.size() && i < 100; i++) {
				dos.writeBytes(Quadruple.LINE_STR + i + ":" + "\t\t" + quadruples.get(i) + "\n");
			}
			for (int i = 100; i < quadruples.size(); i++) {
				dos.writeBytes(Quadruple.LINE_STR + i + ":" + "\t\t" + quadruples.get(i) + "\n");
			}
			// Normal Finish
			if(quadruples.size() < 100)
				dos.writeBytes(Quadruple.LINE_STR + quadruples.size() + ":" + "\t\tprintf(\"Process is terminated with no error.\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\t\treturn 0;\n");
			else
				dos.writeBytes(Quadruple.LINE_STR + quadruples.size() + ":" + "\t\tprintf(\"Process is terminated with no error.\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\t\treturn 0;\n");

			// Array index out of bound error.
			if(quadruples.size() < 100)
				dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 1) + ":" + "\t\tprintf(\"Array Error: Index out of bound!\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\treturn -1;\n");
			else
				dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 1) + ":" + "\t\tprintf(\"Array Error: Index out of bound!\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\treturn -1;\n");

			// Invalid array size error.
			if(quadruples.size() < 100)
				dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 2) + ":" + "\t\tprintf(\"Array Error: Invalid array size!\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\treturn -2;\n");
			else
				dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 2) + ":" + "\t\tprintf(\"Array Error: Invalid array size!\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\treturn -2;\n");

			dos.writeBytes("}\n");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

%left OR_KW OR_ELSE_KW
%left AND_KW AND_THEN_KW
%left EQUAL_KW LESS_EQUAL_KW LESS_THAN_KW MORE_EQUAL_KW MORE_THAN_KW EQUAL_EQUAL_KW
%left ADD_KW MINUS_KW
%left MULTIPLY_KW DEVIDE_KW MOD_KW
%right NOT_KW

%nonassoc LOWER_THAN_ELSE_KW
%nonassoc ELSE_KW

%%
barnameh:
	PROGRAM_KW SHENASE tarifha {
		System.out.println("Rule 1.1 ");
		exportIntermediateCode();
	}

tarifha:
	tarifha tarif {
		System.out.println("Rule 2.1: ");
	}
	| tarif {
		System.out.println("Rule 2.2");
	}
	
tarif:
	tarifeSakhtar  {
		System.out.println("Rule 3.1: ");
	}
	| tarifeMoteghayyer {
		System.out.println("Rule 3.2: " );
	}
	| tarifeTabe{
		System.out.println("Rule 3.3: " );
	}

tarifeSakhtar:
	STRUCT_KW SHENASE AKULAD_BAZ_KW tarifhayeMahalli AKULAD_BASTE_KW  {
		System.out.println("Rule 4.1 ");
	}
	|
	STRUCT_KW SHENASE AKULAD_BAZ_KW AKULAD_BASTE_KW  {
		System.out.println("Rule 4.2 ");
	}
	
tarifhayeMahalli:
	tarifhayeMahalli tarifeMoteghayyerMahdud  {
		System.out.println("Rule 5 ");
	}
	|
	tarifeMoteghayyerMahdud  {
		System.out.println("Rule 5 ");
	}
		
tarifeMoteghayyerMahdud:
	jens tarifhayeMoteghayyerha NOGHTE_VIRGUL {
		System.out.println("Rule 6 eha");
		System.out.println("Rule 9");
		
		System.out.println("Rule 3: " +
			"declarations: type_specifiers declarator_list");
		System.out.println($1.type+" "+$2.type);
		if($2.type == EVal.TYPE_CODE_UNKNOWN || $1.type == $2.type) {
			for(int i = 0; i < $2.initializersList.size(); i++) {
				if(symbolTable.lookUp(sizeStr + $2.declareds.get(i).place) == SymbolTable.NOT_IN_SYMBOL_TABLE) {
					symbolTable.addToSymbolTable($2.declareds.get(i).place, $1.type, false);
					if($2.initializersList.get(i) != null && $2.initializersList.get(i).size() == 1) {
						//if($1.type != EVal.TYPE_CODE_BOOLEAN) {
							emit(":=", $2.initializersList.get(i).get(0).place, null, $2.declareds.get(i).place);
							switch ($1.type) {
								case EVal.TYPE_CODE_INTEGER:
									emit("iprint", null, null, $2.declareds.get(i).place);
									break;
								case EVal.TYPE_CODE_REAL:
									emit("rprint", null, null, $2.declareds.get(i).place);
									break;
								case EVal.TYPE_CODE_CHAR:
									emit("cprint", null, null, $2.declareds.get(i).place);
									break;
								case EVal.TYPE_CODE_BOOLEAN:
									emit("bprint", null, null, $2.declareds.get(i).place);
									break;
							}
						//} else {
							// backpatch($2.initializersList.get(i).get(0).falseList, nextQuad());
							// backpatch($2.initializersList.get(i).get(0).trueList, nextQuad() + 2);
						//	emit(":=", "0", null, $2.declareds.get(i).place);
						//	emit("goto", null, null, String.valueOf(nextQuad() + 2));
						//	emit(":=", "1", null, $2.declareds.get(i).place);
						//	emit("bprint", null, null, $2.declareds.get(i).place);
						//}
					} else if($2.initializersList.get(i) != null) {
						System.err.println("Error! Initializer number mismatch. (Expected: 1" + ", Number: " + $2.initializersList.get(i).size() + ")");
						return YYABORT;
					}
				} else {
					symbolTable.addToSymbolTable($2.declareds.get(i).place, $1.type, true);
					emit("malloc", getTypeString($1.type), sizeStr + $2.declareds.get(i).place, $2.declareds.get(i).place);
					if($2.initializersList.get(i) != null) {
						for(int j = 0; j < $2.initializersList.get(i).size(); j++) {
							EVal.arrayIndexOutOfBoundList.add(nextQuad() + 1);
							emit(">=", String.valueOf(j), sizeStr + $2.declareds.get(i).place, condStr + $2.declareds.get(i).place);
							emit("check", condStr + $2.declareds.get(i).place, null, String.valueOf(nextQuad() + 2)); // Result will be backpatched.
							//if($1.type != EVal.TYPE_CODE_BOOLEAN) {
								emit("[]=", $2.initializersList.get(i).get(j).place, String.valueOf(j), $2.declareds.get(i).place);
								emit("+", startStr + $2.declareds.get(i).place, String.valueOf(j), condStr + $2.declareds.get(i).place);
								switch ($1.type) {
									case EVal.TYPE_CODE_INTEGER:
										emit("aiprint", condStr + $2.declareds.get(i).place, String.valueOf(j), $2.declareds.get(i).place);
										break;
									case EVal.TYPE_CODE_REAL:
										emit("arprint", condStr + $2.declareds.get(i).place, String.valueOf(j), $2.declareds.get(i).place);
										break;
									case EVal.TYPE_CODE_CHAR:
										emit("acprint", condStr + $2.declareds.get(i).place, String.valueOf(j), $2.declareds.get(i).place);
										break;
								}
							//} else {
								// backpatch($2.initializersList.get(i).get(j).falseList, nextQuad());
								// backpatch($2.initializersList.get(i).get(j).trueList, nextQuad() + 2);
							//	emit("[]=", "0", String.valueOf(j), $2.declareds.get(i).place);
							//	emit("goto", null, null, String.valueOf(nextQuad() + 2));
							//	emit("[]=", "1", String.valueOf(j), $2.declareds.get(i).place);
							//	emit("abprint", condStr + $2.declareds.get(i).place, String.valueOf(j), $2.declareds.get(i).place);
							//}
						}
					}
				}
			}
		} else {
			System.err.println("Error! Type specifier type mismatch. (" + $1.type + ", " + $2.type + ")");
			return YYABORT;
		}
	}
	
jens:
	INT_KW {
	System.out.println("Rule 8.1");
	
		$$ = new EVal();
		((EVal)$$).type = EVal.TYPE_CODE_INTEGER;
	}
	| FLOAT_KW {
	System.out.println("Rule 8.2");
		$$ = new EVal();
		((EVal)$$).type = EVal.TYPE_CODE_REAL;
	}
	|CHAR_KW {
		System.out.println("Rule 8.3");
		$$ = new EVal();
		((EVal)$$).type = EVal.TYPE_CODE_CHAR;
	}
	|BOOLEAN_KW{
		System.out.println("Rule 8.4");
		$$ = new EVal();
		((EVal)$$).type = EVal.TYPE_CODE_BOOLEAN;
	}
	
tarifeMoteghayyer:
	jens tarifhayeMoteghayyerha NOGHTE_VIRGUL {
		System.out.println("Rule 9");
		
		System.out.println("Rule 3: " +
			"declarations: type_specifiers declarator_list");
		System.out.println($1.type+" "+$2.type);
		if($2.type == EVal.TYPE_CODE_UNKNOWN || $1.type == $2.type) {
			for(int i = 0; i < $2.initializersList.size(); i++) {
				if(symbolTable.lookUp(sizeStr + $2.declareds.get(i).place) == SymbolTable.NOT_IN_SYMBOL_TABLE) {
					symbolTable.addToSymbolTable($2.declareds.get(i).place, $1.type, false);
					if($2.initializersList.get(i) != null && $2.initializersList.get(i).size() == 1) {
						//if($1.type != EVal.TYPE_CODE_BOOLEAN) {
							emit(":=", $2.initializersList.get(i).get(0).place, null, $2.declareds.get(i).place);
							switch ($1.type) {
								case EVal.TYPE_CODE_INTEGER:
									emit("iprint", null, null, $2.declareds.get(i).place);
									break;
								case EVal.TYPE_CODE_REAL:
									emit("rprint", null, null, $2.declareds.get(i).place);
									break;
								case EVal.TYPE_CODE_CHAR:
									emit("cprint", null, null, $2.declareds.get(i).place);
									break;
							}
						//} else {
							// backpatch($2.initializersList.get(i).get(0).falseList, nextQuad());
							// backpatch($2.initializersList.get(i).get(0).trueList, nextQuad() + 2);
						//	emit(":=", "0", null, $2.declareds.get(i).place);
						//	emit("goto", null, null, String.valueOf(nextQuad() + 2));
						//	emit(":=", "1", null, $2.declareds.get(i).place);
						//	emit("bprint", null, null, $2.declareds.get(i).place);
						//}
					} else if($2.initializersList.get(i) != null) {
						System.err.println("Error! Initializer number mismatch. (Expected: 1" + ", Number: " + $2.initializersList.get(i).size() + ")");
						return YYABORT;
					}
				} else {
					symbolTable.addToSymbolTable($2.declareds.get(i).place, $1.type, true);
					emit("malloc", getTypeString($1.type), sizeStr + $2.declareds.get(i).place, $2.declareds.get(i).place);
					if($2.initializersList.get(i) != null) {
						for(int j = 0; j < $2.initializersList.get(i).size(); j++) {
							EVal.arrayIndexOutOfBoundList.add(nextQuad() + 1);
							emit(">=", String.valueOf(j), sizeStr + $2.declareds.get(i).place, condStr + $2.declareds.get(i).place);
							emit("check", condStr + $2.declareds.get(i).place, null, String.valueOf(nextQuad() + 2)); // Result will be backpatched.
							//if($1.type != EVal.TYPE_CODE_BOOLEAN) {
								emit("[]=", $2.initializersList.get(i).get(j).place, String.valueOf(j), $2.declareds.get(i).place);
								emit("+", startStr + $2.declareds.get(i).place, String.valueOf(j), condStr + $2.declareds.get(i).place);
								switch ($1.type) {
									case EVal.TYPE_CODE_INTEGER:
										emit("aiprint", condStr + $2.declareds.get(i).place, String.valueOf(j), $2.declareds.get(i).place);
										break;
									case EVal.TYPE_CODE_REAL:
										emit("arprint", condStr + $2.declareds.get(i).place, String.valueOf(j), $2.declareds.get(i).place);
										break;
									case EVal.TYPE_CODE_CHAR:
										emit("acprint", condStr + $2.declareds.get(i).place, String.valueOf(j), $2.declareds.get(i).place);
										break;
								}
							//} else {
								// backpatch($2.initializersList.get(i).get(j).falseList, nextQuad());
								// backpatch($2.initializersList.get(i).get(j).trueList, nextQuad() + 2);
							//	emit("[]=", "0", String.valueOf(j), $2.declareds.get(i).place);
							//	emit("goto", null, null, String.valueOf(nextQuad() + 2));
							//	emit("[]=", "1", String.valueOf(j), $2.declareds.get(i).place);
							//	emit("abprint", condStr + $2.declareds.get(i).place, String.valueOf(j), $2.declareds.get(i).place);
							//}
						}
					}
				}
			}
		} else {
			System.err.println("Error! Type specifier type mismatch. (" + $1.type + ", " + $2.type + ")");
			return YYABORT;
		}
	}
	
tarifhayeMoteghayyerha:
	tarifeMeghdareAvalie{
		System.out.println("Rule 10.1 ");
		
		System.out.println("Rule 5.2: " +
			"delarator_list: declarator_end");
		$$ = new EVal();
		((EVal)$$).type = $1.type;
		((EVal)$$).declareds = EVal.makeInitializersOrDeclareds($1);
		((EVal)$$).initializersList = EVal.makeInitializersList($1.initializers);
	} |
	tarifhayeMoteghayyerha COMMA tarifeMeghdareAvalie {
		System.out.println("Rule 5.1: " +
			"declarator_list: declarator_list declarator");
		if($1.type == EVal.TYPE_CODE_UNKNOWN
			|| $1.type == $3.type) {
			$$ = new EVal();
			((EVal)$$).type = $3.type;
			((EVal)$$).declareds = $1.declareds;
			((EVal)$$).declareds.add($3);
			((EVal)$$).initializersList = $1.initializersList;
			((EVal)$$).initializersList.add($3.initializers);
		} else {
			System.err.println("Error! Declarator type mismatch.");
			return YYABORT;
		}
	}
	
tarifeMeghdareAvalie:
	tarifeShenaseMoteghayer {
	System.out.println("Rule 11.1 ");
		$$ = new EVal();
		((EVal)$$).place = $1.place;
		((EVal)$$).array = false;
	}
	| tarifeShenaseMoteghayer EQUAL_KW ebarateSade{
		System.out.println("Rule 11.2 ");
		if($1.array != $3.array) {
			System.err.println("Error! Array mismatch: " + $1.place + " and " + $3.place + " are not the same.");
			return YYABORT;
		}
		$$ = new EVal();
		((EVal)$$).place = $1.place;
		((EVal)$$).type = $3.type;
		((EVal)$$).array = $1.array;
		((EVal)$$).initializers = $3.initializers;
		
		emit(":=", $3.place, null, $1.place);
	}

tarifeShenaseMoteghayer:
	saved_identifier {
		System.out.println("Rule 8.1: " +
			"dec: saved_identifier");
		$$ = new EVal();
		((EVal)$$).place = $1.place;
		((EVal)$$).array = false;
	}
	| saved_identifier BRACKET_BAZ_KW saved_integer BRACKET_BASTE_KW {
		
		System.out.println("Rule 8.3: " +
			"dec: saved_identifier LB_KW saved_integer RB_KW");
		$$ = new EVal();
		((EVal)$$).place = $1.place;
		((EVal)$$).array = true;

		symbolTable.addToSymbolTable(startStr + ((EVal)$$).place, EVal.TYPE_CODE_INTEGER, false);
		emit(":=", "0", null , startStr + ((EVal)$$).place);

		symbolTable.addToSymbolTable(sizeStr + ((EVal)$$).place, EVal.TYPE_CODE_INTEGER, false);
		emit(":=", $3.place, null , sizeStr + ((EVal)$$).place);

		symbolTable.addToSymbolTable(indexStr + ((EVal)$$).place, EVal.TYPE_CODE_INTEGER, false);
		symbolTable.addToSymbolTable(condStr + ((EVal)$$).place, EVal.TYPE_CODE_INTEGER, false);
	}
	
tarifeTabe:
	jens SHENASE PARANTHESIS_BAZ_KW vorudiha PARANTHESIS_BASTE_KW jomle {
		System.out.println("Rule 13.1");
	}
	|
	jens SHENASE PARANTHESIS_BAZ_KW PARANTHESIS_BASTE_KW jomle {
		System.out.println("Rule 13.2");
	}
	|
	SHENASE PARANTHESIS_BAZ_KW vorudiha PARANTHESIS_BASTE_KW jomle {System.out.println("Rule 13.3");}
	|
	SHENASE PARANTHESIS_BAZ_KW PARANTHESIS_BASTE_KW jomle {System.out.println("Rule 13.4");}
	
vorudiha :
	vorudiha NOGHTE_VIRGUL jensVorudiha {System.out.println("Rule 15.1");}
	|
	jensVorudiha {System.out.println("Rule 15.2");}
	
jensVorudiha :
	jens shenaseyeVorudiha  {System.out.println("Rule 16");}
	
shenaseyeVorudiha :
	shenaseyeVorudiha COMMA shenaseyeVorudi {System.out.println("Rule 17.1");}
	|
	shenaseyeVorudi {System.out.println("Rule 17.2");}
	
shenaseyeVorudi :
	SHENASE {System.out.println("Rule 18.1");}|
	SHENASE BRACKET_BAZ_KW BRACKET_BASTE_KW {System.out.println("Rule 18.2");}
	
jomle :
	jomleyeMorakkab {System.out.println("Rule 19.1");}
	|
	jomleyeEbarat {System.out.println("Rule 19.2");}
	|
	jomleyeEntekhab {System.out.println("Rule 19.3");}
	|
	jomleyeTekrar{System.out.println("Rule 19.4");}
	|
	jomleyeBazgasht{System.out.println("Rule 19.5");}
	|
	jomleyeShekast {System.out.println("Rule 19.6");}

jomleyeMorakkab :
	AKULAD_BAZ_KW tarifhayeMahalli jomleha AKULAD_BASTE_KW {
		System.out.println("Rule 20.1");
	}
	|
	AKULAD_BAZ_KW tarifhayeMahalli AKULAD_BASTE_KW {
		System.out.println("Rule 20.2");
	}
	|
	AKULAD_BAZ_KW jomleha AKULAD_BASTE_KW {
		System.out.println("Rule 20.3");
	}
	|
	AKULAD_BAZ_KW AKULAD_BASTE_KW {
		System.out.println("Rule 20.4");
	}
	
jomleha :
	jomleha jomle {System.out.println("Rule 21.1");}
	|
	jomle {System.out.println("Rule 21.2");}

	
jomleyeEbarat :
	ebarat NOGHTE_VIRGUL {
		System.out.println("Rule 22.1");
	}
	|
	NOGHTE_VIRGUL {System.out.println("Rule 22.2");}

jomleyeEntekhab :
	IF_KW ebarateSade THEN_KW jomle %prec LOWER_THAN_ELSE_KW {System.out.println("Rule 23.1");}
	|
	IF_KW ebarateSade THEN_KW jomle ELSE_KW jomle {System.out.println("Rule 23.2");}
	|
	KEY_KW PARANTHESIS_BAZ_KW ebarateSade PARANTHESIS_BASTE_KW onsoreHalat onsorePishfarz END_KW {System.out.println("Rule 23.3");}
	|
	KEY_KW PARANTHESIS_BAZ_KW ebarateSade PARANTHESIS_BASTE_KW onsoreHalat END_KW {System.out.println("Rule 23.4");}

		
onsoreHalat :
	SWITCH_KW ADAD DONOGHTE_KW jomle NOGHTE_VIRGUL { System.out.println("Rule 24.1"); }
	|
	onsoreHalat SWITCH_KW ADAD DONOGHTE_KW jomle NOGHTE_VIRGUL {System.out.println("Rule 24.2");}

onsorePishfarz:
	DEFAULT_KW DONOGHTE_KW jomle NOGHTE_VIRGUL {System.out.println("Rule 25");}

jomleyeTekrar:
	WHILE_KW PARANTHESIS_BAZ_KW ebarateSade PARANTHESIS_BASTE_KW jomle {System.out.println("Rule 26");}

jomleyeBazgasht:
	RETURN_KW NOGHTE_VIRGUL {System.out.println("Rule 27.1");}
	|
	RETURN_KW ebarat NOGHTE_VIRGUL {System.out.println("Rule 27.2");}

jomleyeShekast:
	BREAK_KW NOGHTE_VIRGUL {System.out.println("Rule 28");}

ebarat:
	taghirpazir EQUAL_KW ebarat {
	System.out.println("Rule 29.1");
	emit(":=", $3.place, null, $1.place);
	}
	|
	taghirpazir PLUS_EQUAL_KW ebarat {
	
		System.out.println("Rule 29.1: " +
			"arithmatic_expressions: expressions ADD_KW expressions");
		if(((((EVal)$$).type == EVal.TYPE_CODE_INTEGER || ((EVal)$$).type == EVal.TYPE_CODE_CHAR || ((EVal)$$).type == EVal.TYPE_CODE_BOOLEAN)
				&& ($3.type == EVal.TYPE_CODE_INTEGER || $3.type == EVal.TYPE_CODE_CHAR || $3.type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)$$).type == EVal.TYPE_CODE_REAL && ((EVal)$$).type == EVal.TYPE_CODE_REAL)) {
			emit("+", ((EVal)$$).place, $3.place, ((EVal)$$).place);
		} else if((((EVal)$$).type == EVal.TYPE_CODE_INTEGER || ((EVal)$$).type == EVal.TYPE_CODE_CHAR || ((EVal)$$).type == EVal.TYPE_CODE_BOOLEAN)
			&& $3.type == EVal.TYPE_CODE_REAL) {
			((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)$$).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)$$).place, TYPE_STRING_REAL, tmp);
			emit("+", tmp, $3.place, ((EVal)$$).place);
		} else if(((EVal)$$).type == EVal.TYPE_CODE_REAL
			&& ($3.type == EVal.TYPE_CODE_INTEGER || $3.type == EVal.TYPE_CODE_CHAR || $3.type == EVal.TYPE_CODE_BOOLEAN)) {
			((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)$$).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", $3.place, TYPE_STRING_REAL, tmp);
			emit("+", ((EVal)$$).place, tmp, ((EVal)$$).place);
		} else {
			System.err.println("Error! Invalid type for \"+\" operation.");
			return YYABORT;
		}

		((EVal)$$).trueList = EVal.makeList(nextQuad());
		((EVal)$$).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)$$).nextList = EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	}
	|
	taghirpazir MINUS_EQUAL_KW ebarat {
	
		System.out.println("Rule 29.1: " +
			"arithmatic_expressions: expressions ADD_KW expressions");
		if(((((EVal)$$).type == EVal.TYPE_CODE_INTEGER || ((EVal)$$).type == EVal.TYPE_CODE_CHAR || ((EVal)$$).type == EVal.TYPE_CODE_BOOLEAN)
				&& ($3.type == EVal.TYPE_CODE_INTEGER || $3.type == EVal.TYPE_CODE_CHAR || $3.type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)$$).type == EVal.TYPE_CODE_REAL && ((EVal)$$).type == EVal.TYPE_CODE_REAL)) {
			emit("-", ((EVal)$$).place, $3.place, ((EVal)$$).place);
		} else if((((EVal)$$).type == EVal.TYPE_CODE_INTEGER || ((EVal)$$).type == EVal.TYPE_CODE_CHAR || ((EVal)$$).type == EVal.TYPE_CODE_BOOLEAN)
			&& $3.type == EVal.TYPE_CODE_REAL) {
			((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)$$).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)$$).place, TYPE_STRING_REAL, tmp);
			emit("-", tmp, $3.place, ((EVal)$$).place);
		} else if(((EVal)$$).type == EVal.TYPE_CODE_REAL
			&& ($3.type == EVal.TYPE_CODE_INTEGER || $3.type == EVal.TYPE_CODE_CHAR || $3.type == EVal.TYPE_CODE_BOOLEAN)) {
			((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)$$).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", $3.place, TYPE_STRING_REAL, tmp);
			emit("-", ((EVal)$$).place, tmp, ((EVal)$$).place);
		} else {
			System.err.println("Error! Invalid type for \"+\" operation.");
			return YYABORT;
		}

		((EVal)$$).trueList = EVal.makeList(nextQuad());
		((EVal)$$).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)$$).nextList = EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	}
	|
	taghirpazir MULTIPLY_EQUAL_KW ebarat {
	
		System.out.println("Rule 29.1: " +
			"arithmatic_expressions: expressions ADD_KW expressions");
		if(((((EVal)$$).type == EVal.TYPE_CODE_INTEGER || ((EVal)$$).type == EVal.TYPE_CODE_CHAR || ((EVal)$$).type == EVal.TYPE_CODE_BOOLEAN)
				&& ($3.type == EVal.TYPE_CODE_INTEGER || $3.type == EVal.TYPE_CODE_CHAR || $3.type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)$$).type == EVal.TYPE_CODE_REAL && ((EVal)$$).type == EVal.TYPE_CODE_REAL)) {
			emit("*", ((EVal)$$).place, $3.place, ((EVal)$$).place);
		} else if((((EVal)$$).type == EVal.TYPE_CODE_INTEGER || ((EVal)$$).type == EVal.TYPE_CODE_CHAR || ((EVal)$$).type == EVal.TYPE_CODE_BOOLEAN)
			&& $3.type == EVal.TYPE_CODE_REAL) {
			((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)$$).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)$$).place, TYPE_STRING_REAL, tmp);
			emit("*", tmp, $3.place, ((EVal)$$).place);
		} else if(((EVal)$$).type == EVal.TYPE_CODE_REAL
			&& ($3.type == EVal.TYPE_CODE_INTEGER || $3.type == EVal.TYPE_CODE_CHAR || $3.type == EVal.TYPE_CODE_BOOLEAN)) {
			((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)$$).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", $3.place, TYPE_STRING_REAL, tmp);
			emit("*", ((EVal)$$).place, tmp, ((EVal)$$).place);
		} else {
			System.err.println("Error! Invalid type for \"+\" operation.");
			return YYABORT;
		}

		((EVal)$$).trueList = EVal.makeList(nextQuad());
		((EVal)$$).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)$$).nextList = EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	}
	|
	taghirpazir DEVIDE_EQUAL_KW ebarat {
	
		System.out.println("Rule 29.1: " +
			"arithmatic_expressions: expressions ADD_KW expressions");
		if(((((EVal)$$).type == EVal.TYPE_CODE_INTEGER || ((EVal)$$).type == EVal.TYPE_CODE_CHAR || ((EVal)$$).type == EVal.TYPE_CODE_BOOLEAN)
				&& ($3.type == EVal.TYPE_CODE_INTEGER || $3.type == EVal.TYPE_CODE_CHAR || $3.type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)$$).type == EVal.TYPE_CODE_REAL && ((EVal)$$).type == EVal.TYPE_CODE_REAL)) {
			emit("/", ((EVal)$$).place, $3.place, ((EVal)$$).place);
		} else if((((EVal)$$).type == EVal.TYPE_CODE_INTEGER || ((EVal)$$).type == EVal.TYPE_CODE_CHAR || ((EVal)$$).type == EVal.TYPE_CODE_BOOLEAN)
			&& $3.type == EVal.TYPE_CODE_REAL) {
			((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)$$).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)$$).place, TYPE_STRING_REAL, tmp);
			emit("/", tmp, $3.place, ((EVal)$$).place);
		} else if(((EVal)$$).type == EVal.TYPE_CODE_REAL
			&& ($3.type == EVal.TYPE_CODE_INTEGER || $3.type == EVal.TYPE_CODE_CHAR || $3.type == EVal.TYPE_CODE_BOOLEAN)) {
			((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)$$).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", $3.place, TYPE_STRING_REAL, tmp);
			emit("/", ((EVal)$$).place, tmp, ((EVal)$$).place);
		} else {
			System.err.println("Error! Invalid type for \"+\" operation.");
			return YYABORT;
		}

		((EVal)$$).trueList = EVal.makeList(nextQuad());
		((EVal)$$).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)$$).nextList = EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	}
	|
	taghirpazir PLUS_PLUS_KW {System.out.println("Rule 29.6");}
	|
	taghirpazir MINUS_MINUS_KW  {System.out.println("Rule 29.7");}
	|
	ebarateSade {System.out.println(" Rule 29.8 ebarateSade to ebarat");
	$$ = new EVal();	
		((EVal)$$).place = $1.place;
		((EVal)$$).type = $1.type;
		((EVal)$$).trueList = $1.trueList;
		((EVal)$$).falseList = $1.falseList;}

ebarateSade :
	ebarateSade OR_KW  M ebarateSade {
		System.out.println("Rule 30.1: " +
			"bool_expressions: expressions OR_KW M expressions");
		$$ = new EVal();
		((EVal)$$).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)$$).type = EVal.TYPE_CODE_BOOLEAN;
		backpatch($1.falseList, $3.quad);
		((EVal)$$).trueList = EVal.merge($1.trueList, $4.trueList);
		((EVal)$$).falseList = $4.falseList;
	}
	|
	ebarateSade AND_KW M ebarateSade {
		System.out.println("Rule 30.2: " +
			"bool_expressions: expressions AND_KW M expressions");
		$$ = new EVal();
		((EVal)$$).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)$$).type = EVal.TYPE_CODE_BOOLEAN;
		backpatch($1.trueList, $3.quad);
		((EVal)$$).trueList = $4.trueList;
		((EVal)$$).falseList = EVal.merge($1.falseList, $4.falseList);
	}
	|
	ebarateSade OR_ELSE_KW M ebarateSade {
		System.out.println("Rule 30.3: " +
			"bool_expressions: expressions OR_ELSE_KW M expressions");
		$$ = new EVal();
		((EVal)$$).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)$$).type = EVal.TYPE_CODE_BOOLEAN;
		
		backpatch($1.trueList, nextQuad());
		emit(":=", "1", null, ((EVal)$$).place);
		emit("goto", null, null, String.valueOf($3.quad));
		backpatch($1.falseList, nextQuad());
		emit(":=", "0", null, ((EVal)$$).place);
		emit("goto", null, null, String.valueOf($3.quad));
		backpatch($4.trueList, nextQuad());
		backpatch($4.falseList, nextQuad());
		emit("+", ((EVal)$$).place, $4.place, ((EVal)$$).place);
		((EVal)$$).trueList = EVal.makeList(nextQuad());
		((EVal)$$).falseList = EVal.makeList(nextQuad() + 1);
		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2));
		//emit("goto", null, null, String.valueOf(nextQuad() + 1));
	}
	|
	ebarateSade AND_THEN_KW M ebarateSade {
		System.out.println("Rule 30.4: " +
			"bool_expressions: expressions AND_THEN_KW M expressions");
		$$ = new EVal();
		((EVal)$$).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)$$).type = EVal.TYPE_CODE_BOOLEAN;
		
		backpatch($1.trueList, nextQuad());
		emit(":=", "1", null, ((EVal)$$).place);
		emit("goto", null, null, String.valueOf($3.quad));
		backpatch($1.falseList, nextQuad());
		emit(":=", "0", null, ((EVal)$$).place);
		emit("goto", null, null, String.valueOf($3.quad));
		backpatch($4.trueList, nextQuad());
		backpatch($4.falseList, nextQuad());
		emit("*", ((EVal)$$).place, $4.place, ((EVal)$$).place);
		((EVal)$$).trueList = EVal.makeList(nextQuad());
		((EVal)$$).falseList = EVal.makeList(nextQuad() + 1);
		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2));// result will be backpatched
		//emit("goto", null, null, String.valueOf(nextQuad() + 1));// result will be backpatched
	}
	|
	NOT_KW ebarateSade {
		System.out.println("Rule 30.5: " +
			"bool_expressions: NOT_KW expressions");
		$$ = new EVal();
		((EVal)$$).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)$$).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)$$).trueList = $2.falseList;
		((EVal)$$).falseList = $2.trueList;
	}
	|
	ebarateRabetei {
		System.out.println("Rule 30.6 ebarateRabetei to ebarateSade");
		$$ = new EVal();	
		((EVal)$$).place = $1.place;
		((EVal)$$).type = $1.type;
		((EVal)$$).trueList = $1.trueList;
		((EVal)$$).falseList = $1.falseList;
	}

ebarateRabetei:
	ebarateRiaziManteghi {
		System.out.println("Rule 31.1 ebarateRiaziManteghi to ebarateRabetei");
		$$ = new EVal();	
		((EVal)$$).place = $1.place;
		((EVal)$$).type = $1.type;
		((EVal)$$).trueList = $1.trueList;
		((EVal)$$).falseList = $1.falseList;
	}
	|
	ebarateRiaziManteghi LESS_THAN_KW ebarateRiaziManteghi {
		System.out.println("Rule 31.2: " +
			"bool_expressions: expressions LT_KW expressions");
		$$ = new EVal();
		((EVal)$$).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)$$).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)$$).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)$$).falseList = EVal.makeList(nextQuad() + 2);

		emit("<", $1.place, $3.place, ((EVal)$$).place);
		emit("check", ((EVal)$$).place, null, "-"); // result will be backpatched.
		emit("goto", null, null, "-"); // result will be backpatched.
	}
	|
	ebarateRiaziManteghi LESS_EQUAL_KW ebarateRiaziManteghi {
		System.out.println("Rule 31.3: " +
			"bool_expressions: expressions LE_KW expressions");
		$$ = new EVal();
		((EVal)$$).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)$$).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)$$).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)$$).falseList = EVal.makeList(nextQuad() + 2);

		emit("<=", $1.place, $3.place, ((EVal)$$).place);
		emit("check", ((EVal)$$).place, null, "-"); // result will be backpatched.
		emit("goto", null, null, "-"); // result will be backpatched.
	}
	|
	ebarateRiaziManteghi MORE_THAN_KW ebarateRiaziManteghi {
		System.out.println("Rule 31.4: " +
			"bool_expressions: expressions GT_KW expressions");
		$$ = new EVal();
		((EVal)$$).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)$$).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)$$).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)$$).falseList = EVal.makeList(nextQuad() + 2);

		emit(">", $1.place, $3.place, ((EVal)$$).place);
		emit("check", ((EVal)$$).place, null, "-"); // result will be backpatched.
		emit("goto", null, null, "-"); // result will be backpatched.
	}
	|
	ebarateRiaziManteghi MORE_EQUAL_KW ebarateRiaziManteghi {
		System.out.println("Rule 31.5: " +
			"bool_expressions: expressions GE_KW expressions");
		$$ = new EVal();
		((EVal)$$).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)$$).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)$$).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)$$).falseList = EVal.makeList(nextQuad() + 2);

		emit(">=", $1.place, $3.place, ((EVal)$$).place);
		emit("check", ((EVal)$$).place, null, "-"); // result will be backpatched.
		emit("goto", null, null, "-"); // result will be backpatched.
	}
	|
	ebarateRiaziManteghi EQUAL_EQUAL_KW ebarateRiaziManteghi {
		System.out.println("Rule 31.6: " +
			"bool_expressions: expressions EQ_KW expressions");
		$$ = new EVal();
		((EVal)$$).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)$$).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)$$).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)$$).falseList = EVal.makeList(nextQuad() + 2);

		emit("==", $1.place, $3.place, ((EVal)$$).place);
		emit("check", ((EVal)$$).place, null, "-"); // result will be backpatched.
		emit("goto", null, null, "-"); // result will be backpatched.
	}

ebarateRiaziManteghi :
	ebarateYegani {
	
		System.out.println("Rule 26.4: " +
			"expressions: saved_identifier");
		int index = symbolTable.lookUp($1.place);
		if (index == SymbolTable.NOT_IN_SYMBOL_TABLE) {
			System.err.println("Error! \"" + lexIdentifier + "\" is not declared.");
			return YYABORT;
		}
		if (symbolTable.arrays.get(index)) {
			System.err.println("Error! \"" + lexIdentifier + "\" is an array, it can not be used without index.");
			return YYABORT;
		}
		$$ = new EVal();
		((EVal)$$).place = symbolTable.names.get(index);
		((EVal)$$).type = symbolTable.types.get(index);

		((EVal)$$).trueList = EVal.makeList(nextQuad());
		((EVal)$$).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)$$).nextList = EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result will be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.
	}
	|
	ebarateRiaziManteghi ADD_KW ebarateRiaziManteghi {
	
		System.out.println("Rule 29.1: " +
			"arithmatic_expressions: expressions ADD_KW expressions");
		if((($1.type == EVal.TYPE_CODE_INTEGER || $1.type == EVal.TYPE_CODE_CHAR || $1.type == EVal.TYPE_CODE_BOOLEAN)
				&& ($3.type == EVal.TYPE_CODE_INTEGER || $3.type == EVal.TYPE_CODE_CHAR || $3.type == EVal.TYPE_CODE_BOOLEAN))
			|| ($1.type == EVal.TYPE_CODE_REAL && $3.type == EVal.TYPE_CODE_REAL)) {
			$$ = new EVal();
			((EVal)$$).place = newTemp($1.type, false);
			((EVal)$$).type = $1.type;
			emit("+", $1.place, $3.place, ((EVal)$$).place);
		} else if(($1.type == EVal.TYPE_CODE_INTEGER || $1.type == EVal.TYPE_CODE_CHAR || $1.type == EVal.TYPE_CODE_BOOLEAN)
			&& $3.type == EVal.TYPE_CODE_REAL) {
			$$ = new EVal();
			((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)$$).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", $1.place, TYPE_STRING_REAL, tmp);
			emit("+", tmp, $3.place, ((EVal)$$).place);
		} else if($1.type == EVal.TYPE_CODE_REAL
			&& ($3.type == EVal.TYPE_CODE_INTEGER || $3.type == EVal.TYPE_CODE_CHAR || $3.type == EVal.TYPE_CODE_BOOLEAN)) {
			$$ = new EVal();
			((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)$$).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", $3.place, TYPE_STRING_REAL, tmp);
			emit("+", $1.place, tmp, ((EVal)$$).place);
		} else {
			System.err.println("Error! Invalid type for \"+\" operation.");
			return YYABORT;
		}

		((EVal)$$).trueList = EVal.makeList(nextQuad());
		((EVal)$$).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)$$).nextList = EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	}
	|
	ebarateRiaziManteghi MINUS_KW ebarateRiaziManteghi {
		System.out.println("Rule 29.2: " +
			"arithmatic_expressions: expressions SUB_KW expressions");
		if((($1.type == EVal.TYPE_CODE_INTEGER || $1.type == EVal.TYPE_CODE_CHAR || $1.type == EVal.TYPE_CODE_BOOLEAN)
				&& ($3.type == EVal.TYPE_CODE_INTEGER || $3.type == EVal.TYPE_CODE_CHAR || $3.type == EVal.TYPE_CODE_BOOLEAN))
			|| ($1.type == EVal.TYPE_CODE_REAL && $3.type == EVal.TYPE_CODE_REAL)) {
			$$ = new EVal();
			((EVal)$$).place = newTemp($1.type, false);
			((EVal)$$).type = $1.type;
			emit("-", $1.place, $3.place, ((EVal)$$).place);
		} else if(($1.type == EVal.TYPE_CODE_INTEGER || $1.type == EVal.TYPE_CODE_CHAR || $1.type == EVal.TYPE_CODE_BOOLEAN)
			&& $3.type == EVal.TYPE_CODE_REAL) {
			$$ = new EVal();
			((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)$$).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", $1.place, TYPE_STRING_REAL, tmp);
			emit("-", tmp, $3.place, ((EVal)$$).place);
		} else if($1.type == EVal.TYPE_CODE_REAL
			&& ($3.type == EVal.TYPE_CODE_INTEGER || $3.type == EVal.TYPE_CODE_CHAR || $3.type == EVal.TYPE_CODE_BOOLEAN)) {
			$$ = new EVal();
			((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)$$).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", $3.place, TYPE_STRING_REAL, tmp);
			emit("-", $1.place, tmp, ((EVal)$$).place);
		} else {
			System.err.println("Error! Invalid type for \"-\" operation.");
			return YYABORT;
		}

		((EVal)$$).trueList = EVal.makeList(nextQuad());
		((EVal)$$).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)$$).nextList = EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	}
	|
	ebarateRiaziManteghi MULTIPLY_KW ebarateRiaziManteghi {
		System.out.println("Rule 29.3: " +
			"arithmatic_expressions: expressions MUL_KW expressions");
		if((($1.type == EVal.TYPE_CODE_INTEGER || $1.type == EVal.TYPE_CODE_CHAR || $1.type == EVal.TYPE_CODE_BOOLEAN)
				&& ($3.type == EVal.TYPE_CODE_INTEGER || $3.type == EVal.TYPE_CODE_CHAR || $3.type == EVal.TYPE_CODE_BOOLEAN))
			|| ($1.type == EVal.TYPE_CODE_REAL && $3.type == EVal.TYPE_CODE_REAL)) {
			$$ = new EVal();
			((EVal)$$).place = newTemp($1.type, false);
			((EVal)$$).type = $1.type;
			emit("*", $1.place, $3.place, ((EVal)$$).place);
		} else if(($1.type == EVal.TYPE_CODE_INTEGER || $1.type == EVal.TYPE_CODE_CHAR || $1.type == EVal.TYPE_CODE_BOOLEAN)
			&& $3.type == EVal.TYPE_CODE_REAL) {
			$$ = new EVal();
			((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)$$).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", $1.place, TYPE_STRING_REAL, tmp);
			emit("*", tmp, $3.place, ((EVal)$$).place);
		} else if($1.type == EVal.TYPE_CODE_REAL
			&& ($3.type == EVal.TYPE_CODE_INTEGER || $3.type == EVal.TYPE_CODE_CHAR || $3.type == EVal.TYPE_CODE_BOOLEAN)) {
			$$ = new EVal();
			((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)$$).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", $3.place, TYPE_STRING_REAL, tmp);
			emit("*", $1.place, tmp, ((EVal)$$).place);
		} else {
			System.err.println("Error! Invalid type for \"*\" operation.");
			return YYABORT;
		}

		((EVal)$$).trueList = EVal.makeList(nextQuad());
		((EVal)$$).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)$$).nextList = EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	}
	|
	ebarateRiaziManteghi DEVIDE_KW ebarateRiaziManteghi {
	
		System.out.println("Rule 29.4: " +
			"arithmatic_expressions: expressions DIV_KW expressions");
		if((($1.type == EVal.TYPE_CODE_INTEGER || $1.type == EVal.TYPE_CODE_CHAR || $1.type == EVal.TYPE_CODE_BOOLEAN)
				&& ($3.type == EVal.TYPE_CODE_INTEGER || $3.type == EVal.TYPE_CODE_CHAR || $3.type == EVal.TYPE_CODE_BOOLEAN))
			|| ($1.type == EVal.TYPE_CODE_REAL && $3.type == EVal.TYPE_CODE_REAL)) {
			$$ = new EVal();
			((EVal)$$).place = newTemp($1.type, false);
			((EVal)$$).type = $1.type;
			emit("/", $1.place, $3.place, ((EVal)$$).place);
		} else if(($1.type == EVal.TYPE_CODE_INTEGER || $1.type == EVal.TYPE_CODE_CHAR || $1.type == EVal.TYPE_CODE_BOOLEAN)
			&& $3.type == EVal.TYPE_CODE_REAL) {
			$$ = new EVal();
			((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)$$).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", $1.place, TYPE_STRING_REAL, tmp);
			emit("/", tmp, $3.place, ((EVal)$$).place);
		} else if($1.type == EVal.TYPE_CODE_REAL
			&& ($3.type == EVal.TYPE_CODE_INTEGER || $3.type == EVal.TYPE_CODE_CHAR || $3.type == EVal.TYPE_CODE_BOOLEAN)) {
			$$ = new EVal();
			((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)$$).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", $3.place, TYPE_STRING_REAL, tmp);
			emit("/", $1.place, tmp, ((EVal)$$).place);
		} else {
			System.err.println("Error! Invalid type for \"/\" operation.");
			return YYABORT;
		}

		((EVal)$$).trueList = EVal.makeList(nextQuad());
		((EVal)$$).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)$$).nextList = EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	}
	|
	ebarateRiaziManteghi MOD_KW ebarateRiaziManteghi {
		System.out.println("Rule 29.5: " +
			"arithmatic_expressions: expressions MOD_KW expressions");
		if(($1.type == EVal.TYPE_CODE_INTEGER
				|| $1.type == EVal.TYPE_CODE_CHAR
				|| $1.type == EVal.TYPE_CODE_BOOLEAN)
			&& ($3.type == EVal.TYPE_CODE_INTEGER
				|| $3.type == EVal.TYPE_CODE_CHAR
				|| $3.type == EVal.TYPE_CODE_BOOLEAN)) {
			$$ = new EVal();
			((EVal)$$).place = newTemp(EVal.TYPE_CODE_INTEGER, false);
			((EVal)$$).type = EVal.TYPE_CODE_INTEGER;
			emit("%", $1.place, $3.place, ((EVal)$$).place);
		} else if(($1.type == EVal.TYPE_CODE_INTEGER
				|| $1.type == EVal.TYPE_CODE_CHAR
				|| $1.type == EVal.TYPE_CODE_BOOLEAN)
			&& $3.type == EVal.TYPE_CODE_REAL) {
			$$ = new EVal();
			((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)$$).type = EVal.TYPE_CODE_INTEGER;
			String tmp = newTemp(EVal.TYPE_CODE_INTEGER, false);
			emit("cast", $3.place, TYPE_STRING_INTEGER, tmp);
			emit("%", $1.place, tmp, ((EVal)$$).place);
		} else if($1.type == EVal.TYPE_CODE_REAL
			&& ($3.type == EVal.TYPE_CODE_INTEGER
				|| $3.type == EVal.TYPE_CODE_CHAR
				|| $3.type == EVal.TYPE_CODE_BOOLEAN)) {
			$$ = new EVal();
			((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)$$).type = EVal.TYPE_CODE_INTEGER;
			String tmp = newTemp(EVal.TYPE_CODE_INTEGER, false);
			emit("cast", $1.place, TYPE_STRING_INTEGER, tmp);
			emit("%", tmp, $3.place, ((EVal)$$).place);
		} else {
			System.err.println("Error! Invalid type for \"%\" operation.");
			return YYABORT;
		}

		((EVal)$$).trueList = EVal.makeList(nextQuad());
		((EVal)$$).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)$$).nextList = EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	}


ebarateYegani :
	amalgareYegani ebarateYegani {System.out.println("Rule 35.1");}
	|
	amel {System.out.println("Rule 35.2 amel to ebarateYegani");
	$$ = new EVal();	
		((EVal)$$).place = $1.place;
		((EVal)$$).type = $1.type;
		((EVal)$$).trueList = $1.trueList;
		((EVal)$$).falseList = $1.falseList;}

amalgareYegani :
	MINUS_KW {System.out.println("Rule 36.1");}
	|
	MULTIPLY_KW {System.out.println("Rule 36.2");}
	|
	QUESTION_KW {System.out.println("Rule 36.3");}

amel :
	taghirpazir  {
		System.out.println("Rule 37.1 taghirpazir to amel");
		$$ = new EVal();	
		((EVal)$$).place = $1.place;
		((EVal)$$).type = $1.type;
		((EVal)$$).trueList = $1.trueList;
		((EVal)$$).falseList = $1.falseList;}
	
	|
	taghirnapazir  {System.out.println("Rule 37.2 taghirnapazir to amel");
					$$ = new EVal();	
		((EVal)$$).place = $1.place;
		((EVal)$$).type = $1.type;
		((EVal)$$).trueList = $1.trueList;
		((EVal)$$).falseList = $1.falseList;}

taghirpazir :
	saved_identifier  {
		System.out.println("Rule 38.1 saved_identifier to taghirpazir");
		$$ = new EVal();	
		((EVal)$$).place = $1.place;
		((EVal)$$).type = $1.type;
		((EVal)$$).trueList = $1.trueList;
		((EVal)$$).falseList = $1.falseList;}
	
	|
	taghirpazir BRACKET_BAZ_KW ebarat BRACKET_BASTE_KW  {System.out.println("Rule 38.2");}
	|
	taghirpazir NOGHTE_KW saved_identifier {System.out.println("Rule 38.3");}
	
taghirnapazir :
	PARANTHESIS_BAZ_KW ebarat PARANTHESIS_BASTE_KW  {System.out.println("Rule 39.1");
		$$ = new EVal();	
		((EVal)$$).place = $2.place;
		((EVal)$$).type = $2.type;
		((EVal)$$).trueList = $2.trueList;
		((EVal)$$).falseList = $2.falseList;}
	|
	sedaZadan  {System.out.println("Rule 39.2");}
	|
	meghdareSabet {
		System.out.println("Rule 39.3: meghdareSabet to taghirnapazir");
		$$ = new EVal();	
		((EVal)$$).place = $1.place;
		((EVal)$$).type = $1.type;
		((EVal)$$).trueList = $1.trueList;
		((EVal)$$).falseList = $1.falseList;
	}

sedaZadan :
	saved_identifier PARANTHESIS_BAZ_KW bordareVorudiha PARANTHESIS_BASTE_KW {System.out.println("Rule 40.1");} 
	|
	saved_identifier PARANTHESIS_BAZ_KW PARANTHESIS_BASTE_KW {System.out.println("Rule 40.2");} 

bordareVorudiha: 
	bordareVorudiha COMMA ebarat {System.out.println("Rule 42.1");}
	|
	ebarat {System.out.println("Rule 42.2");}

meghdareSabet:	
	saved_integer {
		System.out.println("Rule 43.1: " +
			"constant_expressions: saved_integer");
		$$ = new EVal();
		((EVal)$$).place = $1.place;
		((EVal)$$).type = $1.type;
		((EVal)$$).trueList = $1.trueList;
		((EVal)$$).falseList = $1.falseList;
		((EVal)$$).nextList = $1.nextList;
	}
	|
	saved_real {
		System.out.println("Rule 43.2: " +
			"constant_expressions: saved_real");
		$$ = new EVal();
		((EVal)$$).place = $1.place;
		((EVal)$$).type = $1.type;
		((EVal)$$).trueList = $1.trueList;
		((EVal)$$).falseList = $1.falseList;
		((EVal)$$).nextList = $1.nextList;
	}
	|
	saved_char {
		System.out.println("Rule 43.3: " +
			"constant_expressions: saved_char");
		$$ = new EVal();
		((EVal)$$).place = $1.place;
		((EVal)$$).type = $1.type;
		((EVal)$$).trueList = $1.trueList;
		((EVal)$$).falseList = $1.falseList;
		((EVal)$$).nextList = $1.nextList;
	}
	|
	saved_boolean {
		System.out.println("Rule 43.4: " +
			"constant_expressions: saved_boolean");
		$$ = new EVal();
		((EVal)$$).place = $1.place;
		((EVal)$$).type = $1.type;
		((EVal)$$).trueList = $1.trueList;
		((EVal)$$).falseList = $1.falseList;
		((EVal)$$).nextList = $1.nextList;
	} 

saved_identifier:
	SHENASE {
		System.out.println("Rule 30: " +
			"saved_identifier: IDENTIFIER");
		$$ = new EVal();
		((EVal)$$).place = lexIdentifier;
}
	
saved_integer:
	ADAD {
		System.out.println("Rule 31: " +
			"saved_integer: INTEGER_CONSTANT");
		$$ = new EVal();
		((EVal)$$).place = newTemp(EVal.TYPE_CODE_INTEGER, false);
		((EVal)$$).type = EVal.TYPE_CODE_INTEGER;
		((EVal)$$).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)$$).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)$$).nextList = EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);

		emit(":=", String.valueOf(lexInt), null, ((EVal)$$).place);
		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.

}

saved_real:
	ADAD_ASHARI {
		System.out.println("Rule 32: " +
			"saved_real: REAL_CONSTANT");
		$$ = new EVal();
		((EVal)$$).place = newTemp(EVal.TYPE_CODE_REAL, false);
		((EVal)$$).type = EVal.TYPE_CODE_REAL;
		((EVal)$$).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)$$).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)$$).nextList = EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);

		emit(":=", String.valueOf(lexReal), null, ((EVal)$$).place);
		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
}

saved_char:
	HARFE_SABET {
		System.out.println("saved_char: HARFE_SABET");
		$$ = new EVal();
		((EVal)$$).place = newTemp(EVal.TYPE_CODE_CHAR, false);
		((EVal)$$).type = EVal.TYPE_CODE_CHAR;
		((EVal)$$).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)$$).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)$$).nextList = EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);

		emit(":=", "'" + String.valueOf(lexChar) + "'", null, ((EVal)$$).place);
		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
}
	
saved_boolean:
	TRUE_KW {
		System.out.println("Rule 34.1: " +
			"saved_boolean: TRUE_KW");
		$$ = new EVal();
		((EVal)$$).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)$$).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)$$).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)$$).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)$$).nextList = EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);
		
		if(lexBoolean)
			emit(":=", "1", null, ((EVal)$$).place);
		else
			emit(":=", "0", null, ((EVal)$$).place);
		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	}|
	FALSE_KW {
		System.out.println("Rule 34.2: " +
			"saved_boolean: FALSE_KW");
		$$ = new EVal();
		((EVal)$$).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)$$).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)$$).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)$$).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)$$).nextList = EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);
		
		if(lexBoolean)
			emit(":=", "1", null, ((EVal)$$).place);
		else
			emit(":=", "0", null, ((EVal)$$).place);
		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	}
	
M:
	{
		System.out.println("Rule 35: " +
			"M: ");
		$$ = new EVal();
		((EVal)$$).quad = nextQuad();
	}

N:
	{
		System.out.println("Rule 36: " +
			"N: ");
		$$ = new EVal();
		((EVal)$$).nextList = EVal.makeList(nextQuad());
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.
}

%%
class EVal {

	public static final int TYPE_CODE_UNKNOWN = -1;
	public static final int TYPE_CODE_INTEGER = 0;
	public static final int TYPE_CODE_REAL = 1;
	public static final int TYPE_CODE_CHAR = 2;
	public static final int TYPE_CODE_BOOLEAN = 3;
	public static final int TYPE_CODE_RANGE = 4;
	

	public String place;
	public int type;
	public boolean array;

	public int quad;

	public static ArrayList<Integer> arrayIndexOutOfBoundList = new ArrayList<>();
	public static ArrayList<Integer> invalidArraySizeList = new ArrayList<>();
	public ArrayList<Integer> initList;
	public ArrayList<Integer> nextList;
	public ArrayList<Integer> trueList;
	public ArrayList<Integer> falseList;

	public ArrayList<ArrayList<EVal>> initializersList;
	public ArrayList<EVal> declareds;

	public ArrayList<EVal> initializers;

	public EVal() {
	}

	public static ArrayList<Integer> makeList(int number) {
		ArrayList<Integer> result = new ArrayList<>();
		result.add(number);
		return result;
	}

	public static ArrayList<Integer> merge(ArrayList<Integer> al1, ArrayList<Integer> al2) {
		ArrayList<Integer> result = new ArrayList<>();
		result.addAll(al1);
		result.addAll(al2);
		return result;
	}

	public static ArrayList<ArrayList<EVal>> makeInitializersList(ArrayList<EVal> initializers) {
		ArrayList<ArrayList<EVal>> result = new ArrayList<>();
		result.add(initializers);
		return result;
	}

	public static ArrayList<EVal> makeInitializersOrDeclareds(EVal initializerOrdDeclared) {
		ArrayList<EVal> result = new ArrayList<>();
		result.add(initializerOrdDeclared);
		return result;
	}
}

class Quadruple {

	public static final String LINE_STR = "Line";

	public String operation;
	public String arg0;
	public String arg1;
	public String result;

	public Quadruple(String operation, String arg0, String arg1, String result) {
		this.operation = operation;
		this.arg0 = arg0;
		this.arg1 = arg1;
		this.result = result;
	}

	@Override
	public String toString() {
		switch(operation.toLowerCase()){
			case "goto":
				return operation + " " + LINE_STR + result + ";";
			case "check":
				return "if (" + arg0 + ") goto " + LINE_STR + result + ";";
			case "==":
			case "<":
			case "<=":
			case ">":
			case ">=":
			case "+":
			case "-":
			case "*":
			case "/":
			case "%":
				return result + " = " + arg0 + " " + operation + " " + arg1 + ";";
			case "=":
				return result + " = " + arg0 + " " + "==" + " " + arg1 + ";";
			case "<>":
				return result + " != " + arg0 + " " + "==" + " " + arg1 + ";";
			case "usub":
				return result + " = -" + arg0 + ";";
			case ":=":
				return result + " = " + arg0 + ";";
			case "cast":
				return result + " = (" + arg1 + ") " + arg0 + ";";
			case "init":
				return arg1 + " " + result + ";";
			case "iprint":
				return "printf(\"%s = %d\\n\", \"" + result + "\", " + result + ");";
			case "rprint":
				return "printf(\"%s = %f\\n\", \"" + result + "\", " + result + ");";
			case "cprint":
				return "printf(\"%s = '%c'\\n\", \"" + result + "\", " + result + ");";
			case "bprint":
				return "printf(\"%s = %s\\n\", \"" + result + "\", " + result + " ? \"true\" : \"false\");";
			case "aiprint":
				return "printf(\"%s[%d] = %d\\n\", \"" + result + "\", " + arg0 + ", " + result + "[" + arg1 + "]);";
			case "arprint":
				return "printf(\"%s[%d] = %f\\n\", \"" + result + "\", " + arg0 + ", " + result + "[" + arg1 + "]);";
			case "acprint":
				return "printf(\"%s[%d] = '%c'\\n\", \"" + result + "\", " + arg0 + ", " + result + "[" + arg1 + "]);";
			case "abprint":
				return "printf(\"%s[%d] = %s\\n\", \"" + result + "\", " + arg0 + ", " + result + "[" + arg1 + "] ? \"true\" : \"false\");";
			case "[]=":
				return "*(" + result + " + " + arg1 + ") = " + arg0 + ";";
			case "=[]":
				return result + " = *(" + arg0 + " + " + arg1 + ");";
			case "malloc":
				return result + " = " + "malloc(sizeof(" + arg0 + ") * " + arg1+ ");";
			default:
				return null;
		}
	}
}

class SymbolTable {

	public static final int NOT_IN_SYMBOL_TABLE = -1;

	public ArrayList<String> names;
	public ArrayList<Integer> types;
	public ArrayList<Boolean> arrays;

	public SymbolTable() {
		names = new ArrayList<>();
		types = new ArrayList<>();
		arrays = new ArrayList<>();
	}

	public int lookUp(String name) {
		return names.indexOf(name);
	}

	public boolean addToSymbolTable(String name, int type, boolean array) {
		if (lookUp(name) == -1) {
			System.out.println(name+" added");
			names.add(name);
			types.add(type);
			arrays.add(array);
			return true;
		}
		return false;
	}

	@Override
    public String toString() {
        if(names.size() == 0)
            return null;
        String res = "";
        for(int i = 0; i < names.size(); i++) {
            switch (types.get(i)) {
                case EVal.TYPE_CODE_INTEGER:
                    res += "\t" + YYParser.TYPE_STRING_INTEGER;
                    break;
                case EVal.TYPE_CODE_REAL:
                    res += "\t" + YYParser.TYPE_STRING_REAL;
                    break;
                case EVal.TYPE_CODE_CHAR:
                    res += "\t" + YYParser.TYPE_STRING_CHAR;
                    break;
                case EVal.TYPE_CODE_BOOLEAN:
                    res += "\t" + YYParser.TYPE_STRING_BOOLEAN;
                    break;
                case EVal.TYPE_CODE_RANGE:
                    continue;
            }
            res += (arrays.get(i) ? " *" : " ") + names.get(i) + ";\n";
        }
        return res;
	}

}
