package by.academy.lesson2.example;

// определяем новый класс Dog, это класс entity (сущность), мы не пишет тут никакой логики выполняемой НАД собакой
// например создание Dog, вызов метода экземпляра класса Dog и тд.
public class Dog {

    // создаем поля (свойства)
    private String nickname;
    private int age;
    private String color;

    // конструктор по умолчанию, без параметров
    public Dog() {
        super();
    }

    // конструктор с параметром
    public Dog(String nickname) {
        super();
        // присваиваем переданное nickname значение при создании экземпляра класса Dog
        this.nickname = nickname;
    }

    // конструктор с 3мя параметрами
    public Dog(String nickname, int age, String color) {
        super();
        // присваиваем переданное nickname значение при создании экземпляра класса Dog
        this.nickname = nickname;
        // присваиваем переданное age значение при создании экземпляра класса Dog
        this.age = age;
        // присваиваем переданное nickname значение при создании экземпляра класса Dog
        this.color = color;
    }

    public void eat() {
        System.out.println(color + " собака по кличке " + nickname + " ест");
    }

    public void serve() {
        System.out.println(color + " собака по кличке " + nickname + " служит");
    }

    public void sleep() {
        System.out.println(color + " собака по кличке " + nickname + " спит");
    }

    // метод гетер, для чтения параметра nickname класса Dog
    public String getNickname() {
        return nickname;
    }

    // метод сетер, для изменения параметра nickname класса Dog
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    // метод гетер, для чтения параметра age класса Dog
    public int getAge() {
        return age;
    }

    // метод сетер, для изменения параметра age класса Dog
    public void setAge(int age) {
        this.age = age;
    }

    // метод гетер, для чтения параметра color класса Dog
    public String getColor() {
        return color;
    }

    // метод сетер, для изменения параметра color класса Dog
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
