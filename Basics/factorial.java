import java.util.*;
public class factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int fact=1;
        System.out.println("Enter the positive number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorrial of the given number is:"+fact);

    }
    
}
