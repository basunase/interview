import java.util.*;
public class ReverseNum{
public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int n, a, c = 0;
       n = sc.nextInt();
      
       
       while(n != 0){
         c = c*10 + n%10;
          System.out.println("No is not AmstrongNum" + c);
           n = n/10;
          System.out.println("No is not AmstrongNum" + n);
        
        
       }
            System.out.println("No is not AmstrongNum" + c);
   }
}