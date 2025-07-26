package StringProblems;

public class Qno49 {
    public static void main(String[] args) {
        String input = "Java is great. It is used worldwide! Do you know it?";
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '.' || ch == '!' || ch == '?') {
                count++;
            }
        }

        System.out.println("Number of sentences: " + count);
    }
    
}
