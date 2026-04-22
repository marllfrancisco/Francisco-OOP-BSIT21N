package midterm_lessons;

// CONTROL STRUCTURES
/*   Compiler executes top to bottom 
     CONTROL FLOW STATEMENTS - statements to control the flow
 */
public class ControlFlow {
     public static void main(String[] args) {
     int x = 0;

// DECISION MAKING STATEMENTS
/*   if statement 
          evaluates boolean value

          4 Types:            */
//        simple if statement 
               if(true){ }
//        if-else statement
               if(true){}
               else{}
//        if-else-if ladder
               if(true){}
               else if(true){}
//        nested if statement
               if(true){ 
                    if(true){ }}
               else if(true){}

          // Sample: 
          String add = "Dehli, Meerut, Noida, India";

          if(add.endsWith("India")){
               if(add.endsWith("Meerut")){
                    System.out.println("Your city is meeut");
               }else if( add.endsWith("Noida")){
                    System.out.println("Your city is noida");
               }else{
                    System.out.println(add.split(",")[2]);
               }
          }

          else{
               System.out.println("Youre not living in india");
          }

          
/* 
     switch statement 
          evaluates data type
          - CASES - switch's blocks of code 
          case expression same type of as the variable, will be a constant value
          - default: statement -  when any case don't match 
          - break; statement - terminates switch, w/o this all cases will be executed 
          - case stacking - shares the same argument             */
                    switch(x){
                         case 1:
                         case 2:
                         case 3: x = 1;
                    }    

// LOOP STATEMENTS
/*   execute statement or group of statement multiple times
     - repitition control structures - allow execute specific blocks of code a # of times
     - initialization - this is a CONDITION - we can initialize a variable or use alr available variable
                    (int i = 0;)
     - condition - second, to test loop condition, until false, returns bool value, optional
                    (int i = 0; i < 5;)
     - increment / decrement - keep the variable going, optional.
                    (int i = 0; i < 5; i++)
     - statement - output for looping, intended to loop
 */

     }
     
}
