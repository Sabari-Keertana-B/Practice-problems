package ArrayListProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Qno23 {
    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(1,3,5));
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(2,4,6));
        
        num1.addAll(num2);
        Collections.sort(num1);
        System.out.println(num1);
    }
    
}
