public class PalindromeNumber {
    public static void main(String... args) {
        System.out.println(isPalindrome(111));
    }

    private static boolean isPalindrome(int x) {
        int temp = x;

        if (x < 0) {
            return false;
        }

        int y = 0;

        while (temp != 0) {
            y = y * 10 + (temp % 10);
            temp /= 10;
        }

        return x == y;
    }
}
