package StringProblems;

public class Qno31 {
    public static void main(String[] args) {
        String s = "abaxyzzyxf";
        int maxLength = 0;
        int startIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            // Odd length palindrome
            int left = i, right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    startIndex = left;
                }
                left--;
                right++;
            }

            // Even length palindrome
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    startIndex = left;
                }
                left--;
                right++;
            }
        }

        // Print result
        String result = "";
        for (int i = startIndex; i < startIndex + maxLength; i++) {
            result += s.charAt(i);
        }

        System.out.println("Longest Palindromic Substring: " + result);
    }
    
}

//O(n^2)  O(1)