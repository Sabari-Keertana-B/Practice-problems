package ArrayProblems;
public class Qno01 {
    public static void main(String[] args) {
        int arr[] = {35, 34, 34, 33, 12, 10, 1, 1};
        int n = arr.length;

        // Step 1: Sort in descending order
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int t = arr[i]; arr[i] = arr[j]; arr[j] = t;
                }
            }
        }

        // Step 2: Find second element with frequency 1
        int count = 0;
        for (int i = 0; i < n; i++) {
            int freq = 0;
            for (int j = 0; j < n; j++)
                if (arr[i] == arr[j]) freq++;

            if (freq == 1) {
                count++;
                if (count == 2) {
                    System.out.println(arr[i]);
                    return;
                }
            }
        }

        System.out.println(-1); 
    }
}
