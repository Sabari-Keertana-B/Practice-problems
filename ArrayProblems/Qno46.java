package ArrayProblems;

public class Qno46 {
    public static void main(String[] args) {
        int[] arr = {4, -10, 2, 5, -20};
        int n = arr.length;

        int max = arr[0];
        int min = arr[0];
        int sum =0; 
        
        for(int i=0;i<n;i++){
            if(arr[i]>0){
               if(max<arr[i]){
                   max=arr[i];
               }
               if(min>arr[i]){
                   min = arr[i];
               }
               sum+=arr[i];
            }
        }
        
        int totalSum = ((max-min+1)*(max+min))/2; //Sum = (number of terms) * (first + last) / 2
        
        System.out.println(totalSum-sum);
    }
    
}
