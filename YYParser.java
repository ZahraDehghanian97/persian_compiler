
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
/* Line 1 of ".\\YYParser.y"  */

import java.io.*;
import java.util.ArrayList;


/**
 * A Bison parser, automatically generated from <tt>.\\YYParser.y</tt>.
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
/* Line 212 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 1.1 ");
		exportIntermediateCode();
	};
  break;
    

  case 3:
  if (yyn == 3)
    
/* Line 353 of lalr1.java  */
/* Line 218 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 2.1: ");
	};
  break;
    

  case 4:
  if (yyn == 4)
    
/* Line 353 of lalr1.java  */
/* Line 221 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 2.2");
	};
  break;
    

  case 5:
  if (yyn == 5)
    
/* Line 353 of lalr1.java  */
/* Line 226 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 3.1: ");
	};
  break;
    

  case 6:
  if (yyn == 6)
    
/* Line 353 of lalr1.java  */
/* Line 229 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 3.2: " );
	};
  break;
    

  case 7:
  if (yyn == 7)
    
/* Line 353 of lalr1.java  */
/* Line 232 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 3.3: " );
	};
  break;
    

  case 8:
  if (yyn == 8)
    
/* Line 353 of lalr1.java  */
/* Line 237 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 4.1 ");
	};
  break;
    

  case 9:
  if (yyn == 9)
    
/* Line 353 of lalr1.java  */
/* Line 241 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 4.2 ");
	};
  break;
    

  case 10:
  if (yyn == 10)
    
/* Line 353 of lalr1.java  */
/* Line 246 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 5 ");
	};
  break;
    

  case 11:
  if (yyn == 11)
    
/* Line 353 of lalr1.java  */
/* Line 250 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 5 ");
	};
  break;
    

  case 12:
  if (yyn == 12)
    
/* Line 353 of lalr1.java  */
/* Line 255 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 6");
	};
  break;
    

  case 13:
  if (yyn == 13)
    
/* Line 353 of lalr1.java  */
/* Line 260 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 7.1");
	};
  break;
    

  case 14:
  if (yyn == 14)
    
/* Line 353 of lalr1.java  */
/* Line 264 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 7.2");
	};
  break;
    

  case 15:
  if (yyn == 15)
    
/* Line 353 of lalr1.java  */
/* Line 269 of ".\\YYParser.y"  */
    {System.out.println("Rule 8.1");};
  break;
    

  case 16:
  if (yyn == 16)
    
/* Line 353 of lalr1.java  */
/* Line 270 of ".\\YYParser.y"  */
    {System.out.println("Rule 8.2");};
  break;
    

  case 17:
  if (yyn == 17)
    
/* Line 353 of lalr1.java  */
/* Line 271 of ".\\YYParser.y"  */
    {System.out.println("Rule 8.3");};
  break;
    

  case 18:
  if (yyn == 18)
    
/* Line 353 of lalr1.java  */
/* Line 272 of ".\\YYParser.y"  */
    {System.out.println("Rule 8.4");};
  break;
    

  case 19:
  if (yyn == 19)
    
/* Line 353 of lalr1.java  */
/* Line 275 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 9");
	};
  break;
    

  case 20:
  if (yyn == 20)
    
/* Line 353 of lalr1.java  */
/* Line 280 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 10.1 ");
	};
  break;
    

  case 21:
  if (yyn == 21)
    
/* Line 353 of lalr1.java  */
/* Line 283 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 10.2 ");
	};
  break;
    

  case 22:
  if (yyn == 22)
    
/* Line 353 of lalr1.java  */
/* Line 288 of ".\\YYParser.y"  */
    {System.out.println("Rule 11.1 ");};
  break;
    

  case 23:
  if (yyn == 23)
    
/* Line 353 of lalr1.java  */
/* Line 289 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 11.2 ");
	};
  break;
    

  case 24:
  if (yyn == 24)
    
/* Line 353 of lalr1.java  */
/* Line 294 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 12.1: " );
	};
  break;
    

  case 25:
  if (yyn == 25)
    
/* Line 353 of lalr1.java  */
/* Line 297 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 12.2: ");
	};
  break;
    

  case 26:
  if (yyn == 26)
    
/* Line 353 of lalr1.java  */
/* Line 302 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 13.1");
	};
  break;
    

  case 27:
  if (yyn == 27)
    
/* Line 353 of lalr1.java  */
/* Line 306 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 13.2");
	};
  break;
    

  case 28:
  if (yyn == 28)
    
/* Line 353 of lalr1.java  */
/* Line 310 of ".\\YYParser.y"  */
    {System.out.println("Rule 13.3");};
  break;
    

  case 29:
  if (yyn == 29)
    
/* Line 353 of lalr1.java  */
/* Line 312 of ".\\YYParser.y"  */
    {System.out.println("Rule 13.4");};
  break;
    

  case 30:
  if (yyn == 30)
    
/* Line 353 of lalr1.java  */
/* Line 315 of ".\\YYParser.y"  */
    {System.out.println("Rule 15.1");};
  break;
    

  case 31:
  if (yyn == 31)
    
/* Line 353 of lalr1.java  */
/* Line 317 of ".\\YYParser.y"  */
    {System.out.println("Rule 15.2");};
  break;
    

  case 32:
  if (yyn == 32)
    
/* Line 353 of lalr1.java  */
/* Line 320 of ".\\YYParser.y"  */
    {System.out.println("Rule 16");};
  break;
    

  case 33:
  if (yyn == 33)
    
/* Line 353 of lalr1.java  */
/* Line 323 of ".\\YYParser.y"  */
    {System.out.println("Rule 17.1");};
  break;
    

  case 34:
  if (yyn == 34)
    
