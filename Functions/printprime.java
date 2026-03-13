import java.util.*;
public class printprime {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }

    public static void printRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
    }
    public static void main(String args[]){
        printRange(12);
    }
    
}
