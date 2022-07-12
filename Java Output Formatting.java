import java.util.Scanner;

public class Solution {
    
    public static int getNrOfDigits(int x){
        int nrOfDigits = 0;
        if(x == 0){
            return 1;
        }
        while(x != 0){
            x /= 10;
            nrOfDigits++;
        }
        return nrOfDigits;
    }
    
    public static String addSomething(int nrOfDigits, String something){
        String remainingOutput = ""; 
        while(nrOfDigits!=0){
            remainingOutput +=something;
            nrOfDigits--;
        }
        return remainingOutput;
    }
    
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                int nrOfDigits = getNrOfDigits(x);
                int nrOfBlank = 15 - s1.length();
                
                System.out.println(s1 + addSomething(nrOfBlank, " ") + addSomething(3 - nrOfDigits, "0") + x);
            }
            System.out.println("================================");

    }
}



