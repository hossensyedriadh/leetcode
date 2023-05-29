import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String... args) {
        System.out.println(romanToInt("VMM"));
    }

    //TODO: will try to do it in a better way later
    private static int romanToInt(String s) {
        final HashMap<Character, Integer> romanMap = new HashMap<>(Map.of('M', 1000, 'D', 500, 'C', 100,
                'L', 50, 'X', 10, 'V', 5, 'I', 1));

        char[] chars = s.toUpperCase().toCharArray();
        int converted = 0;

        for (int i = 0; i < chars.length; i += 1) {
            int n1 = romanMap.get(chars[i]);
            if (i < chars.length - 1) {
                int n2 = romanMap.get(chars[i + 1]);
                if (n1 > n2) {
                    converted += n1;
                } else if (n2 > n1) {
                    converted += (n2 - n1);
                    i += 1;
                } else {
                    converted += n1;
                }
            } else {
                converted += n1;
            }
        }

        return converted;
    }
}
