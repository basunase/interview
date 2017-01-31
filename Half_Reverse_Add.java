import java.lang.*;
import java.io.*;
import java.util.*;
public class Half_Reverse_Add{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while(temp!=0){
            rev = rev * 10 + temp % 10;
            temp = temp /10;
        }System.out.println( "sum"+ (n + rev));
    }
}
