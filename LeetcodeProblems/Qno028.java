//Qno28. Find the Index of the First Occurrence in a String
package LeetcodeProblems;

public class Qno028 {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        
        System.out.println(strStr(haystack, needle));
    }
    
    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (m == 0) return 0;

        for (int i = 0; i <= n - m; i++) {
            boolean isFound = true;

            for (int j = 0; j < m; j++) {
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    isFound = false;
                    break;
                }
            }

            if (isFound) {
                return i; // full match found at index i
            }
        }

        return -1; // needle not found

    }
}
