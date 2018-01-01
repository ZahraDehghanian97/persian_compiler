
/* A Bison parser, made by GNU Bison 2.4.1.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java
   
      Copyright (C) 2007, 2008 Free Software Foundation, Inc.
   
   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.
   
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
   
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.
   
   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* First part of user declarations.  */

/* Line 32 of lalr1.java  */
/* Line 1 of "YYParser.y"  */

import java.io.*;
import java.util.ArrayList;


/**
 * A Bison parser, automatically generated from <tt>YYParser.y</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
class YYParser
{
    /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "2.4.1";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";


  /** True if verbose error messages are enabled.  */
  public boolean errorVerbose = false;



  /** Token returned by the scanner to signal the end of its input.  */
  public static final int EOF = 0;

/* Tokens.  */
  /** Token number, to be returned by the scanner.  */
  public static final int COMMENT = 258;
  /** Token number, to be returned by the scanner.  */
  public static final int FLOAT_KW = 259;
  /** Token number, to be returned by the scanner.  */
  public static final int INT_KW = 260;
  /** Token number, to be returned by the scanner.  */
  public static final int BOOLEAN_KW = 261;
  /** Token number, to be returned by the scanner.  */
  public static final int CHAR_KW = 262;
  /** Token number, to be returned by the scanner.  */
  public static final int AKULAD_BAZ_KW = 263;
  /** Token number, to be returned by the scanner.  */
  public static final int AKULAD_BASTE_KW = 264;
  /** Token number, to be returned by the scanner.  */
  public static final int ADD_KW = 265;
  /** Token number, to be returned by the scanner.  */
  public static final int SWITCH_KW = 266;
  /** Token number, to be returned by the scanner.  */
  public static final int END_KW = 267;
  /** Token number, to be returned by the scanner.  */
  public static final int DEFAULT_KW = 268;
  /** Token number, to be returned by the scanner.  */
  public static final int BREAK_KW = 269;
  /** Token number, to be returned by the scanner.  */
  public static final int RETURN_KW = 270;
  /** Token number, to be returned by the scanner.  */
  public static final int COMMA = 271;
  /** Token number, to be returned by the scanner.  */
  public static final int PROGRAM_KW = 272;
  /** Token number, to be returned by the scanner.  */
  public static final int STRUCT_KW = 273;
  /** Token number, to be returned by the scanner.  */
  public static final int CONSTANT_KW = 274;
  /** Token number, to be returned by the scanner.  */
  public static final int IF_KW = 275;
  /** Token number, to be returned by the scanner.  */
  public static final int THEN_KW = 276;
  /** Token number, to be returned by the scanner.  */
  public static final int ELSE_KW = 277;
  /** Token number, to be returned by the scanner.  */
  public static final int AND_KW = 278;
  /** Token number, to be returned by the scanner.  */
  public static final int OR_KW = 279;
  /** Token number, to be returned by the scanner.  */
  public static final int NOT_KW = 280;
  /** Token number, to be returned by the scanner.  */
  public static final int WHILE_KW = 281;
  /** Token number, to be returned by the scanner.  */
  public static final int NOGHTE_VIRGUL = 282;
  /** Token number, to be returned by the scanner.  */
  public static final int ADAD = 283;
  /** Token number, to be returned by the scanner.  */
  public static final int SHENASE = 284;
  /** Token number, to be returned by the scanner.  */
  public static final int HARFE_SABET = 285;
  /** Token number, to be returned by the scanner.  */
  public static final int KEY_KW = 286;
  /** Token number, to be returned by the scanner.  */
  public static final int MORE_THAN_KW = 287;
  /** Token number, to be returned by the scanner.  */
  public static final int NOGHTE_KW = 288;
  /** Token number, to be returned by the scanner.  */
  public static final int MULTIPLY_KW = 289;
  /** Token number, to be returned by the scanner.  */
  public static final int BRACKET_BASTE_KW = 290;
  /** Token number, to be returned by the scanner.  */
  public static final int BRACKET_BAZ_KW = 291;
  /** Token number, to be returned by the scanner.  */
  public static final int PARANTHESIS_BASTE_KW = 292;
  /** Token number, to be returned by the scanner.  */
  public static final int PARANTHESIS_BAZ_KW = 293;
  /** Token number, to be returned by the scanner.  */
  public static final int TRUE_KW = 294;
  /** Token number, to be returned by the scanner.  */
  public static final int QUESTION_KW = 295;
  /** Token number, to be returned by the scanner.  */
  public static final int EQUAL_EQUAL_KW = 296;
  /** Token number, to be returned by the scanner.  */
  public static final int EQUAL_KW = 297;
  /** Token number, to be returned by the scanner.  */
  public static final int DEVIDE_KW = 298;
  /** Token number, to be returned by the scanner.  */
  public static final int DEVIDE_EQUAL_KW = 299;
  /** Token number, to be returned by the scanner.  */
  public static final int OR_ELSE_KW = 300;
  /** Token number, to be returned by the scanner.  */
  public static final int FALSE_KW = 301;
  /** Token number, to be returned by the scanner.  */
  public static final int AND_THEN_KW = 302;
  /** Token number, to be returned by the scanner.  */
  public static final int MINUS_KW = 303;
  /** Token number, to be returned by the scanner.  */
  public static final int DONOGHTE_KW = 304;
  /** Token number, to be returned by the scanner.  */
  public static final int LESS_EQUAL_KW = 305;
  /** Token number, to be returned by the scanner.  */
  public static final int MOD_KW = 306;
  /** Token number, to be returned by the scanner.  */
  public static final int LESS_THAN_KW = 307;
  /** Token number, to be returned by the scanner.  */
  public static final int MORE_EQUAL_KW = 308;
  /** Token number, to be returned by the scanner.  */
  public static final int PLUS_EQUAL_KW = 309;
  /** Token number, to be returned by the scanner.  */
  public static final int PLUS_PLUS_KW = 310;
  /** Token number, to be returned by the scanner.  */
  public static final int MINUS_MINUS_KW = 311;
  /** Token number, to be returned by the scanner.  */
  public static final int MINUS_EQUAL_KW = 312;
  /** Token number, to be returned by the scanner.  */
  public static final int MULTIPLY_EQUAL_KW = 313;
  /** Token number, to be returned by the scanner.  */
  public static final int ADAD_ASHARI = 314;
  /** Token number, to be returned by the scanner.  */
  public static final int LOWER_THAN_ELSE_KW = 315;



  

  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>YYParser</tt>.
   */
  public interface Lexer {
    

    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.  */
    Object getLVal ();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * of the token. 
     * @return the token identifier corresponding to the next token. */
    int yylex () throws java.io.IOException;

    /**
     * Entry point for error reporting.  Emits an error
     * in a user-defined way.
     *
     * 
     * @param s The string for the error message.  */
     void yyerror (String s);
  }

  /** The object doing lexical analysis for us.  */
  private Lexer yylexer;
  
  



  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  public YYParser (Lexer yylexer) {
    this.yylexer = yylexer;
    
  }

  private java.io.PrintStream yyDebugStream = System.err;

  /**
   * Return the <tt>PrintStream</tt> on which the debugging output is
   * printed.
   */
  public final java.io.PrintStream getDebugStream () { return yyDebugStream; }

  /**
   * Set the <tt>PrintStream</tt> on which the debug output is printed.
   * @param s The stream that is used for debugging output.
   */
  public final void setDebugStream(java.io.PrintStream s) { yyDebugStream = s; }

  private int yydebug = 0;

  /**
   * Answer the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   */
  public final int getDebugLevel() { return yydebug; }

  /**
   * Set the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   * @param level The verbosity level for debugging output.
   */
  public final void setDebugLevel(int level) { yydebug = level; }

  private final int yylex () throws java.io.IOException {
    return yylexer.yylex ();
  }
  protected final void yyerror (String s) {
    yylexer.yyerror (s);
  }

  

  protected final void yycdebug (String s) {
    if (yydebug > 0)
      yyDebugStream.println (s);
  }

  private final class YYStack {
    private int[] stateStack = new int[16];
    
    private Object[] valueStack = new Object[16];

    public int size = 16;
    public int height = -1;
    
    public final void push (int state, Object value    	   	      	    ) {
      height++;
      if (size == height) 
        {
	  int[] newStateStack = new int[size * 2];
	  System.arraycopy (stateStack, 0, newStateStack, 0, height);
	  stateStack = newStateStack;
	  
	  
	  Object[] newValueStack = new Object[size * 2];
	  System.arraycopy (valueStack, 0, newValueStack, 0, height);
	  valueStack = newValueStack;

	  size *= 2;
	}

      stateStack[height] = state;
      
      valueStack[height] = value;
    }

    public final void pop () {
      height--;
    }

    public final void pop (int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (num > 0) {
	java.util.Arrays.fill (valueStack, height - num + 1, height, null);
        
      }
      height -= num;
    }

    public final int stateAt (int i) {
      return stateStack[height - i];
    }

    public final Object valueAt (int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print (java.io.PrintStream out)
    {
      out.print ("Stack now");
      
      for (int i = 0; i < height; i++)
        {
	  out.print (' ');
	  out.print (stateStack[i]);
        }
      out.println ();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).  */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).  */
  public static final int YYABORT = 1;

  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.  */
  public static final int YYERROR = 2;

  /**
   * Returned by a Bison action in order to print an error message and start
   * error recovery.  */
  public static final int YYFAIL = 3;

  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;

  private int yyerrstatus_ = 0;

  /**
   * Return whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.  */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  private int yyaction (int yyn, YYStack yystack, int yylen) 
  {
    Object yyval;
    

    /* If YYLEN is nonzero, implement the default value of the action:
       `$$ = $1'.  Otherwise, use the top of the stack.
    
       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    if (yylen > 0)
      yyval = yystack.valueAt (yylen - 1);
    else
      yyval = yystack.valueAt (0);
    
    yy_reduce_print (yyn, yystack);

    switch (yyn)
      {
	  case 2:
  if (yyn == 2)
    
/* Line 353 of lalr1.java  */
/* Line 213 of "YYParser.y"  */
    {
		System.out.println("Rule 1.1 ");
		exportIntermediateCode();
	};
  break;
    

  case 3:
  if (yyn == 3)
    
/* Line 353 of lalr1.java  */
/* Line 219 of "YYParser.y"  */
    {
		System.out.println("Rule 2.1: ");
	};
  break;
    

  case 4:
  if (yyn == 4)
    
/* Line 353 of lalr1.java  */
/* Line 222 of "YYParser.y"  */
    {
		System.out.println("Rule 2.2");
	};
  break;
    

  case 5:
  if (yyn == 5)
    
/* Line 353 of lalr1.java  */
/* Line 227 of "YYParser.y"  */
    {
		System.out.println("Rule 3.1: ");
	};
  break;
    

  case 6:
  if (yyn == 6)
    
/* Line 353 of lalr1.java  */
/* Line 230 of "YYParser.y"  */
    {
		System.out.println("Rule 3.2: " );
	};
  break;
    

  case 7:
  if (yyn == 7)
    
/* Line 353 of lalr1.java  */
/* Line 233 of "YYParser.y"  */
    {
		System.out.println("Rule 3.3: " );
	};
  break;
    

  case 8:
  if (yyn == 8)
    
/* Line 353 of lalr1.java  */
/* Line 238 of "YYParser.y"  */
    {
		System.out.println("Rule 4.1 ");
		symbolTable.addToSymbolTable(((EVal)(yystack.valueAt (5-(2)))).place, EVal.TYPE_CODE_INTEGER, false);
	};
  break;
    

  case 9:
  if (yyn == 9)
    
/* Line 353 of lalr1.java  */
/* Line 243 of "YYParser.y"  */
    {
		System.out.println("Rule 4.2 ");
		symbolTable.addToSymbolTable(((EVal)(yystack.valueAt (4-(2)))).place, EVal.TYPE_CODE_INTEGER, false);
	};
  break;
    

  case 10:
  if (yyn == 10)
    
/* Line 353 of lalr1.java  */
/* Line 249 of "YYParser.y"  */
    {
		System.out.println("Rule 5 ");
	};
  break;
    

  case 11:
  if (yyn == 11)
    
/* Line 353 of lalr1.java  */
/* Line 253 of "YYParser.y"  */
    {
		System.out.println("Rule 5 ");
	};
  break;
    

  case 12:
  if (yyn == 12)
    
/* Line 353 of lalr1.java  */
/* Line 258 of "YYParser.y"  */
    {
		System.out.println("Rule 6 eha");
		System.out.println("Rule 9");
		
		System.out.println("Rule 3: " +
			"declarations: type_specifiers declarator_list");
		System.out.println(((EVal)(yystack.valueAt (3-(1)))).type+" "+((EVal)(yystack.valueAt (3-(2)))).type);
		if(((EVal)(yystack.valueAt (3-(2)))).type == EVal.TYPE_CODE_UNKNOWN || ((EVal)(yystack.valueAt (3-(1)))).type == ((EVal)(yystack.valueAt (3-(2)))).type) {
			for(int i = 0; i < ((EVal)(yystack.valueAt (3-(2)))).initializersList.size(); i++) {
				if(symbolTable.lookUp(sizeStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place) == SymbolTable.NOT_IN_SYMBOL_TABLE) {
					symbolTable.addToSymbolTable(((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, ((EVal)(yystack.valueAt (3-(1)))).type, false);
					if(((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i) != null && ((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i).size() == 1) {
						//if($1.type != EVal.TYPE_CODE_BOOLEAN) {
							emit(":=", ((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i).get(0).place, null, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
							switch (((EVal)(yystack.valueAt (3-(1)))).type) {
								case EVal.TYPE_CODE_INTEGER:
									emit("iprint", null, null, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
									break;
								case EVal.TYPE_CODE_REAL:
									emit("rprint", null, null, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
									break;
								case EVal.TYPE_CODE_CHAR:
									emit("cprint", null, null, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
									break;
								case EVal.TYPE_CODE_BOOLEAN:
									emit("bprint", null, null, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
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
					} else if(((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i) != null) {
						System.err.println("Error! Initializer number mismatch. (Expected: 1" + ", Number: " + ((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i).size() + ")");
						return YYABORT;
					}
				} else {
					symbolTable.addToSymbolTable(((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, ((EVal)(yystack.valueAt (3-(1)))).type, true);
					emit("malloc", getTypeString(((EVal)(yystack.valueAt (3-(1)))).type), sizeStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
					if(((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i) != null) {
						for(int j = 0; j < ((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i).size(); j++) {
							EVal.arrayIndexOutOfBoundList.add(nextQuad() + 1);
							emit(">=", String.valueOf(j), sizeStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
							emit("check", condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, null, String.valueOf(nextQuad() + 2)); // Result will be backpatched.
							//if($1.type != EVal.TYPE_CODE_BOOLEAN) {
								emit("[]=", ((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i).get(j).place, String.valueOf(j), ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
								emit("+", startStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, String.valueOf(j), condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
								switch (((EVal)(yystack.valueAt (3-(1)))).type) {
									case EVal.TYPE_CODE_INTEGER:
										emit("aiprint", condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, String.valueOf(j), ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
										break;
									case EVal.TYPE_CODE_REAL:
										emit("arprint", condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, String.valueOf(j), ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
										break;
									case EVal.TYPE_CODE_CHAR:
										emit("acprint", condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, String.valueOf(j), ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
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
			/*System.err.println("Error! Type specifier type mismatch. (" + $1.type + ", " + $2.type + ")");
			return YYABORT;*/
		}
	};
  break;
    

  case 13:
  if (yyn == 13)
    
/* Line 353 of lalr1.java  */
/* Line 339 of "YYParser.y"  */
    {
	System.out.println("Rule 8.1");
	
		yyval = new EVal();
		((EVal)yyval).type = EVal.TYPE_CODE_INTEGER;
		((EVal)yyval).nextList = EVal.makeList(nextQuad());
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.
	};
  break;
    

  case 14:
  if (yyn == 14)
    
/* Line 353 of lalr1.java  */
/* Line 347 of "YYParser.y"  */
    {
	System.out.println("Rule 8.2");
		yyval = new EVal();
		((EVal)yyval).type = EVal.TYPE_CODE_REAL;
		((EVal)yyval).nextList = EVal.makeList(nextQuad());
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.
	};
  break;
    

  case 15:
  if (yyn == 15)
    
/* Line 353 of lalr1.java  */
/* Line 354 of "YYParser.y"  */
    {
		System.out.println("Rule 8.3");
		yyval = new EVal();
		((EVal)yyval).type = EVal.TYPE_CODE_CHAR;
		((EVal)yyval).nextList = EVal.makeList(nextQuad());
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.
	};
  break;
    

  case 16:
  if (yyn == 16)
    
/* Line 353 of lalr1.java  */
/* Line 361 of "YYParser.y"  */
    {
		System.out.println("Rule 8.4");
		yyval = new EVal();
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).nextList = EVal.makeList(nextQuad());
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.
	};
  break;
    

  case 17:
  if (yyn == 17)
    
/* Line 353 of lalr1.java  */
/* Line 370 of "YYParser.y"  */
    {
		System.out.println("Rule 9");
		
		System.out.println("Rule 3: " +
			"declarations: type_specifiers declarator_list");
		System.out.println(((EVal)(yystack.valueAt (3-(1)))).type+" "+((EVal)(yystack.valueAt (3-(2)))).type);
		if(((EVal)(yystack.valueAt (3-(2)))).type == EVal.TYPE_CODE_UNKNOWN || ((EVal)(yystack.valueAt (3-(1)))).type == ((EVal)(yystack.valueAt (3-(2)))).type) {
			for(int i = 0; i < ((EVal)(yystack.valueAt (3-(2)))).initializersList.size(); i++) {
				if(symbolTable.lookUp(sizeStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place) == SymbolTable.NOT_IN_SYMBOL_TABLE) {
					symbolTable.addToSymbolTable(((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, ((EVal)(yystack.valueAt (3-(1)))).type, false);
					if(((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i) != null && ((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i).size() == 1) {
						//if($1.type != EVal.TYPE_CODE_BOOLEAN) {
							emit(":=", ((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i).get(0).place, null, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
							switch (((EVal)(yystack.valueAt (3-(1)))).type) {
								case EVal.TYPE_CODE_INTEGER:
									emit("iprint", null, null, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
									break;
								case EVal.TYPE_CODE_REAL:
									emit("rprint", null, null, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
									break;
								case EVal.TYPE_CODE_CHAR:
									emit("cprint", null, null, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
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
					} else if(((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i) != null) {
						//System.err.println("Error! Initializer number mismatch. (Expected: //1" + ", Number: " + $2.initializersList.get(i).size() + ")");
						//return YYABORT;
					}
				} else {
					symbolTable.addToSymbolTable(((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, ((EVal)(yystack.valueAt (3-(1)))).type, true);
					emit("malloc", getTypeString(((EVal)(yystack.valueAt (3-(1)))).type), sizeStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
					if(((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i) != null) {
						for(int j = 0; j < ((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i).size(); j++) {
							EVal.arrayIndexOutOfBoundList.add(nextQuad() + 1);
							emit(">=", String.valueOf(j), sizeStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
							emit("check", condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, null, String.valueOf(nextQuad() + 2)); // Result will be backpatched.
							//if($1.type != EVal.TYPE_CODE_BOOLEAN) {
								emit("[]=", ((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i).get(j).place, String.valueOf(j), ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
								emit("+", startStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, String.valueOf(j), condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
								switch (((EVal)(yystack.valueAt (3-(1)))).type) {
									case EVal.TYPE_CODE_INTEGER:
										emit("aiprint", condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, String.valueOf(j), ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
										break;
									case EVal.TYPE_CODE_REAL:
										emit("arprint", condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, String.valueOf(j), ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
										break;
									case EVal.TYPE_CODE_CHAR:
										emit("acprint", condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, String.valueOf(j), ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
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
			System.out.println("Error! Type specifier type mismatch. (" + ((EVal)(yystack.valueAt (3-(1)))).type + ", " + ((EVal)(yystack.valueAt (3-(2)))).type + ")");
			//return YYABORT;
		}
	};
  break;
    

  case 18:
  if (yyn == 18)
    
/* Line 353 of lalr1.java  */
/* Line 447 of "YYParser.y"  */
    {
		System.out.println("Rule 10.1 ");
		
		System.out.println("Rule 5.2: " +
			"delarator_list: declarator_end 00");
		yyval = new EVal();
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).declareds = EVal.makeInitializersOrDeclareds(((EVal)(yystack.valueAt (1-(1)))));
		((EVal)yyval).initializersList = EVal.makeInitializersList(((EVal)(yystack.valueAt (1-(1)))).initializers);
	};
  break;
    

  case 19:
  if (yyn == 19)
    
/* Line 353 of lalr1.java  */
/* Line 459 of "YYParser.y"  */
    {
		System.out.println("Rule 5.1: " +
			"declarator_list: declarator_list declarator");
		if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_UNKNOWN
			|| ((EVal)(yystack.valueAt (3-(1)))).type == ((EVal)(yystack.valueAt (3-(3)))).type) {
			yyval = new EVal();
			((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(3)))).type;
			((EVal)yyval).declareds = ((EVal)(yystack.valueAt (3-(1)))).declareds;
			((EVal)yyval).declareds.add(((EVal)(yystack.valueAt (3-(3)))));
			((EVal)yyval).initializersList = ((EVal)(yystack.valueAt (3-(1)))).initializersList;
			((EVal)yyval).initializersList.add(((EVal)(yystack.valueAt (3-(3)))).initializers);
		} else {
			//System.err.println("Error! Declarator type mismatch.");
			//return YYABORT;
		}
	};
  break;
    

  case 20:
  if (yyn == 20)
    
/* Line 353 of lalr1.java  */
/* Line 477 of "YYParser.y"  */
    {
	System.out.println("Rule 11.1 ");
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).array = false;
	};
  break;
    

  case 21:
  if (yyn == 21)
    
/* Line 353 of lalr1.java  */
/* Line 483 of "YYParser.y"  */
    {
		System.out.println("Rule 11.2 ");
		/*if($1.array != $3.array) {
			System.err.println("Error! Array mismatch: " + $1.place + " and " + $3.place + " are not the same.");
			return YYABORT;
		}*/
		
		if(((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN){
		backpatch(((EVal)(yystack.valueAt (3-(3)))).trueList, nextQuad() );
		backpatch(((EVal)(yystack.valueAt (3-(3)))).falseList, nextQuad() + 2);
		
		emit(":=", "1", null, ((EVal)(yystack.valueAt (3-(1)))).place);
		emit("goto", null, null, String.valueOf(nextQuad() + 2));
		emit(":=", "0", null, ((EVal)(yystack.valueAt (3-(1)))).place);
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (3-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(3)))).type;
		((EVal)yyval).array = ((EVal)(yystack.valueAt (3-(1)))).array;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (3-(3)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (3-(3)))).falseList;
		((EVal)yyval).initializers = ((EVal)(yystack.valueAt (3-(3)))).initializers;
		
		}
		else{
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (3-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(3)))).type;
		((EVal)yyval).array = ((EVal)(yystack.valueAt (3-(1)))).array;
		((EVal)yyval).initializers = ((EVal)(yystack.valueAt (3-(3)))).initializers;
		emit(":=", ((EVal)(yystack.valueAt (3-(3)))).place, null, ((EVal)(yystack.valueAt (3-(1)))).place);
		}
	};
  break;
    

  case 22:
  if (yyn == 22)
    
/* Line 353 of lalr1.java  */
/* Line 517 of "YYParser.y"  */
    {
		System.out.println("Rule 8.1: " +
			"dec: saved_identifier");
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).array = false;
	};
  break;
    

  case 23:
  if (yyn == 23)
    
/* Line 353 of lalr1.java  */
/* Line 524 of "YYParser.y"  */
    {
		
		System.out.println("Rule 8.3: " +
			"dec: saved_identifier LB_KW saved_integer RB_KW");
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (4-(1)))).place;
		((EVal)yyval).array = true;

		symbolTable.addToSymbolTable(startStr + ((EVal)yyval).place, EVal.TYPE_CODE_INTEGER, false);
		emit(":=", "0", null , startStr + ((EVal)yyval).place);

		symbolTable.addToSymbolTable(sizeStr + ((EVal)yyval).place, EVal.TYPE_CODE_INTEGER, false);
		emit(":=", ((EVal)(yystack.valueAt (4-(3)))).place, null , sizeStr + ((EVal)yyval).place);

		symbolTable.addToSymbolTable(indexStr + ((EVal)yyval).place, EVal.TYPE_CODE_INTEGER, false);
		symbolTable.addToSymbolTable(condStr + ((EVal)yyval).place, EVal.TYPE_CODE_INTEGER, false);
	};
  break;
    

  case 24:
  if (yyn == 24)
    
/* Line 353 of lalr1.java  */
/* Line 543 of "YYParser.y"  */
    {
	
		emit(":=", "sp", null, "top");
	};
  break;
    

  case 25:
  if (yyn == 25)
    
/* Line 353 of lalr1.java  */
/* Line 550 of "YYParser.y"  */
    {
		System.out.println("Rule 13.1");
		backpatch(((EVal)(yystack.valueAt (4-(1)))).nextList, (quadruples.size()));
		
		symbolTable.addFunction(((EVal)(yystack.valueAt (4-(2)))).place, ((EVal)(yystack.valueAt (4-(1)))).nextList.get(0)+1);
		
	};
  break;
    

  case 26:
  if (yyn == 26)
    
/* Line 353 of lalr1.java  */
/* Line 558 of "YYParser.y"  */
    {
		System.out.println("Rule 13.2");
		backpatch(((EVal)(yystack.valueAt (5-(1)))).nextList, (quadruples.size()));
		System.out.println(((EVal)(yystack.valueAt (5-(1)))).nextList.get(0)+1);
		symbolTable.addFunction(((EVal)(yystack.valueAt (5-(2)))).place, ((EVal)(yystack.valueAt (5-(1)))).nextList.get(0)+1);
	};
  break;
    

  case 27:
  if (yyn == 27)
    
/* Line 353 of lalr1.java  */
/* Line 566 of "YYParser.y"  */
    {System.out.println("Rule 13.3");};
  break;
    

  case 28:
  if (yyn == 28)
    
/* Line 353 of lalr1.java  */
/* Line 568 of "YYParser.y"  */
    {System.out.println("Rule 13.4");};
  break;
    

  case 29:
  if (yyn == 29)
    
/* Line 353 of lalr1.java  */
/* Line 571 of "YYParser.y"  */
    {System.out.println("Rule 15.1");};
  break;
    

  case 30:
  if (yyn == 30)
    
/* Line 353 of lalr1.java  */
/* Line 573 of "YYParser.y"  */
    {System.out.println("Rule 15.2");};
  break;
    

  case 31:
  if (yyn == 31)
    
/* Line 353 of lalr1.java  */
/* Line 576 of "YYParser.y"  */
    {System.out.println("Rule 16");};
  break;
    

  case 32:
  if (yyn == 32)
    
/* Line 353 of lalr1.java  */
/* Line 579 of "YYParser.y"  */
    {System.out.println("Rule 17.1");};
  break;
    

  case 33:
  if (yyn == 33)
    
/* Line 353 of lalr1.java  */
/* Line 581 of "YYParser.y"  */
    {System.out.println("Rule 17.2");};
  break;
    

  case 34:
  if (yyn == 34)
    
/* Line 353 of lalr1.java  */
/* Line 584 of "YYParser.y"  */
    {
		System.out.println("Rule 18.1");
		symbolTable.addToSymbolTable(((EVal)(yystack.valueAt (1-(1)))).place, ((EVal)(yystack.valueAt (1-(1)))).type, false);
		emit(":=","stack[top]" , null, ((EVal)(yystack.valueAt (1-(1)))).place);
		emit("-", "top", "1", "top");
		};
  break;
    

  case 35:
  if (yyn == 35)
    
/* Line 353 of lalr1.java  */
/* Line 590 of "YYParser.y"  */
    {System.out.println("Rule 18.2");};
  break;
    

  case 36:
  if (yyn == 36)
    
/* Line 353 of lalr1.java  */
/* Line 593 of "YYParser.y"  */
    {
		System.out.println("jomle: matched N");
		yyval = new EVal();
	(	(EVal)yyval).nextList = ((EVal)(yystack.valueAt (2-(1)))).nextList;
	};
  break;
    

  case 37:
  if (yyn == 37)
    
/* Line 353 of lalr1.java  */
/* Line 598 of "YYParser.y"  */
    {
		System.out.println("jomle: unmatched");
		yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 38:
  if (yyn == 38)
    
/* Line 353 of lalr1.java  */
/* Line 606 of "YYParser.y"  */
    {System.out.println("Rule 19.1");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 39:
  if (yyn == 39)
    
/* Line 353 of lalr1.java  */
/* Line 611 of "YYParser.y"  */
    {System.out.println("Rule 19.2");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;};
  break;
    

  case 40:
  if (yyn == 40)
    
/* Line 353 of lalr1.java  */
/* Line 615 of "YYParser.y"  */
    {System.out.println("Rule 19.3");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;};
  break;
    

  case 41:
  if (yyn == 41)
    
/* Line 353 of lalr1.java  */
/* Line 619 of "YYParser.y"  */
    {System.out.println("Rule 19.4");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;};
  break;
    

  case 42:
  if (yyn == 42)
    
/* Line 353 of lalr1.java  */
/* Line 623 of "YYParser.y"  */
    {System.out.println("Rule 19.5");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;};
  break;
    

  case 43:
  if (yyn == 43)
    
/* Line 353 of lalr1.java  */
/* Line 627 of "YYParser.y"  */
    {System.out.println("Rule 19.6");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;};
  break;
    

  case 44:
  if (yyn == 44)
    
/* Line 353 of lalr1.java  */
/* Line 632 of "YYParser.y"  */
    {
		System.out.println("Rule 20.1");
		yyval = new EVal();
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (4-(3)))).nextList;
	};
  break;
    

  case 45:
  if (yyn == 45)
    
/* Line 353 of lalr1.java  */
/* Line 638 of "YYParser.y"  */
    {
		System.out.println("Rule 20.2");
		yyval = new EVal();
		((EVal)yyval).nextList = EVal.makeList(0);		
	};
  break;
    

  case 46:
  if (yyn == 46)
    
/* Line 353 of lalr1.java  */
/* Line 644 of "YYParser.y"  */
    {
		System.out.println("Rule 20.3");
		yyval = new EVal();
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (3-(2)))).nextList;
		
	};
  break;
    

  case 47:
  if (yyn == 47)
    
/* Line 353 of lalr1.java  */
/* Line 651 of "YYParser.y"  */
    {
		System.out.println("Rule 20.4");
	};
  break;
    

  case 48:
  if (yyn == 48)
    
/* Line 353 of lalr1.java  */
/* Line 656 of "YYParser.y"  */
    {
	System.out.println("Rule 21.1 jomleha : jomleha M jomle");
	yyval = new EVal();
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (3-(3)))).nextList;
		backpatch(((EVal)(yystack.valueAt (3-(1)))).nextList, ((EVal)(yystack.valueAt (3-(2)))).quad);
	};
  break;
    

  case 49:
  if (yyn == 49)
    
/* Line 353 of lalr1.java  */
/* Line 663 of "YYParser.y"  */
    {
	System.out.println("Rule 21.2 jomleha : jomle");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 50:
  if (yyn == 50)
    
/* Line 353 of lalr1.java  */
/* Line 671 of "YYParser.y"  */
    {
		System.out.println("Rule 22.1 jomleyeEbarat : ebarat NOGHTE_VIRGUL M");
		yyval = new EVal();
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (3-(1)))).nextList;
	
	};
  break;
    

  case 51:
  if (yyn == 51)
    
/* Line 353 of lalr1.java  */
/* Line 678 of "YYParser.y"  */
    {
	System.out.println("Rule 22.2 jomleyeEbarat : NOGHTE_VIRGUL M");
	yyval = new EVal();
	((EVal)yyval).nextList = EVal.makeList(((EVal)(yystack.valueAt (2-(2)))).quad);
	};
  break;
    

  case 52:
  if (yyn == 52)
    
/* Line 353 of lalr1.java  */
/* Line 684 of "YYParser.y"  */
    {
		System.out.println("Rule 23.2 jomleyeEntekhab : IF_KW ebarateRiaziManteghi THEN_KW M jomle N ELSE_KW M jomle ");
		yyval = new EVal();
		backpatch(((EVal)(yystack.valueAt (9-(2)))).trueList, ((EVal)(yystack.valueAt (9-(4)))).quad);
		backpatch(((EVal)(yystack.valueAt (9-(2)))).falseList, ((EVal)(yystack.valueAt (9-(8)))).quad);
		((EVal)yyval).nextList = EVal.merge(((EVal)(yystack.valueAt (9-(5)))).nextList, ((EVal)(yystack.valueAt (9-(6)))).nextList);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).nextList, ((EVal)(yystack.valueAt (9-(9)))).nextList);

	};
  break;
    

  case 53:
  if (yyn == 53)
    
/* Line 353 of lalr1.java  */
/* Line 694 of "YYParser.y"  */
    {
		System.out.println("Rule otherjomle " +
			"statement: otherjomle");
		yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 54:
  if (yyn == 54)
    
/* Line 353 of lalr1.java  */
/* Line 701 of "YYParser.y"  */
    {
		System.out.println("Rule 21.1: " +
			"unmatched: IF_KW ebarateSade THEN_KW M matched N ELSE_KW M unmatched");
		yyval = new EVal();
		backpatch(((EVal)(yystack.valueAt (9-(2)))).trueList, ((EVal)(yystack.valueAt (9-(4)))).quad);
		backpatch(((EVal)(yystack.valueAt (9-(2)))).falseList, ((EVal)(yystack.valueAt (9-(8)))).quad);
		((EVal)yyval).nextList = EVal.merge(((EVal)(yystack.valueAt (9-(5)))).nextList, ((EVal)(yystack.valueAt (9-(6)))).nextList);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).nextList, ((EVal)(yystack.valueAt (9-(9)))).nextList);
	};
  break;
    

  case 55:
  if (yyn == 55)
    
/* Line 353 of lalr1.java  */
/* Line 710 of "YYParser.y"  */
    {
		System.out.println("Rule 21.2: " +
			"unmatched: IF_KW ebarateSade THEN_KW M statement");
		yyval = new EVal();
		backpatch(((EVal)(yystack.valueAt (5-(2)))).trueList, ((EVal)(yystack.valueAt (5-(4)))).quad);
		((EVal)yyval).nextList = EVal.merge(((EVal)(yystack.valueAt (5-(2)))).falseList, ((EVal)(yystack.valueAt (5-(5)))).nextList);
	};
  break;
    

  case 56:
  if (yyn == 56)
    
/* Line 353 of lalr1.java  */
/* Line 720 of "YYParser.y"  */
    {
	System.out.println("Rule 23.3 jomleyeEntekhab : KEY_KW PARANTHESIS_BAZ_KW ebarateSade PARANTHESIS_BASTE onsoreHalat onsorePishfarz END_KW ");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_INTEGER, false);
		((EVal)yyval).nextList = EVal.merge(((EVal)(yystack.valueAt (8-(6)))).nextList, ((EVal)(yystack.valueAt (8-(7)))).nextList);

		int last = ((EVal)(yystack.valueAt (8-(6)))).falseList.size() - 1;
		backpatch(((EVal)(yystack.valueAt (8-(5)))).nextList, ((EVal)(yystack.valueAt (8-(6)))).initList.get(0));
		backpatch(((EVal)(yystack.valueAt (8-(6)))).falseList.get(last), nextQuad());
		for(int i = 0; i < ((EVal)(yystack.valueAt (8-(6)))).declareds.size() - 1; i++) {
			backpatch(((EVal)(yystack.valueAt (8-(6)))).falseList.get(i), ((EVal)(yystack.valueAt (8-(6)))).initList.get(i + 1));

			emit("=", ((EVal)(yystack.valueAt (8-(3)))).place, ((EVal)(yystack.valueAt (8-(6)))).declareds.get(i).place, ((EVal)yyval).place);
			emit("check", ((EVal)yyval).place, null, String.valueOf(((EVal)(yystack.valueAt (8-(6)))).trueList.get(i))); // result will not be backpatched.
		}
		emit("=", ((EVal)(yystack.valueAt (8-(3)))).place, ((EVal)(yystack.valueAt (8-(6)))).declareds.get(last).place, ((EVal)yyval).place);
		emit("check", ((EVal)yyval).place, null, String.valueOf(((EVal)(yystack.valueAt (8-(6)))).trueList.get(last))); // result will not be backpatched.

		emit("goto", null, null, String.valueOf(((EVal)(yystack.valueAt (8-(7)))).quad)); // result will not be backpatched.


	};
  break;
    

  case 57:
  if (yyn == 57)
    
/* Line 353 of lalr1.java  */
/* Line 744 of "YYParser.y"  */
    {
		System.out.println("Rule 23.4");
		
		System.out.println("Rule 22.5.2: " +
			"other_statement: SWITCH_KW expressions N caseelement END_KW");
		if(((EVal)(yystack.valueAt (7-(5)))).type != EVal.TYPE_CODE_INTEGER) {
			System.err.println("Error! Switch expression type mismatch. (\"" + ((EVal)(yystack.valueAt (7-(3)))).place + "\" is not integer.)");
			return YYABORT;
		}
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_INTEGER, false);
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (7-(6)))).nextList;

		int last = ((EVal)(yystack.valueAt (7-(6)))).falseList.size() - 1;
		backpatch(((EVal)(yystack.valueAt (7-(5)))).nextList, ((EVal)(yystack.valueAt (7-(6)))).initList.get(0));
		backpatch(((EVal)(yystack.valueAt (7-(6)))).falseList.get(last), nextQuad());
		for(int i = 0; i < ((EVal)(yystack.valueAt (7-(6)))).declareds.size() - 1; i++) {
			backpatch(((EVal)(yystack.valueAt (7-(6)))).falseList.get(i), ((EVal)(yystack.valueAt (7-(6)))).initList.get(i + 1));

			emit("=", ((EVal)(yystack.valueAt (7-(3)))).place, ((EVal)(yystack.valueAt (7-(6)))).declareds.get(i).place, ((EVal)yyval).place);
			emit("check", ((EVal)yyval).place, null, String.valueOf(((EVal)(yystack.valueAt (7-(6)))).trueList.get(i))); // result will not be backpatched.
		}
		emit("=", ((EVal)(yystack.valueAt (7-(3)))).place, ((EVal)(yystack.valueAt (7-(6)))).declareds.get(last).place, ((EVal)yyval).place);
		
		emit("check", ((EVal)yyval).place, null, String.valueOf(((EVal)(yystack.valueAt (7-(6)))).trueList.get(last))); // result will not be backpatched.

		((EVal)yyval).nextList.add(nextQuad());
		emit("goto", null, null, String.valueOf(nextQuad())); // result will be backpatched.
	};
  break;
    

  case 58:
  if (yyn == 58)
    
/* Line 353 of lalr1.java  */
/* Line 777 of "YYParser.y"  */
    { System.out.println("Rule 24.1 onsoreHalat : SWITCH_KW M saved_integer N  DONOGHTE_KW M jomle NOGHTE_VIRGUL");
	yyval = new EVal();
		((EVal)yyval).initList = EVal.makeList(((EVal)(yystack.valueAt (7-(2)))).quad); // Starting point of saving saved_integer is stored in initList;
		((EVal)yyval).declareds = EVal.makeInitializersOrDeclareds(((EVal)(yystack.valueAt (7-(3))))); // saved_integer value is stored in declareds.
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (7-(4)))).nextList; // If there is another init point this will be backpatched to next init point, else to test point.
		((EVal)yyval).trueList = EVal.makeList(((EVal)(yystack.valueAt (7-(6)))).quad); // Starting point of block is stored in trueList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (7-(7)))).nextList;

	 };
  break;
    

  case 59:
  if (yyn == 59)
    
/* Line 353 of lalr1.java  */
/* Line 787 of "YYParser.y"  */
    {System.out.println("Rule 24.2 onsoreHalat : onsoreHalat SWITCH_KW M saved_integer N DONOGHTE_KW M jomle NOGHTE_VIRGUL");
	yyval = new EVal();
		((EVal)yyval).initList = ((EVal)(yystack.valueAt (8-(1)))).initList;
		((EVal)yyval).initList.add(((EVal)(yystack.valueAt (8-(3)))).quad);
		((EVal)yyval).declareds = ((EVal)(yystack.valueAt (8-(1)))).declareds;
		((EVal)yyval).declareds.add(((EVal)(yystack.valueAt (8-(4)))));
		((EVal)yyval).falseList = EVal.merge(((EVal)(yystack.valueAt (8-(1)))).falseList, ((EVal)(yystack.valueAt (8-(5)))).nextList);
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (8-(1)))).trueList;
		((EVal)yyval).trueList.add(((EVal)(yystack.valueAt (8-(7)))).quad);
		((EVal)yyval).nextList = EVal.merge(((EVal)(yystack.valueAt (8-(1)))).nextList, ((EVal)(yystack.valueAt (8-(8)))).nextList);
};
  break;
    

  case 60:
  if (yyn == 60)
    
/* Line 353 of lalr1.java  */
/* Line 800 of "YYParser.y"  */
    {System.out.println("Rule 25 onsorePishfarz: DEFAULT_KW DONOGHTE_KW M jomle N NOGHTE_VIRGUL");
	yyval = new EVal();
		((EVal)yyval).quad = ((EVal)(yystack.valueAt (5-(3)))).quad;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (5-(5)))).nextList;
		};
  break;
    

  case 61:
  if (yyn == 61)
    
/* Line 353 of lalr1.java  */
/* Line 807 of "YYParser.y"  */
    {System.out.println("Rule 26 jomleyeTekrar: WHILE_KW PARANTHESIS_BAZ_KW M ebarateSade PARANTHESIS_BASTE_KW M jomle ");
	
		backpatch(((EVal)(yystack.valueAt (7-(7)))).nextList, ((EVal)(yystack.valueAt (7-(3)))).quad);
		backpatch(((EVal)(yystack.valueAt (7-(4)))).trueList, ((EVal)(yystack.valueAt (7-(6)))).quad);
		yyval = new EVal();
		
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (7-(4)))).falseList;
		emit("goto", null, null, String.valueOf(nextQuad() + 1));

	};
  break;
    

  case 62:
  if (yyn == 62)
    
/* Line 353 of lalr1.java  */
/* Line 820 of "YYParser.y"  */
    {System.out.println("Rule 27.1");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (3-(2)))).nextList;};
  break;
    

  case 63:
  if (yyn == 63)
    
/* Line 353 of lalr1.java  */
/* Line 824 of "YYParser.y"  */
    {
	System.out.println("Rule 27.2");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (3-(2)))).nextList;
	emit(":=",((EVal)(yystack.valueAt (3-(2)))).place , null, "stack[sp + 1]");
	emit("+","sp" , "2", "top");
	emit(":=","*sp", null, "sp");
	emit(":=","*top", null, "L");
	emit("+","top" , "1", "top");
	emit("+","*top" , "top", "top");
	emit("+","1" , "top", "top");
	emit ("goto",null,null,"L");
	};
  break;
    

  case 64:
  if (yyn == 64)
    
/* Line 353 of lalr1.java  */
/* Line 839 of "YYParser.y"  */
    {System.out.println("Rule 28");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (3-(2)))).nextList;};
  break;
    

  case 65:
  if (yyn == 65)
    
/* Line 353 of lalr1.java  */
/* Line 844 of "YYParser.y"  */
    {
	System.out.println("Rule 29.1");
		int index = symbolTable.lookUp(((EVal)(yystack.valueAt (3-(1)))).place);
		if (index == SymbolTable.NOT_IN_SYMBOL_TABLE) {
			System.err.println("Error! \"" + ((EVal)(yystack.valueAt (3-(1)))).place + "\" is not declared.");
			return YYABORT;
		}
		String srcPlace = ((EVal)(yystack.valueAt (3-(3)))).place;
		if((symbolTable.types.get(index) != ((EVal)(yystack.valueAt (3-(3)))).type)
			&& !((symbolTable.types.get(index) == EVal.TYPE_CODE_INTEGER
					|| symbolTable.types.get(index) == EVal.TYPE_CODE_CHAR
					|| symbolTable.types.get(index) == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER
					|| ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR
					|| ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))) {
			if((symbolTable.types.get(index) == EVal.TYPE_CODE_REAL)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER
					|| ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR
					|| ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
				srcPlace = newTemp(EVal.TYPE_CODE_REAL, false);
				emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, srcPlace);
			} else if((symbolTable.types.get(index) == EVal.TYPE_CODE_INTEGER
					|| symbolTable.types.get(index) == EVal.TYPE_CODE_CHAR
					|| symbolTable.types.get(index) == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
				srcPlace = newTemp(symbolTable.types.get(index), false);
				emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, getTypeString(symbolTable.types.get(index)), srcPlace);
			} else {
				System.err.println("Error! Type mismatch: " + ((EVal)(yystack.valueAt (3-(1)))).place + ", " + ((EVal)(yystack.valueAt (3-(3)))).place);
				return YYABORT;
			}
		}
		if (symbolTable.arrays.get(index)) {
			System.err.println("Error! \"" + lexIdentifier + "\" is an array, it can not be used without index.");
			return YYABORT;
		}
		yyval = new EVal();
		((EVal)yyval).place = symbolTable.names.get(index);
		((EVal)yyval).type = symbolTable.types.get(index);
		if(symbolTable.types.get(index) != EVal.TYPE_CODE_BOOLEAN) {
			((EVal)yyval).nextList = ((EVal)(yystack.valueAt (3-(1)))).nextList;
			emit(":=", srcPlace, null, ((EVal)(yystack.valueAt (3-(1)))).place);
			switch (symbolTable.types.get(index)) {
				case EVal.TYPE_CODE_INTEGER:
					emit("iprint", null, null, ((EVal)(yystack.valueAt (3-(1)))).place);
					break;
				case EVal.TYPE_CODE_REAL:
					emit("rprint", null, null, ((EVal)(yystack.valueAt (3-(1)))).place);
					break;
				case EVal.TYPE_CODE_CHAR:
					emit("cprint", null, null, ((EVal)(yystack.valueAt (3-(1)))).place);
					break;
			}
		} else {
			backpatch(((EVal)(yystack.valueAt (3-(3)))).falseList, nextQuad());
			backpatch(((EVal)(yystack.valueAt (3-(3)))).trueList, nextQuad() + 2);
			emit(":=", "0", null, ((EVal)yyval).place);
			emit("goto", null, null, String.valueOf(nextQuad() + 2));
			emit(":=", "1", null, ((EVal)yyval).place);
			emit("bprint", null, null, ((EVal)(yystack.valueAt (3-(1)))).place);
		}
		((EVal)yyval).nextList = EVal.makeList(nextQuad());
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.
	
		
	};
  break;
    

  case 66:
  if (yyn == 66)
    
/* Line 353 of lalr1.java  */
/* Line 914 of "YYParser.y"  */
    {
	
		System.out.println("Rule 29.1: " +
			"arithmatic_expressions: expressions ADD_KW expressions");
		if(((((EVal)yyval).type == EVal.TYPE_CODE_INTEGER || ((EVal)yyval).type == EVal.TYPE_CODE_CHAR || ((EVal)yyval).type == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)yyval).type == EVal.TYPE_CODE_REAL && ((EVal)yyval).type == EVal.TYPE_CODE_REAL)) {
			emit("+", ((EVal)yyval).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if((((EVal)yyval).type == EVal.TYPE_CODE_INTEGER || ((EVal)yyval).type == EVal.TYPE_CODE_CHAR || ((EVal)yyval).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)yyval).place, TYPE_STRING_REAL, tmp);
			emit("+", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if(((EVal)yyval).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("+", ((EVal)yyval).place, tmp, ((EVal)yyval).place);
		} else {
			System.err.println("Error! Invalid type for \"+\" operation.");
			return YYABORT;
		}

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 67:
  if (yyn == 67)
    
/* Line 353 of lalr1.java  */
/* Line 949 of "YYParser.y"  */
    {
	
		System.out.println("Rule 29.1: " +
			"arithmatic_expressions: expressions ADD_KW expressions");
		if(((((EVal)yyval).type == EVal.TYPE_CODE_INTEGER || ((EVal)yyval).type == EVal.TYPE_CODE_CHAR || ((EVal)yyval).type == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)yyval).type == EVal.TYPE_CODE_REAL && ((EVal)yyval).type == EVal.TYPE_CODE_REAL)) {
			emit("-", ((EVal)yyval).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if((((EVal)yyval).type == EVal.TYPE_CODE_INTEGER || ((EVal)yyval).type == EVal.TYPE_CODE_CHAR || ((EVal)yyval).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)yyval).place, TYPE_STRING_REAL, tmp);
			emit("-", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if(((EVal)yyval).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("-", ((EVal)yyval).place, tmp, ((EVal)yyval).place);
		} else {
			System.err.println("Error! Invalid type for \"+\" operation.");
			return YYABORT;
		}

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 68:
  if (yyn == 68)
    
/* Line 353 of lalr1.java  */
/* Line 984 of "YYParser.y"  */
    {
	
		System.out.println("Rule 29.1: " +
			"arithmatic_expressions: expressions ADD_KW expressions");
		if(((((EVal)yyval).type == EVal.TYPE_CODE_INTEGER || ((EVal)yyval).type == EVal.TYPE_CODE_CHAR || ((EVal)yyval).type == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)yyval).type == EVal.TYPE_CODE_REAL && ((EVal)yyval).type == EVal.TYPE_CODE_REAL)) {
			emit("*", ((EVal)yyval).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if((((EVal)yyval).type == EVal.TYPE_CODE_INTEGER || ((EVal)yyval).type == EVal.TYPE_CODE_CHAR || ((EVal)yyval).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)yyval).place, TYPE_STRING_REAL, tmp);
			emit("*", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if(((EVal)yyval).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("*", ((EVal)yyval).place, tmp, ((EVal)yyval).place);
		} else {
			System.err.println("Error! Invalid type for \"+\" operation.");
			return YYABORT;
		}

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 69:
  if (yyn == 69)
    
/* Line 353 of lalr1.java  */
/* Line 1019 of "YYParser.y"  */
    {
	
		System.out.println("Rule 29.1: " +
			"arithmatic_expressions: expressions ADD_KW expressions");
		if(((((EVal)yyval).type == EVal.TYPE_CODE_INTEGER || ((EVal)yyval).type == EVal.TYPE_CODE_CHAR || ((EVal)yyval).type == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)yyval).type == EVal.TYPE_CODE_REAL && ((EVal)yyval).type == EVal.TYPE_CODE_REAL)) {
			emit("/", ((EVal)yyval).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if((((EVal)yyval).type == EVal.TYPE_CODE_INTEGER || ((EVal)yyval).type == EVal.TYPE_CODE_CHAR || ((EVal)yyval).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)yyval).place, TYPE_STRING_REAL, tmp);
			emit("/", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if(((EVal)yyval).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("/", ((EVal)yyval).place, tmp, ((EVal)yyval).place);
		} else {
			System.err.println("Error! Invalid type for \"+\" operation.");
			return YYABORT;
		}

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 70:
  if (yyn == 70)
    
/* Line 353 of lalr1.java  */
/* Line 1054 of "YYParser.y"  */
    {System.out.println("Rule 29.6");};
  break;
    

  case 71:
  if (yyn == 71)
    
/* Line 353 of lalr1.java  */
/* Line 1056 of "YYParser.y"  */
    {System.out.println("Rule 29.7");};
  break;
    

  case 72:
  if (yyn == 72)
    
/* Line 353 of lalr1.java  */
/* Line 1058 of "YYParser.y"  */
    {System.out.println(" Rule 29.8 ebarateSade to ebarat");
	yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
		
	};
  break;
    

  case 73:
  if (yyn == 73)
    
/* Line 353 of lalr1.java  */
/* Line 1069 of "YYParser.y"  */
    {
		System.out.println("Rule 30.1: " +
			"bool_expressions: expressions OR_KW M expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		backpatch(((EVal)(yystack.valueAt (4-(1)))).falseList, ((EVal)(yystack.valueAt (4-(3)))).quad);
		((EVal)yyval).trueList = EVal.merge(((EVal)(yystack.valueAt (4-(1)))).trueList, ((EVal)(yystack.valueAt (4-(4)))).trueList);
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (4-(4)))).falseList;
	};
  break;
    

  case 74:
  if (yyn == 74)
    
/* Line 353 of lalr1.java  */
/* Line 1080 of "YYParser.y"  */
    {
		System.out.println("Rule 30.2: " +
			"bool_expressions: expressions AND_KW M expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		backpatch(((EVal)(yystack.valueAt (4-(1)))).trueList, ((EVal)(yystack.valueAt (4-(3)))).quad);
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (4-(4)))).trueList;
		((EVal)yyval).falseList = EVal.merge(((EVal)(yystack.valueAt (4-(1)))).falseList, ((EVal)(yystack.valueAt (4-(4)))).falseList);
	};
  break;
    

  case 75:
  if (yyn == 75)
    
/* Line 353 of lalr1.java  */
/* Line 1091 of "YYParser.y"  */
    {
		System.out.println("Rule 30.3: " +
			"bool_expressions: expressions OR_ELSE_KW M expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		
		backpatch(((EVal)(yystack.valueAt (4-(1)))).trueList, nextQuad());
		emit(":=", "1", null, ((EVal)yyval).place);
		emit("goto", null, null, String.valueOf(((EVal)(yystack.valueAt (4-(3)))).quad));
		backpatch(((EVal)(yystack.valueAt (4-(1)))).falseList, nextQuad());
		emit(":=", "0", null, ((EVal)yyval).place);
		emit("goto", null, null, String.valueOf(((EVal)(yystack.valueAt (4-(3)))).quad));
		backpatch(((EVal)(yystack.valueAt (4-(4)))).trueList, nextQuad());
		backpatch(((EVal)(yystack.valueAt (4-(4)))).falseList, nextQuad());
		emit("+", ((EVal)yyval).place, ((EVal)(yystack.valueAt (4-(4)))).place, ((EVal)yyval).place);
		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2));
		//emit("goto", null, null, String.valueOf(nextQuad() + 1));
	};
  break;
    

  case 76:
  if (yyn == 76)
    
/* Line 353 of lalr1.java  */
/* Line 1113 of "YYParser.y"  */
    {
		System.out.println("Rule 30.4: " +
			"bool_expressions: expressions AND_THEN_KW M expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		
		backpatch(((EVal)(yystack.valueAt (4-(1)))).trueList, nextQuad());
		emit(":=", "1", null, ((EVal)yyval).place);
		emit("goto", null, null, String.valueOf(((EVal)(yystack.valueAt (4-(3)))).quad));
		backpatch(((EVal)(yystack.valueAt (4-(1)))).falseList, nextQuad());
		emit(":=", "0", null, ((EVal)yyval).place);
		emit("goto", null, null, String.valueOf(((EVal)(yystack.valueAt (4-(3)))).quad));
		backpatch(((EVal)(yystack.valueAt (4-(4)))).trueList, nextQuad());
		backpatch(((EVal)(yystack.valueAt (4-(4)))).falseList, nextQuad());
		emit("*", ((EVal)yyval).place, ((EVal)(yystack.valueAt (4-(4)))).place, ((EVal)yyval).place);
		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2));// result will be backpatched
		//emit("goto", null, null, String.valueOf(nextQuad() + 1));// result will be backpatched
	};
  break;
    

  case 77:
  if (yyn == 77)
    
/* Line 353 of lalr1.java  */
/* Line 1135 of "YYParser.y"  */
    {
		System.out.println("Rule 30.5: " +
			"bool_expressions: NOT_KW expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (2-(2)))).falseList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (2-(2)))).trueList;
	};
  break;
    

  case 78:
  if (yyn == 78)
    
/* Line 353 of lalr1.java  */
/* Line 1145 of "YYParser.y"  */
    {
		System.out.println("Rule 30.6 ebarateRabetei to ebarateSade");
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 79:
  if (yyn == 79)
    
/* Line 353 of lalr1.java  */
/* Line 1156 of "YYParser.y"  */
    {
		System.out.println("Rule 31.1 ebarateRiaziManteghi to ebarateRabetei");
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
		if(((EVal)yyval).nextList == null){
			System.out.println("null is here");
		}
	};
  break;
    

  case 80:
  if (yyn == 80)
    
/* Line 353 of lalr1.java  */
/* Line 1169 of "YYParser.y"  */
    {
		System.out.println("Rule 31.2: " +
			"bool_expressions: expressions LT_KW expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);

		emit("<", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		emit("check", ((EVal)yyval).place, null, "-"); // result will be backpatched.
		emit("goto", null, null, "-"); // result will be backpatched.
	};
  break;
    

  case 81:
  if (yyn == 81)
    
/* Line 353 of lalr1.java  */
/* Line 1183 of "YYParser.y"  */
    {
		System.out.println("Rule 31.3: " +
			"bool_expressions: expressions LE_KW expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);

		emit("<=", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		emit("check", ((EVal)yyval).place, null, "-"); // result will be backpatched.
		emit("goto", null, null, "-"); // result will be backpatched.
	};
  break;
    

  case 82:
  if (yyn == 82)
    
/* Line 353 of lalr1.java  */
/* Line 1197 of "YYParser.y"  */
    {
		System.out.println("Rule 31.4: " +
			"bool_expressions: expressions GT_KW expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);

		emit(">", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		emit("check", ((EVal)yyval).place, null, "-"); // result will be backpatched.
		emit("goto", null, null, "-"); // result will be backpatched.
	};
  break;
    

  case 83:
  if (yyn == 83)
    
/* Line 353 of lalr1.java  */
/* Line 1211 of "YYParser.y"  */
    {
		System.out.println("Rule 31.5: " +
			"bool_expressions: expressions GE_KW expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);

		emit(">=", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		emit("check", ((EVal)yyval).place, null, "-"); // result will be backpatched.
		emit("goto", null, null, "-"); // result will be backpatched.
	};
  break;
    

  case 84:
  if (yyn == 84)
    
/* Line 353 of lalr1.java  */
/* Line 1225 of "YYParser.y"  */
    {
		System.out.println("Rule 31.6: " +
			"bool_expressions: expressions EQ_KW expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);

		emit("==", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		emit("check", ((EVal)yyval).place, null, "-"); // result will be backpatched.
		emit("goto", null, null, "-"); // result will be backpatched.
	};
  break;
    

  case 85:
  if (yyn == 85)
    
/* Line 353 of lalr1.java  */
/* Line 1240 of "YYParser.y"  */
    {
		if(((EVal)(yystack.valueAt (1-(1)))).type == EVal.TYPE_CODE_BOOLEAN){
			System.out.println("Rule 27.4: " +
			"constant_expressions: saved_boolean");
			yyval = new EVal();
			((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
			((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
			((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
			((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
			((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
		}
		else{
		System.out.println("Rule 26.4: " +
			"expressions: saved_identifier");
		int index = symbolTable.lookUp(((EVal)(yystack.valueAt (1-(1)))).place);
		if (index == SymbolTable.NOT_IN_SYMBOL_TABLE) {
			System.out.println("Error! \"" + ((EVal)(yystack.valueAt (1-(1)))).place + "\" is not declared.");
			return YYABORT;
		}
		if (symbolTable.arrays.get(index)) {
			System.out.println("Error! \"" + lexIdentifier + "\" is an array, it can not be used without index.");
			return YYABORT;
		}
		System.out.println("found: "+index);
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;//symbolTable.names.get(index);
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;//symbolTable.types.get(index);

		
		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);
		System.out.println("we have nextlist");

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result will be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.
		}
	};
  break;
    

  case 86:
  if (yyn == 86)
    
/* Line 353 of lalr1.java  */
/* Line 1279 of "YYParser.y"  */
    {
	
		System.out.println("Rule 29.1: " +
			"arithmatic_expressions: expressions ADD_KW expressions");
		if(((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (3-(1)))).type, false);
			((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(1)))).type;
			emit("+", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_REAL, tmp);
			emit("+", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("+", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, ((EVal)yyval).place);
		} else {
			System.err.println("Error! Invalid type for \"+\" operation.");
			return YYABORT;
		}

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 87:
  if (yyn == 87)
    
/* Line 353 of lalr1.java  */
/* Line 1319 of "YYParser.y"  */
    {
		System.out.println("Rule 29.2: " +
			"arithmatic_expressions: expressions SUB_KW expressions");
		if(((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (3-(1)))).type, false);
			((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(1)))).type;
			emit("-", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_REAL, tmp);
			emit("-", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("-", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, ((EVal)yyval).place);
		} else {
			System.err.println("Error! Invalid type for \"-\" operation.");
			return YYABORT;
		}

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 88:
  if (yyn == 88)
    
/* Line 353 of lalr1.java  */
/* Line 1358 of "YYParser.y"  */
    {
		System.out.println("Rule 29.3: " +
			"arithmatic_expressions: expressions MUL_KW expressions");
		if(((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (3-(1)))).type, false);
			((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(1)))).type;
			emit("*", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_REAL, tmp);
			emit("*", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("*", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, ((EVal)yyval).place);
		} else {
			System.err.println("Error! Invalid type for \"*\" operation.");
			return YYABORT;
		}

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 89:
  if (yyn == 89)
    
/* Line 353 of lalr1.java  */
/* Line 1397 of "YYParser.y"  */
    {
	
		System.out.println("Rule 29.4: " +
			"arithmatic_expressions: expressions DIV_KW expressions");
		if(((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (3-(1)))).type, false);
			((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(1)))).type;
			emit("/", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_REAL, tmp);
			emit("/", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("/", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, ((EVal)yyval).place);
		} else {
			System.err.println("Error! Invalid type for \"/\" operation.");
			return YYABORT;
		}

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 90:
  if (yyn == 90)
    
/* Line 353 of lalr1.java  */
/* Line 1437 of "YYParser.y"  */
    {
		System.out.println("Rule 29.5: " +
			"arithmatic_expressions: expressions MOD_KW expressions");
		if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER
				|| ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR
				|| ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER
				|| ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR
				|| ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_INTEGER, false);
			((EVal)yyval).type = EVal.TYPE_CODE_INTEGER;
			emit("%", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER
				|| ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR
				|| ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_INTEGER;
			String tmp = newTemp(EVal.TYPE_CODE_INTEGER, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_INTEGER, tmp);
			emit("%", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, ((EVal)yyval).place);
		} else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER
				|| ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR
				|| ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_INTEGER;
			String tmp = newTemp(EVal.TYPE_CODE_INTEGER, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_INTEGER, tmp);
			emit("%", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else {
			System.err.println("Error! Invalid type for \"%\" operation.");
			return YYABORT;
		}

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 91:
  if (yyn == 91)
    
/* Line 353 of lalr1.java  */
/* Line 1485 of "YYParser.y"  */
    {System.out.println("Rule 35.1");};
  break;
    

  case 92:
  if (yyn == 92)
    
/* Line 353 of lalr1.java  */
/* Line 1487 of "YYParser.y"  */
    {
		System.out.println("Rule 35.2 amel to ebarateYegani");
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 93:
  if (yyn == 93)
    
/* Line 353 of lalr1.java  */
/* Line 1498 of "YYParser.y"  */
    {System.out.println("Rule 36.1");};
  break;
    

  case 94:
  if (yyn == 94)
    
/* Line 353 of lalr1.java  */
/* Line 1500 of "YYParser.y"  */
    {System.out.println("Rule 36.2");};
  break;
    

  case 95:
  if (yyn == 95)
    
/* Line 353 of lalr1.java  */
/* Line 1502 of "YYParser.y"  */
    {System.out.println("Rule 36.3");};
  break;
    

  case 96:
  if (yyn == 96)
    
/* Line 353 of lalr1.java  */
/* Line 1505 of "YYParser.y"  */
    {
		System.out.println("Rule 37.1 taghirpazir to amel");
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
		};
  break;
    

  case 97:
  if (yyn == 97)
    
/* Line 353 of lalr1.java  */
/* Line 1516 of "YYParser.y"  */
    {System.out.println("Rule 37.2 taghirnapazir to amel");
					yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
		};
  break;
    

  case 98:
  if (yyn == 98)
    
/* Line 353 of lalr1.java  */
/* Line 1526 of "YYParser.y"  */
    {
		System.out.println("Rule 38.1 saved_identifier to taghirpazir");
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 99:
  if (yyn == 99)
    
/* Line 353 of lalr1.java  */
/* Line 1537 of "YYParser.y"  */
    {System.out.println("Rule 38.2");
	int index = symbolTable.lookUp(((EVal)(yystack.valueAt (4-(1)))).place);
		if (index == SymbolTable.NOT_IN_SYMBOL_TABLE) {
			System.err.println("Error! \"" + lexIdentifier + "\" is not declared.");
			return YYABORT;
		}
		if (!symbolTable.arrays.get(index)) {
			System.err.println("Error! \"" + lexIdentifier + "\" is not an array, it can not be used with index.");
			return YYABORT;
		}
		yyval = new EVal();
		((EVal)yyval).place = newTemp(symbolTable.types.get(index), false);
		((EVal)yyval).type = symbolTable.types.get(index);
		EVal.arrayIndexOutOfBoundList.add(nextQuad() + 2);
		EVal.arrayIndexOutOfBoundList.add(nextQuad() + 4);
		emit("-", ((EVal)(yystack.valueAt (4-(3)))).place, startStr + ((EVal)(yystack.valueAt (4-(1)))).place, indexStr + ((EVal)(yystack.valueAt (4-(1)))).place);
		emit(">=", indexStr + ((EVal)(yystack.valueAt (4-(1)))).place, sizeStr + ((EVal)(yystack.valueAt (4-(1)))).place, condStr + ((EVal)(yystack.valueAt (4-(1)))).place);
		emit("check", condStr + ((EVal)(yystack.valueAt (4-(1)))).place, null, String.valueOf(nextQuad() + 3)); // Result will be backpatched.
		emit("<", indexStr + ((EVal)(yystack.valueAt (4-(1)))).place, "0", condStr + ((EVal)(yystack.valueAt (4-(1)))).place);
		emit("check", condStr + ((EVal)(yystack.valueAt (4-(1)))).place, null, String.valueOf(nextQuad() + 1)); // Result will be backpatched.

		emit("=[]", ((EVal)(yystack.valueAt (4-(1)))).place, indexStr + ((EVal)(yystack.valueAt (4-(1)))).place, ((EVal)yyval).place);

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result will be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); //result will be backpatche
		};
  break;
    

  case 100:
  if (yyn == 100)
    
/* Line 353 of lalr1.java  */
/* Line 1568 of "YYParser.y"  */
    {
		System.out.println("Rule 38.3");
		
		if(symbolTable.lookUp(((EVal)(yystack.valueAt (3-(1)))).place)==-1){
			System.err.println("struct not defined.");

		}
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (3-(3)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(3)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (3-(3)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (3-(3)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (3-(3)))).nextList;
		};
  break;
    

  case 101:
  if (yyn == 101)
    
/* Line 353 of lalr1.java  */
/* Line 1585 of "YYParser.y"  */
    {System.out.println("Rule 39.1");
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (3-(2)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(2)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (3-(2)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (3-(2)))).falseList;};
  break;
    

  case 102:
  if (yyn == 102)
    
/* Line 353 of lalr1.java  */
/* Line 1592 of "YYParser.y"  */
    {System.out.println("Rule 39.2");};
  break;
    

  case 103:
  if (yyn == 103)
    
/* Line 353 of lalr1.java  */
/* Line 1594 of "YYParser.y"  */
    {
		System.out.println("Rule 39.3: meghdareSabet to taghirnapazir");
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 104:
  if (yyn == 104)
    
/* Line 353 of lalr1.java  */
/* Line 1605 of "YYParser.y"  */
    {System.out.println("Rule 40.1");
	
	emit("-", "top", "1", "top");
	emit(":=",String.valueOf(n) , null, "stack[top]");
	emit("-", "top", "1", "top");
	emit(":=",String.valueOf(nextQuad() - 1) , null, "stack[top]");
	emit("-", "top", "1", "top");
	emit("-", "top", "1", "top");
	emit(":=","sp" , null, "stack[top]");
	emit(":=","top" , null, "sp");
	emit("+", "top", "3", "top");
	emit("+", "top", "*top", "top");
	emit ("goto",null,null,symbolTable.addFunction(((EVal)(yystack.valueAt (4-(1)))).place,0));
	};
  break;
    

  case 105:
  if (yyn == 105)
    
/* Line 353 of lalr1.java  */
/* Line 1620 of "YYParser.y"  */
    {System.out.println("Rule 40.2");};
  break;
    

  case 106:
  if (yyn == 106)
    
/* Line 353 of lalr1.java  */
/* Line 1623 of "YYParser.y"  */
    {
	  System.out.println("Rule 42.1");
	  emit("-", "top", "1", "top");
	  emit(":=",((EVal)(yystack.valueAt (3-(1)))).place , null, "stack[top]");
	  n++;
	  };
  break;
    

  case 107:
  if (yyn == 107)
    
/* Line 353 of lalr1.java  */
/* Line 1630 of "YYParser.y"  */
    {
	n = 1;
	System.out.println("Rule 42.2");
	emit("-", "top", "1", "top");
	emit(":=",((EVal)(yystack.valueAt (1-(1)))).place , null, "stack[top]");
	};
  break;
    

  case 108:
  if (yyn == 108)
    
/* Line 353 of lalr1.java  */
/* Line 1638 of "YYParser.y"  */
    {
		System.out.println("Rule 43.1: " +
			"constant_expressions: saved_integer");
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 109:
  if (yyn == 109)
    
/* Line 353 of lalr1.java  */
/* Line 1649 of "YYParser.y"  */
    {
		System.out.println("Rule 43.2: " +
			"constant_expressions: saved_real");
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 110:
  if (yyn == 110)
    
/* Line 353 of lalr1.java  */
/* Line 1660 of "YYParser.y"  */
    {
		System.out.println("Rule 43.3: " +
			"constant_expressions: saved_char");
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 111:
  if (yyn == 111)
    
/* Line 353 of lalr1.java  */
/* Line 1671 of "YYParser.y"  */
    {
		System.out.println("Rule 43.4: " +
			"constant_expressions: saved_boolean");
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 112:
  if (yyn == 112)
    
/* Line 353 of lalr1.java  */
/* Line 1683 of "YYParser.y"  */
    {
		System.out.println("Rule 30: " +
			"saved_identifier: IDENTIFIER");
		yyval = new EVal();
		((EVal)yyval).place = lexIdentifier;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

};
  break;
    

  case 113:
  if (yyn == 113)
    
/* Line 353 of lalr1.java  */
/* Line 1695 of "YYParser.y"  */
    {
		System.out.println("Rule 31: " +
			"saved_integer: INTEGER_CONSTANT");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_INTEGER, false);
		((EVal)yyval).type = EVal.TYPE_CODE_INTEGER;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);
		
		emit(":=", String.valueOf(lexInt), null, ((EVal)yyval).place);
		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.

};
  break;
    

  case 114:
  if (yyn == 114)
    
/* Line 353 of lalr1.java  */
/* Line 1712 of "YYParser.y"  */
    {
		System.out.println("Rule 32: " +
			"saved_real: REAL_CONSTANT");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
		((EVal)yyval).type = EVal.TYPE_CODE_REAL;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		emit(":=", String.valueOf(lexReal), null, ((EVal)yyval).place);
		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
};
  break;
    

  case 115:
  if (yyn == 115)
    
/* Line 353 of lalr1.java  */
/* Line 1728 of "YYParser.y"  */
    {
		System.out.println("saved_char: HARFE_SABET");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_CHAR, false);
		((EVal)yyval).type = EVal.TYPE_CODE_CHAR;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		emit(":=", "'" + String.valueOf(lexChar) + "'", null, ((EVal)yyval).place);
		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
};
  break;
    

  case 116:
  if (yyn == 116)
    
/* Line 353 of lalr1.java  */
/* Line 1743 of "YYParser.y"  */
    {
		System.out.println("Rule 34.1: " +
			"saved_boolean: TRUE_KW");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);
		
		emit(":=", "1", null, ((EVal)yyval).place);
		
		emit("check", ((EVal)yyval).place, null, "-"); // result may be backpatched.
		emit("goto", null, null, "-"); // result may be backpatched.
	};
  break;
    

  case 117:
  if (yyn == 117)
    
/* Line 353 of lalr1.java  */
/* Line 1758 of "YYParser.y"  */
    {
		System.out.println("Rule 34.2: " +
			"saved_boolean: FALSE_KW");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);
		
		emit(":=", "0", null, ((EVal)yyval).place);

		
		emit("check", ((EVal)yyval).place, null, "-"); // result may be backpatched.
		emit("goto", null, null, "-"); // result may be backpatched.

	};
  break;
    

  case 118:
  if (yyn == 118)
    
/* Line 353 of lalr1.java  */
/* Line 1777 of "YYParser.y"  */
    {
		System.out.println("Rule 35: " +
			"M: ");
		yyval = new EVal();
		((EVal)yyval).quad = nextQuad();
	};
  break;
    

  case 119:
  if (yyn == 119)
    
/* Line 353 of lalr1.java  */
/* Line 1785 of "YYParser.y"  */
    {
		System.out.println("Rule 36: " +
			"N: ");
		yyval = new EVal();
		((EVal)yyval).nextList = EVal.makeList(nextQuad());
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.
};
  break;
    



/* Line 353 of lalr1.java  */
/* Line 2756 of "YYParser.java"  */
	default: break;
      }

    yy_symbol_print ("-> $$ =", yyr1_[yyn], yyval);

    yystack.pop (yylen);
    yylen = 0;

    /* Shift the result of the reduction.  */
    yyn = yyr1_[yyn];
    int yystate = yypgoto_[yyn - yyntokens_] + yystack.stateAt (0);
    if (0 <= yystate && yystate <= yylast_
	&& yycheck_[yystate] == yystack.stateAt (0))
      yystate = yytable_[yystate];
    else
      yystate = yydefgoto_[yyn - yyntokens_];

    yystack.push (yystate, yyval);
    return YYNEWSTATE;
  }

  /* Return YYSTR after stripping away unnecessary quotes and
     backslashes, so that it's suitable for yyerror.  The heuristic is
     that double-quoting is unnecessary unless the string contains an
     apostrophe, a comma, or backslash (other than backslash-backslash).
     YYSTR is taken from yytname.  */
  private final String yytnamerr_ (String yystr)
  {
    if (yystr.charAt (0) == '"')
      {
        StringBuffer yyr = new StringBuffer ();
        strip_quotes: for (int i = 1; i < yystr.length (); i++)
          switch (yystr.charAt (i))
            {
            case '\'':
            case ',':
              break strip_quotes;

            case '\\':
	      if (yystr.charAt(++i) != '\\')
                break strip_quotes;
              /* Fall through.  */
            default:
              yyr.append (yystr.charAt (i));
              break;

            case '"':
              return yyr.toString ();
            }
      }
    else if (yystr.equals ("$end"))
      return "end of input";

    return yystr;
  }

  /*--------------------------------.
  | Print this symbol on YYOUTPUT.  |
  `--------------------------------*/

  private void yy_symbol_print (String s, int yytype,
			         Object yyvaluep				 )
  {
    if (yydebug > 0)
    yycdebug (s + (yytype < yyntokens_ ? " token " : " nterm ")
	      + yytname_[yytype] + " ("
	      + (yyvaluep == null ? "(null)" : yyvaluep.toString ()) + ")");
  }

  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
  public boolean parse () throws java.io.IOException
  {
    /// Lookahead and lookahead in internal form.
    int yychar = yyempty_;
    int yytoken = 0;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;

    YYStack yystack = new YYStack ();

    /* Error handling.  */
    int yynerrs_ = 0;
    

    /// Semantic value of the lookahead.
    Object yylval = null;

    int yyresult;

    yycdebug ("Starting parse\n");
    yyerrstatus_ = 0;


    /* Initialize the stack.  */
    yystack.push (yystate, yylval);

    int label = YYNEWSTATE;
    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
	   pushed when we come here.  */
      case YYNEWSTATE:
        yycdebug ("Entering state " + yystate + "\n");
        if (yydebug > 0)
          yystack.print (yyDebugStream);
    
        /* Accept?  */
        if (yystate == yyfinal_)
          return true;
    
        /* Take a decision.  First try without lookahead.  */
        yyn = yypact_[yystate];
        if (yyn == yypact_ninf_)
          {
            label = YYDEFAULT;
	    break;
          }
    
        /* Read a lookahead token.  */
        if (yychar == yyempty_)
          {
	    yycdebug ("Reading a token: ");
	    yychar = yylex ();
            
            yylval = yylexer.getLVal ();
          }
    
        /* Convert token to internal form.  */
        if (yychar <= EOF)
          {
	    yychar = yytoken = EOF;
	    yycdebug ("Now at end of input.\n");
          }
        else
          {
	    yytoken = yytranslate_ (yychar);
	    yy_symbol_print ("Next token is", yytoken,
	    		     yylval);
          }
    
        /* If the proper action on seeing token YYTOKEN is to reduce or to
           detect an error, take that action.  */
        yyn += yytoken;
        if (yyn < 0 || yylast_ < yyn || yycheck_[yyn] != yytoken)
          label = YYDEFAULT;
    
        /* <= 0 means reduce or error.  */
        else if ((yyn = yytable_[yyn]) <= 0)
          {
	    if (yyn == 0 || yyn == yytable_ninf_)
	      label = YYFAIL;
	    else
	      {
	        yyn = -yyn;
	        label = YYREDUCE;
	      }
          }
    
        else
          {
            /* Shift the lookahead token.  */
	    yy_symbol_print ("Shifting", yytoken,
	    		     yylval);
    
            /* Discard the token being shifted.  */
            yychar = yyempty_;
    
            /* Count tokens shifted since error; after three, turn off error
               status.  */
            if (yyerrstatus_ > 0)
              --yyerrstatus_;
    
            yystate = yyn;
            yystack.push (yystate, yylval);
            label = YYNEWSTATE;
          }
        break;
    
      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
      case YYDEFAULT:
        yyn = yydefact_[yystate];
        if (yyn == 0)
          label = YYFAIL;
        else
          label = YYREDUCE;
        break;
    
      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
      case YYREDUCE:
        yylen = yyr2_[yyn];
        label = yyaction (yyn, yystack, yylen);
	yystate = yystack.stateAt (0);
        break;
    
      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
      case YYFAIL:
        /* If not already recovering from an error, report this error.  */
        if (yyerrstatus_ == 0)
          {
	    ++yynerrs_;
	    yyerror (yysyntax_error (yystate, yytoken));
          }
    
        
        if (yyerrstatus_ == 3)
          {
	    /* If just tried and failed to reuse lookahead token after an
	     error, discard it.  */
    
	    if (yychar <= EOF)
	      {
	      /* Return failure if at end of input.  */
	      if (yychar == EOF)
	        return false;
	      }
	    else
	      yychar = yyempty_;
          }
    
        /* Else will try to reuse lookahead token after shifting the error
           token.  */
        label = YYERRLAB1;
        break;
    
      /*---------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `---------------------------------------------------*/
      case YYERROR:
    
        
        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
        yystack.pop (yylen);
        yylen = 0;
        yystate = yystack.stateAt (0);
        label = YYERRLAB1;
        break;
    
      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
      case YYERRLAB1:
        yyerrstatus_ = 3;	/* Each real token shifted decrements this.  */
    
        for (;;)
          {
	    yyn = yypact_[yystate];
	    if (yyn != yypact_ninf_)
	      {
	        yyn += yyterror_;
	        if (0 <= yyn && yyn <= yylast_ && yycheck_[yyn] == yyterror_)
	          {
	            yyn = yytable_[yyn];
	            if (0 < yyn)
		      break;
	          }
	      }
    
	    /* Pop the current state because it cannot handle the error token.  */
	    if (yystack.height == 1)
	      return false;
    
	    
	    yystack.pop ();
	    yystate = yystack.stateAt (0);
	    if (yydebug > 0)
	      yystack.print (yyDebugStream);
          }
    
	

        /* Shift the error token.  */
        yy_symbol_print ("Shifting", yystos_[yyn],
			 yylval);
    
        yystate = yyn;
	yystack.push (yyn, yylval);
        label = YYNEWSTATE;
        break;
    
        /* Accept.  */
      case YYACCEPT:
        return true;
    
        /* Abort.  */
      case YYABORT:
        return false;
      }
  }

  // Generate an error message.
  private String yysyntax_error (int yystate, int tok)
  {
    if (errorVerbose)
      {
        int yyn = yypact_[yystate];
        if (yypact_ninf_ < yyn && yyn <= yylast_)
          {
	    StringBuffer res;

	    /* Start YYX at -YYN if negative to avoid negative indexes in
	       YYCHECK.  */
	    int yyxbegin = yyn < 0 ? -yyn : 0;

	    /* Stay within bounds of both yycheck and yytname.  */
	    int yychecklim = yylast_ - yyn + 1;
	    int yyxend = yychecklim < yyntokens_ ? yychecklim : yyntokens_;
	    int count = 0;
	    for (int x = yyxbegin; x < yyxend; ++x)
	      if (yycheck_[x + yyn] == x && x != yyterror_)
	        ++count;

	    // FIXME: This method of building the message is not compatible
	    // with internationalization.
	    res = new StringBuffer ("syntax error, unexpected ");
	    res.append (yytnamerr_ (yytname_[tok]));
	    if (count < 5)
	      {
	        count = 0;
	        for (int x = yyxbegin; x < yyxend; ++x)
	          if (yycheck_[x + yyn] == x && x != yyterror_)
		    {
		      res.append (count++ == 0 ? ", expecting " : " or ");
		      res.append (yytnamerr_ (yytname_[x]));
		    }
	      }
	    return res.toString ();
          }
      }

    return "syntax error";
  }


  /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
     STATE-NUM.  */
  private static final short yypact_ninf_ = -185;
  private static final short yypact_[] =
  {
        -2,    -8,    22,   216,  -185,  -185,  -185,  -185,  -185,    10,
    -185,   216,  -185,  -185,    10,  -185,  -185,    17,    60,  -185,
      -7,  -185,    61,    42,    81,   373,    10,  -185,   297,    89,
      85,   251,   251,    10,   -21,  -185,  -185,   380,  -185,    10,
    -185,    83,   297,  -185,  -185,  -185,   297,  -185,  -185,  -185,
    -185,  -185,     3,  -185,    31,  -185,   312,  -185,    65,  -185,
    -185,  -185,    86,  -185,  -185,  -185,  -185,    88,   251,    34,
     178,  -185,   297,   297,    87,  -185,    90,  -185,  -185,  -185,
    -185,  -185,  -185,  -185,  -185,  -185,  -185,    94,     3,   339,
    -185,   110,  -185,    93,   236,   251,  -185,  -185,    77,  -185,
      96,  -185,  -185,  -185,  -185,   312,   312,   312,   312,   312,
     312,   312,   312,   312,   312,  -185,    10,   297,   275,  -185,
    -185,  -185,  -185,   224,  -185,   126,   127,   130,   133,   119,
    -185,  -185,   312,  -185,  -185,   297,   297,   297,  -185,  -185,
     297,   297,    10,   134,  -185,  -185,  -185,  -185,   297,   297,
     297,   297,   124,     9,  -185,     9,  -185,   124,     9,  -185,
       9,     9,  -185,   135,  -185,  -185,    33,  -185,   152,  -185,
     251,  -185,  -185,  -185,  -185,   297,     8,  -185,  -185,  -185,
    -185,  -185,  -185,  -185,  -185,  -185,   -15,   -15,  -185,  -185,
     297,  -185,  -185,  -185,   251,   271,  -185,  -185,  -185,  -185,
    -185,   151,   143,   251,  -185,     1,  -185,  -185,    89,  -185,
    -185,   125,   156,   251,  -185,    89,  -185,  -185,  -185,  -185,
     129,  -185,   251,  -185,   131,  -185,   251,  -185,  -185,  -185,
     251,  -185
  };

  /* YYDEFACT[S] -- default rule to reduce with in state S when YYTABLE
     doesn't specify something else to do.  Zero means the default is an
     error.  */
  private static final byte yydefact_[] =
  {
         0,     0,     0,     0,     1,    14,    13,    16,    15,     0,
     112,     2,     4,     5,     0,     6,     7,     0,     0,     3,
       0,    18,    20,    22,     0,     0,     0,    17,     0,     0,
       0,     0,     0,     0,     0,    30,     9,     0,    11,     0,
      19,    22,     0,   113,   115,    94,     0,   116,    95,   117,
      93,   114,    21,    78,    79,    85,     0,    92,    96,    97,
     102,   103,    98,   108,   109,   110,   111,     0,     0,     0,
       0,   118,   118,     0,     0,   118,     0,    25,    53,    38,
      39,   119,    37,    40,    41,    42,    43,     0,    72,    96,
      28,    31,    33,    34,     0,     0,     8,    10,     0,    77,
       0,   118,   118,   118,   118,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,    91,     0,     0,     0,    23,
      26,    24,    47,     0,    49,   118,     0,     0,     0,     0,
     118,    51,     0,    36,   118,     0,     0,     0,    70,    71,
       0,     0,     0,     0,    29,    27,    12,   101,     0,     0,
       0,     0,    86,    82,    88,    84,    89,    87,    81,    90,
      80,    83,   100,     0,   105,   107,     0,    45,   118,    46,
       0,    64,    63,    62,   118,     0,     0,    50,    65,    69,
      66,    67,    68,    32,    35,    74,    73,    75,    76,    99,
       0,   104,    44,    48,     0,     0,   119,   106,    55,   119,
     118,     0,    36,     0,   118,     0,   118,    61,     0,   118,
      57,     0,     0,     0,   119,     0,   118,    56,    52,    54,
       0,   119,     0,   118,     0,   119,     0,   118,    60,    58,
       0,    59
  };

  /* YYPGOTO[NTERM-NUM].  */
  private static final short yypgoto_[] =
  {
      -185,  -185,  -185,   162,  -185,   106,   -26,    43,  -185,   140,
     163,  -185,  -185,  -185,   160,   100,  -185,    54,   -31,  -185,
    -185,    74,  -185,  -184,   -13,  -185,  -185,  -185,  -185,  -185,
    -185,   -41,    -4,  -185,   256,   145,  -185,  -185,     2,  -185,
    -185,  -185,  -185,    14,   -27,  -185,  -185,  -185,   -68,   -94
  };

  /* YYDEFGOTO[NTERM-NUM].  */
  private static final short
  yydefgoto_[] =
  {
        -1,     2,    11,    12,    13,    37,    38,    39,    15,    20,
      21,    22,    31,    16,    34,    35,    91,    92,   124,    78,
      79,   125,    80,    81,    82,    83,   205,   212,    84,    85,
      86,    87,    88,    53,    54,    55,    56,    57,    89,    59,
      60,   166,    61,    62,    63,    64,    65,    66,   170,   133
  };

  /* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
     positive, shift that token.  If negative, reduce the rule which
     number is the opposite.  If zero, do what YYDEFACT says.  */
  private static final short yytable_ninf_ = -1;
  private static final short
  yytable_[] =
  {
        77,    90,    67,   126,   128,   100,    94,   131,   101,    26,
     199,    97,   209,   210,   211,     1,    95,    17,   105,   105,
      27,     3,     4,    18,    52,    17,   101,   102,    23,   218,
      58,   127,   104,   148,   149,   150,   151,   120,    99,    10,
      41,   105,   107,   107,    58,   196,    14,    93,   103,   190,
     104,   109,   109,    41,    14,    24,   110,   110,    58,   112,
     112,    94,   175,   106,   145,   107,   177,    33,    25,   129,
     191,   121,   108,    33,   109,    58,   163,   165,    29,   110,
      30,   111,   112,   113,   114,     5,     6,     7,     8,     5,
       6,     7,     8,    26,   178,   179,   180,    97,   116,   181,
     182,   117,   201,    28,   146,   202,   194,    58,    58,    58,
      58,    58,    58,    58,    58,    58,    58,    43,    32,    29,
     220,   134,    68,   119,   118,   130,   142,   224,   132,   143,
     162,   228,   203,   147,    58,   169,   208,    33,   213,   193,
     174,   215,   101,   102,   185,   186,   187,   188,   222,   197,
      58,    58,    58,    58,   171,   226,    93,   172,   107,   230,
     173,   192,   204,   198,   103,   206,   104,   109,   217,   184,
     189,   195,   207,    19,   216,   112,   123,    58,   223,    98,
     227,   214,     5,     6,     7,     8,    70,   122,   221,    40,
      69,   225,    71,    72,   144,   229,   183,   168,    73,   231,
     219,   115,     0,    42,    74,    75,    43,    10,    44,    76,
       0,     0,    45,     0,     0,     0,    46,    47,    48,     0,
       5,     6,     7,     8,    49,     0,    50,     0,     5,     6,
       7,     8,    70,   167,     9,     0,     0,    51,    71,    72,
       5,     6,     7,     8,    73,    10,     0,     0,     0,    42,
      74,    75,    43,    10,    44,    76,     0,     0,    45,    70,
       0,     0,    46,    47,    48,    71,    72,     0,     0,     0,
      49,    73,    50,     0,     0,     0,    42,    74,    75,    43,
      10,    44,    76,    51,     0,    45,     0,     0,     0,    46,
      47,    48,     0,     0,   101,   102,     0,    49,     0,    50,
      42,     0,     0,    43,    10,    44,     0,     0,   200,    45,
      51,     0,   164,    46,    47,    48,   103,     0,   104,     0,
       0,    49,    42,    50,     0,    43,    10,    44,     0,     0,
       0,    45,     0,     0,    51,    46,    47,    48,     0,     0,
      43,    10,    44,    49,     0,    50,    45,     0,     0,     0,
      46,    47,    48,     0,     0,     0,    51,     0,    49,     0,
      50,   152,   153,   154,   155,   156,   157,   158,   159,   160,
     161,    51,   116,     0,     0,   117,     0,     5,     6,     7,
       8,   135,    36,   136,     5,     6,     7,     8,   176,    96,
       0,     0,     0,   137,   138,   139,   140,   141
  };

  /* YYCHECK.  */
  private static final short
  yycheck_[] =
  {
        31,    32,    29,    71,    72,    46,    27,    75,    23,    16,
     194,    37,    11,    12,    13,    17,    37,     3,    10,    10,
      27,    29,     0,     9,    28,    11,    23,    24,    14,   213,
      28,    72,    47,   101,   102,   103,   104,    68,    42,    29,
      26,    10,    34,    34,    42,    37,     3,    33,    45,    16,
      47,    43,    43,    39,    11,    38,    48,    48,    56,    51,
      51,    27,   130,    32,    95,    34,   134,    24,     8,    73,
      37,    37,    41,    30,    43,    73,   117,   118,    36,    48,
      38,    50,    51,    52,    53,     4,     5,     6,     7,     4,
       5,     6,     7,    16,   135,   136,   137,   123,    33,   140,
     141,    36,   196,    42,    27,   199,   174,   105,   106,   107,
     108,   109,   110,   111,   112,   113,   114,    28,    37,    36,
     214,    27,    37,    35,    38,    38,    16,   221,    38,    36,
     116,   225,   200,    37,   132,     9,   204,    94,   206,   170,
      21,   209,    23,    24,   148,   149,   150,   151,   216,   190,
     148,   149,   150,   151,    27,   223,   142,    27,    34,   227,
      27,     9,    11,   194,    45,    22,    47,    43,    12,    35,
      35,   175,   203,    11,    49,    51,    70,   175,    49,    39,
      49,   208,     4,     5,     6,     7,     8,     9,   215,    26,
      30,   222,    14,    15,    94,   226,   142,   123,    20,   230,
     213,    56,    -1,    25,    26,    27,    28,    29,    30,    31,
      -1,    -1,    34,    -1,    -1,    -1,    38,    39,    40,    -1,
       4,     5,     6,     7,    46,    -1,    48,    -1,     4,     5,
       6,     7,     8,     9,    18,    -1,    -1,    59,    14,    15,
       4,     5,     6,     7,    20,    29,    -1,    -1,    -1,    25,
      26,    27,    28,    29,    30,    31,    -1,    -1,    34,     8,
      -1,    -1,    38,    39,    40,    14,    15,    -1,    -1,    -1,
      46,    20,    48,    -1,    -1,    -1,    25,    26,    27,    28,
      29,    30,    31,    59,    -1,    34,    -1,    -1,    -1,    38,
      39,    40,    -1,    -1,    23,    24,    -1,    46,    -1,    48,
      25,    -1,    -1,    28,    29,    30,    -1,    -1,    37,    34,
      59,    -1,    37,    38,    39,    40,    45,    -1,    47,    -1,
      -1,    46,    25,    48,    -1,    28,    29,    30,    -1,    -1,
      -1,    34,    -1,    -1,    59,    38,    39,    40,    -1,    -1,
      28,    29,    30,    46,    -1,    48,    34,    -1,    -1,    -1,
      38,    39,    40,    -1,    -1,    -1,    59,    -1,    46,    -1,
      48,   105,   106,   107,   108,   109,   110,   111,   112,   113,
     114,    59,    33,    -1,    -1,    36,    -1,     4,     5,     6,
       7,    42,     9,    44,     4,     5,     6,     7,   132,     9,
      -1,    -1,    -1,    54,    55,    56,    57,    58
  };

  /* STOS_[STATE-NUM] -- The (internal number of the) accessing
     symbol of state STATE-NUM.  */
  private static final byte
  yystos_[] =
  {
         0,    17,    62,    29,     0,     4,     5,     6,     7,    18,
      29,    63,    64,    65,    68,    69,    74,   104,   104,    64,
      70,    71,    72,   104,    38,     8,    16,    27,    42,    36,
      38,    73,    37,    68,    75,    76,     9,    66,    67,    68,
      71,   104,    25,    28,    30,    34,    38,    39,    40,    46,
      48,    59,    93,    94,    95,    96,    97,    98,    99,   100,
     101,   103,   104,   105,   106,   107,   108,   105,    37,    75,
       8,    14,    15,    20,    26,    27,    31,    79,    80,    81,
      83,    84,    85,    86,    89,    90,    91,    92,    93,    99,
      79,    77,    78,   104,    27,    37,     9,    67,    70,    93,
      92,    23,    24,    45,    47,    10,    32,    34,    41,    43,
      48,    50,    51,    52,    53,    96,    33,    36,    38,    35,
      79,    37,     9,    66,    79,    82,   109,    92,   109,    93,
      38,   109,    38,   110,    27,    42,    44,    54,    55,    56,
      57,    58,    16,    36,    76,    79,    27,    37,   109,   109,
     109,   109,    95,    95,    95,    95,    95,    95,    95,    95,
      95,    95,   104,    92,    37,    92,   102,     9,    82,     9,
     109,    27,    27,    27,    21,   109,    95,   109,    92,    92,
      92,    92,    92,    78,    35,    93,    93,    93,    93,    35,
      16,    37,     9,    79,   109,    93,    37,    92,    79,    84,
      37,   110,   110,   109,    11,    87,    22,    79,   109,    11,
      12,    13,    88,   109,   105,   109,    49,    12,    84,    85,
     110,   105,   109,    49,   110,    79,   109,    49,   110,    79,
     109,    79
  };

  /* TOKEN_NUMBER_[YYLEX-NUM] -- Internal symbol number corresponding
     to YYLEX-NUM.  */
  private static final short
  yytoken_number_[] =
  {
         0,   256,   257,   258,   259,   260,   261,   262,   263,   264,
     265,   266,   267,   268,   269,   270,   271,   272,   273,   274,
     275,   276,   277,   278,   279,   280,   281,   282,   283,   284,
     285,   286,   287,   288,   289,   290,   291,   292,   293,   294,
     295,   296,   297,   298,   299,   300,   301,   302,   303,   304,
     305,   306,   307,   308,   309,   310,   311,   312,   313,   314,
     315
  };

  /* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final byte
  yyr1_[] =
  {
         0,    61,    62,    63,    63,    64,    64,    64,    65,    65,
      66,    66,    67,    68,    68,    68,    68,    69,    70,    70,
      71,    71,    72,    72,    73,    74,    74,    74,    74,    75,
      75,    76,    77,    77,    78,    78,    79,    79,    80,    80,
      80,    80,    80,    80,    81,    81,    81,    81,    82,    82,
      83,    83,    84,    84,    85,    85,    86,    86,    87,    87,
      88,    89,    90,    90,    91,    92,    92,    92,    92,    92,
      92,    92,    92,    93,    93,    93,    93,    93,    93,    94,
      94,    94,    94,    94,    94,    95,    95,    95,    95,    95,
      95,    96,    96,    97,    97,    97,    98,    98,    99,    99,
      99,   100,   100,   100,   101,   101,   102,   102,   103,   103,
     103,   103,   104,   105,   106,   107,   108,   108,   109,   110
  };

  /* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
  private static final byte
  yyr2_[] =
  {
         0,     2,     3,     2,     1,     1,     1,     1,     5,     4,
       2,     1,     3,     1,     1,     1,     1,     3,     1,     3,
       1,     3,     1,     4,     3,     4,     5,     5,     4,     3,
       1,     2,     3,     1,     1,     3,     2,     1,     1,     1,
       1,     1,     1,     1,     4,     3,     3,     2,     3,     1,
       3,     2,     9,     1,     9,     5,     8,     7,     7,     8,
       5,     7,     3,     3,     3,     3,     3,     3,     3,     3,
       2,     2,     1,     4,     4,     4,     4,     2,     1,     1,
       3,     3,     3,     3,     3,     1,     3,     3,     3,     3,
       3,     2,     1,     1,     1,     1,     1,     1,     1,     4,
       3,     3,     1,     1,     4,     3,     3,     1,     1,     1,
       1,     1,     1,     1,     1,     1,     1,     1,     0,     0
  };

  /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
     First, the terminals, then, starting at \a yyntokens_, nonterminals.  */
  private static final String yytname_[] =
  {
    "$end", "error", "$undefined", "COMMENT", "FLOAT_KW", "INT_KW",
  "BOOLEAN_KW", "CHAR_KW", "AKULAD_BAZ_KW", "AKULAD_BASTE_KW", "ADD_KW",
  "SWITCH_KW", "END_KW", "DEFAULT_KW", "BREAK_KW", "RETURN_KW", "COMMA",
  "PROGRAM_KW", "STRUCT_KW", "CONSTANT_KW", "IF_KW", "THEN_KW", "ELSE_KW",
  "AND_KW", "OR_KW", "NOT_KW", "WHILE_KW", "NOGHTE_VIRGUL", "ADAD",
  "SHENASE", "HARFE_SABET", "KEY_KW", "MORE_THAN_KW", "NOGHTE_KW",
  "MULTIPLY_KW", "BRACKET_BASTE_KW", "BRACKET_BAZ_KW",
  "PARANTHESIS_BASTE_KW", "PARANTHESIS_BAZ_KW", "TRUE_KW", "QUESTION_KW",
  "EQUAL_EQUAL_KW", "EQUAL_KW", "DEVIDE_KW", "DEVIDE_EQUAL_KW",
  "OR_ELSE_KW", "FALSE_KW", "AND_THEN_KW", "MINUS_KW", "DONOGHTE_KW",
  "LESS_EQUAL_KW", "MOD_KW", "LESS_THAN_KW", "MORE_EQUAL_KW",
  "PLUS_EQUAL_KW", "PLUS_PLUS_KW", "MINUS_MINUS_KW", "MINUS_EQUAL_KW",
  "MULTIPLY_EQUAL_KW", "ADAD_ASHARI", "LOWER_THAN_ELSE_KW", "$accept",
  "barnameh", "tarifha", "tarif", "tarifeSakhtar", "tarifhayeMahalli",
  "tarifeMoteghayyerMahdud", "jens", "tarifeMoteghayyer",
  "tarifhayeMoteghayyerha", "tarifeMeghdareAvalie",
  "tarifeShenaseMoteghayer", "function_input", "tarifeTabe", "vorudiha",
  "jensVorudiha", "shenaseyeVorudiha", "shenaseyeVorudi", "jomle",
  "otherjomle", "jomleyeMorakkab", "jomleha", "jomleyeEbarat", "matched",
  "unmatched", "jomleyeEntekhab", "onsoreHalat", "onsorePishfarz",
  "jomleyeTekrar", "jomleyeBazgasht", "jomleyeShekast", "ebarat",
  "ebarateSade", "ebarateRabetei", "ebarateRiaziManteghi", "ebarateYegani",
  "amalgareYegani", "amel", "taghirpazir", "taghirnapazir", "sedaZadan",
  "bordareVorudiha", "meghdareSabet", "saved_identifier", "saved_integer",
  "saved_real", "saved_char", "saved_boolean", "M", "N", null
  };

  /* YYRHS -- A `-1'-separated list of the rules' RHS.  */
  private static final byte yyrhs_[] =
  {
        62,     0,    -1,    17,    29,    63,    -1,    63,    64,    -1,
      64,    -1,    65,    -1,    69,    -1,    74,    -1,    18,   104,
       8,    66,     9,    -1,    18,   104,     8,     9,    -1,    66,
      67,    -1,    67,    -1,    68,    70,    27,    -1,     5,    -1,
       4,    -1,     7,    -1,     6,    -1,    68,    70,    27,    -1,
      71,    -1,    70,    16,    71,    -1,    72,    -1,    72,    42,
      93,    -1,   104,    -1,   104,    36,   105,    35,    -1,    38,
      75,    37,    -1,    68,   104,    73,    79,    -1,    68,   104,
      38,    37,    79,    -1,   104,    38,    75,    37,    79,    -1,
     104,    38,    37,    79,    -1,    75,    27,    76,    -1,    76,
      -1,    68,    77,    -1,    77,    16,    78,    -1,    78,    -1,
     104,    -1,   104,    36,    35,    -1,    84,   110,    -1,    85,
      -1,    81,    -1,    83,    -1,    86,    -1,    89,    -1,    90,
      -1,    91,    -1,     8,    66,    82,     9,    -1,     8,    66,
       9,    -1,     8,    82,     9,    -1,     8,     9,    -1,    82,
     109,    79,    -1,    79,    -1,    92,    27,   109,    -1,    27,
     109,    -1,    20,    93,    21,   109,    84,   110,    22,   109,
      84,    -1,    80,    -1,    20,    93,    21,   109,    84,   110,
      22,   109,    85,    -1,    20,    93,    21,   109,    79,    -1,
      31,    38,    95,    37,   110,    87,    88,    12,    -1,    31,
      38,    95,    37,   110,    87,    12,    -1,    11,   109,   105,
     110,    49,   109,    79,    -1,    87,    11,   109,   105,   110,
      49,   109,    79,    -1,    13,    49,   109,    79,   110,    -1,
      26,    38,   109,    93,    37,   109,    79,    -1,    15,   109,
      27,    -1,    15,    92,    27,    -1,    14,   109,    27,    -1,
      99,    42,    92,    -1,    99,    54,    92,    -1,    99,    57,
      92,    -1,    99,    58,    92,    -1,    99,    44,    92,    -1,
      99,    55,    -1,    99,    56,    -1,    93,    -1,    93,    24,
     109,    93,    -1,    93,    23,   109,    93,    -1,    93,    45,
     109,    93,    -1,    93,    47,   109,    93,    -1,    25,    93,
      -1,    94,    -1,    95,    -1,    95,    52,    95,    -1,    95,
      50,    95,    -1,    95,    32,    95,    -1,    95,    53,    95,
      -1,    95,    41,    95,    -1,    96,    -1,    95,    10,    95,
      -1,    95,    48,    95,    -1,    95,    34,    95,    -1,    95,
      43,    95,    -1,    95,    51,    95,    -1,    97,    96,    -1,
      98,    -1,    48,    -1,    34,    -1,    40,    -1,    99,    -1,
     100,    -1,   104,    -1,    99,    36,    92,    35,    -1,    99,
      33,   104,    -1,    38,    92,    37,    -1,   101,    -1,   103,
      -1,   104,    38,   102,    37,    -1,   104,    38,    37,    -1,
     102,    16,    92,    -1,    92,    -1,   105,    -1,   106,    -1,
     107,    -1,   108,    -1,    29,    -1,    28,    -1,    59,    -1,
      30,    -1,    39,    -1,    46,    -1,    -1,    -1
  };

  /* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
     YYRHS.  */
  private static final short yyprhs_[] =
  {
         0,     0,     3,     7,    10,    12,    14,    16,    18,    24,
      29,    32,    34,    38,    40,    42,    44,    46,    50,    52,
      56,    58,    62,    64,    69,    73,    78,    84,    90,    95,
      99,   101,   104,   108,   110,   112,   116,   119,   121,   123,
     125,   127,   129,   131,   133,   138,   142,   146,   149,   153,
     155,   159,   162,   172,   174,   184,   190,   199,   207,   215,
     224,   230,   238,   242,   246,   250,   254,   258,   262,   266,
     270,   273,   276,   278,   283,   288,   293,   298,   301,   303,
     305,   309,   313,   317,   321,   325,   327,   331,   335,   339,
     343,   347,   350,   352,   354,   356,   358,   360,   362,   364,
     369,   373,   377,   379,   381,   386,   390,   394,   396,   398,
     400,   402,   404,   406,   408,   410,   412,   414,   416,   417
  };

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short yyrline_[] =
  {
         0,   213,   213,   219,   222,   227,   230,   233,   238,   243,
     249,   253,   258,   339,   347,   354,   361,   370,   447,   459,
     477,   483,   517,   524,   543,   550,   558,   566,   568,   571,
     573,   576,   579,   581,   584,   590,   593,   598,   606,   611,
     615,   619,   623,   627,   632,   638,   644,   651,   656,   663,
     671,   678,   684,   694,   701,   710,   720,   744,   777,   787,
     800,   807,   820,   824,   839,   844,   914,   949,   984,  1019,
    1054,  1056,  1058,  1069,  1080,  1091,  1113,  1135,  1145,  1156,
    1169,  1183,  1197,  1211,  1225,  1240,  1279,  1319,  1358,  1397,
    1437,  1485,  1487,  1498,  1500,  1502,  1505,  1516,  1526,  1537,
    1568,  1585,  1592,  1594,  1605,  1620,  1623,  1630,  1638,  1649,
    1660,  1671,  1683,  1695,  1712,  1728,  1743,  1758,  1777,  1785
  };

  // Report on the debug stream that the rule yyrule is going to be reduced.
  private void yy_reduce_print (int yyrule, YYStack yystack)
  {
    if (yydebug == 0)
      return;

    int yylno = yyrline_[yyrule];
    int yynrhs = yyr2_[yyrule];
    /* Print the symbols being reduced, and their result.  */
    yycdebug ("Reducing stack by rule " + (yyrule - 1)
	      + " (line " + yylno + "), ");

    /* The symbols being reduced.  */
    for (int yyi = 0; yyi < yynrhs; yyi++)
      yy_symbol_print ("   $" + (yyi + 1) + " =",
		       yyrhs_[yyprhs_[yyrule] + yyi],
		       ((yystack.valueAt (yynrhs-(yyi + 1)))));
  }

  /* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */
  private static final byte yytranslate_table_[] =
  {
         0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31,    32,    33,    34,
      35,    36,    37,    38,    39,    40,    41,    42,    43,    44,
      45,    46,    47,    48,    49,    50,    51,    52,    53,    54,
      55,    56,    57,    58,    59,    60
  };

  private static final byte yytranslate_ (int t)
  {
    if (t >= 0 && t <= yyuser_token_number_max_)
      return yytranslate_table_[t];
    else
      return yyundef_token_;
  }

  private static final int yylast_ = 397;
  private static final int yynnts_ = 50;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 4;
  private static final int yyterror_ = 1;
  private static final int yyerrcode_ = 256;
  private static final int yyntokens_ = 61;

  private static final int yyuser_token_number_max_ = 315;
  private static final int yyundef_token_ = 2;

/* User implementation code.  */
/* Unqualified %code blocks.  */

/* Line 875 of lalr1.java  */
/* Line 24 of "YYParser.y"  */


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
	int n;

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
                } catch (IOException EVal) {
                    System.err.println("IO error: " + EVal);
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
		} catch (FileNotFoundException EVal) {
			EVal.printStackTrace();
		}

		try {
			dos.writeBytes("#include <stdio.h>\n\nint main() {\n\n");
			dos.writeBytes(symbolTable.toString());
			dos.writeBytes("\n\t\n");
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
		} catch (IOException EVal) {
			EVal.printStackTrace();
		}

	}



/* Line 875 of lalr1.java  */
/* Line 3738 of "YYParser.java"  */

}


/* Line 879 of lalr1.java  */
/* Line 1793 of "YYParser.y"  */

class EVal {

	public static final int TYPE_CODE_UNKNOWN = -1;
	public static final int TYPE_CODE_INTEGER = 0;
	public static final int TYPE_CODE_REAL = 1;
	public static final int TYPE_CODE_CHAR = 2;
	public static final int TYPE_CODE_BOOLEAN = 3;
	public static final int TYPE_CODE_RANGE = 4;
	public static final int TYPE_CODE_STRUCT = 5;	

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
		
		if(al1 == null){
			result = al2;
		}
		
		if(al2 == null){
			result = al1;
		}
		else{
		result.addAll(al1);
		result.addAll(al2);
		
		}
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
	public ArrayList<String[]>functions;

	public SymbolTable() {
		names = new ArrayList<>();
		types = new ArrayList<>();
		arrays = new ArrayList<>();
		functions = new ArrayList<>();
	}

	public int lookUp(String name) {
		return names.indexOf(name);
	}

	public String addFunction(String name, int address) {
		
		for(String[] str: functions){
			if(str[0].equals(name)){
				return str[1];
			}
		}
		String str[] = new String[2];
		str[0] = name;
		str[1] = Integer.toString(address);
		functions.add(str);
		return "hey";
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


