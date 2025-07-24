package StringProblems;

public class Qno18 {
    public static void main(String[] args) {
        String a = "1001";
        String b = "11";

        // Convert binary strings to integers (in base 10, but treat digits manually)
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);

        int result = 0;
        int carry = 0;
        int place = 1; // used to build the binary result digit by digit

        int maxLength = Math.max(a.length(), b.length());

        for (int i = 0; i < maxLength; i++) {
            int bit1 = a1 % 10; // get last digit
            int bit2 = b1 % 10; // get last digit

            int sum = bit1 + bit2 + carry;

            int digit = sum % 2;
            carry = sum / 2;

            result = result + (digit * place);

            place *= 10;

            a1 /= 10;
            b1 /= 10;
        }

        if (carry == 1) {
            result = result + (carry * place);
        }

        System.out.println("Sum: " + result); // This is in binary forma
    }
    
}
