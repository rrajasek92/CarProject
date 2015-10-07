package Car;
import java.util.Scanner;
public class Car {

	private String make, color, state="stopped";
	private int speed=0;
	public Car(String make, String color){
		this.make=make;
		this.color=color;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void change(String a){
		if (a.equals("start")){
			state="starting";
		}
		else if (a.equals("stop")) {state="stopped"; speed=0;}	
		else if (a.equals("accelerate")){ state="accelerating"; speed+=10;}
		else if (a.equals("decelerate")){state="slowing down"; speed-=10;}
		
		}
	public void carAction(){
		Scanner keyboard=new Scanner(System.in);
		String input="stop";
		System.out.println("The car is a "+color+" "+make+".");
		while (!input.equals("off")){
			System.out.println("The car is "+getState()+".\nThe car is going "+getSpeed()+" mph.");
			input=keyboard.next();
			change(input);
			}
			System.out.println("The car is turning off...\n\n");
			
			}
	}

