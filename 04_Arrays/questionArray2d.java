import java.util.*;
class questionArray2d{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements in array: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your matrix is: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Enter the element to find: ");
        int x = sc.nextInt();
        sc.close();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(matrix[i][j] == x){
                    System.out.println("Element found at index: " + i + "," +j);
                }
            }
        }
    }
}