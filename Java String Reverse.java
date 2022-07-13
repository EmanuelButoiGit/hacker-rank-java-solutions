import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean notPalindorme = false;
        
        for(int i = 0; i < A.length(); i++){
            if(A.charAt(i) != A.charAt(A.length() - i - 1)){
                notPalindorme = true;
                break;
            }    
        }
        
        if(notPalindorme){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
        
    }
}



