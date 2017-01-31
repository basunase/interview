import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Count_fir_sec_third {

   public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int temp = n;
        
       int [] arr = new int [20];
           while(temp!= 0){
           temp = temp/10;
           count++;
       }
       for (int i = count-1; i >=0; i--){
           int  rev = n % 10;
           n = n/10;
           arr[i] = rev;
           System.out.println(arr[i]);
   } 
       int fir = 0;
       int mid = 0;
       int las = 0;
       for (int i = 0; i<=count-1; i++){
           if (i % 3 == 0){
               fir = fir * 10 + arr[i];
           }
           else if (i % 3 == 1){
               mid = mid * 10 + arr[i];
           }
           else if (i % 3 == 2){
               las = las * 10 + arr[i];
           }   
       }
       int rev = 0;
       while (mid !=0){
           rev = rev *10 + mid %10;
           mid = mid /10;   
       } 
     System.out.println("sum ="+ "" +  (fir + rev + las) );   
   }
}