package by.academy.lesson13.innerclasses;

public class CityDemo {

	public static void main(String[] args) {
//			Town4.Street street = new Town4.Street();
//			street.go();
//			District district = new District();
//			district.go();
//			City city = new City();
//			District district = city.District();

		City city = new City();
		City.District districtA = city.new District();
		
		districtA.go();

//		City.District districtB = new City.District();
//		districtB.go();
	}

}
