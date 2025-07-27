import java.util.*;
public class stringRotatin{


    //this function uses string and it creates string every time while running loop decreasing the efficiency
    // static boolean isRotation(String s1 , String s2){
    //     int n = s1.length();

    //     for(int i=0 ; i<n ; i++){

    //         if(s1.equals(s2)){
    //             return true;
    //         }

    //         char last = s1.charAt(s1.length()-1);
    //         s1 = last + s1.substring(0,s1.length()-1);
    //     }

    //     return false;
    // }


    //In this we use stringbuilder which increases the efficiency
    static boolean isRotation(String s1,String s2){

        int n = s1.length();

        StringBuilder sb = new StringBuilder(s1);

        for(int i=0 ; i<n ; i++){

            if(sb.toString().equals(s2)){
                return true;
            }

            char last = sb.charAt(sb.length()-1);
            sb.deleteCharAt(sb.length()-1);
            sb.insert(0, last);
        }

        return false;

    }

    public static void main(String[] args) {
        System.out.print("Enter both strings:");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.print(isRotation(s1, s2));

    }
}