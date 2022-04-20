package co.edu.oop;

public class CalMain {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		cal.x = 5;
		cal.y = 2;
		
		cal.plus(10, 2);
		cal.minus(100, 40);
		cal.multi(10, 20);
		cal.dvid(45, 9);
		
		Car car = new Car(); //레인지로버
		
		Car car2 = new Car(); //소나타
		
		car.model = "레인지로버";
		car.color = "black";
		car.price = 300000000;
		car.info();
		
		car2.model = "소나타";
		car2.color = "white";
		car2.price = 30000000;
		car2.info();
		System.out.println();
		
		Car car3 = new Car("그랜저", "balck", 200);
		car3.info();
		
	}

}
