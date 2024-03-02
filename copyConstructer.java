class student{
    String name;
    int age;
    public void printInfo(){
        System.out.println("the name of the student is "+this.name+" and the age is "+this.age);
    }
    student(student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    student(){
        
    }
}
public class MyClass {
    public static void main(String args[]) {
      student s1=new student();
	s1.name = "aaditya";
	s1.age=21;
	
	student s2 =new student(s1);
	s2.printInfo();
    }
}



