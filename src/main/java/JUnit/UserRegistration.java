package JUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private  UserRegistration() {}
    public static boolean isValidFirstName(String firstName) {
        final String regex = "^[A-Z]{1}[a-z]{2,}";
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
    public static boolean isValidLastName(String lastName) {
        final String regex = "^[A-Z]{1}[a-z]{2,}";
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();	
    }
    public static boolean isValidMobileNo(String mobileNo) {
        final String regex = "^[+]{0,1}[0-9]{2,3}[: :][7-9]{1}[0-9]{9}$";
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(mobileNo);
        return matcher.matches();
    }
    public static boolean isValidEmailId(String email) {
        final String regex =  "^[a-z]{1}[a-zA-Z0-9.+_-]+@[a-zA-Z0-9.]+[a-zA-z]{2,3}$";
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static boolean isValidPassword(String password) {
        final String regex = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>])([A-Z0-9a-z]).{8,20}$";
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
