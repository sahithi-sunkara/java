import java.io.*;
import java.util.*;
class MatrixAddition {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter order of 1st matrix:");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int A[][]=new int[r1][c1];
        System.out.println("Enter order of 2nd matrix:");
        int r2=sc.nextInt();
        int c2=sc.nextInt();     
        int B[][]=new int[r2][c2];
        if((r1!=r2)&&(c1!=c2)) {
            System.out.println("Matrix addition not possible-order of matrix doesnot match");
            System.exit(0);
        }
        else {
            System.out.println("Enter "+(r1*c1)+" elements into 1st matrix:");
            for(int i=0;i<r1;i++) {
                for(int j=0;j<c1;j++) {
                    A[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter "+(r2*c2)+" elements into 2nd matrix:");
            for(int i=0;i<r2;i++) {
                for(int j=0;j<c2;j++) {
                    B[i][j]=sc.nextInt();
                }
            }
            int C[][]=new int[r1][r2];
            for(int i=0;i<r1;i++) {
                for(int j=0;j<c1;j++) {
                    C[i][j]=A[i][j]+B[i][j];
                }
            }
            System.out.println("After summation the resultant matrix is:");
            for(int i=0;i<r1;i++) {
                for(int j=0;j<c1;j++) {
                    System.out.print(C[i][j]+" ");
                }
                System.out.println();
            }                        
        }
    }
}
