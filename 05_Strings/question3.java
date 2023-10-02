import java.util.*;
class question3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the valid email: ");
        String email = sc.nextLine();
        sc.close();
        String userName = email.substring(0, email.indexOf('@'));
        System.out.println(userName);
    }
}