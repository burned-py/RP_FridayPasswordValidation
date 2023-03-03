public class PasswordValidation {

    public static void main(String[] args) {
        String pw = "ABG3DF";
/*        System.out.println(checkLength("test1234"));
        String pw = "ab3deFgh";
        String testKlein = "te3st";
        String upperTest = testKlein.toUpperCase();
        System.out.println(upperTest);
        System.out.println(Character.isLowerCase(pw.charAt(2)));*/
        System.out.println(containsLower(pw));
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
}
/*
    public static String passwordValidation (String password) {
        if (!passwordLength(password)){
            return "your password must contain at least 8 characters";
        }
        if (!containsDigit(password))
        {
            return "your password must contain a digit";
        }
        if (passwordLength(password) && containsDigit(password)){
            return "your password is valid";
        }else {
            return "your password needs at least 8 characters and one digit";
        }*/
