import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        int arraySize = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        while(arraySize != 0){
            arrayList.add(scanner.nextInt());
            arraySize--;
        }
        
        int q = scanner.nextInt();
        String command = "";
        while(q != 0){
            command = scanner.next();
            if(command.equals("Insert")){
                arrayList.add(scanner.nextInt(), scanner.nextInt());
            }
            else if(command.equals("Delete")){
                arrayList.remove(scanner.nextInt());
            }
            q--;
        }
        
        for (Integer element : arrayList) {
            System.out.print(element + " ");
        }
        
    }
}