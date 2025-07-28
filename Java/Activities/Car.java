package activities;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres = 4;
	int doors = 4;

	public Car(String color, String transmission, int make) {
		this.color = color;
		this.transmission = transmission;
		this.make = make;
	}

	public void displayCharcteristics() {
		System.out.println("The color is: " + color);
		System.out.println("The transmission type is: " + transmission);
		System.out.println("The car make year was: " + make);
		System.out.println("It has " + tyres + " tyres");
		System.out.println("It has " + doors + " doors");
	}

	public void accelerate() {
		System.out.println("Car is moving forward");
	}

	public void brake() {
		System.out.println("Car has stopped");
	}
}
