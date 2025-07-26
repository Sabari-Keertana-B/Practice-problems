package StringProblems;

public class Qno48 {
    public static void main(String[] args) {
        String input = "I love Java";
        String word = "", result = "";

        for (int i = 0; i <= input.length(); i++) {
            char ch = (i < input.length()) ? input.charAt(i) : ' ';
            if (ch != ' ') {
                word += ch;
            } else {
                for (int j = word.length() - 1; j >= 0; j--) {
                    result += word.charAt(j);
                }
                result += " ";
                word = "";
            }
        }

        System.out.println("Reversed words: " + result.trim());
    }
    
}
