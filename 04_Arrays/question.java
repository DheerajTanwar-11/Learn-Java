// Take an array as input from user. Search for a given number x and print the index at which it is present.
import java.util.*;
class question{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the elements in array:");
        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter the number x to find in array: ");
        int x = sc.nextInt();
        sc.close();
        for(int i = 0; i <  size; i++){
            if(x == numbers[i]){
                System.out.println("Element " + x + " found at index: " + i);
            } else if(i == ( size - 1)){
                System.out.println("Element not present in the array.");
            }
        }
    }
}