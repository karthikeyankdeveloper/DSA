import java.util.Arrays;

public class MoveZeroToEnd {


    public static void moveZero(int[] input){
    
        // Take 1ms
        int j = 0;
        for(int i=0;i<input.length;i++){
            if(input[i]!=0){
                input[j++]=input[i];
            }
        }

        for(int i=j;i<input.length;i++){
            input[i]=0;
        }

        // Take 3ms
        // int j = 0;
        // for(int i=0;i<input.length;i++){
            
        //     if(input[i]!=0 && input[j]==0){
        //         int temp = input[i];
        //         input[i] = input[j];
        //         input[j] = temp;
        //     }

        //     if(input[j]!=0){
        //         j++;
        //     }
        // }
    }
    

    public static void main(String[] args) {
        int[] input = {0,1,0,3,12};
        MoveZeroToEnd.moveZero(input);
        System.out.println("Output : "+Arrays.toString(input));
    }
}
