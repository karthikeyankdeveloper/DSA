import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class partition {

    static int count = 0;

    public static List<List<Integer>> list = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = { 1,5,11,5 };
        // int[] arr = {1, 5, 3};
        // int[] arr = {2222,222,22,2};
        // int[] arr = {2,22,222222};
        // int[] arr = {2,3,5}; 
        // int[] arr = {1,2,3,4}; 

        System.out.println(Arrays.toString(arr));
        System.out.println(findPartition(arr));

        System.out.println("Count "+count);
        System.out.println(list);
    }

    private static boolean findPartition(int[] arr) { 
        int sum=0;
        for(int temp:arr){
            sum+=temp;
        }

        if(sum%2!=0){
            return false;
        }

        int target = sum/2;

        return findSumEqual(arr,target,0,0,new ArrayList<>())==target?true:false;
    }

    private static int findSumEqual(int[] arr, int target, int index, int sum,List<Integer> track) {
        if(sum==target){
            count+=1;
            list.add(new ArrayList<>(track));
            return sum;
        } 

        if(index>=arr.length) return -1;

        // track.add(arr[index]);
        track.add(index);
        int include = findSumEqual(arr, target, index+1, sum+arr[index],track);

        track.remove(track.size()-1);
        int exclude = findSumEqual(arr, target, index+1, sum,track);

        return Math.max(include, exclude);
    }


}
