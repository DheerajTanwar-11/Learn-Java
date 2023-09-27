import java.util.*;
class floydsTriangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();
        int number = 1;
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
