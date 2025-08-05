import java.util.*;
public class shortestRoute {

    public static void path(String str){

        int x = 0;
        int y = 0;
        for(int i = 0 ; i<str.length() ; i++){

            if(str.charAt(i) == 'W'){
                x--;
            }else if(str.charAt(i) == 'E'){
                x++;
            }else if(str.charAt(i) == 'N'){
                y++;
            }else{
                y--;
        }
    }

        int x2 = x*x;
        int y2 = y*y;

        float path = (float)Math.sqrt(x2+y2);


        System.out.println("The Shortest Path is "+ path);
    }
    

    public static void main(String[] args) {
        String route = "WNEENESENNN";

        path(route);
    }
    }

