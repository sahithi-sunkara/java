import java.io.*;

class StringHandling{
    public static void main(String args[]){
        String s1="Welcome";
        String s2= new String("Welcome");
        String s3 ="Wel";
        boolean x =s1.equals(s2);
        System.out.println("s1 and s2 are equal: " +x);
        x =s1.equals(s3);
        System.out.println("s1 and s3 are equal: " +x);
        System.out.println("The Character at four position in s1 is: "+s1.charAt(4));
        System.out.println("Length of s1 is "+s1.length());
        System.out.println("s1 in upper case is"+s1.toUpperCase());
        System.out.println("s1 in lower case is "+s1.toLowerCase());
        System.out.println("The sub string from 2,5 in s1 is "+s1.substring(2,5));
        System.out.println("The index of 'c' in s2 is "+s2.indexOf('c'));
        System.out.println("After concating s1 and s3 is "+s1.concat(s3));
        System.out.println("After concating s3 and s1 is "+s3.concat(s1));
        System.out.println("s1 contains s3: "+s1.contains(s3));
        System.out.println("s3 contains s1: "+s3.contains(s1));
    }
}
