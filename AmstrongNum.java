import java.util.*;
public class AmstrongNum {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int n, a, c = 0;
       n = sc.nextInt();
       int temp = n;
       
       while(n != 0){
           a = n%10;
           n = n/10;
           c = c + (a * a * a );
       }
        if (temp == c)
            System.out.println("No is AmstrongNum "+ temp);
            else
            System.out.println("No is not AmstrongNum" + temp);
   }
}