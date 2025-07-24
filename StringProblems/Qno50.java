package StringProblems;

public class Qno50 {

    public static void main(String[] args) {
        String str1 = "bcadehb";
        String str2 = "hea";

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch >= 'a' && ch <= 'z') count1[ch - 'a']++;
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (ch >= 'a' && ch <= 'z') count2[ch - 'a']++;
        }

        int deletions = 0;
        for (int i = 0; i < 26; i++) {
            if(count1[i]>count2[i]){
                deletions += count1[i] - count2[i];
            }
            else{
                deletions += count2[i] - count1[i];
            }
        }

        System.out.println("Minimum deletions: " + deletions);
    }
    
}
