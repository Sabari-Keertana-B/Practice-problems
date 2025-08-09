package ArrayListProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class Qno28 {

    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(2,3,4,5,6));
        int sum =0;
        for(int num: num1){
            sum+=num;
        }
        System.out.println(sum);
    }
    
}
