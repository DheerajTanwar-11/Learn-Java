import java.util.*;
class question{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size for array: ");
        int size = sc.nextInt();
        String [] stringArray = new String[size];
        System.out.println("Enter the elements in array: ");
        int stringLength = 0;
        for(int i = 0; i < size; i++){
            stringArray[i] = sc.nextLine();
            stringLength += stringArray[i].length();
        }
        sc.close();
        System.out.println(stringLength);
    }
}