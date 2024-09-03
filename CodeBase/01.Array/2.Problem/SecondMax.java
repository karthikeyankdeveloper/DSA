public class SecondMax {

    public static int secondMax(int[] input) {
        int max = 0;
        int secmax = 0;
        for(int i=0;i<input.length;i++){
            if(max<input[i]){
                secmax = max;
                max = input[i];
            }else if(secmax<input[i] && input[i]!=max){
                secmax = input[i];
            }
        }
        return secmax;
    }

    public static void main(String[] args) {
        int[] input = {55,2,3,55,22,9};
        System.out.println("Output : "+SecondMax.secondMax(input));
    }
}
