//Qno58. Legth of Last Word
package LeetcodeProblems;

public class Qno058 {

    public static void main(String[] args) {
        String s = "   fly me   to   the moon   ";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        int length = 0;
        boolean counting = false;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                counting = true;
                length++;
            } else {
                if (counting) break; 
            }
        }

        return length;
    }
}
