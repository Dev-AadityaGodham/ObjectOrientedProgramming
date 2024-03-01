class pen{
    String color;
    String type;
    public void print(){
        System.out.println("hello");
    }
}
class car{
    static String CarName;
    static String OwnerName;
    static int price;
    static boolean electric;
    public static void PrintDetails(){
        System.out.println("hello "+OwnerName+" nice to meet you ther is your "+CarName+" of "+price +"RS");
    }
}
public class Main{
        public static void main(String args[]){
        pen pen1 =new pen();
        pen1.color="blue";
        pen1.type="bollpoint";
        System.out.println(pen1.color);
        pen1.print();
    
        car NewCar = new car();
    
        NewCar.CarName="Tesla 123";
        NewCar.OwnerName="Aaditya Godham";
        NewCar.price=123456;
        NewCar.electric=true;
        NewCar.PrintDetails();
    }
}
// blue
// hello
// hello Aaditya Godham nice to meet you ther is your Tesla 123 of 123456RS
