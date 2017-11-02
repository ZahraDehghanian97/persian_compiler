
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
type_kw = (\u0633\u0627\u062e\u062a\u0627\u0631)
constant_kw = (\u062b\u0627\u0628\u062a)
MAIN_KW = (\u0627\u0635\u0644\u06cc)

IF_KW = (\u0627\u06AF\u0631)
THEN_KW = (\u0622\u0646\u06af\u0627\u0647)
ELSE_KW = (\u0648\u06af\u0631\u0646\u0647)
return_kw = (\u0628\u0631\u06af\u0631\u062f)

AND_KW = (\u0648)
OR_KW = (\u06cc\u0627)
NOT_KW = (\u062e\u0644\u0627\u0641) 
when_kw = (\u0648\u0642\u062a\u06cc)

PERSIAN_LETTER = [\u0600-\u06FF\uFB50-\uFDFF\uFE70-\uFEFF]

NONZERO_DIGIT = [1-9]
DIGIT = "0"|{NONZERO_DIGIT}

harf_ragham = {DIGIT} | {PERSIAN_LETTER}

shenase = {PERSIAN_LETTER}{harf_ragham}*
adad = {DIGIT}+
back_slash = \
slash = (\u002f)
new_line = {back_slash}n
null_char = {back_slash}0
harfe_sabet = {back_slash}?"'"{back_slash}?(.){back_slash}?"'"{back_slash}?
noghte_virgul = ";"|[\u061b]
comma = ","|[\u060c]
comments = {slash}{slash}({PERSIAN_LETTER}|[A-z]|{DIGIT})*{new_line} | {slash}"*"(.)*"*"{slash}

ADD_KW = [+]
SUB_KW = [-]

BOOLEAN_CONSTANT = (\u063a\u0644\u0637) | (\u062f\u0631\u0633\u062a)

%%
{comments} {
	System.out.println(yytext() + "\t" + "comments\t" + '-');
}

{SUB_KW} {
	System.out.println(yytext() + "\t" + "SUB_KW\t" + '-');
}

{ADD_KW} {
	System.out.println(yytext() + "\t" + "ADD_KW\t" + '-');
}

{BOOLEAN_CONSTANT} {
	System.out.println(yytext() + "\t" + "BOOLEAN_CONSTANT\t" + '-');
}

{comma} {
	System.out.println(yytext() + "\t" + "comma\t" + '-');
}

{PROGRAM_KW} {
	System.out.println(yytext() + "\t" + "PROGRAM_KW\t" + '-');
}
{type_kw} {
	System.out.println(yytext() + "\t" + "type_kw\t" + '-');
}
{constant_kw} {
	System.out.println(yytext() + "\t" + "constant_kw\t" + '-');
}
{MAIN_KW} {
	System.out.println(yytext() + "\t" + "MAIN_KW\t" + '-');
}
{IF_KW} {
	System.out.println(yytext() + "\t" + "IF_KW\t" + '-');
}
{THEN_KW} {
	System.out.println(yytext() + "\t" + "THEN_KW\t" + '-');
}
{ELSE_KW} {
	System.out.println(yytext() + "\t" + "ELSE_KW\t" + '-');
}
{return_kw} {
	System.out.println(yytext() + "\t" + "return_kw\t" + '-');
}
{AND_KW} {
	System.out.println(yytext() + "\t" + "AND_KW\t" + '-');
}
{OR_KW} {
	System.out.println(yytext() + "\t" + "OR_KW\t" + '-');
}
{NOT_KW} {
	System.out.println(yytext() + "\t" + "NOT_KW\t" + '-');
}
{when_kw} {
	System.out.println(yytext() + "\t" + "when_kw\t" + '-');
}

{noghte_virgul} {
	System.out.println(yytext() + "\t" + "noghte_virgul\t" + '-');
}

{adad} {
	System.out.println(yytext() + "\t" + "adad\t" + '-');
}

{shenase} {
	System.out.println(yytext() + "\t" + "shenase\t" + '-');
}

{harfe_sabet} {
	System.out.println(yytext() + "\t" + "harfe_sabet\t" + '-');
}

{new_line} {
	System.out.println(yytext() + "\t" + "new_line\t" + '-');
}

{null_char} {
	System.out.println(yytext() + "\t" + "null_char\t" + '-');
}


. {
}