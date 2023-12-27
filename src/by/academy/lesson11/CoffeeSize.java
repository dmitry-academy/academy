package by.academy.lesson11;

public enum CoffeeSize implements Coffee {
    BIG(350, "Brazil"),
    HUGE(500),
    OVERWHELMING(1000);

    private int ml;
    private String producer;

    CoffeeSize(int ml) {
        this.ml = ml;
    }

    CoffeeSize(int ml, String producer) {
        this.ml = ml;
        this.producer = producer;
    }

    @Override
    public void buy() {
        System.out.println("Покупаем кофе");
    }
}
