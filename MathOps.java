/**
* The program displays various math calculations in Java.
*
* @author  Ms Raffin
* @version 1.0
* @since   2023-02-09
*/
public final class MathOps {

    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private MathOps() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        // Addition
        System.out.println("2 + 3 = " + (2 + 3));
        // Subtraction
        System.out.println("4 - 5 = " + (4 - 5));
        // Multiplication
        System.out.println("3 * 9 = " + (3 * 9));
        // Division with integers
        System.out.println("4 / 2 = " + (4 / 2));
        // Division with float numbers
        System.out.println("2 / 3 = " + (2f / 3f));
        // Division with double numbers
        System.out.println("2 / 3 = " + (2d / 3d));
        // Exponents to power of 2
        System.out.println("5^2 = " + (Math.pow(5, 2)));
        // Exponents to power of 3
        System.out.println("2^3 = " + (Math.pow(2, 3)));
        // Square root
        System.out.println("√16 = " + (Math.sqrt(16)));
    }
}

