/* 
1. String is a non primitive datastructure that stores sentences.
2. Declaration of String: 'String stringName = "Enter the string".'
*/

import java.util.*;
class basic{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string 1: ");
        String name = sc.nextLine();
        System.out.print("Enter your string 2: ");
        String name2 = sc.nextLine();
        sc.close();
        System.out.println("Your name is: " + name);
        System.out.println("Length of string is: " + name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.compareTo(name2));
        System.out.println(name.substring(0, 7));
        System.out.println(name.hashCode());
    }
}