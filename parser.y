%{
package myCompiler;
import java.io.*;
%}

%token COMMENT FLOAT_KW INT_KW BOOLEAN_KW CHAR_KW AKULAD_BAZ_KW AKULAD_BASTE_KW 
ADD_KW BOOLEAN_CONSTANT SWITCH_KW END_KW DEFAULT_KW BREAK_KW 
RETURN_KW COMMA PROGRAM_KW STRUCT_KW CONSTANT_KW IF_KW THEN_KW ELSE_KW AND_KW OR_KW 
NOT_KW WHILE_KW NOGHTE_VIRGUL ADAD SHENASE HARFE_SABET 
KEY_KW MORE_THAN_KW NOGHTE_KW MULTIPLY_KW BRACKET_BASTE_KW BRACKET_BAZ_KW PARANTHESIS_BASTE_KW PARANTHESIS_BAZ_KW
TRUE_KW QUESTION_KW EQUAL_EQUAL_KW EQUAL_KW DEVIDE_KW OR_ELSE_KW FALSE_KW AND_THEN_KW MINUS_KW DONOGHTE_KW LESS_EQUAL_KW
MOD_KW LESS_THAN_KW MORE_EQUAL_KW 
PLUS_EQUAL_KW PLUS_PLUS_KW MINUS_MINUS_KW MINU_EQUAL_KW MULTIPLY_EQUAL_KW DEVIDE_EQUAL_KW