/* Line 353 of lalr1.java  */
/* Line 325 of ".\\YYParser.y"  */
    {System.out.println("Rule 17.2");};
  break;
    

  case 35:
  if (yyn == 35)
    
/* Line 353 of lalr1.java  */
/* Line 328 of ".\\YYParser.y"  */
    {System.out.println("Rule 18.1");};
  break;
    

  case 36:
  if (yyn == 36)
    
/* Line 353 of lalr1.java  */
/* Line 329 of ".\\YYParser.y"  */
    {System.out.println("Rule 18.2");};
  break;
    

  case 37:
  if (yyn == 37)
    
/* Line 353 of lalr1.java  */
/* Line 332 of ".\\YYParser.y"  */
    {System.out.println("Rule 19.1");};
  break;
    

  case 38:
  if (yyn == 38)
    
/* Line 353 of lalr1.java  */
/* Line 334 of ".\\YYParser.y"  */
    {System.out.println("Rule 19.2");};
  break;
    

  case 39:
  if (yyn == 39)
    
/* Line 353 of lalr1.java  */
/* Line 336 of ".\\YYParser.y"  */
    {System.out.println("Rule 19.3");};
  break;
    

  case 40:
  if (yyn == 40)
    
/* Line 353 of lalr1.java  */
/* Line 338 of ".\\YYParser.y"  */
    {System.out.println("Rule 19.4");};
  break;
    

  case 41:
  if (yyn == 41)
    
/* Line 353 of lalr1.java  */
/* Line 340 of ".\\YYParser.y"  */
    {System.out.println("Rule 19.5");};
  break;
    

  case 42:
  if (yyn == 42)
    
/* Line 353 of lalr1.java  */
/* Line 342 of ".\\YYParser.y"  */
    {System.out.println("Rule 19.6");};
  break;
    

  case 43:
  if (yyn == 43)
    
/* Line 353 of lalr1.java  */
/* Line 345 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 20.1");
	};
  break;
    

  case 44:
  if (yyn == 44)
    
/* Line 353 of lalr1.java  */
/* Line 349 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 20.2");
	};
  break;
    

  case 45:
  if (yyn == 45)
    
/* Line 353 of lalr1.java  */
/* Line 353 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 20.3");
	};
  break;
    

  case 46:
  if (yyn == 46)
    
/* Line 353 of lalr1.java  */
/* Line 357 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 20.4");
	};
  break;
    

  case 47:
  if (yyn == 47)
    
/* Line 353 of lalr1.java  */
/* Line 362 of ".\\YYParser.y"  */
    {System.out.println("Rule 21.1");};
  break;
    

  case 48:
  if (yyn == 48)
    
/* Line 353 of lalr1.java  */
/* Line 364 of ".\\YYParser.y"  */
    {System.out.println("Rule 21.2");};
  break;
    

  case 49:
  if (yyn == 49)
    
/* Line 353 of lalr1.java  */
/* Line 368 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 22.1");
	};
  break;
    

  case 50:
  if (yyn == 50)
    
/* Line 353 of lalr1.java  */
/* Line 372 of ".\\YYParser.y"  */
    {System.out.println("Rule 22.2");};
  break;
    

  case 51:
  if (yyn == 51)
    
/* Line 353 of lalr1.java  */
/* Line 375 of ".\\YYParser.y"  */
    {System.out.println("Rule 23.1");};
  break;
    

  case 52:
  if (yyn == 52)
    
/* Line 353 of lalr1.java  */
/* Line 377 of ".\\YYParser.y"  */
    {System.out.println("Rule 23.2");};
  break;
    

  case 53:
  if (yyn == 53)
    
/* Line 353 of lalr1.java  */
/* Line 379 of ".\\YYParser.y"  */
    {System.out.println("Rule 23.3");};
  break;
    

  case 54:
  if (yyn == 54)
    
/* Line 353 of lalr1.java  */
/* Line 381 of ".\\YYParser.y"  */
    {System.out.println("Rule 23.4");};
  break;
    

  case 55:
  if (yyn == 55)
    
/* Line 353 of lalr1.java  */
/* Line 385 of ".\\YYParser.y"  */
    { System.out.println("Rule 24.1"); };
  break;
    

  case 56:
  if (yyn == 56)
    
/* Line 353 of lalr1.java  */
/* Line 387 of ".\\YYParser.y"  */
    {System.out.println("Rule 24.2");};
  break;
    

  case 57:
  if (yyn == 57)
    
/* Line 353 of lalr1.java  */
/* Line 390 of ".\\YYParser.y"  */
    {System.out.println("Rule 25");};
  break;
    

  case 58:
  if (yyn == 58)
    
/* Line 353 of lalr1.java  */
/* Line 393 of ".\\YYParser.y"  */
    {System.out.println("Rule 26");};
  break;
    

  case 59:
  if (yyn == 59)
    
/* Line 353 of lalr1.java  */
/* Line 396 of ".\\YYParser.y"  */
    {System.out.println("Rule 27.1");};
  break;
    

  case 60:
  if (yyn == 60)
    
/* Line 353 of lalr1.java  */
/* Line 398 of ".\\YYParser.y"  */
    {System.out.println("Rule 27.2");};
  break;
    

  case 61:
  if (yyn == 61)
    
/* Line 353 of lalr1.java  */
/* Line 401 of ".\\YYParser.y"  */
    {System.out.println("Rule 28");};
  break;
    

  case 62:
  if (yyn == 62)
    
/* Line 353 of lalr1.java  */
/* Line 404 of ".\\YYParser.y"  */
    {
	System.out.println("Rule 29.1");
	emit(":=", ((EVal)(yystack.valueAt (3-(3)))).place, null, ((EVal)(yystack.valueAt (3-(1)))).place);
	};
  break;
    

  case 63:
  if (yyn == 63)
    
