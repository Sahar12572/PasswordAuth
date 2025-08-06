
import java.util.Scanner;

public class passwordAuthenticator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.println("Enter your password:");
                String password = scanner.nextLine();

                // Password validation
                if (!isValidPassword(password)) {
                    System.out.println("""
                                       Password must be at least 8 characters long and contain:
                                       - At least one digit
                                       - At least one uppercase letter
                                       - At least one lowercase letter
                                       - At least one special character (e.g. !@#$%^&*)
                                       Please try again.""");
                    continue;
                }

                System.out.println("Please confirm your password: ");
                String confirmPassword = scanner.nextLine();

                if (!password.equals(confirmPassword)) {
                    System.out.println("Passwords do not match. Please try again.");
                    continue;
                }

                System.out.println(" Password has been successfully created!");
                break; // Password valid and confirmed
            }
        }
    }

    // Method to validate the password strength
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if ("!@#$%^&*()-_=+[]{}|;:'\",.<>?/`~\\".contains(String.valueOf(c))) {
                hasSpecial = true;
            }
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}
