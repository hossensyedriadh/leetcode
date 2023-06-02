public class RemoveElement {
    public static void main(String... args) {
        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
    }

    private static int removeElement(int[] nums, int val) {
        int c = 0;

        for (int i = 0; i < nums.length; i += 1) {
            if (nums[i] != val) {
                nums[c] = nums[i];
                c += 1;
            }
        }

        return c;
    }
}
