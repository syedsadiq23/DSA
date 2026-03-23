// // // // // class Solution {
// // // // //     public void pattern3(int n) {
// // // // //         int num=1;
// // // // //         for(int i=1;i<=n;i++){
// // // // //             for(int j=1;j<=i;j++){
// // // // //                 System.out.print(num);
// // // // //                 num++;
// // // // //             }
// // // // //             System.out.println();
// // // // //         }

// // // // //     }
// // // // //     public static void main(String args[]){
// // // // //         Solution sol=new Solution();
// // // // //         sol.pattern3(4);
// // // // //     }
// // // // // }

// // // // // class Solution {
// // // // //     public void pattern14(int n) {
        
// // // // //         for(int i=1;i<=n;i++){
// // // // //             for(char ch='A';ch<'A'+i;ch++){
// // // // //                 System.out.print(ch);
                
// // // // //             }
// // // // //             System.out.println();
// // // // //         }

// // // // //     }
// // // // //     public static void main(String args[]){
// // // // //         Solution sol=new Solution();
// // // // //         sol.pattern14(4);
// // // // //     }
// // // // // }
// // // // class Solution {
// // // //     public void pattern3(int n) {
        
// // // //         for(int i=1;i<=n;i++){
// // // //             for(int j=i;j<=i;j++){
// // // //                 System.out.print(j);
// // // //             }
// // // //             System.out.println();
// // // //         }

// // // //     }
// // // //     public static void main(String args[]){
// // // //         Solution sol=new Solution();
// // // //         sol.pattern3(4);
// // // //     }
// // // // }

// // // class Solution {
// // //     public void pattern4(int n) {
// // //         for(int i=1;i<=n;i++){
// // //             for(int j=1;j<=i;j++){
// // //                 System.out.print(i);
// // //             }
// // //             System.out.println();
// // //         }


// // //     }
// // //     public static void main(String args[]){
// // //         Solution sol=new Solution();
// // //         sol.pattern4(4);
// // //     }
// // // }

// // class Solution {
// //     public void pattern7(int n) {
// //         for(int i=1;i<=n;i++){
// //             for(int j=1;j<=n-i;j++){
// //                 System.out.print(" ");
// //             }
// //             for(int j=1;j<=(2*i)-1;j++){
// //                 System.out.print("*");
// //             }
// //             System.out.println();
// //         }
        

// //     }
// //     public static void main(String args[]){
// //         Solution sol=new Solution();
// //         sol.pattern7(4);
// //     }
// // }

// class Solution {
//     public void pattern12(int n) {
//         for(int i=1;i<=n;i++){
//             //number
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }

//             //space
//             for(int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=i;j>=1;j--){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String args[]){
//         Solution sol=new Solution();
//         sol.pattern12(4);
//     }
// }


class Solution {
    // Function to print pattern10
    public static void pattern10(int n) {
        // Outer loop for number of rows.
        for (int i = 1; i <= 2 * n - 1; i++) {

            /* stars would be equal to the
            row no. uptill first half */
            int stars = i;

            // for the second half of rotated triangle.
            if (i > n) stars = 2 * n - i;

            // for printing the stars in each row.
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            /* As soon as the stars for each iteration are printed,
            we move to the next row and give a line break */
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;

        // Create an instance of Solution class
        Solution sol = new Solution();

        sol.pattern10(N);
    }
}