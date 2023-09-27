// Make a function to add two number...

import java.util.*;

class question1{
    public static int sumNumber(int number1, int number2){
        int sum = number1 + number2;
        return sum;  
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the number 2: ");
        int number2 = sc.nextInt();
        sc.close();
        System.out.println("Sum of two number is: " + sumNumber(number1, number2));
    }
}