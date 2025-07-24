package ArrayProblems;

public class Qno08 {

    public static void main(String[] args) {
        int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int n = arr.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) ans[i] = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] != -1 && arr[i] < n) {
                ans[arr[i]] = arr[i];
            }
        }

       for (int i = 0; i < n; i++) {
           System.out.print(ans[i]+" ");
       }
    }
}


