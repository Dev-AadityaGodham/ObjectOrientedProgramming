/******************************************************************************
--------------------Abscraction in java---------------------------------------
*******************************************************************************/
//use abstract key word to abstract teh class
abstract class Animal{
    abstract void walk(); //no need to implement the hole function in abstract
    //constructer
    Animal(){
        System.out.println("Creted new Animal");
    }
}
//first animal constructer get called and it will print "created new animal" and after that horse constructer get called it will print "horse get created"
//means every thime when you create new class from base class the constructer of base call will implement firs 
//and this process known as chain constructer
class Horse extends Animal{
    Horse(){
        System.out.println("Creted new Horse");
    }
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("walk of 2 legs");
    }
}

public class Main
{
	public static void main(String[] args) {
		
		Horse h1 = new Horse();
		h1.walk();
		
		Chicken c1 = new Chicken();
		c1.walk();
		
		//this will throw error;
		//you can not creat the Object or cannot be instantiated --------this is run time error
		//Animal a1 = new Animal();
		//a1.walk();
	}
}
//output
// Creted new Animal
// Creted new Horse
// walk on 4 legs
// Creted new Animal
// walk of 2 legs

