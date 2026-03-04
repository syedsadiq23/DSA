import java.util.*;
public class breaks {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter your number:");
            int n=sc.nextInt();
            if(n%10==0){
                System.out.print("Multiple of 10");
                break;
            }
        }while(true);
    }
    
}
