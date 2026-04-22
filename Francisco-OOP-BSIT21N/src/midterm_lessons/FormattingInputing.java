package midterm_lessons;

//IMPORTS REQUIRED
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.File;
import java.io.Console;

public class FormattingInputing {
	
	public static void main(String[]args) throws IOException{
		
		//FILE INPUT 
		/* 	to systematically store user inputs
		 * 	specify the location
		 */
			File myObj = new File("filename.txt");
		
			
		//BUFFEREDREADER CLASS
		/*	most primitive
		 * 	read raw lines
		 * 	provide buffer for data 
		 * 	buffer stores input -> into input stream
		 * 	wraps System.in, which also wrapped under BufferedReader
		 * 	can read input in command line
		 */
			// Using BufferedReader
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(input);
			
			System.out.println("Enter Input: ");
			String name = reader.readLine(); //IOExceptioning
			System.out.println("You entered: " + name);
			System.out.println();
			
			// avoid leakage (kills all inputs below)
			input.close();
 
			
		//SCANNER CLASS
		/*	widely used
		 * 	parse the given input
		 * 	parses tokens
		 *	can read user input in command line 
		 */
			// Using Scanner
			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter Char Name: ");
			String chr_name = in.next();
			System.out.println("Enter Full Name: ");
			String full_name = in.nextLine(); //for string (not just char)
			
			System.out.println("You entered: " + chr_name);
			System.out.println("You entered: " + full_name);
			System.out.println();
			
			in.close();

			
		//CONSOLE CLASS
		/* used for passwords
		 * reading password-like input w/o echo
		 * no buffer in reading;
		 * but has buffered output stream
		 * Works only in real terminal (cmd, PowerShell, bash)
		 * often returns null in IDEs
		 * console.readPassword() hides passwords
		 */
			Console c = System.console();
			System.out.println("Enter NickName: ");
			String n = c.readLine(); //string
			System.out.println("Hello, " + n);
			
			
		//COMMAND LINE INPUTS (FT. ARGS) 
		/* inputs are added after filename in the run command
		 * inputs dealt w/ JVM
		 * passed as just array of strings;
		 * in main function as parameters	
		 * order matters 
		 * args[0] and [1] is separated by space
		 * no input = empty array (args.length = 0)
		 * everything is string
		 * convert when needed:
		 * 		int num = Integer.parseInt(args[1]);
		 */
			if(args.length < 2) {
				System.out.println("Args length: " + args.length);
				System.out.println("Enter PIN: ");
				return;
			}
			
			String pin = args[0];
			int num = Integer.parseInt(args[1]);
	}
	
}
