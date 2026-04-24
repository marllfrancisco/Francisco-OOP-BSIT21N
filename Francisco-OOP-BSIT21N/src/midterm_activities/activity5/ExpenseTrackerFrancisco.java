// personal package
package midterm_activities.activity5;

// necessary imports
import java.util.Scanner;

public class ExpenseTrackerFrancisco {

	// DISPLAY THE TITLE -----------------------------------------------------
	public static void displayTitle() {
		System.out.println("Welcome to Personal Expense Tracker");
		System.out.println("Developer: Marl :> \n");
	}
	
	// CALCULATE TOTAL EXPENSE -----------------------------------------------
	public static double totalExpense(double food, double transport, double medic) {
		System.out.println("\nCalculating total expense...");
		return food + transport + medic;
	}
	
	// CHECKS IF TOTAL EXPENSE EXCEEDS BUDGET --------------------------------
		public static String checkExceeds(double budget, double total_expense) {
			if(total_expense > budget) {
				return "Warning! You overspent!";
			} else {
				return "Notice: Expenses meet the budget threshold <3";
			}
		}
	
	// DISPLAY THE EXPENSES --------------------------------------------------
	public static void displayExpense(double budget, double total_expense) {
		double budget_remain = budget - total_expense;
		int index = 0;
		
		System.out.println("\nTotal expense: " + total_expense);
		System.out.println("Remaining budget: " + budget_remain);
		
		String status[] = {"FAHH!", "Oh no", "Goods", "Savior", "Thrifty"};
		
		if (budget_remain >= 0) {
			if (budget_remain <= (budget * 0.1)) {	//0%-10%
				index = 0;
			} else if(budget_remain < (budget * 0.4)){	//11%-39%
				index = 1;
			} else if(budget_remain <= (budget * 0.6)){	//40%-60%
				index = 2;
			} else if(budget_remain < (budget * 0.9)){	//61%-89%
				index = 3;
			} else {	//90%-100%
				index = 4;
			}
			
			System.out.println("Budget status: " + status[index]);
		} else {
			System.out.println("Learn how to save money next time ^^");
		}	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double budget = 0; //initialized here for method calling
		
	
		// METHOD FOR TITLE --------------------------------------------------
		displayTitle();
		
		// INITIALLY INSERT BUDGET -------------------------------------------
		while (true) {
			System.out.print("Input BUDGET for this month: ");
			budget = sc.nextDouble();
			
			if(budget < 1 ) {
				if(budget == 0) {
					System.out.println("Budget cannot be empty. Try again.");
				} else {
				System.out.println("Budget cannot be negative. Try again.");
				}
			} else { 
				break; 
			}
		}
		
		// INPUT EXPENSES (FOOD, TRANSPORTATION, MEDICINE) -------------------
		System.out.print("Input FOOD expenses: ");
		double food = sc.nextDouble();
		System.out.print("Input TRANSPORTATION expenses: ");
		double transport = sc.nextDouble();
		System.out.print("Input MEDICAL expenses: ");
		double medic = sc.nextDouble();
		
		// METHOD FOR TOTAL --------------------------------------------------
		double total_expense = totalExpense(food, transport, medic);
		
		// METHOD FOR CHECKING TOTAL EXPENSE ---------------------------------
		String message = checkExceeds(budget, total_expense);
		System.out.println(message);
		
		// METHOD FOR DISPLAY TOTALS -----------------------------------------
		displayExpense(budget, total_expense);
			
		// FAREWELL MESSAGE
		System.out.print("\nThank u for using my program, see u next month :)");
		
		
		sc.close();
	}

}
