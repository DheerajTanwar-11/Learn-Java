// Write a function which take age as input and tell if person in eligible for vote or not.

import java.util.*;
class question5{
    public static void voteEligibility(int age){
        if(age >= 18){
            System.out.println("You are eligible for vote.");
            return;
        } else{
            System.out.println("You are not eligible for vote.");
            return;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.close();
        voteEligibility(age);
    }
}