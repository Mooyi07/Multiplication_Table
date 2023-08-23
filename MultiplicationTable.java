public class MultiplicationTable {
    
    private int numberOfRows;
    private int numberOfColumns;
    private int multiplicationTable[][];

    //getters
    public int getNumberOfRows() {
        return numberOfRows;
    }
    public int getNumberOfColumns() {
        return numberOfColumns;
    }
    public int[][] getMultiplicationTable() {
        return multiplicationTable;
    }
    //constructors
    public MultiplicationTable(int rowCount, int columnCount){
        numberOfRows = rowCount;
        numberOfColumns = columnCount;
        multiplicationTable = new int[getNumberOfRows()][getNumberOfColumns()]; // initialize table
        generateMultiplicationTable();
    }

    private void generateMultiplicationTable() {
        for(int rowIndex = 0; rowIndex < getNumberOfRows(); rowIndex++){
            for (int columnIndex = 0; columnIndex < getNumberOfColumns(); columnIndex++){
                multiplicationTable[rowIndex][columnIndex] = (rowIndex + 1) * (columnIndex + 1);
            }
        }
    }
}