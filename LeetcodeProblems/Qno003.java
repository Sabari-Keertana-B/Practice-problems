// Qno3. Longest Substring without repeating characters
package LeetcodeProblems;

public class Qno003 {
    public static void main(String[] args) {
        String str ="abcabca";
        System.out.println(lengthOfLongestSubstring(str));
    }
    public static int lengthOfLongestSubstring(String s) {
      int[] lastSeen = new int[128]; 
        for (int i = 0; i < 128; i++) {
            lastSeen[i] = -1;
        }

        int maxLen = 0;
        int start = 0; 

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (lastSeen[ch] >= start) {
                start = lastSeen[ch] + 1;
            }
            lastSeen[ch] = i; 
            maxLen = (maxLen>(i - start + 1))? maxLen:(i-start+1);
        }

        return maxLen;
    }
}
