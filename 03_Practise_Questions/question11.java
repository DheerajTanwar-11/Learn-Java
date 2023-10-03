// Q. Write a program to find if a number is power of 2 or not
import java.util.*;

class solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        if (n <= 0){
            System.out.println("Given Number is not power of 2");
        } else{
            if ((n & (n-1)) == 0){
                System.out.println("Given number is power of 2");
            }
            else{
                System.out.println("Given number is not power of 2");
            }
        }
    }
}