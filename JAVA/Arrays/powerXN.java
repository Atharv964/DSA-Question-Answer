public class powerXN {

    public static void Power(int x , int n){

        double ans = 1;

        if(n<0){
            x = 1/x;
            n = -n;
        }

        while(n>0){
            if(n%2 == 1){
                ans*=x;
            }
            x*=x;
            n/=2;
        }
        System.out.println(ans);
    }
    

    public static void main(String[] args) {
        Power(2, 10);
    }
}
