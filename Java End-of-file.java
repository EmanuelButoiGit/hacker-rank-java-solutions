import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 1; scanner.hasNext()== true; i++){
            System.out.println(i + " " + scanner.nextLine());    
        }
    }
}