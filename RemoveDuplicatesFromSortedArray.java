import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String... args) {
        int[] array = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int len = removeDuplicates(array);

        System.out.println(len);
        System.out.println(Arrays.toString(array));
    }

    private static int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int i = 0;

        for (int j = 1; j < nums.length; j += 1) {
            if (nums[i] != nums[j]) {
                i += 1;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}
