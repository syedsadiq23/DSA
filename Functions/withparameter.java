
import java.util.*;
public class withparameter {
    public static int calculateSum(int a,int b){  //formal parameters (these are in the function)
        int Sum=a+b;
        System.out.println("The sum of two numbers is:"+Sum);
        return Sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();
        calculateSum(a,b);  //actual parameters(during function call)
    }
    
}
