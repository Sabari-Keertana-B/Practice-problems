
package ArrayListProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Qno16 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Purple","Red", "Green", "Blue"));
        
        Collections.sort(colors);
        
        System.out.println(colors);
    }
    
}
