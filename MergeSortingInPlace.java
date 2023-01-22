import java.util.Arrays;

public class MergeSortingInPlace {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 4, 0, 9, -1, 8};
        System.out.println(Arrays.toString(arr));
        System.out.println("The Sorted Array is:");
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[] arr, int s, int e) {
        if (e - s != 1) {
            int mid = (s + e) / 2;
            mergeSort(arr, s, mid);
            mergeSort(arr, mid, e);
            finalMergeSort(arr, s, mid, e);
        }
    }
    static void finalMergeSort(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k;
        for(k = 0; i < m && j < e; ++k) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                ++i;
            } 
            else {
                mix[k] = arr[j];
                ++j;
            }
        }
        while(i < m) {
            mix[k] = arr[i];
            ++i;
            ++k;
        }
        while(j < e) {
            mix[k] = arr[j];
            ++j;
            ++k;
        }
        for(int l = 0; l < mix.length; ++l) {
            arr[s + l] = mix[l];
        }

    }

}

/*

Output:

[7, 2, 4, 0, 9, -1, 8]
The Sorted Array is:
[-1, 0, 2, 4, 7, 8, 9]

 */
