public class singleNumber {
    
    public static int requireNumber(int arr[]){

        int value = 0;
        for(int i = 0 ; i< arr.length ; i++){
            value = value^arr[i];
        }
        return value;
    }

    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};
        System.out.print(requireNumber(nums));
    }
}
