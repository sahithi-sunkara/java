import java.io.*;
import java.lang.String.*;
import java.util.*;
class StringConcateDemo{
    public static void main(String args[]){
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1.concat(s2);
        System.out.println("The result of s1 concate s2 is "+s3);
        String s4 = "sasi site welcome Hello";
        String s5 = s4 +" Wel "+ s2;
        System.out.println("The result of s4 joining s2 is "+s5);
        System.out.println("The result of s1+s2 is "+(s1+s2));
    }
}
