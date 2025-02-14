/*
Author:Kevin Mwithiga
Reg No:CT101/G/19870/23
*/
//Base class
class vehicle {

//Attributes
String brand;
int speed;

//Constructor
public vehicle(String brand, int speed) {
	this.brand = brand;
	this.speed = speed;
	}

//Method for acceleration
public void acceleration(int increase) {
	speed += increase;
	}

//Method for brake
public void brake(int decrease) {
	speed -= decrease;
//Ensuring that no number below 0 is displayed
if (speed < 0){
	speed = 0;
	}
}

//User input and display Method
public void showDetails() {
System.out.println("Vehicle brand: " + brand + "\nCurrent speed: " + speed);
	}
}

//Subclass:Car
class Car extends vehicle {

//Fuellevel attribute 
int fuelLevel;

//Constructor
public Car(String brand, int speed, int fuelLevel) {
	super(brand, speed);
	this.fuelLevel = fuelLevel;
	}

//Method to refuel
public void refuel(double amount) {
 fuelLevel += amount;
//Ensuring it doesn't go beyond 100
if (fuelLevel > 100) {
	fuelLevel = 100;
	}
}

//Overridding the showDetails method
public void showDetails() {
System.out.println("Vehicle brand: " + brand + "\nCurrent speed: " + speed + "\nFuelLevel: " + fuelLevel + "%");
	}
}

//Subclass:Helmet
class Bike extends vehicle {

//Attributes
boolean helmetOn;

//Constructor
public Bike(String brand, int speed, boolean helmetOn) {
	super(brand, speed);
	this.helmetOn = helmetOn;
	}

//Method to wearHelmet
public void wearHelmet() {
	helmetOn = true;
	}

//Overidding the showDetails method
public void showDetails() {
System.out.println("Vehicle brand: " + brand + "\nCurrent speed: " + speed + "\nHelmetOn: " + helmetOn);
	}
}

//Mainclass: vehicleSystem
public class vehicleSystem {
public static void main(String[] args) {

//Creating the Car Object
Car car = new Car("Toyota", 60, 50);

//Increasing speed
car.acceleration(20);

//Decreasing speed
car.brake(30);

//Level of fuel
car.refuel(30);

//Output of Car details
car.showDetails();

//Creating the Bike Object
Bike bike = new Bike("Yamaha", 40, false);

//Increasing speed
bike.acceleration(15);

//Decreasing speed
bike.brake(10);

//Helmeton
bike.wearHelmet();

//Output of Bike details
bike.showDetails();
	}
}
