import java.util.*;
public class factorial {
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
            
        }
        return f;
         }

         public static int binomialcoeff(int n,int r){
           int  n_fact=fact(n);
           int  r_fact=fact(r);
           int  nmr_fact=fact(n-r);

           int bc=n_fact/(r_fact*nmr_fact);
           return bc;
         }
         public static void main(String args[]){
           System.out.println(binomialcoeff(5,4));
         }
    
}
