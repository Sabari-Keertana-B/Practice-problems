package StringProblems;

public class Qno28 {
    public static void main(String[] args) {
        String sentence = "I love programming in Java";
        String longest = "";
        String current = "";

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch != ' ') {
                current += ch;
            } else {
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "";
            }
        }

        System.out.println("Longest word: " + longest);
    }
    
}
