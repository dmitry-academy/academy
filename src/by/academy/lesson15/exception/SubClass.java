package by.academy.lesson15.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {

	public SubClass() throws IOException, ArithmeticException {
	}

	public void start() {
	}

	@Override
	public void stop() throws IOException, FileNotFoundException {
		// TODO Auto-generated method stub

	}
}