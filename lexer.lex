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
MAIN_KW = (\u0627\u0635\u0644\u068a)|(\u0627\u0635\u0644)

jens_kw = (\u0635\u062d\u062d)|(\u0627\u0639\u0634\u0627\u0631)|(\u0635\u062d\u06cc\u062d)|(\u0627\u0639\u0634\u0627\u0631\u06cc)|(\u0645\u0646\u0637\u0642\u06cc)|(\u062d\u0631\u0641)
switch_kw = (\u06a9\u0644\u06cc\u062f)
end_kw = (\u062a\u0645\u0627\u0645)
default_kw = (\u067e\u06cc\u0634\u0641\u0631\u0636)
break_kw = (\u0628\u0634\u06a9\u0646)
return_kw = (\u0628\u0631\u06af\u0631\u062f\u0627\u0646)
AKULAD_BAZ_KW = "{"
AKULAD_BASTE_KW = "}"

IF_KW = (\u0627\u06AF\u0631)
THEN_KW = (\u0622\u0646\u06af\u0627\u0647)
ELSE_KW = (\u0648\u06af\u0631\u0646\u0647)

AND_KW = (\u0648)
OR_KW = (\u06cc\u0627)
NOT_KW = (\u062e\u0644\u0627\u0641) 
while_kw = (\u0648\u0642\u062a\u06cc)|(\u0648\u0642\u062a)

PERSIAN_LETTER = [\u0600-\u06FF\uFB50-\uFDFF\uFE70-\uFEFF]	

NONZERO_DIGIT = [1-9]
DIGIT = "0"|{NONZERO_DIGIT}

harf_ragham = {DIGIT} | {PERSIAN_LETTER}

shenase = {PERSIAN_LETTER}{harf_ragham}*
adad = {DIGIT}+
back_slash = \
slash = (\u002f)
new_line = "\s"|"\n"|"\r"|"\t"
null_char = {back_slash}0
harfe_sabet = {back_slash}?"'"{back_slash}?(.){back_slash}?"'"{back_slash}?
noghte_virgul = ";"|[\u061b]
comma = ","|[\u060c]
comments = {slash}{slash}({PERSIAN_LETTER}|[A-z]|{DIGIT})*		{new_line} | {slash}"*"(.)*"*"{slash}
FLOAT_KW = (\u0627\u0639\u0634\u0627\u0631\u06cc)
INT_KW = (\u0635\u062d\u06cc\u062d)
BOOLEAN_KW =(\u0645\u0646\u0637\u0642\u06cc)
CHAR_KW = (\u062d\u0631\u0641)

ADD_KW = [+]
SUB_KW = [-]

BOOLEAN_CONSTANT = (\u063a\u0644\u0637) | (\u062f\u0631\u0633\u062a)

%%
{AKULAD_BAZ_KW} {
	return YYParser.AKULAD_BAZ_KW;
}
{AKULAD_BASTE_KW} {
	return YYParser.AKULAD_BASTE_KW;
}
{comments} {
	//System.out.println(yytext() + "\t" + "comments\t" + '-');
	return YYParser.COMMENT;
}

{MAIN_KW} {
	//System.out.println(yytext() + "\t" + "MAIN_KW\t" + '-');
	return YYParser.MAIN_KW;
}

{SUB_KW} {
	//System.out.println(yytext() + "\t" + "SUB_KW\t" + '-');
	return YYParser.SUB_KW;
}

{ADD_KW} {
	//System.out.println(yytext() + "\t" + "ADD_KW\t" + '-');
	return YYParser.ADD_KW;
}

{BOOLEAN_CONSTANT} {
	//System.out.println(yytext() + "\t" + "BOOLEAN_CONSTANT\t" + '-');
	return YYParser.BOOLEAN_CONSTANT;
}

{INT_KW} {
	//System.out.println(yytext() + "\t" + "jens_kw\t" + '-');
	return YYParser.INT_KW;
}
{FLOAT_KW} {
	//System.out.println(yytext() + "\t" + "jens_kw\t" + '-');
	return YYParser.FLOAT_KW;
}
{BOOLEAN_KW} {
	//System.out.println(yytext() + "\t" + "jens_kw\t" + '-');
	return YYParser.BOOLEAN_KW;
}
{CHAR_KW} {
	//System.out.println(yytext() + "\t" + "jens_kw\t" + '-');
	return YYParser.CHAR_KW;
}


{switch_kw) {
	//System.out.println(yytext() + "\t" + "switch_kw\t" + '-');
	return YYParser.SWITCH_KW;
}
{end_kw} {
	//System.out.println(yytext() + "\t" + "end_kw\t" + '-');
	return YYParser.END_KW;
}
{default_kw} {
	//System.out.println(yytext() + "\t" + "default_kw\t" + '-');
	return YYParser.DEFAULT_KW;
}
{break_kw} {
	//System.out.println(yytext() + "\t" + "break_kw\t" + '-');
	return YYParser.BREAK_KW;
}
{return_kw} {
	//System.out.println(yytext() + "\t" + "return_kw\t" + '-');
	return YYParser.RETURN_KW;
}

{comma} {
	//System.out.println(yytext() + "\t" + "comma\t" + '-');
	return YYParser.COMMA;
}

{PROGRAM_KW} {
	//System.out.println(yytext() + "\t" + "PROGRAM_KW\t" + '-');
	return YYParser.PROGRAM_KW;
}
{struct_kw} {
	//System.out.println(yytext() + "\t" + "type_kw\t" + '-');
	return YYParser.STRUCT_KW;
}
{constant_kw} {
	//System.out.println(yytext() + "\t" + "constant_kw\t" + '-');
	return YYParser.CONSTANT_KW;
}

{IF_KW} {
	//System.out.println(yytext() + "\t" + "IF_KW\t" + '-');
	return YYParser.IF_KW;
}
{THEN_KW} {
	//System.out.println(yytext() + "\t" + "THEN_KW\t" + '-');
	return YYParser.THEN_KW;
}
{ELSE_KW} {
	//System.out.println(yytext() + "\t" + "ELSE_KW\t" + '-');
	return YYParser.ELSE_KW;
}
{AND_KW} {
	//System.out.println(yytext() + "\t" + "AND_KW\t" + '-');
	return YYParser.AND_KW;
}
{OR_KW} {
	//System.out.println(yytext() + "\t" + "OR_KW\t" + '-');
	return YYParser.OR_KW;
}
{NOT_KW} {
	//System.out.println(yytext() + "\t" + "NOT_KW\t" + '-');
	return YYParser.NOT_KW;
}
{while_kw} {
	//System.out.println(yytext() + "\t" + "while_kw\t" + '-');
	return YYParser.WHILE_KW;
}

{noghte_virgul} {
	//System.out.println(yytext() + "\t" + "noghte_virgul\t" + '-');
	return YYParser.NOGHTE_VIRGUL;
}

{adad} {
	//System.out.println(yytext() + "\t" + "adad\t" + '-');
	return YYParser.ADAD;
}

{shenase} {
	 
	//System.out.println(yytext() + "\t" + "shenase\t" + '-');
	return YYParser.SHENASE;
}

{harfe_sabet} {
	//System.out.println(yytext() + "\t" + "harfe_sabet\t" + '-');
	return YYParser.HARFE_SABET;
}

{new_line} {
	//System.out.println(yytext() + "\t" + "new_line\t" + '-');
}

{null_char} {
	System.out.println(yytext() + "\t" + "null_char\t" + '-');
}
. {
	//System.out.println(yytext() + "\t" + "nothing\t" + '-');

}