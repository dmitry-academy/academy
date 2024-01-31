package by.academy.lesson17;

public class ExpensiveSearchable implements Searchable {
    @Override
    public boolean accept(Car c) {
        return c.getCost() > 25000;
    }
}
