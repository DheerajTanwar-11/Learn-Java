import java.util.*;
class question2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        sc.close();
        String result = input.replace('e', 'i');
        System.out.println("Your edited string is: " + result);
    }
}