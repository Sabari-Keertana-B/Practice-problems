
package ArrayListProblems;

import java.util.ArrayList;

public class Qno12 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(); 
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        
        ArrayList<String> myList1 = new ArrayList<>(); 
        myList1.add("Apple");
        myList1.add("Mango");
        
        myList.removeAll(myList1);
        
        System.out.println(myList);
    }
    
}
