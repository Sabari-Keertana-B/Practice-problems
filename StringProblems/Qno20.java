package StringProblems;

public class Qno20 {
    public static void main(String[] args) {
        String str = "abc";
        int n = str.length();

        // Convert string to char array for easy swapping
        char[] arr = str.toCharArray();

        for (int i = 0; i < n; i++) {
            // First character
            for (int j = 0; j < n; j++) {
                if (j == i) continue;

                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;

                    // Print the permutation
                    System.out.println("" + arr[i] + arr[j] + arr[k]);
                }
            }
        }        
    }
}
