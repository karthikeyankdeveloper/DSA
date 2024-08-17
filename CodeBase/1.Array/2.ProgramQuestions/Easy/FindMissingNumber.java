
// Distint number 1 to n so find missing number in an array

public class FindMissingNumber {

    public int Find(int[] input) {
        int n = input.length+1; //so one element missing so one element added +1
        int sumOfN = (n*(n+1))/2;
        for(int i=0;i<n-1;i++){
            sumOfN -= input[i];
        }

        return sumOfN;
    }
    

    public static void main(String[] args) {
        int[] input = {1,6,3,2,5,8,7};
        System.out.println("Output : "+new FindMissingNumber().Find(input));
    }
    
}
