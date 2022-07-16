import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        if(a.length() != b.length()){
            return false;
        }
        
        java.util.Hashtable<Character, Integer> freqOfA = new java.util.Hashtable<>();
        java.util.Hashtable<Character, Integer> freqOfB = new java.util.Hashtable<>();
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        for(Character i = 'a'; i <= 'z'; i++){
            freqOfA.put(i, 0);
            freqOfB.put(i, 0);
        }
        
        for(int i = 0; i < a.length(); i++){
            freqOfA.replace(a.charAt(i), freqOfA.get(a.charAt(i)), freqOfA.get(a.charAt(i)) + 1);
            freqOfB.replace(b.charAt(i), freqOfB.get(b.charAt(i)), freqOfB.get(b.charAt(i)) + 1);
        }
        
        for(Character i = 'a'; i <= 'z'; i++){
            if(freqOfA.get(i) != freqOfB.get(i)){
                return false;
            }
        }
        
        return true;        
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
