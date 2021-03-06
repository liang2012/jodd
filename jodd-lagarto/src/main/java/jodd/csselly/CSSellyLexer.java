/* The following code was generated by JFlex 1.4.3-fixes on 5/16/13 9:36 PM */

package jodd.csselly;

import java.util.LinkedList;
import java.nio.CharBuffer;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3-fixes
 * on 5/16/13 9:36 PM from the specification file
 * <tt>csselly.flex</tt>
 */
final class CSSellyLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 4096;

  /** lexical states */
  public static final int COMBINATOR = 6;
  public static final int YYINITIAL = 0;
  public static final int ATTR = 4;
  public static final int SELECTOR = 2;
  public static final int PSEUDO_FN = 8;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4, 4
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\2\1\10\1\7\1\2\1\11\1\6\22\2\1\10\1\2\1\12"+
    "\1\16\1\24\2\2\1\13\1\21\1\30\1\14\1\27\1\2\1\1"+
    "\1\17\1\2\12\5\1\20\2\2\1\22\1\26\2\2\32\0\1\15"+
    "\1\3\1\25\1\24\1\0\1\2\6\4\24\0\1\2\1\24\1\2"+
    "\1\23\1\2\uff80\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\0\1\2\3\3\1\4\1\5\1\6"+
    "\1\7\1\10\3\6\1\11\3\7\1\12\1\13\1\1"+
    "\1\14\1\15\1\16\1\7\1\17\1\0\1\2\1\20"+
    "\1\0\1\21\2\0\1\22\3\0\1\11\2\0\1\11"+
    "\3\0\2\2\1\20\1\21\1\23\1\22\1\11\4\0"+
    "\2\11\1\2\2\20\2\21\2\22\2\11\2\0\1\11"+
    "\1\2\1\20\1\21\1\22\2\11\2\0\1\11\2\0"+
    "\2\11\1\2\1\20\1\21\1\22\1\11\2\0\1\11"+
    "\1\2\1\20\1\21\1\22\1\11\2\0\1\11\1\20"+
    "\1\21\1\22\1\11\2\0\1\11\4\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[112];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\31\0\62\0\113\0\144\0\175\0\226\0\257"+
    "\0\310\0\341\0\257\0\257\0\257\0\257\0\372\0\u0113"+
    "\0\u012c\0\u0145\0\u015e\0\u0177\0\u0190\0\257\0\257\0\u01a9"+
    "\0\u01c2\0\u01db\0\u01f4\0\u020d\0\257\0\310\0\u0226\0\372"+
    "\0\u023f\0\u0258\0\u0271\0\u028a\0\u02a3\0\u02bc\0\u02d5\0\u0177"+
    "\0\u02ee\0\u0307\0\u0320\0\u0339\0\u015e\0\u0190\0\u020d\0\u0352"+
    "\0\u036b\0\u0384\0\u039d\0\257\0\u03b6\0\u03cf\0\u03e8\0\u0401"+
    "\0\u041a\0\u0433\0\u044c\0\u0465\0\u047e\0\u0497\0\u04b0\0\u04c9"+
    "\0\u04e2\0\u04fb\0\u0514\0\u052d\0\u0546\0\u055f\0\u0578\0\u0591"+
    "\0\u05aa\0\u05c3\0\u05dc\0\u05f5\0\u060e\0\u0627\0\u0640\0\u0659"+
    "\0\u0672\0\u068b\0\u06a4\0\u06bd\0\u06d6\0\u06ef\0\u0708\0\u0721"+
    "\0\u073a\0\u0753\0\u076c\0\u0785\0\u079e\0\u07b7\0\u07d0\0\u07e9"+
    "\0\u0802\0\u081b\0\u0834\0\u084d\0\u0866\0\u087f\0\u0898\0\u08b1"+
    "\0\u08ca\0\u08e3\0\u08fc\0\u0915\0\u092e\0\u0947\0\u0960\0\u0979";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[112];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int ZZ_TRANS [] = {
    5, 6, 7, 8, 5, 7, 9, 9, 9, 9, 
    7, 7, 10, 7, 7, 7, 7, 7, 7, 7, 
    7, 7, 7, 7, 7, 11, 11, 11, 11, 11, 
    11, 11, 12, 11, 11, 11, 11, 11, 13, 14, 
    15, 16, 11, 11, 11, 11, 11, 11, 11, 11, 
    17, 18, 12, 19, 17, 12, 20, 20, 20, 20, 
    12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 
    12, 21, 12, 12, 12, 22, 22, 22, 22, 22, 
    22, 23, 23, 23, 23, 22, 22, 22, 22, 22, 
    22, 22, 22, 22, 24, 22, 22, 25, 26, 22, 
    27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 
    27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 
    27, 27, 27, 27, 28, 5, 5, -1, 29, 5, 
    5, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    5, -1, -1, 29, 5, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    5, 5, 5, 5, 30, 30, -1, -1, 5, -1, 
    5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 
    5, 5, 5, 5, 5, -1, -1, -1, -1, -1, 
    -1, 9, 9, 9, 9, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    31, 31, -1, 32, 31, 31, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, 33, 34, -1, 35, 33, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    36, 37, -1, 38, 36, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, 17, 17, -1, 39, 17, 
    17, 40, 40, 40, 40, -1, -1, 41, -1, -1, 
    -1, -1, -1, 42, 41, 41, -1, -1, -1, -1, 
    17, -1, -1, 39, 17, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, 17, 17, 17, 17, 43, 
    43, -1, -1, 17, -1, 17, 17, 17, 17, 17, 
    17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 
    17, 44, -1, 39, 17, -1, 45, 45, 45, 45, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, 23, 23, 23, 23, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, 24, -1, -1, 25, 26, -1, 
    -1, -1, -1, -1, -1, -1, 24, 24, 24, 24, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, 25, 25, 25, 25, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, 26, 26, 26, 26, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, 46, 46, 46, 46, 46, 
    46, 46, 46, 46, 46, 46, 46, 46, 46, 46, 
    46, 46, 46, 46, 46, 46, 46, 46, 46, 28, 
    5, 5, -1, 29, 47, 47, 48, 5, 5, 5, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, 31, 31, 31, 31, 49, 
    49, -1, -1, 31, -1, 31, 31, 31, 31, 31, 
    31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 
    33, 33, -1, 35, 33, 33, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, 33, -1, -1, 35, 33, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    33, 33, 33, 33, 50, 50, -1, -1, 33, -1, 
    33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 
    33, 33, 33, 33, 33, 36, 36, -1, 38, 36, 
    36, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, 51, -1, -1, -1, -1, -1, -1, -1, 
    36, -1, -1, 38, 36, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, 36, 36, 36, 36, 52, 
    52, -1, -1, 36, -1, 36, 36, 36, 36, 36, 
    36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 
    -1, -1, -1, -1, -1, -1, 40, 40, 40, 40, 
    -1, -1, 41, -1, -1, -1, -1, -1, 42, 41, 
    41, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, 42, -1, -1, -1, -1, -1, -1, 
    53, 54, -1, 55, 53, -1, 42, 42, 42, 42, 
    56, 57, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, 17, 17, -1, 39, 58, 
    58, 59, 17, 17, 17, -1, -1, 41, -1, -1, 
    -1, -1, -1, 42, 41, 41, -1, -1, -1, -1, 
    5, 5, -1, 29, 60, 60, 48, 5, 5, 5, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, 5, 5, -1, 29, 5, 
    5, -1, 5, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    31, 31, -1, 32, 61, 61, 62, 31, 31, 31, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, 33, 33, -1, 35, 63, 
    63, 64, 33, 33, 33, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    36, 36, -1, 38, 65, 65, 66, 36, 36, 36, 
    -1, -1, -1, -1, -1, -1, -1, 51, -1, -1, 
    -1, -1, -1, -1, -1, 53, 53, -1, 55, 53, 
    53, 67, 67, 67, 67, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    53, -1, -1, 55, 53, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, 53, 53, 53, 53, 68, 
    68, -1, -1, 53, -1, 53, 53, 53, 53, 53, 
    53, 53, 53, 53, 53, 53, 53, 53, 53, 53, 
    56, 56, 56, 69, 56, 56, -1, -1, 56, -1, 
    67, 56, 56, 56, 56, 56, 56, 56, 56, 56, 
    56, 56, 56, 56, 56, 57, 57, 57, 70, 57, 
    57, -1, -1, 57, -1, 57, 67, 57, 57, 57, 
    57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 
    17, 17, -1, 39, 71, 71, 59, 17, 17, 17, 
    -1, -1, 41, -1, -1, -1, -1, -1, 42, 41, 
    41, -1, -1, -1, -1, 17, 17, -1, 39, 17, 
    17, 40, 17, 40, 40, -1, -1, 41, -1, -1, 
    -1, -1, -1, 42, 41, 41, -1, -1, -1, -1, 
    5, 5, -1, 29, 72, 72, 48, 5, 5, 5, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, 31, 31, -1, 32, 73, 
    73, 62, 31, 31, 31, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    31, 31, -1, 32, 31, 31, -1, 31, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, 33, 33, -1, 35, 74, 
    74, 64, 33, 33, 33, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    33, 33, -1, 35, 33, 33, -1, 33, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, 36, 36, -1, 38, 75, 
    75, 66, 36, 36, 36, -1, -1, -1, -1, -1, 
    -1, -1, 51, -1, -1, -1, -1, -1, -1, -1, 
    36, 36, -1, 38, 36, 36, -1, 36, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, 51, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, 67, 67, 67, 67, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    53, 53, -1, 55, 76, 76, 77, 53, 53, 53, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, 56, 56, 56, 69, 78, 
    78, 79, 56, 56, 56, 80, 56, 56, 56, 56, 
    56, 56, 56, 56, 56, 56, 56, 56, 56, 56, 
    57, 57, 57, 70, 81, 81, 82, 57, 57, 57, 
    57, 83, 57, 57, 57, 57, 57, 57, 57, 57, 
    57, 57, 57, 57, 57, 17, 17, -1, 39, 84, 
    84, 59, 17, 17, 17, -1, -1, 41, -1, -1, 
    -1, -1, -1, 42, 41, 41, -1, -1, -1, -1, 
    5, 5, -1, 29, 85, 85, 48, 5, 5, 5, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, 31, 31, -1, 32, 86, 
    86, 62, 31, 31, 31, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    33, 33, -1, 35, 87, 87, 64, 33, 33, 33, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, 36, 36, -1, 38, 88, 
    88, 66, 36, 36, 36, -1, -1, -1, -1, -1, 
    -1, -1, 51, -1, -1, -1, -1, -1, -1, -1, 
    53, 53, -1, 55, 89, 89, 77, 53, 53, 53, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, 53, 53, -1, 55, 53, 
    53, 67, 53, 67, 67, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    56, 56, 56, 69, 90, 90, 79, 56, 56, 56, 
    67, 56, 56, 56, 56, 56, 56, 56, 56, 56, 
    56, 56, 56, 56, 56, 56, 56, 56, 69, 56, 
    56, -1, 56, 56, -1, 67, 56, 56, 56, 56, 
    56, 56, 56, 56, 56, 56, 56, 56, 56, 56, 
    56, 56, 56, 69, 56, 56, 67, 67, 80, 67, 
    67, 56, 56, 56, 56, 56, 56, 56, 56, 56, 
    56, 56, 56, 56, 56, 57, 57, 57, 70, 91, 
    91, 82, 57, 57, 57, 57, 67, 57, 57, 57, 
    57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 
    57, 57, 57, 70, 57, 57, -1, 57, 57, -1, 
    57, 67, 57, 57, 57, 57, 57, 57, 57, 57, 
    57, 57, 57, 57, 57, 57, 57, 57, 70, 57, 
    57, 67, 67, 83, 67, 57, 67, 57, 57, 57, 
    57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 
    17, 17, -1, 39, 92, 92, 59, 17, 17, 17, 
    -1, -1, 41, -1, -1, -1, -1, -1, 42, 41, 
    41, -1, -1, -1, -1, 5, 5, -1, 29, 93, 
    93, 48, 5, 5, 5, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    31, 31, -1, 32, 94, 94, 62, 31, 31, 31, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, 33, 33, -1, 35, 95, 
    95, 64, 33, 33, 33, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    36, 36, -1, 38, 96, 96, 66, 36, 36, 36, 
    -1, -1, -1, -1, -1, -1, -1, 51, -1, -1, 
    -1, -1, -1, -1, -1, 53, 53, -1, 55, 97, 
    97, 77, 53, 53, 53, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    56, 56, 56, 69, 98, 98, 79, 56, 56, 56, 
    67, 56, 56, 56, 56, 56, 56, 56, 56, 56, 
    56, 56, 56, 56, 56, 57, 57, 57, 70, 99, 
    99, 82, 57, 57, 57, 57, 67, 57, 57, 57, 
    57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 
    17, 17, -1, 39, 100, 100, 59, 17, 17, 17, 
    -1, -1, 41, -1, -1, -1, -1, -1, 42, 41, 
    41, -1, -1, -1, -1, 5, 5, -1, 29, 5, 
    5, 48, 5, 5, 5, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    31, 31, -1, 32, 101, 101, 62, 31, 31, 31, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, 33, 33, -1, 35, 102, 
    102, 64, 33, 33, 33, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    36, 36, -1, 38, 103, 103, 66, 36, 36, 36, 
    -1, -1, -1, -1, -1, -1, -1, 51, -1, -1, 
    -1, -1, -1, -1, -1, 53, 53, -1, 55, 104, 
    104, 77, 53, 53, 53, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    56, 56, 56, 69, 105, 105, 79, 56, 56, 56, 
    67, 56, 56, 56, 56, 56, 56, 56, 56, 56, 
    56, 56, 56, 56, 56, 57, 57, 57, 70, 106, 
    106, 82, 57, 57, 57, 57, 67, 57, 57, 57, 
    57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 
    17, 17, -1, 39, 17, 17, 59, 17, 17, 17, 
    -1, -1, 41, -1, -1, -1, -1, -1, 42, 41, 
    41, -1, -1, -1, -1, 31, 31, -1, 32, 31, 
    31, 62, 31, 31, 31, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    33, 33, -1, 35, 33, 33, 64, 33, 33, 33, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, 36, 36, -1, 38, 36, 
    36, 66, 36, 36, 36, -1, -1, -1, -1, -1, 
    -1, -1, 51, -1, -1, -1, -1, -1, -1, -1, 
    53, 53, -1, 55, 107, 107, 77, 53, 53, 53, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, 56, 56, 56, 69, 108, 
    108, 79, 56, 56, 56, 67, 56, 56, 56, 56, 
    56, 56, 56, 56, 56, 56, 56, 56, 56, 56, 
    57, 57, 57, 70, 109, 109, 82, 57, 57, 57, 
    57, 67, 57, 57, 57, 57, 57, 57, 57, 57, 
    57, 57, 57, 57, 57, 53, 53, -1, 55, 53, 
    53, 77, 53, 53, 53, -1, -1, -1, -1, -1, 
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
    56, 56, 56, 69, 110, 110, 79, 56, 56, 56, 
    67, 56, 56, 56, 56, 56, 56, 56, 56, 56, 
    56, 56, 56, 56, 56, 57, 57, 57, 70, 111, 
    111, 82, 57, 57, 57, 57, 67, 57, 57, 57, 
    57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 
    56, 56, 56, 69, 56, 56, 79, 56, 56, 56, 
    67, 56, 56, 56, 56, 56, 56, 56, 56, 56, 
    56, 56, 56, 56, 56, 57, 57, 57, 70, 57, 
    57, 82, 57, 57, 57, 57, 67, 57, 57, 57, 
    57, 57, 57, 57, 57, 57, 57, 57, 57, 57
  };

  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\1\1\0\2\1\1\11\2\1\4\11\7\1"+
    "\2\11\5\1\1\11\1\0\2\1\1\0\1\1\2\0"+
    "\1\1\3\0\1\1\2\0\1\1\3\0\4\1\1\11"+
    "\2\1\4\0\13\1\2\0\7\1\2\0\1\1\2\0"+
    "\7\1\2\0\6\1\2\0\5\1\2\0\1\1\4\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[112];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
	// position methods
	public int position() { return yychar; }
	public int length()   { return yylength(); }
	public int line()     { return -1; /*yyline;*/ }   	// for debugging
	public int column()   { return -1; /*yycolumn;*/ } 	// for debugging

	// state methods
	public void stateReset() 		{ yybegin(YYINITIAL); }
	public void stateSelector() 	{ yybegin(SELECTOR); }
	public void stateAttr()			{ yybegin(ATTR); }
	public void stateCombinator()	{ yybegin(COMBINATOR); }
	public void statePseudoFn()		{ yybegin(PSEUDO_FN); }

	// fast methods
	public final CharSequence xxtext() {
		return CharBuffer.wrap(zzBuffer, zzStartRead, zzMarkedPos - zzStartRead);
	}

	public final String yytext(int startIndex) {
		startIndex += zzStartRead;
		return new String(zzBuffer, startIndex, zzMarkedPos - startIndex);
	}
	public final String yytext(int startIndex, int endIndexOffset) {
		startIndex += zzStartRead;
		return new String(zzBuffer, startIndex, zzMarkedPos - endIndexOffset - startIndex);
	}

	LinkedList<CssSelector> selectors = new LinkedList<CssSelector>();
	CssSelector cssSelector;
	String pseudoFnName;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  CSSellyLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  CSSellyLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 86) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 9: 
          { cssSelector.addAttributeSelector(yytext());
          }
        case 20: break;
        case 14: 
          { cssSelector.setCombinator(Combinator.ADJACENT_SIBLING); stateReset();
          }
        case 21: break;
        case 5: 
          { cssSelector = new CssSelector(); selectors.add(cssSelector); stateSelector();
          }
        case 22: break;
        case 4: 
          { /* ignore whitespaces */
          }
        case 23: break;
        case 19: 
          { pseudoFnName = yytext(1,1); statePseudoFn();
          }
        case 24: break;
        case 12: 
          { cssSelector.setCombinator(Combinator.GENERAL_SIBLING); stateReset();
          }
        case 25: break;
        case 10: 
          { stateSelector();
          }
        case 26: break;
        case 15: 
          { cssSelector.addPseudoFunctionSelector(pseudoFnName, yytext(0, 1)); stateSelector();
          }
        case 27: break;
        case 8: 
          { stateAttr();
          }
        case 28: break;
        case 18: 
          { cssSelector.addPseudoClassSelector(yytext(1));
          }
        case 29: break;
        case 7: 
          { throw new CSSellyException("Illegal character <"+ yytext() +">.", yystate(), line(), column());
          }
        case 30: break;
        case 6: 
          { yypushback(1); stateCombinator();
          }
        case 31: break;
        case 2: 
          { cssSelector = new CssSelector(yytext()); selectors.add(cssSelector); stateSelector();
          }
        case 32: break;
        case 3: 
          { cssSelector = new CssSelector(); selectors.add(cssSelector); yypushback(1); stateSelector();
          }
        case 33: break;
        case 1: 
          { cssSelector.setCombinator(Combinator.DESCENDANT); stateReset();
          }
        case 34: break;
        case 16: 
          { cssSelector.addIdSelector(yytext(1));
          }
        case 35: break;
        case 17: 
          { cssSelector.addClassSelector(yytext(1));
          }
        case 36: break;
        case 11: 
          { throw new CSSellyException("Invalid combinator <"+ yytext() +">.", yystate(), line(), column());
          }
        case 37: break;
        case 13: 
          { cssSelector.setCombinator(Combinator.CHILD); stateReset();
          }
        case 38: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return 0; }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
