import java.util.ArrayList;
import java.util.Scanner;

/**
 * A program to check whether an Array is sorted in the natural order or not.
 *
 * @author Neeyat Lotlikar
 * <p>
 * Problem Statement: https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted/0
 */
public class IsArraySorted {

    /**
     * Checks whether an Array is sorted
     *
     * @param intArray the array to be checked for sorting in natural order
     * @return int 1 if the array is sorted else 0
     */
    public static int isArraySorted(int[] intArray) {
        for (int i = 0; i < intArray.length; i++)
            if (i != intArray.length - 1)
                if (intArray[i] > intArray[i + 1])
                    return 0;
        return 1;
    }

    /**
     * Skips remaining content on the current line of input stream buffer if any
     *
     * @param input Scanner object which gives access to the input stream buffer
     */
    public static void skipExtraIfAny(Scanner input) {
        if (input.hasNext())
            input.nextLine();
    }

    public static void main(String[] args) throws IllegalArgumentException {
        Scanner input = new Scanner(System.in);

        int nTestCases = 0, sizeOfArray = 0;
        int[] intArray;
        ArrayList<int[]> testCaseArrays = new ArrayList<>();

        if (input.hasNextInt())
            nTestCases = input.nextInt();

        if (nTestCases < 1 || nTestCases > 100) throw new IllegalArgumentException("1 <= T <= 100");

        int j = 0;
        do {
            skipExtraIfAny(input);

            if (input.hasNextInt())
                sizeOfArray = input.nextInt();

            if (sizeOfArray < 1 || sizeOfArray > 500) throw new IllegalArgumentException("1 <= N <= 500");

            intArray = new int[sizeOfArray];

            skipExtraIfAny(input);

            for (int i = 0; i < sizeOfArray; i++)
                if (input.hasNextInt()) {
                    intArray[i] = input.nextInt();

                    if (intArray[i] < 1 || intArray[i] > 1200) throw new IllegalArgumentException("1 <= C[i] <= 1200");
                }

            testCaseArrays.add(intArray);
            ++j;
        } while (j < nTestCases);

        for (int[] ints : testCaseArrays)
            System.out.println(isArraySorted(ints));
    }

}
