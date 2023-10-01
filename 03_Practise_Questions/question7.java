import java.util.*;
class question7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of input you give: ");
        int n = sc.nextInt();
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        System.out.println("Enter the numbers: ");
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            if(x > 0){
                countPositive++;
            } else if(x < 0){
                countNegative++;
            } else {
                countZero++;
            }
        }
        sc.close();
        System.out.println("Total number of positive number are: " + countPositive);
        System.out.println("Total number of negative number are: " + countNegative);
        System.out.println("Total number of zeros are: " + countZero);
    }
}