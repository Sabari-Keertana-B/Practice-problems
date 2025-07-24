package StringProblems;

public class Qno22 {

    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "DABC";  // change to "CDAB" to get true result
        boolean flag = false;

        int n = str1.length();
        char arr[] = str1.toCharArray();
        char arr2[] = str2.toCharArray(); 

        for (int d = 0; d < n; d++) {
            char[] arr1 = new char[n];
            int j = 0;

            // rotate str1 by d
            for (int i = d; i < n; i++) {
                arr1[j++] = arr[i];
            }
            for (int i = 0; i < d; i++) {
                arr1[j++] = arr[i];
            }

            // compare entire rotated string with str2
            boolean match = true;
            for (int i = 0; i < n; i++) {
                if (arr1[i] != arr2[i]) {
                    match = false;
                    break;
                }
            }

            if (match) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
