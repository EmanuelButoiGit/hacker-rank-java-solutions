import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static class Shape{
    private int length;
    private int breadth;
    
    Shape(){
        
    }
    
    Shape(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    
    public void area(){
        System.out.println(length + " " +breadth);
    }
    
    public int getLength(){
        return length;
    }
    
    public int getBreadth(){
        return breadth;
    }
}

    public static class Rectangle extends Shape{
        Rectangle(int length, int breadth){
            super(length, breadth);
        }
        
        @Override
        public void area(){
            System.out.println(super.getBreadth() * super.getLength());
        }
    }
    
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  lines = br.readLine();    
        
        String[] strs = lines.trim().split("\\s+");
        int inputs[];
        inputs = new int[2];
        
        for (int i = 0; i < strs.length; i++) {
            inputs[i] = Integer.parseInt(strs[i]);
        }
        
        
        Rectangle rectangle = new Rectangle(inputs[0], inputs[1]);
        System.out.println(inputs[0] + " " + inputs[1]);
        rectangle.area();
    }
}