%code {
	static PrintStream writer;

    public static void main(String args[]) throws IOException, FileNotFoundException {
        YYParser yyparser;
        final Yylex lexer;

        writer = new PrintStream(new File("output.txt"));
        lexer = new Yylex(new InputStreamReader(new FileInputStream("java_code.txt")));

        yyparser = new YYParser(new Lexer() {

            @Override
            public int yylex() {
                int yyl_return = -1;
                try {

                    yyl_return = lexer.yylex();
                } catch (IOException e) {
                    System.err.println("IO error :" + e);
                }
                return yyl_return;
            }

            @Override
            public void yyerror(String error) {
                System.err.println("Error : " + error);
            }

            @Override
            public Object getLVal() {
                return null;
            }
        });
        yyparser.parse();

        return;
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
	jenseMahdud tarifhayeMoteghayyerha NOGHTE_VIRGUL {
		System.out.println("Rule 6");
	}

jenseMahdud:
	CONSTANT_KW jens {
		System.out.println("Rule 7.1");
	}
	|
	jens {
		System.out.println("Rule 7.2");
	}
	
jens:
	INT_KW {System.out.println("Rule 8.1");}
	| FLOAT_KW {System.out.println("Rule 8.2");}
	|CHAR_KW {System.out.println("Rule 8.3");}
	|BOOLEAN_KW{System.out.println("Rule 8.4");}
	
tarifeMoteghayyer:
	jens tarifhayeMoteghayyerha NOGHTE_VIRGUL {
		System.out.println("Rule 9");
	}
	
tarifhayeMoteghayyerha:
	tarifeMeghdareAvalie{
		System.out.println("Rule 10.1 ");
	} |
	tarifhayeMoteghayyerha COMMA tarifeMeghdareAvalie {
		System.out.println("Rule 10.2 ");
	}
	
tarifeMeghdareAvalie:
	tarifeShenaseMoteghayer {System.out.println("Rule 11.1 ");}
	| tarifeShenaseMoteghayer EQUAL_KW ebarateSade{
		System.out.println("Rule 11.2 ");
	}

tarifeShenaseMoteghayer:
	SHENASE {
		System.out.println("Rule 12.1: " );
	}
	| SHENASE BRACKET_BAZ_KW ADAD BRACKET_BASTE_KW {
		System.out.println("Rule 12.2: ");
	}
	
tarifeTabe:
	jens SHENASE PARANTHESIS_BAZ_KW vorudi PARANTHESIS_BASTE_KW jomle {
		System.out.println("Rule 13.1");
	}
	|
	jens SHENASE PARANTHESIS_BAZ_KW PARANTHESIS_BASTE_KW jomle {
		System.out.println("Rule 13.2");
	}
	|
	SHENASE PARANTHESIS_BAZ_KW vorudi PARANTHESIS_BASTE_KW jomle {System.out.println("Rule 13.3");}
	|
	SHENASE PARANTHESIS_BAZ_KW PARANTHESIS_BASTE_KW jomle {System.out.println("Rule 13.4");}

vorudi :
	vorudiha {System.out.println("Rule 14");}
	
vorudiha :
	vorudiha NOGHTE_VIRGUL jensVorudiha {System.out.println("Rule 15.1"}
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
	taghirpazir EQUAL_KW ebarat {System.out.println("Rule 29.1");}
	|
	taghirpazir PLUS_EQUAL_KW ebarat {System.out.println("Rule 29.2");}
	|
	taghirpazir MINU_EQUAL_KW ebarat {System.out.println("Rule 29.3");}
	|
	taghirpazir MULTIPLY_EQUAL_KW ebarat {System.out.println("Rule 29.4");}
	|
	taghirpazir DEVIDE_EQUAL_KW ebarat {System.out.println("Rule 29.5");}
	|
	taghirpazir PLUS_PLUS_KW {System.out.println("Rule 29.6");}
	|
	taghirpazir MINUS_MINUS_KW  {System.out.println("Rule 29.7");}
	|
	ebarateSade {System.out.println(" Rule 29.8");}

ebarateSade :
	ebarateSade OR_KW ebarateSade {System.out.println("Rule 30.1");}
	|
	ebarateSade AND_KW ebarateSade {System.out.println("Rule 30.2");}
	|
	ebarateSade OR_ELSE_KW ebarateSade {System.out.println("Rule 30.3");}
	|
	ebarateSade AND_THEN_KW ebarateSade {System.out.println("Rule 30.4");}
	|
	ebarateSade NOT_KW ebarateSade {System.out.println("Rule 30.5");}
	|
	ebarateRabetei {System.out.println("Rule 30.6");}

ebarateRabetei :
	ebarateRiaziManteghi {System.out.println("Rule 31.1");}
	|
	ebarateRiaziManteghi amalgareRabetei ebarateRiaziManteghi {System.out.println("Rule 31.2");}

amalgareRabetei :
	LESS_THAN_KW {System.out.println("Rule 32.1");}
	|
	LESS_EQUAL_KW {System.out.println("Rule 32.2");}
	|
	MORE_THAN_KW {System.out.println("Rule 32.3");}
	|
	MORE_EQUAL_KW {System.out.println("Rule 32.4");}
	|
	EQUAL_EQUAL_KW {System.out.println("Rule 32.5");}

ebarateRiaziManteghi :
	ebarateYegani {System.out.println("Rule 33.1");}
	|
	ebarateRiaziManteghi ADD_KW ebarateRiaziManteghi {System.out.println("Rule 33.2");}
	|
	ebarateRiaziManteghi MINUS_KW ebarateRiaziManteghi {System.out.println("Rule 33.2");}
	|
	ebarateRiaziManteghi MULTIPLY_KW ebarateRiaziManteghi {System.out.println("Rule 33.2");}
	|
	ebarateRiaziManteghi DEVIDE_KW ebarateRiaziManteghi {System.out.println("Rule 33.2");}
	|
	ebarateRiaziManteghi MOD_KW ebarateRiaziManteghi {System.out.println("Rule 33.2");}


ebarateYegani :
	amalgareYegani ebarateYegani {System.out.println("Rule 35.1");}
	|
	amel {System.out.println("Rule 35.2");}

amalgareYegani :
	MINUS_KW {System.out.println("Rule 36.1");}
	|
	MULTIPLY_KW {System.out.println("Rule 36.2");}
	|
	QUESTION_KW {System.out.println("Rule 36.3");}

amel :
	taghirpazir  {System.out.println("Rule 37.1");}
	|
	taghirnapazir  {System.out.println("Rule 37.2");}

taghirpazir :
	SHENASE  {System.out.println("Rule 38.1");}
	|
	taghirpazir BRACKET_BAZ_KW ebarat BRACKET_BASTE_KW  {System.out.println("Rule 38.2");}
	|
	taghirpazir NOGHTE_KW SHENASE {System.out.println("Rule 38.3");}
	
taghirnapazir :
	PARANTHESIS_BAZ_KW ebarat PARANTHESIS_BASTE_KW  {System.out.println("Rule 39.1");}
	|
	sedaZadan  {System.out.println("Rule 39.2");}
	|
	meghdareSabet {System.out.println("Rule 39.3");}

sedaZadan :
	SHENASE PARANTHESIS_BAZ_KW bordareVorudi PARANTHESIS_BASTE_KW {System.out.println("Rule 40.1");} 
	|
	SHENASE PARANTHESIS_BAZ_KW PARANTHESIS_BASTE_KW {System.out.println("Rule 40.2");} 


bordareVorudi: 
	bordareVorudiha {System.out.println("Rule 41");}

bordareVorudiha: 
	bordareVorudiha COMMA ebarat {System.out.println("Rule 42.1");}
	|
	ebarat {System.out.println("Rule 42.2");}

meghdareSabet:	
	ADAD {System.out.println("Rule 43.1");}
	|
	FLOAT_KW {System.out.println("Rule 43.1");}
	|
	HARFE_SABET {System.out.println("Rule 43.2");}
	|
	TRUE_KW {System.out.println("Rule 43.3");}
	|
	FALSE_KW {System.out.println("Rule 43.4");}
