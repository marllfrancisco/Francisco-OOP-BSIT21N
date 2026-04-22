package midterm_lessons;

//JVM Memory Areas
/*   Stack Memory - stores LOCAL(inside method) variables, method calls, temp memory
     Heap Memory - stores objects, ACROSS METHODS(inside class, instance variable), managed by garbage collector
     Method Area - stores class structure, STATIC variables, method definitions
 */

public class VariablesMemory {
     //Static variable (stored in method area)
     static String brand = "Toyota";

     //Instance variables (is a field, stored in heap memory)
     String model;

     // this is method 
     public void startEngine(){
          //Local variable (stored in stack memory)
          int year = 2023;

          //Str model overwrites the object variables;
          //remove Str model -> object variables will run:
          //String model = "Mitsubishi";

          System.out.println(model + "-" + brand + "-" + year);

     }

     public static void main(String[] args) {
          VariablesMemory c1 = new VariablesMemory();
          VariablesMemory c2 = new VariablesMemory();

          //Local/Reference variable - inside main method 
          c1.model = "Vios";
          c2.model = "BMW";

          c1.startEngine();
          c2.startEngine();
     }

}

//JAVA NAMING CONVENTIONS 
/*
 *  Classes: Use UpperCamelCase (PascalCase) and name them as nouns.
		Example: Student, AccountManager, LinkedList.
	
	Interfaces: Also use UpperCamelCase and often use adjectives to describe a capability.
		Example: Runnable, Serializable, Comparable.
	
	Methods: Use lowerCamelCase and name them as verbs.
		Example: calculateTotal(), getName(), actionPerformed().
	
	Variables: Use lowerCamelCase. Names should be short yet meaningful. Avoid single-character names except for temporary loop counters (e.g., i, j, k).
		Example: firstName, orderAmount, index.
	
	Constants: Use ALL_UPPERCASE with words separated by underscores (SCREAMING_SNAKE_CASE). These variables must be declared as static final.
		Example: MAX_PRIORITY, PI, DEFAULT_TIMEOUT.
	
	Packages: Use all lowercase letters. To ensure uniqueness, use the reverse domain name of your organization as a prefix.
		Example: com.google.search, org.apache.commons.lang. 
	
	General Rules for All Identifiers
		Case Sensitivity: Java is case-sensitive; myVariable and MyVariable are different identifiers.
	
		Special Characters: Names should not start with a dollar sign ($) or underscore (_), although it is technically legal. They cannot contain spaces.
		
		Keywords: You cannot use Java Reserved Keywords (like int, class, or static) as identifiers.
	
		Acronyms: When using acronyms in camelCase names, it is often recommended to treat them as normal words (e.g., parseXml instead of parseXML) to improve readability.
 */