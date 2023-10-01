import java.util.*;
class question8{
    public static int calculatePower(int number, int power){
        int result = number;
        for(int i = 1; i < power; i++){
            result *= number;
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        sc.close();
        System.out.println(number + "^" + power + "= " + calculatePower(number,power));
    }
}