import java.util.*;

public class reversestr {

    public static void reverse(String str) {
        
        StringBuilder sb = new StringBuilder(str);

        System.out.println(sb.reverse().toString());

        }

    public static void main(String[] args) {
        System.out.print("Enter the string to reverse:");
        Scanner sc = new Scanner(System.in);
        String strr = sc.nextLine();
        reverse(strr);
    }
}