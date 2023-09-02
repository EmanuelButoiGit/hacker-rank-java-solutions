import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        BitSet[] bitSet = new BitSet[3]; // with a 2 size array you need to decrease i/j and there it will be more computation
        bitSet[1] = b1;
        bitSet[2] = b2;
        
        while(m != 0){
            String option = scanner.next();
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            switch(option){
                case "AND":
                bitSet[i].and(bitSet[j]);
                break;
                case "OR":
                bitSet[i].or(bitSet[j]);
                break;
                case "XOR":
                bitSet[i].xor(bitSet[j]);
                break;
                case "FLIP":
                bitSet[i].flip(j);
                break;
                case "SET":
                bitSet[i].set(j);
                break;
            }
            
            System.out.println(b1.cardinality() + " " + b2.cardinality());
            m--;
        }
        
        scanner.close();
    }
}