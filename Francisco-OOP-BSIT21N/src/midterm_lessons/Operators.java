package midterm_lessons;

public class Operators { 

     public static void main(String[] args) {
          //UNARY OPERATORS
          /* POSTFIX = exp++, exp--
             PREFIX  = --exp, ++exp 
             
             ++exp, --exp = magperform muna yung operation bago mag print (una muna)
             exp++, exp-- = print muna yung initial value, then perform operation to update (delayed)  
          */
          
          /* Example:
               int x = 10;
               System.out.println(x++); //10+1
               System.out.println(++x); //11+1  
           */  

          int x = 55, y = 52, z = 33, a = 28, b = 41;
          System.out.println(a++ + --b);     //28+40=  68
          System.out.println(++x + ++y);     //56+53=  109
          System.out.println(++z + a--);     //34+29=  63
          System.out.println(--b + ++x);     //39+57=  96
          System.out.println(y++ + --z);     //53+33=  86
          System.out.println(++a + ++b);     //29+40=  69
          System.out.println(x++ + --y);     //57+53=  110
          System.out.println(++z - ++a);     //34-30=  4
          System.out.println(b++ + --x);     //40+57=  97
          System.out.println(y++ + --z);     //53+33=  86
          System.out.println();

          //TERNARY OPERATOR
          /*   Just like if - then - else
               Used in variable declaration  
             
               Example:
                    int a = 10;
                    int b = 20;
                    int min = (a<b) ? a:b;
                    System.out.println(min); //10
           */

          //ARITHMETIC OPERATOR
          /*   Symbols: += -=
           */

          //RELATIONAL OPERATOR
          /*   Output is only 'true' or 'false', nothing else
               Symbols: > < >= <= == !=
           */

          //LOGICAL OPERATOR
          /*   Data type: boolean
               Symbols: && ||

               Example:
                    int age = 20;
                    boolean hadID = true;

                    if(age>=18 && hadID){
                         System.out.println("Allowed") }
           */

          //BITWISE OPERATOR
          /*   Convert the value of variable to binary;
               Example: 5=0101, 3=0011;
               Then perform binary addition(|) or multiplication(&)
               Symbols: & |

               Example:
                    int a = 5, b = 3;
                    System.out.println(a & b);
                    System.out.println(a | b);
               
           */
          //BITWISE (&) VS LOGICAL (&&)
          /*   When these symbols are used between 2 arguements -> possibly decrease operations
               & - perform both arguements no matter what
               && - kapag false ang 1st arguement, the second arguement not performed

               Example:                                */
               int c = 5, d = 3;
               //& vs &&, Observe the difference in output:
               //                  5++   3++        NOPE
               System.out.println((c++ < d++) && (c++ < d++));  //false && true = false
               System.out.println(c + d);    //6+4 =10 
               //                  6++   4++      7++   5++  
               System.out.println((c++ > d++) & (c++ < d++));   //true & false = false
               System.out.println(c + d);    //8+6= 14
               System.out.println();

          System.out.println((c++ < d++) & (c++ > d++));
          System.out.println(c++ - d++);
     }

}
