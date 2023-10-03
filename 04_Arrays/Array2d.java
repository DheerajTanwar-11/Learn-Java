/*
1. 2D array is a datastructure similar to matrix in maths. 2D array consist of rows and columns.
2. To declare a 2d array : 'type[][] arrayName = new type[row][column]'.
3. For Example : int[][] 2dArray = new int[2][3]. 
4. Total number of element in 2d array = row * column. 
*/

class Array2d{
    public static void main(String args[]){
        int[][] matrix = new int[2][2];
        matrix[0][0] = 2;
        matrix[0][1] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        System.out.println("Element at index(0,0): " + matrix[0][0]);
        System.out.println("Element at index(0,1): " + matrix[0][1]);
        System.out.println("Element at index(1,0): " + matrix[1][0]);
        System.out.println("Element at index(1,1): " + matrix[1][1]);
    }
}