package ArrayListProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Qno18 {
    public static void main(String[] args) {
        ArrayList<String> num = new ArrayList<String>(Arrays.asList("Two","Four","Six","Eight"));
        
        Collections.shuffle(num);
        System.out.println(num);
    }
    
}
