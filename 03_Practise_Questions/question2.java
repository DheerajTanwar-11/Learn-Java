// Write a function to add all the odd number from 1 to n.

import java.util.*;
class question2{
    public static int oddSum(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            if(i % 2 != 0){
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Sum of odd number upto given n is: " + oddSum(n));
    }
}