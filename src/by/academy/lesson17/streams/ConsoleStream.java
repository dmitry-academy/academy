package by.academy.lesson17.streams;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConsoleStream {

//	Промежуточные операции:
//
//		1. Сгенерировать 1000 чисел в диапазоне от 500 до 1500 используя Stream API. 
//		2. Нужно пропустить первые 100 элементов.
//		3. Оставить только нечетные числа.
//		4. Отсортировать числа в обратном порядке.
//		5. Оставить только уникальные значения.
//		6. Преобразовать с помощью map числа в строки в формате: "Строка с номером: " + n
//		7. Органичить количество элементов 350.
//		8. Сгенерировать List (.collect(Collectors.toList())
//
//		Терминальные операции:
//
//		1. Найти min/max с помощью Stream API.
//		2. Проверить, есть ли в коллекции строка, которая equals строке "Число 500"
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		Stream.of(sc.nextLine().split(" ")).forEach(s -> System.out.println(s));
//
//		sc.close();
		Random r = new Random();

		IntStream.range(0, 100).boxed().toList().stream().sorted((o1, o2) -> r.nextInt(100))
				.forEach(s -> System.out.println(s));
//		forEach(System.out::println);

		List<Integer> list = generateIntegerList(1000, 1000);

		List<String> result = list.stream().skip(100).filter(i -> i % 2 == 1).sorted((i1, i2) -> i2 - i1)
				.distinct()
				.map(v -> "Строка с номером: " + v).limit(350).toList();

		System.out.println(result.stream().min((s1, s2) -> s1.compareTo(s2)));
		System.out.println(result.stream().max((s1, s2) -> -s1.compareTo(s2)));
		System.out.println(result.stream().anyMatch(s -> "Строка с номером: 501".equals(s)));

	}

	private static List<Integer> generateIntegerList(Integer seed, Integer size) {
		Supplier<Integer> s = () -> new Random().nextInt(seed);
		return Stream.generate(s).limit(size).map(i -> i + 500).toList();
	}
}
