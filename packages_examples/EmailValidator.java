package packages_examples;

import java.util.regex.*;

public class EmailValidator {
    public static void main(String[] args) {
        String[] emails = {
                "example@example.com",  // Valid
                "test.email@domain.co", // Valid
                "invalidemail.com",     // Invalid
                "test@.com",            // Invalid
                "user@domain",          // Invalid
                "user@domain.c"         // Invalid
        };

        // Regular expression for email validation
        String pattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";

        // Compile the pattern
        Pattern compiledPattern = Pattern.compile(pattern);

        for (String email : emails) {
            Matcher matcher = compiledPattern.matcher(email);
            if (matcher.matches()) {
                System.out.println(email + " is a valid email address.");
            } else {
                System.out.println(email + " is an invalid email address.");
            }
        }
    }
}
