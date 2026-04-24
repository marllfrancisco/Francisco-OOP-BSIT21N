package midterm_lessons;

public class UserPass {

	public static void main(String[] args) {
		
		// .length ensures args is not occupied yet
		if(args.length < 2) {
			System.out.println("Please enter username and password: ");
			return;
		}
		
		// making use of args string 
		String username = args[0];
		String password = args[1];
		
		if(username.equals("admin")&&password.equals("1234")) {
			System.out.println("Login Successful");
		}else {
			System.out.println("Invalid Credentials");
		}
		
		// Run using run configurations -> arguments - > Program arguments
		// Input "admin 1234" (pass besides user)

	}

}
