import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        int sum = 10+10;

        int[] arrayOne = new int[3];
        arrayOne[0] =  0;
        arrayOne[1] =  1;
        arrayOne[2] =  2;

        int[] arrayTwo = {1,2,3,4,5,6}; //OR new int[]{1,2,3,4,5,6}
        int[] arrayThree = arrayTwo; //reference
        arrayThree[0] = 11;

        Integer[] wrapperArray = new Integer[5];

        System.out.println(sum);
        System.out.println("Array One : "+Arrays.toString(arrayOne) + " Hashcode : "+arrayOne.hashCode());
        System.out.println("Array Two : "+Arrays.toString(arrayTwo) + " Hashcode : "+arrayTwo.hashCode());
        System.out.println("Array Three : "+Arrays.toString(arrayThree) + " Hashcode : "+arrayThree.hashCode());
        System.out.println("Wrapper Array : "+Arrays.toString(wrapperArray) + " Hashcode : "+wrapperArray.hashCode());


        String[][] TwoDArray = {
            {"00","01","02"},
            {"10","11","12"},
            {"20","21","22"}
        };

        String[] zeroIndex = TwoDArray[0];
        zeroIndex[0]="Modified";

        System.out.println("TwoDArray 0 Index : "+Arrays.toString(TwoDArray[0]) + " Hashcode : "+TwoDArray.hashCode()+ " Hashcode[0] : "+TwoDArray[0].hashCode()+ " Hashcode[1] : "+TwoDArray[1].hashCode()+ " Hashcode[2] : "+TwoDArray[2].hashCode());
        System.out.println("zeroIndex Array : "+Arrays.toString(zeroIndex) + " Hashcode : "+zeroIndex.hashCode());

        String[][][] ThreeDArray = {
            {
                {"0","1","3"},{"4","5","6"},{"7","8","9"}
            },
            {
                {"A","B","C"},{"D","E","F"},{"G","H","I"}
            }
        };

        System.out.println("ThreeDArray Array : "+ThreeDArray[0][2][2]);
    }
}