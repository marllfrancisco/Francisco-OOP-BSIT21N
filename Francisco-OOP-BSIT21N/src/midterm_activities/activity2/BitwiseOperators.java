package midterm_activities.activity2;

public class BitwiseOperators {
     public static void main(String[] args) {

          // conditional bitwise AND
          boolean a = (2>1) & (0<9);
          System.out.println(a);   //true

          // computational bitwise AND
          int b = 14 & 11;
          System.out.println(b);   //10

          // conditional bitwise OR
          boolean c = (6>7) | (0>9);
          System.out.println(c);   //false

          // computational bitwise OR
          int d = 12 | 3;
          System.out.println(d);   //15
     }    

}
