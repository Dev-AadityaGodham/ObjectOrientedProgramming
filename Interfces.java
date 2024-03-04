/******************************************************************************
--------------------------Interfces in java--------------------------------
*******************************************************************************/
interface Animal{
    public void walk();//------------this is must functions you need to give every sub class
    //you can not create a non abstract functions it will throw the error
    //but when you use abstract you are able to create non abstract functions like this 
    // public void eats(){
        
    // }
    
    //also you not able to create constructors in interface but you can to it in abstract
    // Animal(){
        
    // }
}
interface Wild{
    
}
//if you are using interface face the you need to use ------implements-----key word not ---extends--

class Horse implements Animal{
    public void walk(){
        System.out.println("walk on 4 legs");
    }    
}
//in interface you can use multiple inheritnce means Chicken can extract the properties of Animal as well as Wild interfacee
class Chicken implements Animal,Wild{
    public void walk(){
        System.out.println("walk on 2 legs");
    }
}
public class Main
{
	public static void main(String[] args) {
	    
	    Horse h1 = new Horse();
	    h1.walk();
		
	}
}
