
package ArrayListProblems;

import java.util.ArrayList;

public class Qno02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(24);
        list.add(30);
        list.add(12);
        list.add(64);
        
        System.out.println(list);
        
        list.remove(3);
        
        System.out.println(list);
    }
    
}
