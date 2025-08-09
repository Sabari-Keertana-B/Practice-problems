
package ArrayListProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class Qno15 {
    public static void main(String[] args) {
        ArrayList<Integer> colors = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        
        Object[] arr = colors.toArray();
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
