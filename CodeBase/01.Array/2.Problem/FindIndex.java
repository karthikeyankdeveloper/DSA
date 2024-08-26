/* 
    Return the Index of Target Element in an Array
*/ 
class FindIndex {

    public int Index(int[] input,int target) {
        for(int i=0;i<input.length;i++){
            if(input[i]==target){
                return i;
            }
        }
        return -1;
    }
    

    public static void main(String[] args) {
        int[] input = {1,2,3,5,4};
        System.out.println("Output : "+new FindIndex().Index(input,4));
    }
    
}
