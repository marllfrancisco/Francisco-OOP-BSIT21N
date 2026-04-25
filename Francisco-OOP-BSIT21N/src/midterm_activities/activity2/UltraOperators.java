package midterm_activities.activity2;

public class UltraOperators {
    public static void main(String[] args) {

        //num  (arithmetic + assignment)
        int alpha = 30;
        alpha *= 3;                  //90
        System.out.println(alpha);   //1

        //bool (relational + logical)
        int beta = 15;
        boolean gamma = (beta > 10) && (beta != 20);
        System.out.println(gamma);   //2

        //num (bitwise shift)
        int delta = 4;
        int epsilon = delta << 2;    //4 * 2^2 = 16
        System.out.println(epsilon); //3

        //bool (logical + unary)
        int zeta = 8;
        boolean eta = !(zeta < 5) || (zeta == 8);
        System.out.println(eta);     //4

        //num (tricky increment)
        int theta = 5;
        int iota = theta++ + ++theta; 
        // theta++ = 6, ++theta = 7, 5 + 7 = 12
        System.out.println(iota);    //5

        //num (modulus + assignment)
        int kappa = 50;
        kappa %= 9;                  //50 % 9 = 5
        System.out.println(kappa);   //6
    }
}

