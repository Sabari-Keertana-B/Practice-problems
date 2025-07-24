package ArrayProblems;
import java.util.Arrays;
public class Qno12 {   
    public static void main(String[] args) {
        int[] a = {-5, 3, 6, 12, 15};
        int[] b = {-12, -10, -6, -3, 4, 10};
        int[] c = new int[a.length + b.length];
        
        for(int i=0;i<a.length;i++){
            c[i] =a[i];
        }
        for(int i=0;i<b.length;i++){
            c[i+a.length]=b[i];
        }
   
        int n = c.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(c[j]>c[j+1]){
                    int temp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp;
                }
            }
        }
            
        if (n % 2 == 0)
            System.out.println((c[n / 2 - 1] + c[n / 2]) / 2.0);
        else
            System.out.println(c[n / 2]);
    }
}
