package StringProblems;
public class Qno46 {
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
