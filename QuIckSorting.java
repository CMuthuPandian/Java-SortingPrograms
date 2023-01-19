import java.util.Arrays;
public class QuIckSorting {
    public static void main(String[] args) {
        int[] arr = new int[]{18, 7, 0, 3, 10, -1, 12};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int s = low;
            int e = high;
            int m = low + (high - low) / 2;
            int pivot = nums[m];
            while(s <= e) {
                while(nums[s] < pivot) {
                    ++s;
                }
                while(nums[e] > pivot) {
                    --e;
                }
                if (s <= e) {
                    int temp = nums[s];
                    nums[s] = nums[e];
                    nums[e] = temp;
                    ++s;
                    --e;
                }
                quickSort(nums, low, e);
                quickSort(nums, s, high);
            }

        }
    }

}

/*

Output:

[18, 7, 0, 3, 10, -1, 12]
The Sorted Array is:
[-1, 0, 3, 7, 10, 12, 18]

 */
