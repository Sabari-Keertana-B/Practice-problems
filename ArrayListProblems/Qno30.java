package ArrayListProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class Qno30 {
    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        
        for(int num: num1){
            if(num%2==0){
                System.out.print(num+" ");
            }
        }
    }
    
}
