package ExerciciosTreino.Random;

public class Car {
    String make = "Chevrolet";
	String model = "Corvette";
	int year = 2020;
	String color = "blue";
	double price = 50000.00;
	
	void drive() {
		System.out.println("You drive the car");
	}
	void brake() {
		System.out.println("You step on the brakes");
	}	

	// toString() = special method that all objects inherit, 
  	//    that returns a string that "textually represents" an object.
  	//    can be used both implicitly and explicitly
	public String toString() {
  
		return make +"\n"+model+"\n"+color+"\n"+year;
		
	} 
}

