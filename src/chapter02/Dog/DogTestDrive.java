package chapter02.Dog;

public class DogTestDrive { //this class tests our "Dog" class
	public static void main (String[] args) {
		Dog d = new Dog(); // creates a Dog object
		d.size = 40; // dot operator to set the size of the Dog
		d.bark(); // dot operator to call its bark() method
	}
}
