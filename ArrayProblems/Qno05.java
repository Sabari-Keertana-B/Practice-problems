package ArrayProblems;

public class Qno05 {
  
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4};
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i]; // XOR logic: a^a = 0, 0^a = a
        }
        System.out.println(ans);
        
        System.out.println("Method:2");
        boolean visited[] = new boolean[100];
        
        for(int i=0;i<arr.length;i++){
            if(visited[i])continue;
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
            }
        }
    }
}

    

