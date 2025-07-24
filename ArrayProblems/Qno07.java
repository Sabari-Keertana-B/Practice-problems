package ArrayProblems;
public class Qno07
{
    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int sum = 23;
        int curr = 0, start = 0;

        System.out.println("Method: 1");
        for (int i = 0; i < arr.length; i++) {
            curr += arr[i];
            while (curr > sum) {
                curr -= arr[start];
                start++;
            }
            if (curr == sum) {
                System.out.println((start + 1) + " " + (i + 1));
                break; //use return;
            }
        }
//        System.out.println("-1");
        
        System.out.println("Method: 2");
        int currentSum = arr[0];
        start = 0;
        for (int i = 1; i <= arr.length; i++) {
            while (currentSum > sum && start < i - 1) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == sum) {
                System.out.println( (start+1) + "," + (i));
                return;
            }

            if (i < arr.length) {
                currentSum += arr[i];
            }
        }

        System.out.println("No subarray found");
    }
}
