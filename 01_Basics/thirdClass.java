// Here we are learning about conditional statement...
import java.util.*;
class thirdClass{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        // Using If Else Statement
        if (age > 18){
            System.out.println("You are an adult");
        } else{
            System.out.println("You are not adult");
        }
        if(number % 2 == 0){
            System.out.println("Given number is even.");
        } else{
            System.out.println("Given number is odd.");
        }
        // Question Time
        System.out.println("################Question Time################################");
        System.out.print("Enter number a: ");
        int a = sc.nextInt();
        System.out.print("Enter the number b : ");
        int b = sc.nextInt();
        if(a == b){
            System.out.println("Both number are equal");
        }else if(a > b){
            System.out.println("a is Greater");
        }else{
            System.out.println("a is Smaller");
        }
        System.out.println("#################Switch Statement##################################");
        System.out.print("Enter the value of button: ");
        int button = sc.nextInt();
        switch(button){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Pranam");
            break;
            default: System.out.println("Invalid Button");
        }
        sc.close();
    }
}