public class StringReverse{
    public static void  main(String[] args){
        String stuff = "i am basu";
        String [] mylist = stuff.split(" ");
        System.out.println(stuff);
        System.out.println(mylist.length);
        
        for(int s = mylist.length - 1, e = 0;  s >= e  ; s--){
            System.out.print(mylist[0] + " ");
        }
           
          //System.out.print(rem);
        
    }
}
