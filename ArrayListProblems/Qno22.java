package ArrayListProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Qno22 {
    public static void main(String[] args) {
        ArrayList<Character> alph = new ArrayList<>(Arrays.asList('A','B','A','D'));
        
        Set<Character> set = new HashSet<>(alph);
        
        System.out.println("ArrayList: " + alph);
        System.out.println("Set: " + set);
    }
    
}
