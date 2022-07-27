package javatests.util;

public class PasswordUtil {

    public enum SecurityLevel {
        WEAK, MEDIUM, STRONG
    }

    public static SecurityLevel assessPassword(String password){

        if (password.length() < 8) {
            return SecurityLevel.WEAK;
        }

        if (password.matches("[a-z A-Z]+")){ //The + sign means that it can have multiple characters of the regular expression
            return SecurityLevel.WEAK;
        }

        if (password.matches("[a-zA-Z0-9]+")){
            return SecurityLevel.MEDIUM;
        }

        return SecurityLevel.STRONG;

    }
}
