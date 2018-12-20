package prj06Arrays;

import java.util.Arrays;
import java.util.Comparator;

interface MoveAble {
	int move();
}

class Car implements MoveAble , Comparable<Car>{
	private int year ; 
	private String name ;
	private int speed ;
	
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public Car(int year, String name) {
		super();
		this.year = year;
		this.name = name;
	}
	@Override
	public int move() {
		return speed ;
	}
	@Override
	public int compareTo(Car c) {
		//if(this.speed>c.speed) return 1 ;
		//if(this.speed<c.speed) return -1 ;
		//if(this.speed==c.speed) return 0 ;
		return this.year-c.year;
	}
	@Override
	public String toString() {
		return "Car [year=" + year + ", name=" + name + ", speed=" + speed + "]";
	}
	
	
}
class CompareByYear implements Comparator<Car>{

	@Override
	public int compare(Car c1, Car c2) {
		return c1.getYear()-c2.getYear();
	}
}

class CompareByName implements Comparator<Car>{

		@Override
		public int compare(Car c1, Car c2) {
			return c1.getName().compareTo(c2.getName());
		}
}
	
public class PogramCompareTo {

	public static void main(String[] args) {
		/*int [] mas = {1,2,5,3,-5,-8,0};
		Arrays.sort(mas);
		System.out.println(Arrays.toString(mas));
		*/
		
		/*String strMas [] = {"dfd","vanyz","sjghj"};
		Arrays.sort(strMas);
		System.out.println(Arrays.toString(strMas));
		*/
		
		/*Car carMas [] = new Car[3];
		carMas[0] = new Car(12, "ford");
		carMas[1] = new Car(9, "ford1");
		carMas[2] = new Car(11, "ford2");
		Arrays.sort(carMas);
		System.out.println(Arrays.toString(carMas));
		*/
		
		/*Car carMas [] = new Car[3];
		carMas[0] = new Car(12, "ford");
		carMas[1] = new Car(9, "ford1");
		carMas[2] = new Car(11, "ford2");
		Arrays.sort(carMas, new CompareByYear());
		System.out.println(Arrays.toString(carMas));
		*/
		
		/*Car carMas [] = new Car[3];
		carMas[0] = new Car(12, "ford");
		carMas[1] = new Car(9, "ford1");
		carMas[2] = new Car(11, "ford2");
		Arrays.sort(carMas, new Comparator<Car>() {    /форма записи компаратора для дравы  6 НЕ выше
			public int compare(Car c1, Car c2) {
				return c1.getYear()-c2.getYear();
		}
			
		});
		System.out.println(Arrays.toString(carMas));
		*/
		Car carMas [] = new Car[3];
		carMas[0] = new Car(12, "ford");
		carMas[1] = new Car(9, "ford1");
		carMas[2] = new Car(11, "ford2");
		Arrays.sort(carMas,(c1, c2)-> c1.getYear()-c2.getYear()); //короткая форма записи компаратора для дравы  8 и выше
		
		System.out.println(Arrays.toString(carMas));
		Arrays.sort(carMas, 
				new Comparator<Car>() {
					@Override
					public int compare(Car c1, Car c2) {							
						return c1.getName().compareTo(c2.getName());
					}
			    }
		);
		System.out.println(Arrays.toString(carMas));
	}

}

