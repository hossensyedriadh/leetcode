public class LengthOfLastWord {
    public static void main(String... args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

    private static int lengthOfLastWord(String s) {
        String[] split = s.split("\\s");
        return split[split.length - 1].length();
    }
}
