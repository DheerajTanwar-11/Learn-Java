import java.util.*;
class halfPyramid{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}