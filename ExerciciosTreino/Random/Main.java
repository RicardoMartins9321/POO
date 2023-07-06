package ExerciciosTreino.Random;
;

public class Main {

	public static void main(String[] args) {
		
		Car myCar1 = new Car();
		Car myCar2 = new Car();

		System.out.println(myCar1.make);
		System.out.println(myCar1.model);

		myCar1.drive();
		myCar1.brake();
		myCar2.drive();

		// human1 and human2 are objects created from the same class Human
		Human human1 = new Human("Rick",65,70);
		Human human2 = new Human("Morty",16,50);

		// methods in the class Human
		human1.drink();
		human2.eat();
	
	
		// local =  declared inside a method
		//   visible only to that method

		// global  = declared outside a method, but within a class
		//   visible to all parts of a class
		
		// DiceRoller diceRoller = new DiceRoller();
		

		Pizza pizza = new Pizza("thicc crust","tomato","mozzerella","pepperoni");
		
		System.out.println("Here are the ingredients of your pizza: ");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);


		// toString() = special method that all objects inherit, 
  		//    that returns a string that "textually represents" an object.
  		//    can be used both implicitly and explicitly
  
  		Car car = new Car();
  
  		System.out.println(car.toString());	//used explicity
  		// or
  		System.out.println(car);			// used implicity
		// this second expression would normally return the signature of the car object
		// but because we used the toString() method it returns what we defined
		// inside the car class and inside the toString() method
	} 
}

