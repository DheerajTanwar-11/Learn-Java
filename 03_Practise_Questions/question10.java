import java.util.*;
class question10{
    public static void fibonacciSeries(int n){
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        System.out.print("0 1 ");
        for(int i = 2; i <= n; i++){
            n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + " ");
        }
        System.err.println();
        return;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();
        System.out.print("Fibonacci series upto " + n + ": ");
        fibonacciSeries(n);
    }
}