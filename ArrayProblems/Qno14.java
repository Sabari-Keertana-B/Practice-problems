package ArrayProblems;

public class Qno14 {

    public static void main(String[] args) {
        
        int[] arr = {2, 1, 6, 4};
        int n = arr.length;
        int res = 0;
        
        // Try removing each element one by one
        for (int i = 0; i < n; i++) {
            int evenSum = 0, oddSum = 0;
            int index = 0;
            
            // Calculate sum of even and odd indexed elements
            // after removing element at index i
            for (int j = 0; j < n; j++) {
                
                // Skip the removed element
                if (j == i) continue; 
                
                if (index % 2 == 0) {
                    evenSum += arr[j];
                } 
                else {
                    oddSum += arr[j];
                }
                index++;
            }
            
            // Check if even sum equals odd sum
            if (evenSum == oddSum) {
                res++;
            }
        }
        
        System.out.println(res);
        
    }
    
}
