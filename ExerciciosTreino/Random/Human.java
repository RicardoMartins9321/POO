package ExerciciosTreino.Random;

public class Human {
    
    String name;
	int age;
	double weight;
	
    // this right here is a constructor
	Human(String name,int age,double weight){
        
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
    // this are methods of the class
	void eat() {
		System.out.println(this.name+" is eating");
	}
	void drink() {
		System.out.println(this.name+" is drinking *burp*");
	}

}
