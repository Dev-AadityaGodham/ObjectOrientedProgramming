/******************************************************************************
    inheritance(one calss able to adapt evey property of other class)
    child class extends the parent class also know as sub-class and base-class
    --------Multilevel inheritance and Hierchical Inheritance -----------
*******************************************************************************/
class shape{
    String shapeName;
    String color;
    int sides;
    public void printInfo(){
        System.out.println("The color of the "+this.shapeName+ " is "+this.color+" and have "+this.sides+ " sides");
    }
}
class circle extends shape{
	
}
//class square extends shape calss and similerly Traingle calss and circle also extends shape class is know as
//Hierchical Inheritance
class square extends shape{

}
class Traingle extends shape{
    public void area(int l,int b){
        System.out.println("The area of the "+ this.shapeName +" is"+ 1/2*l*b);
    }
}
//multilevle Inheritance:-when derived class extends other drived class which deriver from the base/parent calss known as multilevel Inheritance
class EquilaterlTraingle extends Traingle{
    
}
public class Main
{   
	public static void main(String[] args) {
	    Traingle T1 = new Traingle();
	    //Eventhough the Traingle calss ont have nay property becuse of it extends the shape class it can use the ppropeties of shape class
	    T1.shapeName="Traingle";
	    T1.color="Red";
	    T1.sides=3;
	    T1.printInfo();
	    T1.area(3,4);
	}
}
