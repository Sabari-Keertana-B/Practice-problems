package ArrayProblems;

public class Qno10 {

    public static void main(String[] args) {
       
        int[] arr = {10, 11, 12};
        int[] index = {1, 0, 2};
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ans[index[i]] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
           System.out.print(ans[i]+" ");
       }
    }
}

