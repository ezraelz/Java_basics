public class Metrix{
    public void main(String[] args){
        // 2D matrix 
        int[][] matrix = {{1,3,5},{2,4,6}};

        int sums = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                sums += matrix[i][j];
                // prints in table format using "\t" 
                System.out.print(matrix[i][j] + "\t");
            }
            // Prints sum of each rows
            System.out.println("Sum of row " + i + " " + sums + " ");
        }
    }
}

