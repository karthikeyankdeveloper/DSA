import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int arr[] = { 30, 45, 63, 22, 12, 9, 8, 1, 25, 0, 256, 255 };

        int output[] = split(arr);

        System.out.println(Arrays.toString(output));
    }

    private static int[] split(int[] arr) {

        if (arr.length <= 1) {
            return arr;
        }

        int[] left = split(part(arr, true, false));
        int[] right = split(part(arr, false, true));

        System.out.println("Left" + Arrays.toString(left));
        System.out.println("Right" + Arrays.toString(right));

        return mergeSorted(left, right);
    }

    private static int[] mergeSorted(int left[], int right[]) {

        int merge[] = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                merge[k++] = left[i++];
            } else {
                merge[k++] = right[j++];
            }
        }

        if (i < left.length) {
            for (int z = i; z < left.length; z++) {
                merge[k++] = left[z];
            }
        }

        if (j < right.length) {
            for (int z = j; z < right.length; z++) {
                merge[k++] = right[z];
            }
        }

        System.out.println("Merge " + Arrays.toString(merge));

        return merge;
    }

    private static int[] part(int[] arr, boolean left, boolean right) {
        if (arr.length == 2) {
            if (left) {
                int[] rt = { arr[0] };
                return rt;
            } else {
                int[] rt = { arr[1] };
                return rt;
            }
        }

        if (left) {
            int part[] = new int[arr.length / 2];
            for (int i = 0, j = 0; i < arr.length / 2; i++) {
                part[j++] = arr[i];
            }

            System.out.println("Left" + Arrays.toString(part));
            return part;

        } else {
            int st = arr.length / 2;
            int en = arr.length - 1;

            int part[] = new int[en - st + 1];
            for (int i = st, j = 0; i <= en; i++) {
                part[j++] = arr[i];
            }

            System.out.println("Right " + Arrays.toString(part));
            return part;

        }

    }

}
