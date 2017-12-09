import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.*;

class MainClass {
    public static void main(String[] args) {
        FileReader fr = null;
        String input = "code.txt";
        try {
            fr = new FileReader(input);		
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Lexeme\tToken\tAttribute");
        Yylex yylex = new Yylex(fr);
        try {
            yylex.yylex();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
  
%%

PROGRAM_KW = (\u0628\u0631\u0646\u0627\u0645\u0647)
struct_kw = (\u0633\u0627\u062e\u062a\u0627\u0631)
constant_kw = (\u062b\u0627\u0628\u062a)
INT_KW = (\u0635\u062d\u062d)

SWITCH_KW = ( \u062d\u0627\u0644\u062a)
end_kw = (\u062a\u0645\u0627\u0645)
default_kw = (\u067e\u06cc\u0634\u0641\u0631\u0636)
break_kw = (\u0628\u0634\u06a9\u0646)
return_kw = (\u0628\u0631\u06af\u0631\u062f\u0627\u0646)
AKULAD_BAZ_KW = [{]
AKULAD_BASTE_KW = [}]

IF_KW = (\u0627\u06AF\u0631)
THEN_KW = (\u0622\u0646\u06af\u0627\u0647)
ELSE_KW = (\u0648\u06af\u0631\u0646\u0647)

AND_KW = (\u0648)
OR_KW = (\u06cc\u0627) | (\u0627\u0648\u0631)
NOT_KW = (\u062e\u0644\u0627\u0641) 
while_kw = (\u0648\u0642\u062a\u06cc)|(\u0648\u0642\u062a)

PERSIAN_LETTER = [\u0600-\u06FF\uFB50-\uFDFF\uFE70-\uFEFF]	

NONZERO_DIGIT = [1-9]
DIGIT = "0"|{NONZERO_DIGIT}

harf_ragham = {DIGIT} | {PERSIAN_LETTER}

shenase = {PERSIAN_LETTER}{harf_ragham}*
adad = {DIGIT}+
dot = "."
ADAD_ASHARI = {DIGIT}+{dot}{DIGIT}+
back_slash = \
slash = (\u002f)
new_line = "\s"|"\n"|"\r"|"\t"
null_char = {back_slash}0
harfe_sabet = {back_slash}?"'"{back_slash}?(.){back_slash}?"'"{back_slash}?
noghte_virgul = ";"|[\u061b]
comma = ","|[\u060c]
comments = {slash}{slash}({PERSIAN_LETTER}|[A-z]|{DIGIT})*		{new_line} | {slash}"*"(.)*"*"{slash}
FLOAT_KW = (\u0627\u0639\u0634\u0627\u0631\u06cc) | (\u0627\u0639\u0634\u0627\u0631)
BOOLEAN_KW =(\u0645\u0646\u0637\u0642\u06cc) | (\u0645\u0646\u0637\u0642)
CHAR_KW = (\u062d\u0631\u0641)

KEY_KW = (\u06a9\u0644\u06cc\u062f)
MORE_THAN_KW = "<"
NOGHTE_KW = "."
MULTIPLY_KW = "*"
BRACKET_BASTE_KW = "["
BRACKET_BAZ_KW = "]"
<<<<<<< HEAD
PARANTHESIS_BASTE_KW = "(" 
PARANTHESIS_BAZ_KW = ")"
OR_ELSE_KW = (\u06cc\u0627\u0648\u06af\u0631\u0646\u0647))
=======
PARANTHESIS_BASTE_KW = ")" 
PARANTHESIS_BAZ_KW = "("
OR_ELSE_KW = (\u06cc\u0627\u0648\u06af\u0631\u0646\u0647)
>>>>>>> cb659c34111e1022994ec2a08853475b6b1a272d
FALSE_KW = (\u063a\u0644\u0637)
AND_THEN_KW = (\u0648\u0647\u0645\u0686\u0646\u06cc\u0646) 
MINUS_KW ="-" | (\u002d) | [-]
TRUE_KW = (\u062f\u0631\u0633\u062a) 
QUESTION_KW = "?" | [\u061f] 
EQUAL_EQUAL_KW = "=="
EQUAL_KW = "="
DEVIDE_KW = "/" |(\u002f)

DONOGHTE_KW = ":"
LESS_EQUAL_KW = ">="
MOD_KW ="%"
LESS_THAN_KW = ">"  
MORE_EQUAL_KW = "<=" 
PLUS_PLUS_KW = "++"
PLUS_EQUAL_KW = "+="
MINUS_MINUS_KW = "--"
MINUS_EQUAL_KW = "-=" 
MULTIPLY_EQUAL_KW = "*="
DEVIDE_EQUAL_KW = "/="

ADD_KW = [+]


%%
{comments} {
	if(p){System.out.println(yytext() + "\t" + "comments\t" + '-');}
	return YYParser.COMMENT;
}

{KEY_KW} {
	if(p){System.out.println(yytext() + "\t" + "KEY_KW\t" + '-');}
	return YYParser.KEY_KW ;
}
{NOGHTE_KW} {
	if(p){System.out.println(yytext() + "\t" + "NOGHTE_KW\t" + '-');}
	return YYParser.NOGHTE_KW ;
	//System.out.println(yytext() + "\t" + "NOGHTE_KW\t" + '-');
}

{BRACKET_BASTE_KW} {
	if(p){System.out.println(yytext() + "\t" + "BRACKET_BASTE_KW\t" + '-');}

	return YYParser.BRACKET_BASTE_KW ;
	//System.out.println(yytext() + "\t" + "BRACKET_BASTE_KW\t" + '-');
}
{BRACKET_BAZ_KW} {
	if(p){System.out.println(yytext() + "\t" + "BRACKET_BAZ_KW\t" + '-');}

	return YYParser.BRACKET_BAZ_KW ;
	//System.out.println(yytext() + "\t" + "BRACKET_BAZ_KW\t" + '-');
}
{PARANTHESIS_BASTE_KW} {
	if(p){System.out.println(yytext() + "\t" + "PARANTHESIS_BASTE_KW\t" + '-');}

	return YYParser.PARANTHESIS_BASTE_KW ;
	//System.out.println(yytext() + "\t" + "PARANTHESIS_BASTE_KW\t" + '-');
}
{PARANTHESIS_BAZ_KW} {
	if(p){System.out.println(yytext() + "\t" + "PARANTHESIS_BAZ_KW\t" + '-');}
	return YYParser.PARANTHESIS_BAZ_KW ;
	//System.out.println(yytext() + "\t" + "PARANTHESIS_BAZ_KW\t" + '-');
}
{TRUE_KW} {
	if(p){System.out.println(yytext() + "\t" + "TRUE_KW\t" + '-');}
	YYParser.lexBoolean = Boolean.parseBoolean("true");
	return YYParser.TRUE_KW ;
	//System.out.println(yytext() + "\t" + "TRUE_KW\t" + '-');
}

{LESS_EQUAL_KW} {
	if(p){System.out.println(yytext() + "\t" + "LESS_EQUAL_KW\t" + '-');}
	return YYParser.LESS_EQUAL_KW ;
	//System.out.println(yytext() + "\t" + "LESS_EQUAL_KW\t" + '-');
}
{DONOGHTE_KW} {
	if(p){System.out.println(yytext() + "\t" + "DONOGHTE_KW\t" + '-');}
	return YYParser.DONOGHTE_KW ;
	//System.out.println(yytext() + "\t" + "DONOGHTE_KW\t" + '-');
}
{AND_THEN_KW} {
	if(p){System.out.println(yytext() + "\t" + "AND_THEN_KW\t" + '-');}
	return YYParser.AND_THEN_KW ;
	//System.out.println(yytext() + "\t" + "AND_THEN_KW\t" + '-');
}
{FALSE_KW} {
	if(p){System.out.println(yytext() + "\t" + "FALSE_KW\t" + '-');}
	YYParser.lexBoolean = Boolean.parseBoolean("false");
	return YYParser.FALSE_KW ;
	//System.out.println(yytext() + "\t" + "FALSE_KW\t" + '-');
}
{OR_ELSE_KW} {
	if(p){System.out.println(yytext() + "\t" + "OR_ELSE_KW\t" + '-');}
	return YYParser.OR_ELSE_KW ;
	//System.out.println(yytext() + "\t" + "OR_ELSE_KW\t" + '-');
}

{EQUAL_EQUAL_KW} {
	if(p){System.out.println(yytext() + "\t" + "EQUAL_EQUAL_KW\t" + '-');}
	return YYParser.EQUAL_EQUAL_KW ;
	//System.out.println(yytext() + "\t" + "EQUAL_EQUAL_KW\t" + '-');
}
{EQUAL_KW} {
	if(p){System.out.println(yytext() + "\t" + "EQUAL_KW\t" + '-');}
	return YYParser.EQUAL_KW ;
	//System.out.println(yytext() + "\t" + "EQUAL_KW\t" + '-');
}
{QUESTION_KW} {
	if(p){System.out.println(yytext() + "\t" + "QUESTION_KW\t" + '-');}
	return YYParser.QUESTION_KW ;
	//System.out.println(yytext() + "\t" + "QUESTION_KW\t" + '-');
}
{MOD_KW} {
	if(p){System.out.println(yytext() + "\t" + "MOD_KW\t" + '-');}
	return YYParser.MOD_KW ;
	//System.out.println(yytext() + "\t" + "MOD_KW\t" + '-');
}
{LESS_THAN_KW} {
	if(p){System.out.println(yytext() + "\t" + "LESS_THAN_KW\t" + '-');}
	return YYParser.LESS_THAN_KW ;
	//System.out.println(yytext() + "\t" + "LESS_THAN_KW\t" + '-');
}

{MORE_EQUAL_KW} {
	if(p){System.out.println(yytext() + "\t" + "MORE_EQUAL_KW\t" + '-');}
	return YYParser.MORE_EQUAL_KW ;
	//System.out.println(yytext() + "\t" + "MORE_EQUAL_KW\t" + '-');
}

{MORE_THAN_KW} {
	if(p){System.out.println(yytext() + "\t" + "MORE_THAN_KW\t" + '-');}
	return YYParser.MORE_THAN_KW ;
	//ystem.out.println(yytext() + "\t" + "MORE_THAN_KW\t" + '-');
}

{PLUS_EQUAL_KW} {
	if(p){System.out.println(yytext() + "\t" + "PLUS_EQUAL_KW\t" + '-');}
	return YYParser.PLUS_EQUAL_KW ;
	//System.out.println(yytext() + "\t" + "PLUS_EQUAL_KW\t" + '-');
}
{PLUS_PLUS_KW} {
	if(p){System.out.println(yytext() + "\t" + "PLUS_PLUS_KW\t" + '-');}
	return YYParser.PLUS_PLUS_KW ;
	//System.out.println(yytext() + "\t" + "PLUS_PLUS_KW\t" + '-');
}

{ADD_KW} {
	if(p){System.out.println(yytext() + "\t" + "ADD_KW\t" + '-');}
	//System.out.println(yytext() + "\t" + "ADD_KW\t" + '-');
	return YYParser.ADD_KW;
}

{MINUS_MINUS_KW} {
	if(p){System.out.println(yytext() + "\t" + "MINUS_MINUS_KW\t" + '-');}
	return YYParser.MINUS_MINUS_KW ;
	//System.out.println(yytext() + "\t" + "MINUS_MINUS_KW\t" + '-');
}
{MINUS_EQUAL_KW} {
	if(p){System.out.println(yytext() + "\t" + "MINUS_EQUAL_KW\t" + '-');}
	return YYParser.MINUS_EQUAL_KW ;
	//System.out.println(yytext() + "\t" + "MINU_EQUAL_KW\t" + '-');
}
{MINUS_KW} {
	if(p){System.out.println(yytext() + "\t" + "MINUS_KW\t" + '-');}
	return YYParser.MINUS_KW ;
}
{MULTIPLY_EQUAL_KW} {
	if(p){System.out.println(yytext() + "\t" + "MULTIPLY_EQUAL_KW\t" + '-');}
	return YYParser.MULTIPLY_EQUAL_KW ;
	//System.out.println(yytext() + "\t" + "MULTIPLY_EQUAL_KW\t" + '-');
}
{MULTIPLY_KW} {
	if(p){System.out.println(yytext() + "\t" + "MULTIPLY_KW\t" + '-');}
	return YYParser.MULTIPLY_KW ;
	//System.out.println(yytext() + "\t" + "MULTIPLY_KW\t" + '-');
}

{DEVIDE_EQUAL_KW} {
	if(p){System.out.println(yytext() + "\t" + "DEVIDE_EQUAL_KW\t" + '-');}
	return YYParser.DEVIDE_EQUAL_KW ;
	//System.out.println(yytext() + "\t" + "DEVIDE_EQUAL_KW\t" + '-');
}

{DEVIDE_KW} {
	if(p){System.out.println(yytext() + "\t" + "DEVIDE_KW\t" + '-');}
	return YYParser.DEVIDE_KW ;
	//System.out.println(yytext() + "\t" + "DEVIDE_KW\t" + '-');
}

{AKULAD_BAZ_KW} {
	if(p){System.out.println(yytext() + "\t" + "AKULAD_BAZ_KW\t" + '-');}
	return YYParser.AKULAD_BAZ_KW;
}
{AKULAD_BASTE_KW} {
	if(p){System.out.println(yytext() + "\t" + "AKULAD_BASTE_KW\t" + '-');}
	return YYParser.AKULAD_BASTE_KW;
}

{INT_KW} {
	//System.out.println(yytext() + "\t" + "INT_KW\t" + '-');
	if(p){System.out.println(yytext() + "\t" + "INT_KW\t" + '-');}
	return YYParser.INT_KW;
}
{FLOAT_KW} {
	if(p){System.out.println(yytext() + "\t" + "FLOAT_KW\t" + '-');}
	//System.out.println(yytext() + "\t" + "FLOAT_KW\t" + '-');
	return YYParser.FLOAT_KW;
}
{BOOLEAN_KW} {
	if(p){System.out.println(yytext() + "\t" + "BOOLEAN_KW\t" + '-');}
	//System.out.println(yytext() + "\t" + "BOOLEAN_KW\t" + '-');
	return YYParser.BOOLEAN_KW;
}
{CHAR_KW} {
	if(p){System.out.println(yytext() + "\t" + "CHAR_KW\t" + '-');}
	//System.out.println(yytext() + "\t" + "CHAR_KW\t" + '-');
	return YYParser.CHAR_KW;
}
{SWITCH_KW} {
	if(p){System.out.println(yytext() + "\t" + "SWITCH_KW\t" + '-');}
	//System.out.println(yytext() + "\t" + "SWITCH_KW\t" + '-');
	return YYParser.SWITCH_KW;
}
{end_kw} {
	if(p){System.out.println(yytext() + "\t" + "END_KW\t" + '-');}
	//System.out.println(yytext() + "\t" + "end_kw\t" + '-');
	return YYParser.END_KW;
}
{default_kw} {
	if(p){System.out.println(yytext() + "\t" + "DEFAULT_KW\t" + '-');}
	//System.out.println(yytext() + "\t" + "default_kw\t" + '-');
	return YYParser.DEFAULT_KW;
}
{break_kw} {
	if(p){System.out.println(yytext() + "\t" + "BREAK_KW\t" + '-');}
	//System.out.println(yytext() + "\t" + "break_kw\t" + '-');
	return YYParser.BREAK_KW;
}
{return_kw} {
	if(p){System.out.println(yytext() + "\t" + "RETURN_KW\t" + '-');}
	//System.out.println(yytext() + "\t" + "return_kw\t" + '-');
	return YYParser.RETURN_KW;
}

{comma} {
	if(p){System.out.println(yytext() + "\t" + "COMMA\t" + '-');}
	//System.out.println(yytext() + "\t" + "comma\t" + '-');
	return YYParser.COMMA;
}

{PROGRAM_KW} {
	if(p){System.out.println(yytext() + "\t" + "PROGRAM_KW\t" + '-');}
	//System.out.println(yytext() + "\t" + "PROGRAM_KW\t" + '-');
	return YYParser.PROGRAM_KW;
}
{struct_kw} {
	if(p){System.out.println(yytext() + "\t" + "STRUCT_KW\t" + '-');}
	//System.out.println(yytext() + "\t" + "type_kw\t" + '-');
	return YYParser.STRUCT_KW;
}
{constant_kw} {
	if(p){System.out.println(yytext() + "\t" + "CONSTANT_KW\t" + '-');}
	//System.out.println(yytext() + "\t" + "constant_kw\t" + '-');
	return YYParser.CONSTANT_KW;
}

{IF_KW} {
	if(p){System.out.println(yytext() + "\t" + "IF_KW\t" + '-');}
	//System.out.println(yytext() + "\t" + "IF_KW\t" + '-');
	return YYParser.IF_KW;
}
{THEN_KW} {
	if(p){System.out.println(yytext() + "\t" + "THEN_KW\t" + '-');}
	//System.out.println(yytext() + "\t" + "THEN_KW\t" + '-');
	return YYParser.THEN_KW;
}
{ELSE_KW} {
	if(p){System.out.println(yytext() + "\t" + "ELSE_KW\t" + '-');}
	//System.out.println(yytext() + "\t" + "ELSE_KW\t" + '-');
	return YYParser.ELSE_KW;
}
{AND_KW} {
	if(p){System.out.println(yytext() + "\t" + "AND_KW\t" + '-');}
	//System.out.println(yytext() + "\t" + "AND_KW\t" + '-');
	return YYParser.AND_KW;
}
{OR_KW} {
	if(p){System.out.println(yytext() + "\t" + "OR_KW\t" + '-');}
	//System.out.println(yytext() + "\t" + "OR_KW\t" + '-');
	return YYParser.OR_KW;
}
{NOT_KW} {
	if(p){System.out.println(yytext() + "\t" + "NOT_KW\t" + '-');}
	//System.out.println(yytext() + "\t" + "NOT_KW\t" + '-');
	return YYParser.NOT_KW;
}
{while_kw} {
	if(p){System.out.println(yytext() + "\t" + "WHILE_KW\t" + '-');}
	//System.out.println(yytext() + "\t" + "while_kw\t" + '-');
	return YYParser.WHILE_KW;
}

{noghte_virgul} {
	if(p){System.out.println(yytext() + "\t" + "NOGHTE_VIRGUL\t" + '-');}
	//System.out.println(yytext() + "\t" + "noghte_virgul\t" + '-');
	return YYParser.NOGHTE_VIRGUL;
}

{ADAD_ASHARI} {
	if(p){System.out.println(yytext() + "\t" + "ADAD\t" + '-');}
	//System.out.println(yytext() + "\t" + "adad\t" + '-');
	YYParser.lexReal = Double.parseDouble(yytext());
	return YYParser.ADAD_ASHARI;
}

{adad} {
	if(p){System.out.println(yytext() + "\t" + "ADAD\t" + '-');}
	//System.out.println(yytext() + "\t" + "adad\t" + '-');
	YYParser.lexInt = Integer.parseInt(yytext());
	return YYParser.ADAD;
}

{shenase} {
	 if(p){System.out.println(yytext() + "\t" + "SHENASE\t" + '-');}
	//System.out.println(yytext() + "\t" + "shenase\t" + '-');
	YYParser.lexIdentifier = yytext();
	return YYParser.SHENASE;
}

{harfe_sabet} {
	if(p){System.out.println(yytext() + "\t" + "HARFE_SABET\t" + '-');}
	//System.out.println(yytext() + "\t" + "harfe_sabet\t" + '-');
	YYParser.lexChar = yytext().charAt(1);
	return YYParser.HARFE_SABET;
}

{null_char} {
	//if(p){System.out.println(yytext() + "\t" + "\t" + '-');}
	System.out.println(yytext() + "\t" + "null_char\t" + '-');
}
{new_line} {
	//System.out.println(yytext() + "\t" + "new line\t" + '-');
	//if(p){System.out.println(yytext() + "\t" + "NEW_LINE\t" + '-');}
}
. {
	//if(p){System.out.println(yytext() + "\t" + "NOTHING\t" + '-');}
	//System.out.println(yytext() + "\t" + "nothing\t" + '-');

}
       
