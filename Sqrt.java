public class Sqrt {
    public static void main(String... args) {
        System.out.println(mySqrt(2147395599));
    }

    private static int mySqrt(int x) {
        long sqrt = x;

        while (((sqrt * sqrt) - x) > 0) {
            sqrt = (sqrt + (x / sqrt)) / 2;
        }

        return (int) sqrt;
    }
}
