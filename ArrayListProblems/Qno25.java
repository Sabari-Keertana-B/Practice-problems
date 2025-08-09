package ArrayListProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class Qno25 {
    public static void main(String[] args) {
        ArrayList<Character> alph = new ArrayList<>(Arrays.asList('A','B','C','B','A'));
        boolean flag = true;
        for(int i=0;i<alph.size();i++){
            if(alph.get(i)!=alph.get(alph.size()-i-1)){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println(flag);
        }
        else{
            System.out.println(flag);
        }
    }
    
}
