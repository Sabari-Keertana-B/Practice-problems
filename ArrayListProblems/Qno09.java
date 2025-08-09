
package ArrayListProblems;

import java.util.ArrayList;

public class Qno09 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(); 
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        myList.add("Mango");
        
        for(int i=0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }
    }
    
}
