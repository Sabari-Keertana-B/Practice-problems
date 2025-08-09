package ArrayListProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class Qno24 {
    public static void main(String[] args) {
        ArrayList<String> sen = new ArrayList<>(Arrays.asList("b","sabari","keertana"));
        
        for(int i=0;i<sen.size();i++){
            sen.set(i, sen.get(i).toUpperCase());
        }
        
        System.out.println(sen);
    }
    
}
