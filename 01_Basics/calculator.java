// Q. Make a calculator with operations +,-,/,* and % using switch statement.

import java.util.*;
class calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter tha value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter the operation: ");
        String operation = sc.next();
        switch(operation){
            case "+": System.out.println("Addition is: " + (a + b));
            break;
            case "-": System.out.println("Subtraction is: " + (a - b));
            break;
            case "*": System.out.println("Multiplication is: " + (a * b));
            break;
            case "/": System.out.println("Division is: " + (a/b));
            break;
            case "%": System.out.println("Remainder is: " + (a % b));
            break;
            default: System.out.println("Invalid Operation");
        }
        sc.close();
    }
}