/**
 * OOPSBannerApp
 * UC6: Static Functions for Banner Characters
 * Generates OOPS banner using helper methods
 * 
 * @author Sai
 * @version 1.5
 */

public class OOPSBannerApp {

    // Pattern for letter O
    public static String[] printO() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Pattern for letter P
    public static String[] printP() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Pattern for letter S
    public static String[] printS() {
        return new String[]{
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
    }

    public static void main(String[] args) {

        String[] O = printO();
        String[] P = printP();
        String[] S = printS();

        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "   " + O[i] + "   " + P[i] + "   " + S[i]);
        }
    }
}