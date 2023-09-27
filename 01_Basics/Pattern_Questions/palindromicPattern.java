import java.util.*;
class solidRhombus{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= rows - i; j++ ){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j-- ){
                System.out.print(j);
            }
            for(int j = 2; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}