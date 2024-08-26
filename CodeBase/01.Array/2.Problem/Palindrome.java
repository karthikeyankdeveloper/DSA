public class Palindrome {

    public boolean isPalindrome(String input) {
        int start = 0, end = input.length()-1;
        char[] data = input.toCharArray();

        while (start<end) {
            if(data[start++]!=data[end--]){
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        String input = "madadam";
        System.out.println("Output : "+new Palindrome().isPalindrome(input));
    }
    
}
