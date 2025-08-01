public class searchSortedArry {

    public static boolean stairCaseSearch(int matrix[][] , int key){
        int Row = 0;
        int Col = matrix[0].length-1;

        while(Row<=matrix.length && Col>=0){
            if(matrix[Row][Col] == key){
                System.out.println("key found at index ("+Row+","+Col+")");
                return true;
            }else if(matrix[Row][Col] > key){
                Col--;
            }else{
                Row++;
            }
        }
        return false;
    }
    

    public static void main(String[] args) {
        int arr[][] = {{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};

        stairCaseSearch(arr, 33);
    }
}
