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

adad  {ragham}+
shenase  {harf}{harf_ragham}*
ragham '\u0031' |'\u0032' | '\u0033' | '\u0034' | '\u0035' | '\u0036' | '\u0037' | '\u0038' | '\u0039' | '\u0030' | [0-9]
harf_ragham  (ragham|harf)
harf  ('\u0627' | '\u0628' | '\u067e' | '\u062a' | '\u062b' |
    '\u062c' | '\u067e' | '\u062d' | '\u062e' | '\u062f' |
    '\u0630' | '\u0631' | '\u0632' | '\u0698' | '\u0633' | '\u0634' | '\u0635' | '\u0636' | '\u0637' | '\u0638' | '\u0639' 
    | '\u063a' | '\u0641' | '\u0642' | '\u06a9' | '\u06af' | '\u0644' | '\u0645' | '\u0646' | '\u0648' | '\u0647' | '\u06cc')
harfe_sabet  ((\)?"'" (\)?{harf} (\)?"'" )^("'\n'") ^ ("'\0'") 
new_line  "\n"
null_char "\0"
jaye_khali ((\t) |" ")
noghte_virgul (";" | '\u061b' )
comma ("," | '\u060c')
comments ("/*"(.)*"/*")| ("//"[(.)*^{new_line}]){new_line}

%%
{shenase} {
    printf(" shenase ") ;
    counter ++ ;
  }
{adad} {
    printf("adad") ;
    counter ++ ;
  }
  ragham {
    printf("ragham") ;
    counter ++ ;
  }
{harf_ragham} {
    printf("harf_ragham") ;
    counter ++ ;
  }
  harf {
    printf("harf") ;
    counter ++ ;
  }
  {harfe_sabet} {
    printf("harfe_sabet") ;
    counter ++ ;
  new_line {
    printf("new_line") ;
    counter ++ ;
  }  
  null_char {
    printf("null_char s here ") ;
    counter ++ ;
  } 
  {comments} {
    printf("comments") ;
    counter ++ ;
  }  
  comma {
    printf("comma") ;
    counter ++ ;
  }  
  noghte_virgul {
    printf("noghte_virgul") ;
    counter ++ ;
  }   
  jaye_khali {
    printf("jaye_khali") ;
    counter ++ ;
  }  
. {printf("unknown") ;}
%%
int main()
{
yylex();
printf("\n%d" , counter ) ;
return 0;
}