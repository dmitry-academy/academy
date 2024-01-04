package by.academy.lesson13.innerclasses;

import by.academy.lesson10.iterfaces.Validator;
import by.academy.lesson9.E;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Food {

	private static final Validator validator_GMAIL = new Validator() {
		private final Pattern p = Pattern.compile("[a-z]+@gmail.com");

		@Override
		public Pattern getPattern() {
			return p;
		}
	};

    public static void main(String[] args) {

        Potato potato = new Potato() {
            @Override
            public void dig() {
                System.out.println("капаем картоху");
            }
			@Override
			public void peel() {
				specificPeel();
				System.out.println("Чистим картошку в анонимном классе.");
			}
			public void specificPeel() {
				System.out.println("some specific method");
			}
        };
        potato.dig();
        potato.peel();


		System.out.println(validator_GMAIL.validate("test@gmail.com"));
//		Potato potato = new Potato();
//		potato.peel();
    }
}