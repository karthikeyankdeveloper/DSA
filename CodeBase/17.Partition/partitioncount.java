
import java.util.Arrays;

public class partitioncount {

    public static void main(String[] args) {

        StringBuilder buffer = new StringBuilder("Hello");
        buffer.append("World");
        int[] arr = {2, 3, 5, 2};
        System.out.println(Arrays.toString(arr));
        
        int target = 7; // Example target sum
        int count = findPartitionCount(arr, target);
        System.out.println("Number of subsets hitting target: " + count);
    }

    private static int findPartitionCount(int[] arr, int target) {
        return countSubsets(arr, target, 0, 0);
    }

    private static int countSubsets(int[] arr, int target, int index, int sum) {
        if (sum == target) {
            return 1; 
        }

        if (index >= arr.length || sum > target) {
            return 0;
        }

        int include = countSubsets(arr, target, index + 1, sum + arr[index]);
        int exclude = countSubsets(arr, target, index + 1, sum);
        return include + exclude;

        
    }
}

