    class Pallindrome{  
     public static void main(String args[]){  
       
     int n= 132;
     int sum = 0;
    int temp = n;
     while(n>0){
         sum = sum *10;
         sum = sum + n % 10;
         n = n/10;
        }
     if (temp==sum)
     System.out.print("yse");
     else
     System.out.print("no");
     }
    }