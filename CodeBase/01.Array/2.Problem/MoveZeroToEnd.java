import java.util.Arrays;

public class MoveZeroToEnd {


    public static void moveZero(int[] input){
    
        // int j = 0;
        // for(int i=0;i<input.length;i++){
        //     if(input[i]!=0){
        //         input[j++]=input[i];
        //     }
        // }

        // for(int i=j;i<input.length;i++){
        //     input[i]=0;
        // }

 
        int temp;
        for(int i=0,j = 0;i<input.length;i++){
            if(input[i]!=0){
                if(input[j]!=0){
                    j++;
                    continue;
                }
                temp = input[i];
                input[i] = input[j];
                input[j++] = temp;
            }
        }
    }
    

    public static void main(String[] args) {
        int[] input = {0,1,0,3,0,12,10,0};
        MoveZeroToEnd.moveZero(input);
        System.out.println("Output : "+Arrays.toString(input));
    }
}
