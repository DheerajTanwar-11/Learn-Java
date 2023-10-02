/*
1. Arithmetic Operators => +,-,*,/,%.
2. Incremental Operator => ++(Post Increment[Use Value, Increase Value], Pre Increment[Increase Value, Use Value]),
--(Post Decrement[Use Value, Decrease Value], Pre Decrement[Decrease Value, Use Value]))
3. Relational Operators => ==,!=,<=,>=,<<,>>.
4. Logical Operators => &&(Logical And), ||(Logical OR), !(Logical Not).
5.Bitwise Operators => &(Bitwise And), |(Bitwise Or), ^(Bitwise XOR), ~(Bitwise One's Complement).
6. Binary Left Shift(<<) & Binary Right Shift(>>).
*/

import java.util.*;
class basicOperators{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        int a = sc.nextInt();
        System.out.print("Enter the number b: ");
        int b = sc.nextInt();
        sc.close();
        System.out.println("Your Input a: " + a);
        System.out.println("Your Input b: " + b);
        System.out.println("Addition Operator: " + (a+b));// Arithmetic Operators 
        System.out.println("Subtraction Operator: " + (a-b));// Arithmetic Operators 
        System.out.println("Multiplication Operator: " + (a*b));// Arithmetic Operators 
        System.out.println("Division Operator: " + (a/b));// Arithmetic Operators 
        System.out.println("Modulo Operator: " + (a%b));// Arithmetic Operators 
        System.out.println("Pre Increment Operator: " + (++a));// Pre Increment Operator
        System.out.println("Pre Increment Operator: " + (a++));// Post Increment Operator
        System.out.println("Pre Decrement Operator: " + (--a));// Pre Decrement Operator
        System.out.println("Post Decrement Operator: " + (a--));// Post Decrement Operator
        // Relational Operators
        System.out.println("Equal Operator: " + (a==b));// Relational Operators
        System.out.println("NotEqual Operator: " + (a!=b));// Relational Operators
        System.out.println("Less Than Operator: " + (a<b));// Relational Operators
        System.out.println("Greater Than Operator: " + (a>b));// Relational Operators
        System.out.println("Less Than Or Equal To Operator: " + (a<=b));// Relational Operators
        System.out.println("Greater Than Or Equal To Operator: " + (a>=b));// Relational Operators
        // Bitwise Operators
        System.out.println("Bitwise And Operator: " + (a&b));// Bitwise Operators
        System.out.println("Bitwise Or Operator: " + (a|b));// Bitwise Operators
        System.out.println("Bitwise XOR Operator: " + (a^b));// Bitwise Operators
        System.out.println("Bitwise One's Complement Operator: " + (~a));// Bitwise Operators
        // Binary Left Shift(<<) & Binary Right Shift(>>)
        System.out.println("Binary Left Shift(<<) Operator: " + (a<<1));// Binary Left Shift(<<) Operator
        System.out.println("Binary Right Shift(>>) Operator: " + (a>>1));// Binary Right Shift(>>) Operator

    }
}