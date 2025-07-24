package ArrayProblems;

public class Qno40 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 2};
        int diff = 2;
        int n = arr.length;

        System.out.println("Method: 1");
        System.out.println("Pairs with difference " + diff + ":");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && Math.abs(arr[i] - arr[j]) == diff) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
        
        System.out.println("Method: 2");
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]-arr[j]==diff||arr[j]-arr[i]==diff){
                    System.out.print("("+arr[i]+","+arr[j]+")\n");
                }
            }
        }
        
    }
    
}
