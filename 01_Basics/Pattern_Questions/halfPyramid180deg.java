import java.util.*;
class halfPyramid180deg{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < (rows - (i+1)); j++){
                System.out.print(" ");
            }
            for(int j = (rows-(i+1)); j < rows; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}