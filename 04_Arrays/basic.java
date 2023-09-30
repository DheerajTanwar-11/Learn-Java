/* 
1. Array is a non primitive data structure which store same type of multiple data in it.
2. Array is declared using the syntax 'type[] arrayName = new type[size]' or 'type arrayName[] = new type[size]'.
3. For example: int[] marks = new int[3] // By this we have declared the array marks of size 3.
4. When ever we declare the array of any size, in java null value automatically assigned to each element of array.
   If array type is object, integer, string, float, boolean then value assigned will be null, 0, " ", 0.0, false respectively.
*/

import java.util.*;
class basic{
    public static void main(String args[]){
        int[] marks = new int[3]; // declaration of array
        marks[0] = 97; // Assignment of value
        marks[1] = 89;
        marks[2] = 99;
        System.out.println("Element at index 0: " + marks[0]);
        System.out.println("Element at index 1: " + marks[1]);
        System.out.println("Element at index 2: " + marks[2]);
        int marks2[] = {33,44,66};
        System.out.println("Element at index 0 of marks2: " + marks2[0]);
        System.out.println("Element at index 1 of marks2: " + marks2[1]);
        System.out.println("Element at index 2 of marks2: " + marks2[2]);
    }
}