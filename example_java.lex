
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


LETTER = [a-zA-z]
PERSIAN_LETTER = [\u0600-\u06FF\uFB50-\uFDFF\uFE70-\uFEFF]

NONZERO_DIGIT = [1-9]
DIGIT = "0"|{NONZERO_DIGIT}

harf_ragham = {DIGIT} | {PERSIAN_LETTER}

shenase = {PERSIAN_LETTER}{harf_ragham}*
adad = {DIGIT}+
back_slash = \
new_line = {back_slash}n
null_char = {back_slash}0
harfe_sabet = {back_slash}?"'"{back_slash}?(.){back_slash}?"'"{back_slash}?
noghte_virgul = ";"|'\u061b'

PROGRAM_KW = (program)
MAIN_KW = (main)

IF_KW = (\u0627\u06AF\u0631)
THEN_KW = (بب)
ELSE_KW = (وگرنه)

AND_KW = (و)
OR_KW = (یا)
NOT_KW = (نه)

SEMICOLON_KW = [;]
SINGLE_QUOTE_KW = [']

ADD_KW = [+]
SUB_KW = [-]

BOOLEAN_CONSTANT = (درست) | (غلط)
CHAR_CONSTANT = {SINGLE_QUOTE_KW} ({LETTER} | {DIGIT}) {SINGLE_QUOTE_KW}
%%

{PERSIAN_LETTER} {
	System.out.println(yytext() + "\t" + "PERSIAN_LETTER\t" + '-');
}

{harf_ragham} {
	System.out.println(yytext() + "\t" + "harf_ragham\t" + '-');
}

{shenase} {
	System.out.println(yytext() + "\t" + "shenase\t" + '-');
}

{DIGIT} {
	System.out.println(yytext() + "\t" + "DIGIT\t" + '-');
}

{new_line} {
	System.out.println(yytext() + "\t" + "new_line\t" + '-');
}

{null_char} {
	System.out.println(yytext() + "\t" + "null_char\t" + '-');
}

{back_slash} {
	System.out.println(yytext() + "\t" + "back_slash\t" + '-');
}

{harfe_sabet} {
	System.out.println(yytext() + "\t" + "harfe_sabet\t" + '-');
}

{noghte_virgul} {
	System.out.println(yytext() + "\t" + "noghte_virgul\t" + '-');
}

{PROGRAM_KW} {
	System.out.println(yytext() + "\t" + "PROGRAM_KW\t" + '-');
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

{AND_KW} {
	System.out.println(yytext() + "\t" + "AND_KW\t" + '-');
}
{OR_KW} {
	System.out.println(yytext() + "\t" + "OR_KW\t" + '-');
}
{NOT_KW} {
	System.out.println(yytext() + "\t" + "NOT_KW\t" + '-');
}

{SEMICOLON_KW} {
	System.out.println(yytext() + "\t" + "SEMICOLON_KW\t" + '-');
}

{ADD_KW} {
	System.out.println(yytext() + "\t" + "ADD_KW\t" + '-');
}
{SUB_KW} {
	System.out.println(yytext() + "\t" + "SUB_KW\t" + '-');
}

{BOOLEAN_CONSTANT} {
	System.out.println(yytext() + "\t" + "CHAR_CONSTANT\t" + "-");
}
{CHAR_CONSTANT} {
	System.out.println(yytext() + "\t" + "CHAR_CONSTANT\t" + "-");
}

. {
}