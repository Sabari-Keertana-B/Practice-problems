package ArrayProblems;

public class Qno09 {

    public static void main(String[] args) {
        int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int n = arr.length;
        int [] pos = new int[10];
        int[] neg = new int[10];
        
        int j=0;
        for(int i=0;i<n;i++){
           if(arr[i]>0){
               pos[j] =arr[i];
               j++;
           } 
        }
        
        j=0;
        for(int i=0;i<n;i++){
           if(arr[i]<0){
               neg[j] =arr[i];
               j++;
           } 
        }
        
        for(int i=0;i<n;i++){
            if(pos[i]!=0){
            System.out.print(pos[i]+" ");
            }
            if(neg[i]!=0){
            System.out.print(neg[i]+" ");
            }
        }
    }
}
