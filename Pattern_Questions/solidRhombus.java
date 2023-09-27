import java.util.*;
class solidRhombus{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();
        for(int i = 1; i <= rows; i++){
            int spaces = rows - i;
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= rows; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}