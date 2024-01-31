package by.academy.lesson17;

@FunctionalInterface
public interface Printable {

	void print(String p);

	boolean equals(Object o);

	int hashCode();

	String toString();

}
