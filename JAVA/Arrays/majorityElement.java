public class majorityElement {
    

    public static int majority(int arr[]){

        int freq = 0;
        int ans =0;

        for(int i = 0; i < arr.length ; i++){
            if(freq == 0){
                ans = arr[i];
            }
            if(ans == arr[i]){
                freq++;
            }else{
                freq--;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int num[] = {3,2,3};

        System.out.println(majority(num));
    }
}
