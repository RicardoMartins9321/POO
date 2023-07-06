package ExerciciosTreino.Random;

public class Pizza {
    String bread;
	String sauce;
	String cheese;
	String topping;
	
    // overloaded constructors = multiple constructors within a class, all with the same name 
    // but have different parameters, making them  have different signatures
    // name + parameters = signature 

	Pizza(){
		
	}
	
	Pizza(String bread){
		
		this.bread = bread;
	}
	
	Pizza(String bread,String sauce){
		
		this.bread = bread;
		this.sauce = sauce;
	}
	
	Pizza(String bread,String sauce,String cheese){
		
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
	}
	
	Pizza(String bread,String sauce,String cheese,String topping){
		
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	}
}
