package StringProblems;

public class Qno39 {
    public static void main(String[] args) {
        String str = "I love Java";
        String strarr[]=new String[100];
        
        int wordcount =0;
        String word = "";
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ' '){
                word+=str.charAt(i);
            }
            else{
                strarr[wordcount] = word;
                wordcount++;
                word="";
            }
        }
        
        if (!word.equals("")) {
            strarr[wordcount] = word;
            wordcount++;
        }
        
        for(int i=wordcount-1;i>=0;i--){
                System.out.print(strarr[i]+" ");
        }
        
    }
    
}
