package ArrayListProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Qno19 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(2,4,3,6,1,5));
        
        int max = Collections.max(num);
        System.out.println(max);
    }
    
}