/* Line 353 of lalr1.java  */
/* Line 409 of ".\\YYParser.y"  */
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
    

  case 64:
  if (yyn == 64)
    
/* Line 353 of lalr1.java  */
/* Line 444 of ".\\YYParser.y"  */
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
    

  case 65:
  if (yyn == 65)
    
/* Line 353 of lalr1.java  */
/* Line 479 of ".\\YYParser.y"  */
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

		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 66:
  if (yyn == 66)
    
/* Line 353 of lalr1.java  */
/* Line 514 of ".\\YYParser.y"  */
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

		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 67:
  if (yyn == 67)
    
/* Line 353 of lalr1.java  */
/* Line 549 of ".\\YYParser.y"  */
    {System.out.println("Rule 29.6");};
  break;
    

  case 68:
  if (yyn == 68)
    
/* Line 353 of lalr1.java  */
/* Line 551 of ".\\YYParser.y"  */
    {System.out.println("Rule 29.7");};
  break;
    

  case 69:
  if (yyn == 69)
    
/* Line 353 of lalr1.java  */
/* Line 553 of ".\\YYParser.y"  */
    {System.out.println(" Rule 29.8 ebarateSade to ebarat");
	yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;};
  break;
    

  case 70:
  if (yyn == 70)
    
/* Line 353 of lalr1.java  */
/* Line 561 of ".\\YYParser.y"  */
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
    

  case 71:
  if (yyn == 71)
    
/* Line 353 of lalr1.java  */
/* Line 572 of ".\\YYParser.y"  */
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
    

  case 72:
  if (yyn == 72)
    
/* Line 353 of lalr1.java  */
/* Line 583 of ".\\YYParser.y"  */
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
		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2));
		emit("goto", null, null, String.valueOf(nextQuad() + 1));
	};
  break;
    

  case 73:
  if (yyn == 73)
    
/* Line 353 of lalr1.java  */
/* Line 605 of ".\\YYParser.y"  */
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
		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2));// result will be backpatched
		emit("goto", null, null, String.valueOf(nextQuad() + 1));// result will be backpatched
	};
  break;
    

  case 74:
  if (yyn == 74)
    
/* Line 353 of lalr1.java  */
/* Line 627 of ".\\YYParser.y"  */
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
    

  case 75:
  if (yyn == 75)
    
/* Line 353 of lalr1.java  */
/* Line 637 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 30.6 ebarateRabetei to ebarateSade");
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
	};
  break;
    

  case 76:
  if (yyn == 76)
    
/* Line 353 of lalr1.java  */
/* Line 647 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 31.1 ebarateRiaziManteghi to ebarateRabetei");
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
	};
  break;
    

  case 77:
  if (yyn == 77)
    
/* Line 353 of lalr1.java  */
/* Line 656 of ".\\YYParser.y"  */
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
		emit("goto", null, null, "-" // result will be backpatched.
	};
  break;
    

  case 78:
  if (yyn == 78)
    
/* Line 353 of lalr1.java  */
/* Line 670 of ".\\YYParser.y"  */
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
    

  case 79:
  if (yyn == 79)
    
/* Line 353 of lalr1.java  */
/* Line 684 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 31.4: " +
			"bool_expressions: expressions GT_KW expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);

		emit(">", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		emit("check", ((EVal)yyval).place, null, "-")); // result will be backpatched.
		emit("goto", null, null, "-"); // result will be backpatched.
	};
  break;
    

  case 80:
  if (yyn == 80)
    
/* Line 353 of lalr1.java  */
/* Line 698 of ".\\YYParser.y"  */
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
    

  case 81:
  if (yyn == 81)
    
/* Line 353 of lalr1.java  */
/* Line 712 of ".\\YYParser.y"  */
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
		emit("goto", null, null, "-")); // result will be backpatched.
	};
  break;
    

  case 82:
  if (yyn == 82)
    
/* Line 353 of lalr1.java  */
/* Line 727 of ".\\YYParser.y"  */
    {
	System.out.println("Rule 33.1 ebarateYegani to ebarateRiaziManteghi");
	yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
	};
  break;
    

  case 83:
  if (yyn == 83)
    
/* Line 353 of lalr1.java  */
/* Line 736 of ".\\YYParser.y"  */
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

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 84:
  if (yyn == 84)
    
/* Line 353 of lalr1.java  */
/* Line 776 of ".\\YYParser.y"  */
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
    

  case 85:
  if (yyn == 85)
    
/* Line 353 of lalr1.java  */
/* Line 815 of ".\\YYParser.y"  */
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

		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 86:
  if (yyn == 86)
    
/* Line 353 of lalr1.java  */
/* Line 854 of ".\\YYParser.y"  */
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

		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 87:
  if (yyn == 87)
    
/* Line 353 of lalr1.java  */
/* Line 894 of ".\\YYParser.y"  */
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

		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 88:
  if (yyn == 88)
    
/* Line 353 of lalr1.java  */
/* Line 942 of ".\\YYParser.y"  */
    {System.out.println("Rule 35.1");};
  break;
    

  case 89:
  if (yyn == 89)
    
/* Line 353 of lalr1.java  */
/* Line 944 of ".\\YYParser.y"  */
    {System.out.println("Rule 35.2 amel to ebarateYegani");
	yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;};
  break;
    

  case 90:
  if (yyn == 90)
    
/* Line 353 of lalr1.java  */
/* Line 952 of ".\\YYParser.y"  */
    {System.out.println("Rule 36.1");};
  break;
    

  case 91:
  if (yyn == 91)
    
