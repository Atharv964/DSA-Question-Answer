public class kadan {

    public static void kadan(int numbers[]){

        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i = 0 ; i < numbers.length ; i++){

            cs = cs + numbers[i];
            
            ms = Math.max(cs, ms);
            if(cs < 0){
                cs = 0;
            }

        }

        System.out.println("Maximum sum of subarray is "+ ms);
    }
    

    public static void main(String[] args) {
        int n[] = {-2,-3,4,-1,-2,1,5,-3};

        kadan(n);
    }
}
