package ArrayListProblems;

import java.util.ArrayList;

public class Qno06 {
    public static void main(String[] args) {
         ArrayList<String> myList = new ArrayList<>(); 
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
          
        System.out.println(myList);
                
        myList.set(1,"Mango");
        
        System.out.println(myList);
    }
    
}
