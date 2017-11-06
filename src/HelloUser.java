
public class HelloUser {
	
	private String userName;
	
	public HelloUser(String userName) {
		this.userName = userName;
	}
	
	// Outputs personalized greeting on the console
	public void greetUser(){
		System.out.println("Hello " + userName + "!");
	}
}
