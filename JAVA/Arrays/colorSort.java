public class colorSort {

    public static void swap(int[] array , int i , int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void SortedArray(int arr[]){
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid<=high){

            if(arr[mid] == 0){
                swap(arr, low, mid);
                mid++;
                low++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                swap(arr, mid, high);
                high--;
            }
        }

        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

    }
    

    public static void main(String[] args) {
        int arra[] = {1,1,1,0,0,2,2,0,0,1,1,1};
        SortedArray(arra);
    }
}
