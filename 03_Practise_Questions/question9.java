import java.util.*;
class question9{
    public static int GCD(int a, int b){
        int min = 0;
        int gcd = 0;
        if( a < b){
            min = a;
        } else{
            min = b;
        }
        for(int i = 1; i <= min; i++){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        sc.close();
        System.out.println("GCD of two number " + a + " & " + b + " is: " + GCD(a,b));
    }
}