/* Line 353 of lalr1.java  */
/* Line 954 of ".\\YYParser.y"  */
    {System.out.println("Rule 36.2");};
  break;
    

  case 92:
  if (yyn == 92)
    
/* Line 353 of lalr1.java  */
/* Line 956 of ".\\YYParser.y"  */
    {System.out.println("Rule 36.3");};
  break;
    

  case 93:
  if (yyn == 93)
    
/* Line 353 of lalr1.java  */
/* Line 959 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 37.1 taghirpazir to amel");
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;};
  break;
    

  case 94:
  if (yyn == 94)
    
/* Line 353 of lalr1.java  */
/* Line 968 of ".\\YYParser.y"  */
    {System.out.println("Rule 37.2 taghirnapazir to amel");
					yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;};
  break;
    

  case 95:
  if (yyn == 95)
    
/* Line 353 of lalr1.java  */
/* Line 976 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 38.1 saved_identifier to taghirpazir");
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;};
  break;
    

  case 96:
  if (yyn == 96)
    
/* Line 353 of lalr1.java  */
/* Line 985 of ".\\YYParser.y"  */
    {System.out.println("Rule 38.2");};
  break;
    

  case 97:
  if (yyn == 97)
    
/* Line 353 of lalr1.java  */
/* Line 987 of ".\\YYParser.y"  */
    {System.out.println("Rule 38.3");};
  break;
    

  case 98:
  if (yyn == 98)
    
/* Line 353 of lalr1.java  */
/* Line 990 of ".\\YYParser.y"  */
    {System.out.println("Rule 39.1");
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (3-(2)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(2)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (3-(2)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (3-(2)))).falseList;};
  break;
    

  case 99:
  if (yyn == 99)
    
/* Line 353 of lalr1.java  */
/* Line 997 of ".\\YYParser.y"  */
    {System.out.println("Rule 39.2");};
  break;
    

  case 100:
  if (yyn == 100)
    
/* Line 353 of lalr1.java  */
/* Line 999 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 39.3: meghdareSabet to taghirnapazir");
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
	};
  break;
    

  case 101:
  if (yyn == 101)
    
/* Line 353 of lalr1.java  */
/* Line 1009 of ".\\YYParser.y"  */
    {System.out.println("Rule 40.1");};
  break;
    

  case 102:
  if (yyn == 102)
    
/* Line 353 of lalr1.java  */
/* Line 1011 of ".\\YYParser.y"  */
    {System.out.println("Rule 40.2");};
  break;
    

  case 103:
  if (yyn == 103)
    
/* Line 353 of lalr1.java  */
/* Line 1014 of ".\\YYParser.y"  */
    {System.out.println("Rule 42.1");};
  break;
    

  case 104:
  if (yyn == 104)
    
/* Line 353 of lalr1.java  */
/* Line 1016 of ".\\YYParser.y"  */
    {System.out.println("Rule 42.2");};
  break;
    

  case 105:
  if (yyn == 105)
    
/* Line 353 of lalr1.java  */
/* Line 1019 of ".\\YYParser.y"  */
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
    

  case 106:
  if (yyn == 106)
    
/* Line 353 of lalr1.java  */
/* Line 1030 of ".\\YYParser.y"  */
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
    

  case 107:
  if (yyn == 107)
    
/* Line 353 of lalr1.java  */
/* Line 1041 of ".\\YYParser.y"  */
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
    

  case 108:
  if (yyn == 108)
    
/* Line 353 of lalr1.java  */
/* Line 1052 of ".\\YYParser.y"  */
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
    

  case 109:
  if (yyn == 109)
    
/* Line 353 of lalr1.java  */
/* Line 1064 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 30: " +
			"saved_identifier: IDENTIFIER");
		yyval = new EVal();
		((EVal)yyval).place = lexIdentifier;
};
  break;
    

  case 110:
  if (yyn == 110)
    
/* Line 353 of lalr1.java  */
/* Line 1072 of ".\\YYParser.y"  */
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
    

  case 111:
  if (yyn == 111)
    
/* Line 353 of lalr1.java  */
/* Line 1089 of ".\\YYParser.y"  */
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
    

  case 112:
  if (yyn == 112)
    
/* Line 353 of lalr1.java  */
/* Line 1105 of ".\\YYParser.y"  */
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
    

  case 113:
  if (yyn == 113)
    
/* Line 353 of lalr1.java  */
/* Line 1120 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 34.1: " +
			"saved_boolean: TRUE_KW");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);
		
		if(lexBoolean)
			emit(":=", "1", null, ((EVal)yyval).place);
		else
			emit(":=", "0", null, ((EVal)yyval).place);
		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 114:
  if (yyn == 114)
    
/* Line 353 of lalr1.java  */
/* Line 1137 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 34.2: " +
			"saved_boolean: FALSE_KW");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);
		
		if(lexBoolean)
			emit(":=", "1", null, ((EVal)yyval).place);
		else
			emit(":=", "0", null, ((EVal)yyval).place);
		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 115:
  if (yyn == 115)
    
/* Line 353 of lalr1.java  */
/* Line 1156 of ".\\YYParser.y"  */
    {
		System.out.println("Rule 35: " +
			"M: ");
		yyval = new EVal();
		((EVal)yyval).quad = nextQuad();
	};
  break;
    



