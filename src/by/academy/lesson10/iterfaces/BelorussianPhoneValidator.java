package by.academy.lesson10.iterfaces;

import java.util.regex.Pattern;

public class BelorussianPhoneValidator implements Validator {

    public static final Pattern p = Pattern.compile("\\+375\\d{9}");

    @Override
    public Pattern getPattern() {
        return p;
    }
}
