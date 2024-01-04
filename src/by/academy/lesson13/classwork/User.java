package by.academy.lesson13.classwork;

import javax.management.Query;

public class User {

    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    static class Query {

        private User user;

        public Query(User user) {
            this.user = user;
        }

        public void printToLog() {
            System.out.println("пользователь c логином: " + user.login + " и паролем: " + user.password + " отправил запрос");
        }
    }

    public static void main(String[] args) {
        User user = new User("SUPER_ADMIN", "qwerty");
        user.createQuery();

        Query query = new User.Query(user);
        query.printToLog();
//        Query q2 = user.new Query();
//        q2.printToLog();
//
//        Query q3 = new User("SUPER_PUPER_ADMIN", "123").new Query();
//        q3.printToLog();

    }
}
