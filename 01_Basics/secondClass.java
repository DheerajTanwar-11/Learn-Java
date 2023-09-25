// Here we will learn input and output in Java.
// To give output on the console in java we use a specific line 'System.out.print(Enter what you want to print)'. 
// Here system is a class in java.

import java.util.*;
class secondClass{
    public static void main(String args[]){
        // Output
        System.out.print("Hi! My name is Dheeraj Tanwar");// This method will not give us new line after printing this line.
        // Output with New Line
        System.out.println("Hi! My name is Dheeraj Tanwar");
        System.out.print("I am learning Java.\nI love eSports.\n");
        System.out.println("###########Questions################");
        //Question time (Print Star Pattern)
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("##############Variables#######################");
        int a = 10;
        int b = 25;
        int sum = a + b;
        System.out.println(sum);
        System.out.println("##############Input#################################");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Age: ");
        int age = sc.nextInt(); // Use to take integer input
        System.out.println("Age is: " + age);
        System.out.print("Enter the Balance: ");
        float balance = sc.nextFloat(); // Use to take float input
        System.out.println("Balance is: " + balance);
        System.out.print("Enter the Name: ");
        String name = sc.next(); // Use to take a single token or word as input
        System.out.println("Name is: " + name);
        sc.nextLine();
        System.out.print("Enter Info: ");
        String info = sc.nextLine(); // use to take entire line as input.
        System.out.println("Info is: " + info);
        sc.close();
    }
}

/*Java has datatypes divided into two categories: Primitive Datatype and Non Primitive Datatype.
Primitive Dataype are : byte(1 byte), short, char(2 bytes), boolean(1 byte), int(4 byte), long(8 byte), float(4 byte) and double(8 byte).
Non Primitive Dataypes are : String, Array, Class, Object and Interface.
*/

/* Taking Input in java is little complex. To take input in java we use scanner class available in java.util. So to take input first we need to import java.util. After that we create an object of the scanner class. In scanner class we have many functions to take different type of input. */