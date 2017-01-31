import java.lang.*;
import java.io.*;
import java.util.*;


public class Half_Count {

   public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int temp = n;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        if(count % 2 != 0 ){
        int halfCount = count / 2;
        int last = n % (int)Math.pow(10,halfCount+1);
        int first = n / (int)Math.pow(10,halfCount);
        System.out.println("n       = " + n);
        System.out.println("first   = " + first);
        System.out.println("last    = " + last);
        int sum = first+last;
        System.out.println("sum     = " + sum);
            
        }
        else{
            System.out.println("give only odd number of digits");
        }
            
   }
    
}