public class Sum {
    public static int sum(int[] input) {
        int sum = 0;
        for(int i=0;i<input.length;i++){
            sum += input[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5};
        System.out.println("Output : "+Sum.sum(input));
    }
}
