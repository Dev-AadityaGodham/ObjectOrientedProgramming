/******************************************************************************
    Compile time polymorpisum (function overloading)
*******************************************************************************/

public class Main
{   
    public static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    //having same name dut diffrent arrguments and functionalities
	public static void main(String[] args) {
	    add(2,4);
	    add(1,2,3);
	    
	}
}
