import java.util.*;
// // Soultion 1
// class hollowRectangle{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int rows = sc.nextInt();
//         System.out.print("Enter the number of columns: ");
//         int columns = sc.nextInt();
//         sc.close();
//         for(int i = 0; i < rows; i++){
//             if(i == 0 || i == (rows-1)){
//                 for(int j = 0; j < columns; j++){
//                     System.out.print("*");
//                 }
//             } else{
//                 for(int j = 0; j < columns; j++){
//                     if (j == 0 || j == (columns-1)){
//                         System.out.print("*");
//                     } else{
//                         System.out.print(" ");
//                     }
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// // Solution 2
class hollowRectangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        sc.close();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(i == 0 || j == 0 || i == (rows-1) || j == (columns-1)){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}