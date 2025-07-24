package StringProblems;

public class Qno29 {
    public static void main(String[] args) {
        String str = "Java is a powerful language";
        int wordcount = 0;
//        boolean inWord = false;
//
//        for (int i = 0; i < input.length(); i++) {
//            char ch = input.charAt(i);
//            if (ch != ' ' && !inWord) {
//                wordCount++;
//                inWord = true;
//            } else if (ch == ' ') {
//                inWord = false;
//            }
//        }
//
//        System.out.println("Word count: " + wordCount);
        String word = "";
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ' '){
                word+=str.charAt(i);
            }
            else{
                wordcount++;
                word="";
            }
        }
        
        if (!word.equals("")) {
            wordcount++;
        }
        
        System.out.println(wordcount);
        
    }
    
}
