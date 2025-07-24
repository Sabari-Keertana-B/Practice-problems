package ArrayProblems;

public class Qno13 {
    public static void main(String[] args) {

        String seats = "100000101";
        int max = 0, last = -1;

        for (int i = 0; i < seats.length(); i++) {
            if (seats.charAt(i) == '1') {
                if (last == -1)
                    max = i;
                else
                    max = Math.max(max, (i - last) / 2);
                last = i;
            }
        }

        max = Math.max(max, seats.length() - 1 - last);
        System.out.println(max);
    }
}
