/* 
1. Bit Manipulation means direct manipulation of data bits to perform operations.
2. Following manipulations can be performed => Get Bit (return specific bit), Set Bit (set specific bit), Clear Bit(Make a bit zero), Update Bit(0 to 1 or 1 to 0).
3. To perform these operations first we need to create a Bit Mask and then we perform operations between Bit Mask and Original Value to get desired result.
4. Bit Mask => 1<<i where i = position
5. Get operation => and operation between Bit Mask and Original Value
6. Set operation => or operation between Bit Mask and Original Value
7. Clear operation => and operation between not(bitmask) and original value.
*/

import java.util.*;
class basic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter the position: ");
        int pos = sc.nextInt();
        int bitmask = 1<<pos;
        int bitResult = bitmask & pos;
        if(bitResult == 0){
            System.out.println("Bit was zero.");
        } else{
            System.out.println("Bit was one.");
        }
        // Set Bit Operation
        int newNumber = bitmask | n;
        System.out.println("Your new bit is: " + newNumber);
        // Clear Bit Operation
        int clearbit = (~(bitmask)) & n;
        System.out.println("Number after making the specified bit zero: " + clearbit);
        // Update Bit Operation
        System.out.print("Enter the update status: ");
        int updateStatus = sc.nextInt();
        if(updateStatus == 1){
            System.out.println(bitmask | n);
        } else{
            System.out.println((~(bitmask)) & n);
        }
    }
}
