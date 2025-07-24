package StringProblems;

public class Qno34 {
    public static void main(String[] args) {
        String str = "Geeks";
        boolean isAlphabet = true;
        
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(!((c>='a'&&c<='z')||(c>='A'&&c<='Z'))){
                isAlphabet=false;
                break;
            }
        }
        if(isAlphabet){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    
}
