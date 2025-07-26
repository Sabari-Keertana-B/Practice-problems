
package StringProblems;
public class Qno44 {

    public static void main(String[] args) {
         String input = "Java Java is fun";
        String[] words = new String[100];
        String word = "";
        int count = 0;

        // Split manually
        for (int i = 0; i <= input.length(); i++) {
            char ch = (i < input.length()) ? input.charAt(i) : ' ';
            if (ch != ' ') {
                word += ch;
            } else {
                if (word.length() > 0) {
                    words[count++] = word;
                    word = "";
                }
            }
        }

        // Remove duplicates and print
        System.out.print("Without duplicates: ");
        for (int i = 0; i < count; i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if (words[i].equals(words[j])) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                System.out.print(words[i] + " ");
            }
        }
        System.out.println();
    }
    
}
