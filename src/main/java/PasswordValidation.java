public class PasswordValidation {

    public static void main(String[] args) {
        String pw = "ABG3fdghDF";
/*        System.out.println(checkLength("test1234"));
        String pw = "ab3deFgh";
        String testKlein = "te3st";
        String upperTest = testKlein.toUpperCase();
        System.out.println(upperTest);
        System.out.println(Character.isLowerCase(pw.charAt(2)));*/
        System.out.println(passwordValidation(pw));
    }

    public static boolean checkLength(String pw) {
        return pw.length() >= 8;
    }

    public static boolean containsNumbers(String pw) {
        for (int i = 0; i < pw.length(); ++i) {
            if (Character.isDigit(pw.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsLower(String pw) {
        for (int i = 0; i < pw.length(); ++i) {
            if (Character.isLowerCase(pw.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsUpper(String pw) {
        for (int i = 0; i < pw.length(); ++i) {
            if (Character.isUpperCase(pw.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static String passwordValidation(String pw) {
/*        String fail1 = "contain at least 8 characters";
        String fail2 = "contain at least 8 characters";
        String fail3 = "contain at least 8 characters";
        String fail4 = "contain at least 8 characters";*/


        if (!checkLength(pw)) {
            return "your password must contain at least 8 characters";
        }
        if (!containsNumbers(pw)) {
            return "your password must contain a digit";
        }
        if (!containsLower(pw)) {
            return "your password must contain a lower case character";
        }
        if (!containsUpper(pw)) {
            return "your password must contain an upper case character";
        }
        if (checkLength(pw) && containsNumbers(pw) && containsLower(pw) && containsUpper(pw)) {
            return "your password is valid";
        } else {
            return "your password needs at least 8 characters and one digit";
        }
    }
}


