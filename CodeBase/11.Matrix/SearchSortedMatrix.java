public class SearchSortedMatrix {
    public static void main(String[] args){

        int[][] matrix = {
            {10,20,30,40},
            {15,26,36,46},
            {25,31,41,51},
            {35,42,53,64}
        };

        System.out.println(search(matrix,matrix.length,35));
    }

    private static String search(int[][] matrix,int n, int target){

        int i = 0;
        int j = n-1;

        while (i<n && j>=0) {
            if(matrix[i][j]==target){
                return "The element find in index ("+(i+1)+","+(j+1)+")";
            }

            if(matrix[i][j]>target){
                j--;
            }else{
                i++;
            }
            
        }


        return "Not Found!";
    }
}
