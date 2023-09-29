// Write a function which takes 2 number and return greater number.

import java.util.*;
class question3{
    public static void maxNum(int number1, int number2){
        if(number1 > number2){
            System.out.println("Greater number is: " + number1);
            return;
        } else if(number1 < number2){
            System.out.println("Greater number is: " + number2);
            return;
        } else{
            System.out.println("Both number are equal.");
            return;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the number2: ");
        int number2 = sc.nextInt();
        sc.close();
        maxNum(number1, number2);
    }
}