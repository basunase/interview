import java.lang.*;
import java.io.*;
import java.util.*;

public class ForEach {
  public static void main(String args[]) {
    int arr[] = new int[5];
     for(int i:arr){
      System.out.println(i);
    }

    
    for(int i:arr){
      i = 1;
      System.out.println(i);
    }

    System.out.println("\n\n");

    for(int i:arr){
      System.out.println(i);
    }

  }
}