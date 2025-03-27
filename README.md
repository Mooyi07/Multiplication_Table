# Multiplication Table Generator  

## 📌 Description  
This Java program generates a **multiplication table** of a specified number of rows and columns. It uses a 2D array to store the results and provides methods to retrieve the table dimensions and data.  

## 🛠 Features  
- Generates a multiplication table dynamically based on user input.  
- Uses encapsulation with **getters** for table properties.  
- Provides a structured and efficient way to compute multiplication values.  

## 📺 File Structure  
- `MultiplicationTable.java` – Defines the `MultiplicationTable` class with:  
  - Private fields for rows, columns, and table storage.  
  - A constructor to initialize the table size.  
  - A method to generate multiplication values.  

## 🚀 Usage  
1. **Compile the Java file:**  
   ```sh
   javac MultiplicationTable.java
   ```
2. **Integrate with a main program:**  
   ```java
   public class Main {
       public static void main(String[] args) {
           MultiplicationTable table = new MultiplicationTable(5, 5);
           int[][] result = table.getMultiplicationTable();
           for (int[] row : result) {
               for (int value : row) {
                   System.out.print(value + "\t");
               }
               System.out.println();
           }
       }
   }
   ```
3. **Run the program:**  
   ```sh
   java Main
   ```

## 📌 Example Output (5x5 Table)  
```
1   2   3   4   5  
2   4   6   8   10  
3   6   9   12  15  
4   8   12  16  20  
5   10  15  20  25  
```

## 🐜 License  
This project is open-source and free to use.  

