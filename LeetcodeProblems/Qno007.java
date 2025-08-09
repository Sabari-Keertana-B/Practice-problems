//7. Reverse Integer
package LeetcodeProblems;

public class Qno007 {

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
    public static int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            int newReversed = reversed * 10 + digit;

            if ((newReversed - digit) / 10 != reversed) {
                return 0; // overflow
            }

            reversed = newReversed;
            x = x / 10;
        }

        return reversed;
    }
    
}
