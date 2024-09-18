import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 35, 45, 53, 63, 72, 12, 5, 1, 4 };

        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            temp = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[temp] > arr[j]) {
                    temp = j;
                }
            }
            swap(arr, temp, i);
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
