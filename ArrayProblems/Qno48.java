package ArrayProblems;

public class Qno48 {

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        
        int maxSum = 0;
        int currSum = 0;

        for (int num : arr) {
            currSum = Math.max(num, currSum + num);
            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
