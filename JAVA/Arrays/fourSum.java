import java.util.*;
public class fourSum {

    public static List<List<Integer>> fSum(int arr[]){

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(arr);
        int n = arr.length;

        for(int i = 0; i<n-3 ; i++){

            if(i>0 && arr[i] == arr[i-1]){
                continue;
            }

            for(int j = i+1;j< n-2 ; j++){

                if(j>i+1 && arr[j] == arr[j-1]){
                    continue;
                }

                int p = j+1;
                int q = n-1;

                while(p<q){

                    long sum = (long)arr[i]+arr[j]+arr[p]+arr[q];

                    if(sum<0){
                        p++;
                    }else if(sum>0){
                        q--;
                    }else{
                        result.add(Arrays.asList(arr[i],arr[j],arr[p],arr[q]));

                        while(p<q && arr[p] == arr[p+1]){
                            p++;
                        }
                        while(p<q && arr[q] == arr[q-1]){
                            q--;
                        }

                        p++;
                        q--;
                    }
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        
        int num[] = {1,0,-1,0,-2,2};
        System.out.println(fSum(num));
    }
    
}
