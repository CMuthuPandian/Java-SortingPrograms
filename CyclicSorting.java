import java.util.Arrays;

public class CyclicSorting {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 7, 3, 6, 2, 1, 4};
        System.out.println(Arrays.toString(arr));
        System.out.println("The Sorted Array is:");
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr) {
        int i = 0;

        while(i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                ++i;
            }
        }

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

/*

Output:

[5, 7, 3, 6, 2, 1, 4]
The Sorted Array is:
[1, 2, 3, 4, 5, 6, 7]

 */
