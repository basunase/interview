public class Basu{
    public static void  main(String[] args){
        int x,y,r1,r2,z;
        for(int i = 1; i <= 100; i++){
            x = i;
            y = x * x;
            r1 = y % 100;
            r2 = y / 100;
            z = r1 + r2;
            
            if(x == z){
                 System.out.println(x + " yes");
                 System.out.println("x = " + x +",y = " + y +",r1 = " + r1 +",r2 = " + r2 +",z = " + z );
                 
            }
            
            else{
                 //System.out.println(x +  " no");
            }
        }
          //System.out.print(rem);
        
    }
}