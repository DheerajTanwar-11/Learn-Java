import java.util.*;
class question1{
    public static int average(int number1, int number2, int number3){
        int result = (number1 + number2 + number3) / 3;
        return result;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the number 2: ");
        int number2 = sc.nextInt();
        System.out.print("Enter the number 3: ");
        int number3 = sc.nextInt();
        sc.close();
        System.out.println("Average of given 3 numbers is: " + average(number1, number2, number3));

    }
}