package ArrayProblems;

public class Qno04 {

    public static void main(String[] args) {
        int arr1[] = {1,22,3,79,4,12,6};
        int n = 7;
        int d = 14;
        d = d%n;
        for(int i=d;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        for(int i=0;i<d;i++){
            System.out.print(arr1[i]+" ");
        }
    }
    
}
