public class Track {
    

    public static int count = 0;
    public static void main(String[] args) {


        int arr[] = {1,2,3,4};
        int target = 7;

        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        if(target==sum){
            System.out.println("All element added is output."); 
            return;
        }
        // else  if(sum<target){
        //     System.out.println("No set found initially.");
        //     return;
        // }

        System.out.println(begin(arr,target));
        System.out.println("count"+count);
    }

    private static int begin(int[] arr,int target){
        return findSum(arr,0,0,target);
    }

    private static int findSum(int arr[],int index,int sum,int target){
        if(sum==target){
            count++;
            return sum;
        } 
        

        if(index>=arr.length || target<sum) return -1;

        int include = findSum(arr, index+1, sum+arr[index], target);
        int exclude = findSum(arr, index+1, sum, target);

        return Math.max(include,exclude);
    }
}
