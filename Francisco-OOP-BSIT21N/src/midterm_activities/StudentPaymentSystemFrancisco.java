
// my package
package midterm_activities;

// imports needed
import java.util.Scanner;

public class StudentPaymentSystemFrancisco {

	public static void main(String[] args) {
		
		// initial declarations 
		Scanner sc = new Scanner(System.in);
		int choice, disCounter = 0; // counts discount entry
		int transact_count = 0; // counts transactions

		// initial interface -----------------------------------------------------------
        System.out.println("Welcome to Tuition System by Marl :>\n");
        
        System.out.print("Student Name      : ");
        String stud_name = sc.nextLine();
        System.out.print("Student ID        : ");
        String stud_id = sc.next(); //char
        System.out.print("Total Tuition Fee : ");
        double balance = sc.nextDouble();
        
        
        // MAIN MENU - do-whiled --------------------------------------------------------
        do {
            System.out.println("\n===== PAYMENT MENU =====");
            System.out.println("1. Pay Tuition");
            System.out.println("2. Check Balance");
            System.out.println("3. Apply Discount");
            System.out.println("4. Exit");
            System.out.print("\nChoose option: ");

            choice = sc.nextInt();
            
            // options (switch) --------------------------------------------------------
            switch (choice) {
            
            	// payment
                case 1:
                	// prevents payment when balance is alr 0
                	if (balance <= 0) {
                    	System.out.println("Cannot pay. No remaining balance.");
                    	break;
                	}
                	
                    // Payment validation - while loop
                    while (balance > 0) {
                    	System.out.print("Enter payment amount: ");
                        double payment = sc.nextDouble();
                        
                    	if (payment > 0) {
                            if (payment > balance) {
                            	System.out.println("Invalid Payment. Exceeds Balance.");
                            } else {
                            	balance -= payment;
                            	transact_count++;
                            	System.out.println("Payment Succesful.");
                            	break;
                            }
                        } else {
                        	System.out.println("Invalid Value. Try again.");
                            }
                    }
                    break;
                    
                // checks the balance
                case 2:
                	if (balance > 0) {
                		System.out.println("Balance: " + balance);
                		transact_count++;
                	} else {
                		System.out.println("No remaining balance.");
                	}
                    break;
                
                // apply discount?
                case 3:
                	// super nested if (required eh)
                    if (disCounter == 0) {

                        System.out.print("Are you Regular Student [y/n]: ");
                        String regular = sc.next().toLowerCase();

                        if (regular.equals("y")) {
                        	System.out.println("You are a regular student. No discount.");
                        	
                        } else if (regular.equals("n")){
                        		System.out.print("Are you Scholar Student [y/n]: ");
                                String scholar = sc.next().toLowerCase();

                                // validate, no garbage input
                                if (scholar.equals("y") || scholar.equals("n")) {
                                	
                                        if (scholar.equals("y")) {
                                            System.out.println("Discount applied.");
                                            balance *= 0.8; // 20% is now deducted
                                            transact_count++;
                                            disCounter++;
                                        } else {
                                            System.out.println("No discount applied.");
                                        }      
                                } else {
                                    System.out.println("Invalid input for scholar. Only y/n allowed.");
                                }	
                        } else {
                        	System.out.println("Invalid input for regular. Only y/n allowed."); 
                        } 
                    } else {
                        System.out.println("Discount can only apply once.");
                    }
                    break;
                
                // exit 
                case 4:
                	System.out.println("Student Name       : " + stud_name);
                	System.out.println("Student ID         : " + stud_id);
                    System.out.println("Total Transactions : " + transact_count);
                    System.out.println("Final Balance      : " + balance);
                    
                    System.out.println("\nProgram terminating...");
                    System.out.println("Thank you for using :>");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);
        
        sc.close();
	}

}
