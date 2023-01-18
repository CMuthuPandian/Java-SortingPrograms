import java.util.Arrays;

public class InsertionSorting {
    public static void main(String[] args) {
        int[] arr = new int[]{18, 7, 0, 3, 10, -1, 12};
        System.out.println(Arrays.toString(arr));
        System.out.println("The Sorted Array is:");
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        for(int i = 0; i < arr.length - 1; ++i) {
            for(int j = i + 1; j > 0 && arr[j] < arr[j - 1]; --j) {
                swap(arr, j, j - 1);
            }
        }

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
