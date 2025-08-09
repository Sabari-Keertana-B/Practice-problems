package ArrayListProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class Qno26 {

    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(1,3,5));
        ArrayList<Integer> num2 = new ArrayList<>();
        
        num2.addAll(num1);
        System.out.println(num2);
    }
    
}
