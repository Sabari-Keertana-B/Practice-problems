package ArrayProblems;
public class Qno06 {
    public static void main(String[] args) {
        int[] arr = {12, 10, 9, 45, 2, 10, 10, 45};
        
        System.out.println("Method: 1");
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(arr[i] + " ");
            }
        }
        
        System.out.println("\nMethod:2");
        boolean visited[] = new boolean[100];
        
        for(int i=0;i<arr.length;i++){
            if(visited[i])continue;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                }
            }
                System.out.print(arr[i]+" ");
        }
    }
}
