import java.io.*;
import java.lang.String;
public class StringDemo {
    public static void main(String args[]) {
        String s1 = "Welcome";
        char ch[] = {'S', 'A', 'H', 'I', 'T', 'H', 'I'};
        String s2 = new String(ch);
        String s3 = new String("Example");
        
        System.out.println("String s1 is " + s1);
        System.out.println("String s2 is " + s2);
        System.out.println("String s3 is " + s3);
    }
}
