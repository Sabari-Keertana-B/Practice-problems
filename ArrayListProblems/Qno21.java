package ArrayListProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Qno21 {
    public static void main(String[] args) {
       ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue","Purple","Blue","Red","Blue"));
       
       System.out.println(Collections.frequency(colors, "Blue"));
    }
    
}
