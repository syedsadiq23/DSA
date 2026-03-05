import java.util.*;
public class incometax {
    public static void main(String args[]){
        int income=2500000;
        if(income<500000)
            {
            System.out.println("Zero percent tax");
            }
        else if(income>500000 && income<1000000)
            {
            System.out.println("20 percent tax");      
            }
    
    else{
        System.out.println("30 percent tax ");
        }
    
}
}