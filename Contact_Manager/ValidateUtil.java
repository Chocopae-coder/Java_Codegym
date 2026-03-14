package Contact_Manager;

public class ValidateUtil {
    public static boolean isPhone(String phone) {
        return phone.matches("^0[0-9]{9}$");
    }

    public static boolean isEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

}

