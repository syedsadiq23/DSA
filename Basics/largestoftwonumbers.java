import java.util.*;
public class largestoftwonumbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter the value of a:"+a);
        System.out.println("Enter the value of b:"+b);
        if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a");
        }
    }
    
}
