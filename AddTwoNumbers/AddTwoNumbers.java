package AddTwoNumbers;

public class AddTwoNumbers {

    public static void main(String[] args) {
        int[] arr = { 1, 3 };
        int[] arr1 = searchRange(arr, 1);
        for (int i = 0; i < arr1.length; i++)
            System.out.println(arr1[i]);
    }

    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 1)
            return nums[0] == target ? new int[] { 0 } : new int[] { -1 };
        int[] positions = { -1, -1 };
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (nums[i] == target) {
                if (positions[0] < 0) {
                    positions[0] = i;
                } else {
                    positions[1] = i;
                    break;
                }
            }
            if (nums[j] == target) {
                if (positions[1] < 0) {
                    positions[1] = j;
                } else {
                    positions[0] = j;
                    break;
                }
            }
            i++;
            j--;
        }
        if (positions[0] == -1 && positions[1] > -1) {
            positions[0] = positions[1];
        }
        if (positions[1] == -1 && positions[0] > -1) {
            positions[1] = positions[0];
        }
        return positions;
    }
}