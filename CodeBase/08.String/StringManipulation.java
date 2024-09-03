class StringManipulation {

    public String output(String input) { //a10b2c3d1a1

        if(input.length()==1){
            return input+"1";
        }

        String output ="";
        char single = input.charAt(0);
        int count = 1;

        for(int i=1;i<input.length();i++){
            if(input.charAt(i)==single){
                count++;
            }else {
                output+=single+""+count;
                single = input.charAt(i);
                count = 1;
            }
        }

        output+=single+""+count;

        return output;
    }



    public static void main(String[] args) {
        String input  = "aaabbcccda";
        System.out.println("Output : "+new StringManipulation().output(input));
    }

    
}