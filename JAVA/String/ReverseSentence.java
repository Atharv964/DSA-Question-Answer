
import java.util.Stack;
import java.util.*;

public class ReverseSentence {
    
    static String reverseSent(String str){

        Stack<String> stack = new Stack<>();
        StringBuilder word = new StringBuilder();

        for(int i = 0 ; i<str.length() ; i++){

            if(str.charAt(i) != ' '){
                word.append(str.charAt(i));
            }
            else if(word.length()>0){
                stack.push(word.toString());
                word.setLength(0);
            }       
        }

        if(word.length()>0){
                stack.push(word.toString());
            }

        StringBuilder result = new StringBuilder();

        while(! stack.isEmpty()){
            result.append(stack.pop());
            if(! stack.isEmpty()){
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.print("Enter the string input in proper format :");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        
        System.out.println(reverseSent(s));



    }
}
