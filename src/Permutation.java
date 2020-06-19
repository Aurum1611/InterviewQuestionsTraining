/*
Program to calculate permutation given by (n!) / (n-r)!

Constraints
1 <= T <= 100
1 <= n,r <= 20
n >= r
*/

public class Permutation {

    /**
     * A method to calculate nP^r or permutation
     *
     * @param n int n from nP^r
     * @param r int r from nP^r
     * @return The final value after calculating nP^r
     * @throws IllegalArgumentException when n < r or n < 1 or r < 1 or n > 20 or r > 20
     * @author Neeyat Lotlikar
     */
    public static long permutation(int n, int r) {
        if (n < r) throw new IllegalArgumentException("n cannot be less than r");
        if (n < 1 || r < 1) throw new IllegalArgumentException("n and r cannot have negative values");
        if (n > 20 || r > 20) throw new IllegalArgumentException("n and r must have values less than or equal to 20");

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
