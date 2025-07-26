package StringProblems;

public class Qno45 {
    public static void main(String[] args) {
        String input = "abcd";
        System.out.print("ASCII Differences: ");

        for (int i = 1; i < input.length(); i++) {
            int diff = input.charAt(i) - input.charAt(i - 1);
            System.out.print(diff + " ");
        }
        System.out.println();
    }
    
}
