public class centreblock{
    public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                
                if (
                    (i == 0 && (j == 0 || j == n - 1)) ||   
                    (i == n - 1 && (j == 0 || j == n - 1)) || 
                    (i >= 1 && i <= 2 && j >= 1 && j <= 2)    
                ) {
                    System.out.print("X ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}