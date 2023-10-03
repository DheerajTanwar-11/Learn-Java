// Here we will learn loops in java...
class loops{
    public static void main(String args[]){
        System.out.println("############### For Loop ######################");
        // For Loop
        for(int counter = 0; counter<11; counter = counter +1){
            System.out.println(counter + ": Hello World");
        }
        // While loop
        System.out.println("########### While Loop ###################");
        int i = 0;
        while(i < 11){
            System.out.println(i + ": Hello World");
            i++;
        }
        System.out.println("############ Do While Loop ############################");
        // Do While Loop
        int x = 0;
        do{
            System.out.println(x + ": Hello World");
            x++;
        } while(x < 11);
    }
}