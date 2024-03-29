package by.academy.lesson15.exception.classwork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginDemo {

    private static Pattern VALIDATION = Pattern.compile("\\w{3,20}");

    public static void main(String[] args) {
//        enterCredentials();

        login("user", "password");
    }

    public static void login(String username, String password) {

        // check nulls

        Map<String, String> users = new HashMap<>();
        users.put("1", "2");

        if (users.containsKey(username) && password.equals(users.get(username))) {
            System.out.println("Вы вошли в систему");
        } else {

        }


    }

    public static boolean enterCredentials() {

        Scanner sc = new Scanner(System.in);

        String login = sc.next();
        String password = sc.next();
        String repeatPassword = sc.next();
        try {
            registration(login, password, repeatPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
            return false;
        } finally {
            sc.close();
        }
        return true;
    }

    public static void registration(String login, String password, String repeatPassword)
            throws WrongLoginException, WrongPasswordException {

        Matcher mLogin = VALIDATION.matcher(login);

        if (login == null || !mLogin.matches()) {
            throw new WrongLoginException("Wrong login: " + login);
        }

        Matcher pasMatcher = VALIDATION.matcher(password);
        if (password == null || !pasMatcher.matches()) {
            throw new WrongPasswordException("Wrong password: " + password);
        }
        if (!password.equals(repeatPassword)) {
            throw new WrongPasswordException("Passwords doesn't match: " + password + " " + repeatPassword);
        }

        System.out.println("Save user to database! alala ");
    }
}
