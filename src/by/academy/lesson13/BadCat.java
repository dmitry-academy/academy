package by.academy.lesson13;

public class BadCat {

    private String nickname;
    private int age;

    public BadCat(String s, int age) {
        this.nickname = s;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }


    @Override
    public String toString() {
        return "BadCat{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }
}
