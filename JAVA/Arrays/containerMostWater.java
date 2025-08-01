import java.util.*;
public class containerMostWater {

    public static int Water(int arr[]){
        int lp = 0;
        int rp = arr.length-1;
        int maxWater = 0;

        while(lp<rp){

            int w = rp-lp;
            int h = Math.min(arr[lp], arr[rp]);
            int area = w*h;
            maxWater = Math.max(area , maxWater);

            if(arr[lp]<arr[rp]){
                lp++;
            }else {
                rp--;
            }
        }
        return maxWater;
    }
    

    public static void main(String[] args) {
        int heigh[] = {1,8,6,2,5,4,8,3,7};

        System.out.println(Water(heigh));
    }
}
