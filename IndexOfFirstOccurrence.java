public class IndexOfFirstOccurrence {
    public static void main(String... args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }

    private static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
