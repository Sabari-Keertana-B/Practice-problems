package ArrayListProblems;

import java.util.ArrayList;

public class Qno03 {
    public static void main(String[] args) {
        ArrayList<String> myStringList = new ArrayList<>(); 
        myStringList.add("Apple");
        myStringList.add("Banana");
        myStringList.add("Orange");
          
        System.out.println(myStringList);
          
        myStringList.remove("Banana");
          
        System.out.println(myStringList);
    }
    
}
