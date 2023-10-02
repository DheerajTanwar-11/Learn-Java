/*
1. String Builder is class in java similar to String class. The only difference between them is that String Builder is Mutable and String is immutable.
2. Java introduced StringBuilder to overcome the problem of immutability os String.
*/

import java.util.*;

class stringBuilder{
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        System.out.println(sb.append("! Dheeraj"));
    }
}