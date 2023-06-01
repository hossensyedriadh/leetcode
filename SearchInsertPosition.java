public class SearchInsertPosition {
    public static void main(String... args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

    private static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i += 1) {
            if (nums[i] >= target) {
                return i;
            }
        }

        return nums.length;
    }
}
