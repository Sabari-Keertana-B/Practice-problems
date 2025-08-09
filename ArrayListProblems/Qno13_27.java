package ArrayListProblems;

import java.util.ArrayList;

public class Qno13_27 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(); 
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Mango");
        
        ArrayList<String> myList1 = new ArrayList<>(); 
        myList1.add("Apple");
        myList1.add("Mango");
        
        myList.retainAll(myList1);
        
        System.out.println(myList);
    }
    
}
