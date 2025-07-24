package ArrayProblems;

public class Qno42 {
    public static void main(String[] args) {
         int[] arr = {10, 3, 5, 6, 20};
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int maxProduct = arr[0]*arr[1];
        System.out.println("Maximum product = " + maxProduct);
    }
    
}
