public class StringManipulate {

    public String output(String input) { //a1b2c3d1a1

        input += "x";

        String output ="";
        char single = input.charAt(0);
        int count = 0;

        for(int i=1;i<input.length();i++){
            if(97<=input.charAt(i)){
                while(0<(count--)){
                    output += single;
                }
                single = input.charAt(i);
                count = 0;
            }else{
                count = (count*10)+Integer.parseInt(input.charAt(i)+"");
            }
        }

        return output;
    }



    public static void main(String[] args) {
        String input  = "a10b2c3d1x4";
        System.out.println("Output : "+new StringManipulate().output(input));
    }
    
}
