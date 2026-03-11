import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp
 * UC8: Use Map Collection for Character Patterns
 * 
 * @author Sai
 * @version 1.7
 */

public class OOPSBannerApp {

    // Function to create the character pattern map
    public static Map<Character, String[]> getCharacterPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return map;
    }

    public static void main(String[] args) {

        String word = "OOPS";

        Map<Character, String[]> patterns = getCharacterPatterns();

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                String[] pattern = patterns.get(c);
                line.append(pattern[i]).append("   ");
            }

            System.out.println(line);
        }
    }
}