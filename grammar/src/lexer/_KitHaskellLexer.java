/* The following code was generated by JFlex 1.5.1 */

package lexer;

import java.util.*;
import com.intellij.lexer.*;
import com.intellij.psi.*;
import com.intellij.psi.tree.IElementType;
import generated.GeneratedTypes;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.5.1
 * from the specification file <tt>/Users/atsky/work/haskell-idea-plugin/grammar/src/lexer/Haskell.flex</tt>
 */
class _KitHaskellLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int BLOCK_COMMENT = 2;
  public static final int TEX = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\3\0\1\4\1\0\1\1\3\0\1\1\1\2\1\66\1\1\1\1"+
    "\22\0\1\1\1\0\1\5\1\0\1\0\1\0\1\22\1\15\2\0"+
    "\1\0\1\0\1\0\1\56\1\67\1\0\1\12\1\50\1\50\1\50"+
    "\1\50\3\12\2\3\1\0\1\0\1\0\1\70\2\0\1\20\1\40"+
    "\1\43\1\41\1\14\1\36\1\44\1\53\1\33\1\47\1\10\1\42"+
    "\1\30\1\52\1\26\1\32\1\47\1\37\1\46\1\31\1\34\1\27"+
    "\1\45\1\10\1\35\1\51\1\10\1\20\1\17\1\20\1\21\1\11"+
    "\1\0\1\24\1\57\1\13\1\16\1\60\1\24\1\61\1\77\1\62"+
    "\2\7\1\75\1\71\1\63\1\54\1\72\1\7\1\73\1\7\1\25"+
    "\1\74\1\23\1\76\1\55\2\7\1\64\1\0\1\65\1\0\6\0"+
    "\1\66\33\0\11\0\1\7\2\0\1\0\4\0\2\0\1\0\1\7"+
    "\3\0\1\0\1\7\1\0\3\0\1\0\27\6\1\0\7\6\30\7"+
    "\1\0\10\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\2\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\2\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\2\6\1\7\1\6\1\7\1\6\3\7\2\6\1\7\1\6\1\7"+
    "\2\6\1\7\3\6\2\7\4\6\1\7\2\6\1\7\3\6\3\7"+
    "\2\6\1\7\2\6\1\7\1\6\1\7\1\6\1\7\2\6\1\7"+
    "\1\6\2\7\1\6\1\7\2\6\1\7\3\6\1\7\1\6\1\7"+
    "\2\6\2\7\1\0\1\6\3\7\4\0\1\6\1\0\1\7\1\6"+
    "\1\0\1\7\1\6\1\0\1\7\1\6\1\7\1\6\1\7\1\6"+
    "\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6"+
    "\2\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6"+
    "\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\2\7\1\6"+
    "\1\0\1\7\1\6\1\7\3\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\7\7\2\6\1\7\2\6\2\7\1\6\1\7"+
    "\4\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\105\7"+
    "\1\0\44\7\7\0\2\7\4\0\14\0\16\0\5\7\7\0\1\0"+
    "\1\0\1\0\21\0\105\0\1\7\52\0\1\6\1\7\1\6\1\7"+
    "\1\0\1\0\1\6\1\7\2\0\4\7\1\0\5\0\2\0\1\6"+
    "\1\0\3\6\1\0\1\6\1\0\2\6\1\7\21\6\1\0\11\6"+
    "\43\7\1\6\2\7\3\6\3\7\1\6\1\7\1\6\1\7\1\6"+
    "\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6"+
    "\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\5\7\1\6"+
    "\1\7\1\0\1\6\1\7\2\6\2\7\63\6\60\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\0\7\0\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\2\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\2\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\11\0\46\6\3\0\6\0\1\0\47\7\1\0\2\0\4\0\1\0"+
    "\56\0\1\0\1\0\1\0\2\0\1\0\2\0\1\0\54\0\2\0"+
    "\21\0\12\0\13\0\1\0\2\0\2\0\112\0\4\0\146\0\1\0"+
    "\11\0\1\0\12\0\1\0\23\0\2\0\1\0\16\0\350\0\4\0"+
    "\66\0\17\0\37\0\1\0\u0105\0\2\0\12\0\1\0\201\0\2\0"+
    "\6\0\2\0\364\0\2\0\176\0\1\0\202\0\10\0\204\0\1\0"+
    "\371\0\1\0\172\0\1\0\112\0\1\0\17\0\1\0\12\0\2\0"+
    "\245\0\27\0\2\0\6\0\24\0\1\0\1\0\1\0\1\0\1\0"+
    "\1\0\4\0\107\0\1\0\70\0\10\0\1\0\6\0\1\0\15\0"+
    "\157\0\6\0\116\0\2\0\46\6\1\0\1\6\5\0\1\6\55\0"+
    "\1\0\u0264\0\11\0\47\0\12\0\146\0\1\0\u026c\0\2\0\54\0"+
    "\2\0\116\0\3\0\107\0\2\0\235\0\3\0\1\0\4\0\44\0"+
    "\13\0\u0135\0\1\0\3\0\2\0\230\0\42\0\36\0\2\0\200\0"+
    "\7\0\1\0\6\0\254\0\21\0\11\0\11\0\177\0\4\0\73\0"+
    "\5\0\76\0\2\0\100\0\10\0\13\0\1\0\54\0\300\7\100\0"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\11\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\11\7\10\6\6\7"+
    "\2\0\6\6\2\0\10\7\10\6\10\7\10\6\6\7\2\0\6\6"+
    "\2\0\10\7\1\0\1\6\1\0\1\6\1\0\1\6\1\0\1\6"+
    "\10\7\10\6\16\7\2\0\10\7\10\0\10\7\10\0\10\7\10\0"+
    "\5\7\1\0\2\7\4\6\1\0\1\0\1\7\3\0\3\7\1\0"+
    "\2\7\4\6\1\0\3\0\4\7\2\0\2\7\4\6\1\0\3\0"+
    "\10\7\5\6\3\0\2\0\3\7\1\0\2\7\4\6\1\0\2\0"+
    "\21\0\30\0\1\66\1\66\6\0\57\0\22\0\1\7\10\0\5\0"+
    "\1\7\12\0\5\0\1\0\15\7\3\0\33\0\105\0\2\0\1\6"+
    "\4\0\1\6\2\0\1\7\3\6\2\7\3\6\1\7\1\0\1\6"+
    "\3\0\5\6\6\0\1\6\1\0\1\6\1\0\1\6\1\0\4\6"+
    "\1\0\1\7\4\6\1\7\4\0\1\7\2\0\2\7\2\6\5\0"+
    "\1\6\4\7\4\0\1\7\1\0\20\0\20\6\20\7\3\0\1\6"+
    "\1\7\13\0\u0264\0\14\0\47\0\31\0\13\0\121\0\32\0\32\6"+
    "\32\7\26\0\u0200\0\1\0\165\0\36\0\u03b9\0\3\0\12\0\246\0"+
    "\57\6\1\0\57\7\1\0\1\6\1\7\3\6\2\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\4\6\1\7\1\6\2\7\1\6\10\7"+
    "\3\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\2\7"+
    "\6\0\1\6\1\7\1\6\1\7\3\0\1\6\1\7\5\0\4\0"+
    "\1\0\2\0\46\7\1\0\1\7\5\0\1\7\102\0\1\0\217\0"+
    "\57\0\1\0\14\0\104\0\32\0\1\0\131\0\14\0\326\0\32\0"+
    "\14\0\5\0\4\0\3\0\31\0\17\0\1\0\5\0\2\0\5\0"+
    "\3\0\133\0\2\0\3\0\1\0\132\0\1\0\224\0\2\0\4\0"+
    "\12\0\40\0\44\0\34\0\37\0\13\0\36\0\10\0\1\0\17\0"+
    "\40\0\12\0\47\0\17\0\77\0\1\0\u0100\0\u19c0\0\100\0\u5690\0"+
    "\67\0\67\0\2\0\u010d\0\3\0\60\0\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7"+
    "\1\6\1\7\5\0\1\0\12\0\1\0\1\0\1\6\1\7\1\6"+
    "\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6"+
    "\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6"+
    "\1\7\132\0\6\0\10\0\27\0\11\0\2\0\1\6\1\7\1\6"+
    "\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6"+
    "\3\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6"+
    "\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6"+
    "\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6"+
    "\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6"+
    "\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6"+
    "\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6"+
    "\1\7\1\6\12\7\1\6\1\7\1\6\1\7\2\6\1\7\1\6"+
    "\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\0\2\0\1\6"+
    "\1\7\1\6\1\7\1\0\1\6\1\7\1\6\1\7\14\0\1\6"+
    "\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6\1\7\1\6"+
    "\115\0\3\7\55\0\4\0\12\0\4\0\72\0\4\0\126\0\2\0"+
    "\50\0\3\0\63\0\2\0\57\0\1\0\141\0\15\0\20\0\2\0"+
    "\174\0\4\0\27\0\3\0\144\0\2\0\20\0\2\0\371\0\1\0"+
    "\u4f14\0\7\7\14\0\5\7\21\0\1\0\210\0\20\0\u017c\0\2\0"+
    "\274\0\2\0\22\0\12\0\26\0\43\0\1\0\23\0\1\0\4\0"+
    "\225\0\17\0\12\0\7\0\32\6\6\0\32\7\13\0\172\0\7\0"+
    "\1\0\7\0\15\0\2\0\2\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\2\1\5\1\6"+
    "\1\2\1\6\1\7\1\10\1\11\1\12\2\6\3\13"+
    "\2\1\1\0\1\14\3\0\1\6\1\15\2\6\1\16"+
    "\1\17\1\1\20\0\1\20\17\0\3\6\30\0\3\6"+
    "\1\0\2\6\1\21\1\0\1\22\1\23\6\0\1\24";

  private static int [] zzUnpackAction() {
    int [] result = new int[110];
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
    "\0\0\0\100\0\200\0\300\0\u0100\0\300\0\u0140\0\u0180"+
    "\0\u01c0\0\u0200\0\u0240\0\u0280\0\300\0\300\0\300\0\u02c0"+
    "\0\u0300\0\300\0\u0340\0\u0380\0\u03c0\0\u0400\0\u0140\0\300"+
    "\0\u0440\0\u0480\0\u04c0\0\u0500\0\300\0\u0540\0\u0580\0\300"+
    "\0\300\0\u05c0\0\u0600\0\u0640\0\u0680\0\u06c0\0\u0700\0\u0740"+
    "\0\u0780\0\u07c0\0\u0800\0\u0840\0\u0880\0\u08c0\0\u0900\0\u0940"+
    "\0\u0980\0\u09c0\0\300\0\u0a00\0\u0a40\0\u0a80\0\u0ac0\0\u0b00"+
    "\0\u0b40\0\u0b80\0\u0bc0\0\u0c00\0\u0c40\0\u0c80\0\u0cc0\0\u0d00"+
    "\0\u0d40\0\u0d80\0\u0dc0\0\u0e00\0\u0e40\0\u0e80\0\u0ec0\0\u0f00"+
    "\0\u0f40\0\u0f80\0\u0fc0\0\u1000\0\u1040\0\u1080\0\u10c0\0\u1100"+
    "\0\u1140\0\u1180\0\u11c0\0\u1200\0\u1240\0\u1280\0\u12c0\0\u1300"+
    "\0\u1340\0\u1380\0\u13c0\0\u1400\0\u1440\0\u1480\0\u14c0\0\u1500"+
    "\0\u1540\0\u1580\0\u15c0\0\u01c0\0\u1600\0\u01c0\0\u01c0\0\u1640"+
    "\0\u1680\0\u16c0\0\u1700\0\u1740\0\u1780\0\300";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[110];
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
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\2\4\1\7\1\10\1\11\1\10"+
    "\1\11\1\4\1\11\1\10\1\12\1\11\4\4\3\11"+
    "\22\10\1\4\3\10\2\11\1\4\3\11\1\13\1\11"+
    "\1\14\1\15\1\0\1\16\1\17\1\20\4\11\1\21"+
    "\1\11\56\22\1\23\5\22\1\24\1\22\1\0\11\22"+
    "\17\25\1\26\60\25\101\0\1\5\76\0\2\27\1\30"+
    "\2\27\1\30\11\27\1\31\60\27\3\0\2\10\1\0"+
    "\11\10\4\0\33\10\1\0\5\10\5\0\7\10\3\0"+
    "\2\11\1\0\11\11\4\0\33\11\1\0\5\11\5\0"+
    "\7\11\2\32\1\0\12\32\1\0\1\32\1\33\60\32"+
    "\3\0\2\11\1\0\11\11\4\0\33\11\1\0\5\11"+
    "\5\0\1\34\6\11\56\0\1\35\24\0\2\11\1\0"+
    "\11\11\4\0\31\11\1\36\1\11\1\0\5\11\5\0"+
    "\7\11\3\0\2\11\1\0\11\11\4\0\33\11\1\0"+
    "\5\11\5\0\6\11\1\37\65\0\1\40\70\0\1\41"+
    "\21\0\17\25\1\0\60\25\17\0\1\42\37\0\1\43"+
    "\21\0\2\44\1\27\1\0\1\27\4\0\1\27\1\0"+
    "\1\45\1\27\1\0\1\27\1\0\1\46\4\27\1\47"+
    "\1\50\1\51\1\52\1\0\1\53\2\0\1\54\1\0"+
    "\1\55\1\56\1\0\1\57\1\60\1\53\1\50\1\0"+
    "\1\27\2\0\1\50\1\61\1\62\1\0\1\27\3\0"+
    "\1\27\7\0\1\27\21\0\1\63\65\0\1\64\1\0"+
    "\1\32\4\0\1\64\1\0\1\65\1\32\1\0\1\32"+
    "\1\0\1\66\4\32\1\67\1\70\1\71\1\72\1\0"+
    "\1\73\2\0\1\74\1\0\1\75\1\76\1\0\1\77"+
    "\1\100\1\73\1\70\1\0\1\64\2\0\1\70\1\101"+
    "\1\102\1\0\1\32\3\0\1\32\7\0\1\32\7\0"+
    "\2\11\1\0\11\11\4\0\33\11\1\0\5\11\5\0"+
    "\1\11\1\103\5\11\3\0\2\11\1\0\10\11\1\104"+
    "\4\0\33\11\1\0\5\11\5\0\7\11\3\0\2\11"+
    "\1\0\11\11\4\0\33\11\1\0\1\11\1\105\3\11"+
    "\5\0\7\11\17\0\1\42\140\0\1\106\20\0\2\44"+
    "\14\0\1\27\110\0\1\107\5\0\1\110\2\0\1\111"+
    "\46\0\2\27\2\0\1\27\2\0\3\27\4\0\22\27"+
    "\1\0\3\27\53\0\1\110\10\0\1\112\70\0\1\27"+
    "\112\0\1\27\62\0\1\113\2\0\1\27\1\0\1\114"+
    "\12\0\1\27\1\0\1\115\62\0\1\27\71\0\1\116"+
    "\2\0\1\117\1\53\1\0\1\120\15\0\1\27\66\0"+
    "\1\112\76\0\1\115\5\0\1\27\62\0\1\27\4\0"+
    "\1\110\72\0\1\27\12\0\1\27\45\0\1\27\35\0"+
    "\1\27\32\0\1\27\6\0\3\27\1\0\1\27\5\0"+
    "\1\27\11\0\1\27\1\0\2\27\1\0\2\27\3\0"+
    "\1\27\6\0\2\27\22\0\1\64\6\0\1\64\2\0"+
    "\1\63\32\0\1\64\57\0\1\121\5\0\1\122\2\0"+
    "\1\123\46\0\2\32\2\0\1\32\2\0\3\32\4\0"+
    "\22\32\1\0\3\32\53\0\1\122\10\0\1\124\70\0"+
    "\1\32\112\0\1\32\62\0\1\125\2\0\1\126\1\0"+
    "\1\127\12\0\1\32\1\0\1\130\62\0\1\32\71\0"+
    "\1\131\2\0\1\132\1\73\1\0\1\133\15\0\1\32"+
    "\66\0\1\124\76\0\1\130\5\0\1\32\62\0\1\32"+
    "\4\0\1\122\72\0\1\32\12\0\1\32\45\0\1\134"+
    "\35\0\1\134\32\0\1\135\6\0\3\135\1\0\1\135"+
    "\5\0\1\135\11\0\1\135\1\0\2\135\1\0\2\135"+
    "\3\0\1\135\6\0\2\135\22\0\2\11\1\0\11\11"+
    "\4\0\31\11\1\136\1\11\1\0\5\11\5\0\7\11"+
    "\3\0\2\11\1\0\11\11\4\0\33\11\1\0\5\11"+
    "\5\0\3\11\1\137\3\11\3\0\2\11\1\0\11\11"+
    "\4\0\33\11\1\0\5\11\5\0\2\11\1\140\4\11"+
    "\61\0\1\141\54\0\1\27\71\0\1\27\117\0\1\27"+
    "\71\0\1\27\100\0\1\27\71\0\1\27\70\0\1\27"+
    "\110\0\1\27\101\0\1\27\73\0\1\27\5\0\1\27"+
    "\72\0\1\32\71\0\1\32\117\0\1\32\71\0\1\32"+
    "\100\0\1\32\51\0\1\63\15\0\1\32\101\0\1\32"+
    "\70\0\1\32\110\0\1\32\101\0\1\32\73\0\1\32"+
    "\5\0\1\32\46\0\1\134\2\0\1\63\32\0\1\134"+
    "\32\0\1\135\6\0\3\135\1\63\1\135\5\0\1\135"+
    "\11\0\1\135\1\0\2\135\1\0\2\135\3\0\1\135"+
    "\6\0\2\135\22\0\2\11\1\0\11\11\4\0\33\11"+
    "\1\0\5\11\5\0\2\11\1\142\4\11\3\0\2\11"+
    "\1\0\11\11\4\0\33\11\1\0\5\11\5\0\4\11"+
    "\1\143\2\11\3\0\2\11\1\0\11\11\4\0\33\11"+
    "\1\0\1\11\1\144\3\11\5\0\7\11\62\0\1\145"+
    "\20\0\2\11\1\0\11\11\4\0\2\11\1\146\30\11"+
    "\1\0\5\11\5\0\7\11\3\0\2\11\1\0\11\11"+
    "\4\0\33\11\1\0\1\11\1\147\3\11\5\0\7\11"+
    "\63\0\1\150\100\0\1\151\26\0\1\152\140\0\1\153"+
    "\41\0\1\154\141\0\1\155\104\0\1\156\12\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6080];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

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
    "\2\0\1\1\1\11\1\1\1\11\6\1\3\11\2\1"+
    "\1\11\4\1\1\0\1\11\3\0\1\1\1\11\2\1"+
    "\2\11\1\1\20\0\1\11\17\0\3\1\30\0\3\1"+
    "\1\0\3\1\1\0\2\1\6\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[110];
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

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char[] zzBuffer = new char[0];

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
    private int commentStart;
    private int commentDepth;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  _KitHaskellLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  _KitHaskellLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader
             (in, java.nio.charset.Charset.forName("UTF-8")));
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
    while (i < 3350) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer.toString().toCharArray();
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos);
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
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer[zzStartRead+pos];
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

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
        case 1: 
          { return GeneratedTypes.BLOCK_COMMENT;
          }
        case 21: break;
        case 2: 
          { return TokenType.BAD_CHARACTER;
          }
        case 22: break;
        case 3: 
          { return TokenType.WHITE_SPACE;
          }
        case 23: break;
        case 4: 
          { return GeneratedTypes.NEW_LINE;
          }
        case 24: break;
        case 5: 
          { return GeneratedTypes.CONID;
          }
        case 25: break;
        case 6: 
          { return GeneratedTypes.VARID;
          }
        case 26: break;
        case 7: 
          { return GeneratedTypes.OCURLY;
          }
        case 27: break;
        case 8: 
          { return GeneratedTypes.CCURLY;
          }
        case 28: break;
        case 9: 
          { return GeneratedTypes.DOT;
          }
        case 29: break;
        case 10: 
          { return GeneratedTypes.EQUAL;
          }
        case 30: break;
        case 11: 
          { 
          }
        case 31: break;
        case 12: 
          { return GeneratedTypes.STRING;
          }
        case 32: break;
        case 13: 
          { yybegin(BLOCK_COMMENT);
    commentDepth = 0;
    commentStart = getTokenStart();
          }
        case 33: break;
        case 14: 
          { if (commentDepth > 0) {
            commentDepth--;
        }
        else {
             int state = yystate();
             yybegin(YYINITIAL);
             zzStartRead = commentStart;
             return GeneratedTypes.BLOCK_COMMENT;
        }
          }
        case 34: break;
        case 15: 
          { commentDepth++;
          }
        case 35: break;
        case 16: 
          { return GeneratedTypes.CHAR;
          }
        case 36: break;
        case 17: 
          { return GeneratedTypes.WHERE;
          }
        case 37: break;
        case 18: 
          { return GeneratedTypes.IMPORT;
          }
        case 38: break;
        case 19: 
          { return GeneratedTypes.MODULE_T;
          }
        case 39: break;
        case 20: 
          { yybegin(YYINITIAL); return GeneratedTypes.BLOCK_COMMENT;
          }
        case 40: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            switch (zzLexicalState) {
            case BLOCK_COMMENT: {
              int state = yystate();
        yybegin(YYINITIAL);
        zzStartRead = commentStart;
        return GeneratedTypes.BLOCK_COMMENT;
            }
            case 111: break;
            default:
            return null;
            }
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
