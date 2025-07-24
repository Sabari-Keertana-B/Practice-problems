package StringProblems;

public class Qno19 {
    public static void main(String[] args) {
        String ip = "125.512.100.1";
        String[] parts = ip.split("\\.");

        if (parts.length != 4) {
            System.out.println("Invalid");
            return;
        }

        boolean valid = true;

        for (int i = 0; i < 4; i++) {
            try {
                int num = Integer.parseInt(parts[i]);

                if (num < 0 || num > 255) {
                    valid = false;
                    break;
                }

            } catch (Exception e) {
                valid = false;
                break;
            }
        }

        if (valid) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
    
}
