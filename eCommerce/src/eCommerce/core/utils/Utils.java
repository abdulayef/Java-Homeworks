package eCommerce.core.utils;

import java.util.regex.Pattern;

public class Utils {

    public static boolean checkEmail(String eMail) {

        if (eMail == null || eMail.isEmpty()) return false;

        return Pattern.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", eMail);
    }
}
