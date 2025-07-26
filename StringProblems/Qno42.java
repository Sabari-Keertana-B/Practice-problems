package StringProblems;
public class Qno42 {

    public static void main(String[] args) {
        String mainStr = "GeeksForGeeks";
        String suffix = "Geeks";

        boolean endsWith = true;
        int mainLen = mainStr.length();
        int suffixLen = suffix.length();

        if (suffixLen > mainLen) {
            endsWith = false;
        } else {
            for (int i = 0; i < suffixLen; i++) {
                if (mainStr.charAt(mainLen - suffixLen + i) != suffix.charAt(i)) {
                    endsWith = false;
                    break;
                }
            }
        }

        System.out.println("Ends with suffix: " + endsWith);
    }
    
}
