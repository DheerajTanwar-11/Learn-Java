import java.util.*;
class loops_question{
    public static void main(String args[]){
        // Q. Sum of firtst n natural number.
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("The sum of " + n + " natural numbers is: " + sum);
        System.out.println("################ Question 2: Program to make table of a number. ###############################");
        for(int i = 1; i < 11; i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }
        System.out.println("############# question 3: print even number till n. ##########################");
        for(int i = 0; i <= n; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}