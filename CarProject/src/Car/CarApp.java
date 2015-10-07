package Car;
public class CarApp {
	public static void main(String[] args){
		Car car=new Car("Toyota Sienna","teal");
		Car car2=new Car("Audi A4", "silver");
		car.carAction();
		car2.carAction();
	}
}
