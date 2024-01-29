package by.academy.lesson1;

public class Cat {

    String nickname;
    int age;

    public Cat() {
        super();
    }

    public Cat(String nickname) {
        super();
        this.nickname = nickname;
    }

    public Cat(String nickname, int age) {
        super();
        this.nickname = nickname;
        this.age = age;
    }

    void eat() {
        System.out.println(nickname + " ЕСТ(" + age + ")");
    }

    void sleep() {
        System.out.println(nickname + " СПИТ(" + age + ")");
    }

    void murlikat() {
        System.out.println(nickname + " МУРЛЫКАЕТ(" + age + ")");
    }

    public int getAge() {
        return age;
    }

    public void grow() {
        age++;
        System.out.println("Happy birthday: " + age);
    }

    public String getNickname() {
        return nickname;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("alalala memory was cleared");
    }
}
