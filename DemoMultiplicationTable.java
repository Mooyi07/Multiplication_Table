public class DemoMultiplicationTable {

    public static void main(String args[]){
        int rows = 10;
        int cols = 10;
        MultiplicationTable mt = new MultiplicationTable(rows, cols);
        int[][] table = mt.getMultiplicationTable();
        displayTable(mt.getMultiplicationTable(), mt.getNumberOfRows(), mt.getNumberOfColumns());
    }

    private static void displayTable (int[][] table, int rows, int columns) {
        for(int rowIndex = 0; rowIndex < rows; rowIndex++){
            for(int columnIndex = 0; columnIndex < columns; columnIndex++){
                if(table[rowIndex][columnIndex] < 10){
                    System.out.print(" ");
                }
                System.out.print(table[rowIndex][columnIndex] + " ");
            }
            System.out.println("");
        }
    }
}