import java.util.*;
import java.io.*;
public class SecondLarge{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                min = max;
                max = arr[i];
            }
        }System.out.println(min);
    }
    
}