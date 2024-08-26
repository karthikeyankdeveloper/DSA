import java.util.Arrays;

public class ReplaceTarget {

    public int[] replace(int[] input,int target,int replace) {
        for(int i=0;i<input.length;i++){
            if(input[i]==target)
                input[i] = replace;
        }
        return input;
    }
    

    public static void main(String[] args) {
        int[] input = {1,2,3,5,4,22,4};
        System.out.println("Output : "+Arrays.toString(new ReplaceTarget().replace(input,4,0)));
    }
}
