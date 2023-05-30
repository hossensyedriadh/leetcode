import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String... args) {
        System.out.println(romanToInt("VMM"));
    }

    private static int romanToInt(String s) {
        final HashMap<Character, Integer> romanMap = new HashMap<>(Map.of('M', 1000, 'D', 500, 'C', 100,
                'L', 50, 'X', 10, 'V', 5, 'I', 1));

        int converted = 0;

        for (int i = 0; i < s.length() - 1; i += 1) {
            int current = romanMap.get(s.charAt(i));
            int next = romanMap.get(s.charAt(i + 1));

            if (current >= next) {
                converted += current;
            } else {
                converted -= current;
            }
        }

        converted += romanMap.get(s.charAt(s.length() - 1));

        return Math.abs(converted);
    }
}
