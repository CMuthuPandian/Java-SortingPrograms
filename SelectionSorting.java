import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 8, 1, 10, 0, 3, 2};
        System.out.println(Arrays.toString(arr));
        System.out.println("The Sorted Array is:");
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            int last = arr.length - 1 - i;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for(int j = start; j <= end; ++j) {
            if (arr[max] < arr[j]) {
                max = j;
            }
        }

        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

/*

Output:

[5, 8, 1, 10, 0, 3, 2]
The Sorted Array is:
[0, 1, 2, 3, 5, 8, 10]

 */
