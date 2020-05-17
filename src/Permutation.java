/*
Program to calculate permutation given by (n!) / (n-r)!

Constraints
1 <= T <= 100
1 <= n,r <= 20
n >= r
*/

public class Permutation {

    public static long permutation(int n, int r) {
        if (n < r) throw new ArithmeticException("n cannot be less than r");
        if (n < 1 || r < 1) throw new ArithmeticException("n and r cannot have negative values");
        if (n > 20 || r > 20) throw new ArithmeticException("n and r must have values less than or equal to 20");

        int stop = n - r; // Calculates the number which gets divided and so the multiplication must happen till that number

        // Loop iterates till it reaches the stopping point
        int i = n;
        long result = 1; // Maximum value possible which is 20! cannot be stored in an int variable. Hence, using long.
        while (i != stop) {
            result *= i;
            --i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(permutation(2, 1));
        System.out.println(permutation(10, 4));
        System.out.println(permutation(7, 4));
        System.out.println(permutation(13, 7));
        System.out.println(permutation(12, 10));
        System.out.println(permutation(10, 6));
        System.out.println(permutation(20, 20));
    }
}
