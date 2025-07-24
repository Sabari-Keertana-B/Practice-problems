/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package StringProblems;

/**
 *
 * @author Admin
 */
public class Qno46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "PAYPALISHIRING";
        int numRows = 3;

        if (numRows == 1) {
            System.out.println(input);
            return;
        }

        String[] rows = new String[numRows];
        for (int i = 0; i < numRows; i++) rows[i] = "";

        int currentRow = 0;
        boolean goingDown = false;

        for (int i = 0; i < input.length(); i++) {
            rows[currentRow] += input.charAt(i);
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
        }

        String result = "";
        for (int i = 0; i < numRows; i++) {
            result += rows[i];
        }

        System.out.println("Zigzag Conversion: " + result);
    }
    
}
