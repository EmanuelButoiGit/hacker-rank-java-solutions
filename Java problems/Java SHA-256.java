import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        /* Read and save the input String */
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        
        // Encode the String using SHA-256 
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(str.getBytes());
        byte[] digest = md.digest();
        
        // Print the encoded value in hexadecimal 
        for (byte b : digest) {
            System.out.format("%02x", b);
        }
    }
}