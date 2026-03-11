/**
 * OOPSBannerApp
 * UC5: Array Initialization with String.join()
 *
 * @author Sai
 * @version 1.4
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
            String.join("   ", " ***** ", " ***** ", " ***** ", " ***** "),
            String.join("   ", "*     *", "*     *", "*     *", "*     "),
            String.join("   ", "*     *", "*     *", "*     *", "*     "),
            String.join("   ", "*     *", " ***** ", " ***** ", " ***** "),
            String.join("   ", "*     *", "*      ", "*      ", "*     "),
            String.join("   ", "*     *", "*      ", "*      ", "*     "),
            String.join("   ", " ***** ", "*      ", " ***** ", " ***** ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}