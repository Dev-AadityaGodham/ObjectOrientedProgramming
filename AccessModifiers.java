/******************************************************************************
                Access Modifiers
*******************************************************************************/
class Account{
    //access by any one
    public String name;
    //only class and sun-classes able to access the protected information
    protected String email;
    //you can not access the private information  
    private String password;
    
    //to access the private information we can use getters and setters 
    //by creating functions user able to set and get the private info;
    
    public String setPassword(String pass){
        return this.password=pass;
    }
    
    public void getPassword(){
        System.out.println(this.password);
    }
    
}
//bank class able to use protected information of Account class
class bank extends Account{
    
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Account a1 = new Account();
		a1.name="Aaditya";
		a1.email="aaditya@gamil.com";
		System.out.println(a1.name);
		System.out.println(a1.email);
		//you can not do this 
// 		a1.password="abcd";
        //but you can do this
        a1.setPassword("abcd");
        a1.getPassword();
		
	}
}
// Hello World
// Aaditya
// aaditya@gamil.com
// abcd
