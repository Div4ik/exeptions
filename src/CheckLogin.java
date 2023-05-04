import java.util.Locale;
import java.util.Set;

public class CheckLogin {
    public static void cheker(String login) {
        if (checkLength(login) && checkSymbols(login)) {
            System.out.println("Логин корректный");
        } else {
            throw new WrongLoginException("Логин некорректный");
        }
    }

    private static boolean checkLength(String login) {
        return login.length() <= 20;
    }

    private static boolean checkSymbols(String login) {
// Параметр Login содержит в себе только латинские буквы, цифры и знак подчеркивания.
        String s = "qwertyuiopsdfghjklzxcvbnm_1234567890";
        login = login.toLowerCase();
//petrov.123
        for (int i = 0; i < login.length(); i++) {
            String currentSymbol = Character.toString(login.charAt(i));
            if (s.contains(currentSymbol) == false) {
                return false;
            }
        }
        return true;
    }

}
