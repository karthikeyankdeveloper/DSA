import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int arr[] = { 30, 45, 63, 22, 12, 9, 8, 1, 25, 0, 256, 255 };
        // int arr[] = { 63, 30, 45, 22, 12 };
        // len = 5, left = 0, right 4, mid = 2
        // len = 6, left = 0, right 5, mid = 2
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int low, int high) {

        if (low < high) {
            int p = partition(arr, low, high);
            sort(arr, low, p - 1);
            sort(arr, p + 1, high);
        }

        

    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low, j = low;

        while (i<=high) {
            if (arr[i]<=pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }

        return j-1;
    }

}
