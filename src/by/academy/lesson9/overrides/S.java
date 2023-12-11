package by.academy.lesson9.overrides;


import by.academy.lesson8.classes.HeavyBox;

public class S extends R {
    @Override
    HeavyBox getInstance() {
        return new HeavyBox();
    }
}