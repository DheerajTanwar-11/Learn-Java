// Make function to find factorial....

import java.util.*;
class question2{
    public static int factorial(int number){
        int result = 1;
        if(number == 0 || number == 1){
            return result;
        } else {
            for(int i = 1; i <= number; i++){
                result = result*i;
            }
            return result;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int number = sc.nextInt();
        sc.close();
        if(number < 0){
            System.out.println("Invalid Input");
        } else{
            System.out.println("Factorial of the given input is: " + factorial(number));
        }
    }
}