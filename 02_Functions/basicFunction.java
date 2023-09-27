// Function are the block of code that perform some operations.
/* Syntax to declare function in java: 
public static returnType functionName(type arg1, type arg2...){
    operations....
} */
// Return type can be int, string, bigint, void etc...
/* In memory when we call function they are stored in form of stack and when a function returns something then it removed from memory.*/

import java.util.*;
class basicFunction{
    public static void printMessage(String name){
        System.out.println("Welcome "  + name + "! You are entring the realm of Java....");
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        sc.close();
        printMessage(name); // Calling the function
    }
}