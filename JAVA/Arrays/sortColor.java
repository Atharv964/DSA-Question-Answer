
//DUTCH NATIONAL FLAG ALGORITHM
public class sortColor {
    
    public static void Sort(int arr){
        int red , white , blue;
        red = 0;
        white = 0;
        blue = 0;

        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] == 0){
                red++;
            }else if(arr[i] == 1){
                white++;
            }else{
                blue++;
            }
        }


    }

    public static void main(String[] args) {
        
    }
}
