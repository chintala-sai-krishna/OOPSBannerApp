/**
 * OOPSBannerApp
 * UC7: Store Character Pattern in a Class using Inner Class
 * 
 * @author Sai
 * @version 1.6
 */

public class OOPSBannerApp {

    // Static Inner Class
    static class CharacterPattern {
        char character;
        String[] pattern;

        CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        String[] Opattern = O.getPattern();
        String[] Ppattern = P.getPattern();
        String[] Spattern = S.getPattern();

        for (int i = 0; i < Opattern.length; i++) {
            System.out.println(
                    Opattern[i] + "   " +
                    Opattern[i] + "   " +
                    Ppattern[i] + "   " +
                    Spattern[i]
            );
        }
    }
}