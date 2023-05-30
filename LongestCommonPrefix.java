public class LongestCommonPrefix {
    public static void main(String... args) {
        System.out.println(longestCommonPrefix("reflower", "flow", "flight"));
    }

    private static String longestCommonPrefix(String... strs) {
        String lcp = strs[0];
        int index = 0;

        for (int i = 0; i < strs.length; i += 1) {
            if (strs[i].length() < lcp.length()) {
                lcp = strs[i];
                index = i;
            }
        }

        for (int i = 0; i < strs.length; i += 1) {
            if (i != index) {
                if (!strs[i].startsWith(lcp)) {
                    lcp = lcp.substring(0, lcp.length() - 1);
                    i -= 1;
                }
            }
        }

        return lcp;
    }
}
