%option noyywrap
%{
#include <stdio.h>
#include <stdlib.h>

FILE *fout;

char symbol_table[100][50];
int counter=0;
int install_id(char* next)
{
}
%}

adad {ragham}+
shenase {harf}{harf_ragham}*
ragham [0-9]
harf_ragham (ragham|harf)
harf ('\u0627'|'\u0628'|'\u067e')
harfe_sabet ((\)?"'" (\)?{harf} (\)?"'" )^("'\n'") ^ ("'\0'")
new_line ("\n")
null_char ("\0")
jaye_khali ((\t)|" ")
noghte_virgul (";" | "")

%%
"EXIT" {
counter ++ ;
return 0 ;
}
{adad} {
printf("ID") ;
counter ++ ;
}

"+" {printf("+") ;}
. {printf("unknown") ;}
%%
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {

yyin = fopen("input.txt", "r");	
fout = fopen("output.txt", "w");
fprintf(fout, "\n LEXER \n");
fprintf(fout, "\tRegEx\tToken\tAttVal\n\n");
    if(yyin) {  
      yylex();
	  fclose(yyin);           
    }
	fclose(fout);
    return 0;
}
