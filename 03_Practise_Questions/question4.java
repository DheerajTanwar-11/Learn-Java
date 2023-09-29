// Write a function which take radius of circle as input and returns circumference.

import java.util.*;
class question3{
    public static void circumference(String radius){
        float pi = 3.14f;
        try {
            int radiusInt = Integer.parseInt(radius);
            if(radiusInt > 0){
                System.out.println("Circumference of circle is: " + (2 * pi * radiusInt));
                return;
            } else{
                System.out.println("Value of radius should be positive.");
            }
        } catch(NumberFormatException e){
            try {
                float radiusFloat = Float.parseFloat(radius);
                if(radiusFloat > 0){
                    System.out.println("Circumference of circle is: " + (2 * pi * radiusFloat));
                    return;
                } else{
                    System.out.println("Value of radius should be positive.");
                }
            } catch(NumberFormatException ex){
                System.out.println("Invalid Input");
                return;
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Radius: ");
        String radius = sc.nextLine();
        sc.close();
        circumference(radius);
    }
}