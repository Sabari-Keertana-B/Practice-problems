package ArrayListProblems;

import java.util.ArrayList;

public class Qno11 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(); 
        myList.add("Apple");
        myList.add("Banana");
        
        ArrayList<String> myList1 = new ArrayList<>(); 
        myList1.add("Orange");
        myList1.add("Mango");
        
        myList.addAll(myList1);
        System.out.println(myList);
    }
    
}
