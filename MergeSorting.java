import java.util.Arrays;

public class MergeSorting {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 9, 1, 5, 2, -1, 6, 3, 0};
        System.out.println(Arrays.toString(arr));
        System.out.println("The Sorted Array is:");
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        } else {
            int mid = arr.length / 2;
            int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
            int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
            return merge(left, right);
        }
    }

    static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;

        int k;
        for(k = 0; i < first.length && j < second.length; ++k) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                ++i;
            } else {
                mix[k] = second[j];
                ++j;
            }
        }

        while(i < first.length) {
            mix[k] = first[i];
            ++i;
            ++k;
        }

        while(j < second.length) {
            mix[k] = second[j];
            ++j;
            ++k;
        }

        return mix;
    }

}

/*

Output:

[7, 9, 1, 5, 2, -1, 6, 3, 0]
The Sorted Array is:
[-1, 0, 1, 2, 3, 5, 6, 7, 9]

 */