/* Line 353 of lalr1.java  */
/* Line 2110 of "YYParser.java"  */
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
  private static final short yypact_ninf_ = -42;
  private static final short yypact_[] =
  {
         2,    -9,    24,    66,   -42,   -42,   -42,   -42,   -42,     0,
      16,    66,   -42,   -42,    30,   -42,   -42,    60,    -1,   -42,
      77,    80,   -42,    32,   139,   292,    53,   -15,   -42,    84,
      72,    54,   -42,   360,   -42,   155,   203,   -42,    54,   -42,
     165,    90,   314,   360,   360,    86,   -42,   -42,   -42,   -42,
      93,   -42,   360,   -42,   -42,   -42,   -42,   -42,   -42,   -42,
     -42,   -42,   -42,   -42,   -42,    91,    11,   -42,    -2,   -42,
     375,   -42,    97,   -42,   -42,   -42,   104,   -42,   -42,   -42,
     -42,   114,   147,   -42,   155,   292,   129,   292,   -12,   141,
     -42,    11,    33,   -42,   -42,   -42,    98,   -42,   211,   -42,
     238,   -42,   -42,   148,    87,   -42,   360,   360,   145,   -42,
     -42,   -42,   -42,   -42,   375,   375,   375,   375,   375,   375,
     375,   375,   375,   375,   -42,   154,   360,   360,   360,   360,
     -42,   -42,   360,   360,   338,   151,    53,   -42,   -42,   -42,
     -42,   292,   -42,   -42,   265,   -42,   -42,   -42,   292,   -14,
      20,   -42,   360,   360,   360,   360,   106,     4,   -42,     4,
     -42,   106,     4,   -42,     4,     4,   -42,   152,   -42,   -42,
     -42,   -42,   -42,   -42,   -42,    26,   -42,   -42,   -42,   -42,
     166,   292,   178,   -42,    14,    14,   -42,   -42,   360,   -42,
     292,   -42,   169,   109,   -42,   -42,   149,   172,   -42,   153,
     189,   292,   157,   292,   -42,   187,   292,   194,   -42,   196,
     -42,   -42
  };

  /* YYDEFACT[S] -- default rule to reduce with in state S when YYTABLE
     doesn't specify something else to do.  Zero means the default is an
     error.  */
  private static final byte yydefact_[] =
  {
         0,     0,     0,     0,     1,    16,    15,    18,    17,     0,
       0,     2,     4,     5,     0,     6,     7,     0,     0,     3,
      24,     0,    20,    22,     0,     0,     0,     0,    31,     0,
       0,     0,    19,     0,     9,     0,     0,    11,     0,    14,
       0,     0,     0,     0,     0,     0,    50,   110,   109,   112,
       0,    91,     0,   113,    92,   114,    90,   111,    29,    37,
      38,    39,    40,    41,    42,     0,    69,    75,    76,    82,
       0,    89,    93,    94,    99,   100,    95,   105,   106,   107,
     108,    35,    32,    34,     0,     0,     0,     0,     0,    24,
      21,    23,    93,    13,     8,    10,     0,    46,     0,    48,
       0,    61,    59,     0,     0,    74,     0,     0,     0,    49,
     115,   115,   115,   115,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,    88,     0,     0,     0,     0,     0,
      67,    68,     0,     0,     0,     0,     0,    30,    28,    25,
      27,     0,    12,    44,     0,    45,    47,    60,     0,     0,
       0,    98,     0,     0,     0,     0,    83,    79,    85,    81,
      86,    84,    78,    87,    77,    80,    97,     0,    62,    66,
      63,    64,    65,   102,   104,     0,    36,    33,    26,    43,
      51,     0,     0,    71,    70,    72,    73,    96,     0,   101,
       0,    58,     0,     0,   103,    52,     0,     0,    54,     0,
       0,     0,     0,     0,    53,     0,     0,     0,    55,     0,
      57,    56
  };

  /* YYPGOTO[NTERM-NUM].  */
  private static final short yypgoto_[] =
  {
       -42,   -42,   -42,   216,   -42,   188,   -34,   -42,    10,   -42,
     191,   201,   -42,   -42,   204,   159,   -42,    99,   -25,   -42,
     135,   -42,   -42,   -42,   -42,   -42,   -42,   -42,   -41,   -26,
     -42,   310,   174,   -42,   -42,   -17,   -42,   -42,   -42,   -42,
     123,   -42,   -42,   -42,   -42,    55
  };

  /* YYDEFGOTO[NTERM-NUM].  */
  private static final short
  yydefgoto_[] =
  {
        -1,     2,    11,    12,    13,    36,    37,    38,    39,    15,
      21,    22,    23,    16,    27,    28,    82,    83,    99,    59,
     100,    60,    61,   193,   200,    62,    63,    64,    65,    66,
      67,    68,    69,    70,    71,    72,    73,    74,   175,    75,
      76,    77,    78,    79,    80,   152
  };

  /* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
     positive, shift that token.  If negative, reduce the rule which
     number is the opposite.  If zero, do what YYDEFACT says.  */
  private static final short yytable_ninf_ = -1;
  private static final short
  yytable_[] =
  {
        58,   103,    95,     5,     6,     7,     8,    91,   114,   110,
     111,   108,    84,    14,   114,    84,    92,   104,   105,     1,
       3,    14,    85,   181,     4,   141,    92,    92,    26,    17,
     115,   112,   116,   113,   110,   111,    25,   110,   116,   117,
      26,   118,   188,   110,   111,    93,   119,   118,   120,   121,
     122,   123,   119,    92,    18,   121,   112,   182,   113,    20,
     138,   113,   140,   189,    95,   112,   125,   113,    24,   126,
       5,     6,     7,     8,    33,   146,     5,     6,     7,     8,
     149,   150,    81,    89,     9,   167,   168,   169,   170,    92,
      92,   171,   172,   174,    26,    10,    31,    92,    92,    92,
      92,    92,    92,    92,    92,    92,    92,    32,   148,    87,
     110,   111,    86,    29,    31,    30,   178,   101,   109,   146,
     197,   198,   199,   180,   106,   142,   183,   184,   185,   186,
     125,   107,   112,   126,   113,    92,    92,    92,    92,   127,
     116,   128,   134,     5,     6,     7,     8,   194,    34,   118,
     135,   129,   130,   131,   132,   133,   191,   121,    35,     5,
       6,     7,     8,   136,   139,   195,   153,   154,   155,     5,
       6,     7,     8,    40,    97,   147,   205,    29,   207,    41,
      42,   209,   151,    48,    35,    43,   176,   187,   190,   192,
      44,    45,    46,    47,    48,    49,    50,   196,   201,    51,
     202,   204,   203,    52,    53,    54,   206,     5,     6,     7,
       8,    55,    94,    56,   208,     5,     6,     7,     8,    40,
     143,   210,    35,   211,    57,    41,    42,    19,    98,    96,
      35,    43,    90,   144,    88,   177,    44,    45,    46,    47,
      48,    49,    50,   137,   124,    51,    40,   145,   166,    52,
      53,    54,    41,    42,     0,     0,     0,    55,    43,    56,
       0,     0,     0,    44,    45,    46,    47,    48,    49,    50,
      57,     0,    51,    40,   179,     0,    52,    53,    54,    41,
      42,     0,     0,     0,    55,    43,    56,     0,     0,     0,
      44,    45,    46,    47,    48,    49,    50,    57,     0,    51,
      40,     0,     0,    52,    53,    54,    41,    42,     0,     0,
       0,    55,    43,    56,     0,     0,     0,    44,    45,    46,
      47,    48,    49,    50,    57,     0,    51,     0,     0,     0,
      52,    53,    54,     0,     0,     0,     0,     0,    55,    44,
      56,   102,    47,    48,    49,     0,     0,     0,    51,     0,
       0,    57,    52,    53,    54,     0,     0,     0,     0,     0,
      55,     0,    56,    44,     0,     0,    47,    48,    49,     0,
       0,     0,    51,    57,     0,   173,    52,    53,    54,     0,
       0,     0,     0,     0,    55,    44,    56,     0,    47,    48,
      49,     0,     0,     0,    51,     0,     0,    57,    52,    53,
      54,     0,     0,    47,    48,    49,    55,     0,    56,    51,
       0,     0,     0,    52,    53,    54,     0,     0,     0,    57,
       0,    55,     0,    56,   156,   157,   158,   159,   160,   161,
     162,   163,   164,   165,    57
  };

  /* YYCHECK.  */
  private static final short
  yycheck_[] =
  {
        25,    42,    36,     4,     5,     6,     7,    33,    10,    23,
      24,    52,    27,     3,    10,    27,    33,    43,    44,    17,
      29,    11,    37,    37,     0,    37,    43,    44,    18,    29,
      32,    45,    34,    47,    23,    24,    37,    23,    34,    41,
      30,    43,    16,    23,    24,    35,    48,    43,    50,    51,
      52,    53,    48,    70,    38,    51,    45,    37,    47,    29,
      85,    47,    87,    37,    98,    45,    33,    47,     8,    36,
       4,     5,     6,     7,    42,   100,     4,     5,     6,     7,
     106,   107,    29,    29,    18,   126,   127,   128,   129,   106,
     107,   132,   133,   134,    84,    29,    16,   114,   115,   116,
     117,   118,   119,   120,   121,   122,   123,    27,    21,    37,
      23,    24,    28,    36,    16,    38,   141,    27,    27,   144,
      11,    12,    13,   148,    38,    27,   152,   153,   154,   155,
      33,    38,    45,    36,    47,   152,   153,   154,   155,    42,
      34,    44,    38,     4,     5,     6,     7,   188,     9,    43,
      36,    54,    55,    56,    57,    58,   181,    51,    19,     4,
       5,     6,     7,    16,    35,   190,   111,   112,   113,     4,
       5,     6,     7,     8,     9,    27,   201,    36,   203,    14,
      15,   206,    37,    29,    19,    20,    35,    35,    22,    11,
      25,    26,    27,    28,    29,    30,    31,    28,    49,    34,
      28,    12,    49,    38,    39,    40,    49,     4,     5,     6,
       7,    46,     9,    48,    27,     4,     5,     6,     7,     8,
       9,    27,    19,    27,    59,    14,    15,    11,    40,    38,
      19,    20,    31,    98,    30,   136,    25,    26,    27,    28,
      29,    30,    31,    84,    70,    34,     8,     9,   125,    38,
      39,    40,    14,    15,    -1,    -1,    -1,    46,    20,    48,
      -1,    -1,    -1,    25,    26,    27,    28,    29,    30,    31,
      59,    -1,    34,     8,     9,    -1,    38,    39,    40,    14,
      15,    -1,    -1,    -1,    46,    20,    48,    -1,    -1,    -1,
      25,    26,    27,    28,    29,    30,    31,    59,    -1,    34,
       8,    -1,    -1,    38,    39,    40,    14,    15,    -1,    -1,
      -1,    46,    20,    48,    -1,    -1,    -1,    25,    26,    27,
      28,    29,    30,    31,    59,    -1,    34,    -1,    -1,    -1,
      38,    39,    40,    -1,    -1,    -1,    -1,    -1,    46,    25,
      48,    27,    28,    29,    30,    -1,    -1,    -1,    34,    -1,
      -1,    59,    38,    39,    40,    -1,    -1,    -1,    -1,    -1,
      46,    -1,    48,    25,    -1,    -1,    28,    29,    30,    -1,
      -1,    -1,    34,    59,    -1,    37,    38,    39,    40,    -1,
      -1,    -1,    -1,    -1,    46,    25,    48,    -1,    28,    29,
      30,    -1,    -1,    -1,    34,    -1,    -1,    59,    38,    39,
      40,    -1,    -1,    28,    29,    30,    46,    -1,    48,    34,
      -1,    -1,    -1,    38,    39,    40,    -1,    -1,    -1,    59,
      -1,    46,    -1,    48,   114,   115,   116,   117,   118,   119,
     120,   121,   122,   123,    59
  };

  /* STOS_[STATE-NUM] -- The (internal number of the) accessing
     symbol of state STATE-NUM.  */
  private static final byte
  yystos_[] =
  {
         0,    17,    62,    29,     0,     4,     5,     6,     7,    18,
      29,    63,    64,    65,    69,    70,    74,    29,    38,    64,
      29,    71,    72,    73,     8,    37,    69,    75,    76,    36,
      38,    16,    27,    42,     9,    19,    66,    67,    68,    69,
       8,    14,    15,    20,    25,    26,    27,    28,    29,    30,
      31,    34,    38,    39,    40,    46,    48,    59,    79,    80,
      82,    83,    86,    87,    88,    89,    90,    91,    92,    93,
      94,    95,    96,    97,    98,   100,   101,   102,   103,   104,
     105,    29,    77,    78,    27,    37,    28,    37,    75,    29,
      72,    90,    96,    69,     9,    67,    71,     9,    66,    79,
      81,    27,    27,    89,    90,    90,    38,    38,    89,    27,
      23,    24,    45,    47,    10,    32,    34,    41,    43,    48,
      50,    51,    52,    53,    93,    33,    36,    42,    44,    54,
      55,    56,    57,    58,    38,    36,    16,    76,    79,    35,
      79,    37,    27,     9,    81,     9,    79,    27,    21,    90,
      90,    37,   106,   106,   106,   106,    92,    92,    92,    92,
      92,    92,    92,    92,    92,    92,   101,    89,    89,    89,
      89,    89,    89,    37,    89,    99,    35,    78,    79,     9,
      79,    37,    37,    90,    90,    90,    90,    35,    16,    37,
      22,    79,    11,    84,    89,    79,    28,    11,    12,    13,
      85,    49,    28,    49,    12,    79,    49,    79,    27,    79,
      27,    27
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
      66,    66,    67,    68,    68,    69,    69,    69,    69,    70,
      71,    71,    72,    72,    73,    73,    74,    74,    74,    74,
      75,    75,    76,    77,    77,    78,    78,    79,    79,    79,
      79,    79,    79,    80,    80,    80,    80,    81,    81,    82,
      82,    83,    83,    83,    83,    84,    84,    85,    86,    87,
      87,    88,    89,    89,    89,    89,    89,    89,    89,    89,
      90,    90,    90,    90,    90,    90,    91,    91,    91,    91,
      91,    91,    92,    92,    92,    92,    92,    92,    93,    93,
      94,    94,    94,    95,    95,    96,    96,    96,    97,    97,
      97,    98,    98,    99,    99,   100,   100,   100,   100,   101,
     102,   103,   104,   105,   105,   106
  };

  /* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
  private static final byte
  yyr2_[] =
  {
         0,     2,     3,     2,     1,     1,     1,     1,     5,     4,
       2,     1,     3,     2,     1,     1,     1,     1,     1,     3,
       1,     3,     1,     3,     1,     4,     6,     5,     5,     4,
       3,     1,     2,     3,     1,     1,     3,     1,     1,     1,
       1,     1,     1,     4,     3,     3,     2,     2,     1,     2,
       1,     4,     6,     7,     6,     5,     6,     4,     5,     2,
       3,     2,     3,     3,     3,     3,     3,     2,     2,     1,
       4,     4,     4,     4,     2,     1,     1,     3,     3,     3,
       3,     3,     1,     3,     3,     3,     3,     3,     2,     1,
       1,     1,     1,     1,     1,     1,     4,     3,     3,     1,
       1,     4,     3,     3,     1,     1,     1,     1,     1,     1,
       1,     1,     1,     1,     1,     0
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
  "tarifeMoteghayyerMahdud", "jenseMahdud", "jens", "tarifeMoteghayyer",
  "tarifhayeMoteghayyerha", "tarifeMeghdareAvalie",
  "tarifeShenaseMoteghayer", "tarifeTabe", "vorudiha", "jensVorudiha",
  "shenaseyeVorudiha", "shenaseyeVorudi", "jomle", "jomleyeMorakkab",
  "jomleha", "jomleyeEbarat", "jomleyeEntekhab", "onsoreHalat",
  "onsorePishfarz", "jomleyeTekrar", "jomleyeBazgasht", "jomleyeShekast",
  "ebarat", "ebarateSade", "ebarateRabetei", "ebarateRiaziManteghi",
  "ebarateYegani", "amalgareYegani", "amel", "taghirpazir",
  "taghirnapazir", "sedaZadan", "bordareVorudiha", "meghdareSabet",
  "saved_identifier", "saved_integer", "saved_real", "saved_char",
  "saved_boolean", "M", null
  };

  /* YYRHS -- A `-1'-separated list of the rules' RHS.  */
  private static final byte yyrhs_[] =
  {
        62,     0,    -1,    17,    29,    63,    -1,    63,    64,    -1,
      64,    -1,    65,    -1,    70,    -1,    74,    -1,    18,    29,
       8,    66,     9,    -1,    18,    29,     8,     9,    -1,    66,
      67,    -1,    67,    -1,    68,    71,    27,    -1,    19,    69,
      -1,    69,    -1,     5,    -1,     4,    -1,     7,    -1,     6,
      -1,    69,    71,    27,    -1,    72,    -1,    71,    16,    72,
      -1,    73,    -1,    73,    42,    90,    -1,    29,    -1,    29,
      36,    28,    35,    -1,    69,    29,    38,    75,    37,    79,
      -1,    69,    29,    38,    37,    79,    -1,    29,    38,    75,
      37,    79,    -1,    29,    38,    37,    79,    -1,    75,    27,
      76,    -1,    76,    -1,    69,    77,    -1,    77,    16,    78,
      -1,    78,    -1,    29,    -1,    29,    36,    35,    -1,    80,
      -1,    82,    -1,    83,    -1,    86,    -1,    87,    -1,    88,
      -1,     8,    66,    81,     9,    -1,     8,    66,     9,    -1,
       8,    81,     9,    -1,     8,     9,    -1,    81,    79,    -1,
      79,    -1,    89,    27,    -1,    27,    -1,    20,    90,    21,
      79,    -1,    20,    90,    21,    79,    22,    79,    -1,    31,
      38,    90,    37,    84,    85,    12,    -1,    31,    38,    90,
      37,    84,    12,    -1,    11,    28,    49,    79,    27,    -1,
      84,    11,    28,    49,    79,    27,    -1,    13,    49,    79,
      27,    -1,    26,    38,    90,    37,    79,    -1,    15,    27,
      -1,    15,    89,    27,    -1,    14,    27,    -1,    96,    42,
      89,    -1,    96,    54,    89,    -1,    96,    57,    89,    -1,
      96,    58,    89,    -1,    96,    44,    89,    -1,    96,    55,
      -1,    96,    56,    -1,    90,    -1,    90,    24,   106,    90,
      -1,    90,    23,   106,    90,    -1,    90,    45,   106,    90,
      -1,    90,    47,   106,    90,    -1,    25,    90,    -1,    91,
      -1,    92,    -1,    92,    52,    92,    -1,    92,    50,    92,
      -1,    92,    32,    92,    -1,    92,    53,    92,    -1,    92,
      41,    92,    -1,    93,    -1,    92,    10,    92,    -1,    92,
      48,    92,    -1,    92,    34,    92,    -1,    92,    43,    92,
      -1,    92,    51,    92,    -1,    94,    93,    -1,    95,    -1,
      48,    -1,    34,    -1,    40,    -1,    96,    -1,    97,    -1,
     101,    -1,    96,    36,    89,    35,    -1,    96,    33,   101,
      -1,    38,    89,    37,    -1,    98,    -1,   100,    -1,   101,
      38,    99,    37,    -1,   101,    38,    37,    -1,    99,    16,
      89,    -1,    89,    -1,   102,    -1,   103,    -1,   104,    -1,
     105,    -1,    29,    -1,    28,    -1,    59,    -1,    30,    -1,
      39,    -1,    46,    -1,    -1
  };

  /* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
     YYRHS.  */
  private static final short yyprhs_[] =
  {
         0,     0,     3,     7,    10,    12,    14,    16,    18,    24,
      29,    32,    34,    38,    41,    43,    45,    47,    49,    51,
      55,    57,    61,    63,    67,    69,    74,    81,    87,    93,
      98,   102,   104,   107,   111,   113,   115,   119,   121,   123,
     125,   127,   129,   131,   136,   140,   144,   147,   150,   152,
     155,   157,   162,   169,   177,   184,   190,   197,   202,   208,
     211,   215,   218,   222,   226,   230,   234,   238,   241,   244,
     246,   251,   256,   261,   266,   269,   271,   273,   277,   281,
     285,   289,   293,   295,   299,   303,   307,   311,   315,   318,
     320,   322,   324,   326,   328,   330,   332,   337,   341,   345,
     347,   349,   354,   358,   362,   364,   366,   368,   370,   372,
     374,   376,   378,   380,   382,   384
  };

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short yyrline_[] =
  {
         0,   212,   212,   218,   221,   226,   229,   232,   237,   241,
     246,   250,   255,   260,   264,   269,   270,   271,   272,   275,
     280,   283,   288,   289,   294,   297,   302,   306,   310,   312,
     315,   317,   320,   323,   325,   328,   329,   332,   334,   336,
     338,   340,   342,   345,   349,   353,   357,   362,   364,   368,
     372,   375,   377,   379,   381,   385,   387,   390,   393,   396,
     398,   401,   404,   409,   444,   479,   514,   549,   551,   553,
     561,   572,   583,   605,   627,   637,   647,   656,   670,   684,
     698,   712,   727,   736,   776,   815,   854,   894,   942,   944,
     952,   954,   956,   959,   968,   976,   985,   987,   990,   997,
     999,  1009,  1011,  1014,  1016,  1019,  1030,  1041,  1052,  1064,
    1072,  1089,  1105,  1120,  1137,  1156
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

  private static final int yylast_ = 434;
  private static final int yynnts_ = 46;
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
/* Line 24 of ".\\YYParser.y"  */


	public static final String TYPE_STRING_INTEGER = "int";
	public static final String TYPE_STRING_REAL = "double";
	public static final String TYPE_STRING_CHAR = "char";
	public static final String TYPE_STRING_BOOLEAN = "int";

	private static final String tempStr = "__SHLangTempVar";
	public static final String startStr = "__SHLangStartVar";
	public static final String sizeStr = "__SHLangSizeVar";
	public static final String indexStr = "__SHLangIndexVar";
	public static final String condStr = "__SHLangConditionVar";
	
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



/* Line 875 of lalr1.java  */
/* Line 3090 of "YYParser.java"  */

}


/* Line 879 of lalr1.java  */
/* Line 1172 of ".\\YYParser.y"  */

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

