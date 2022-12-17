// This program was completed by Zyad Khan for CIS-132-01 Lab #7 on 11/21/22
// The purpose of this program is to use the Random class to fill an array of doubles and an array of ints.
// Enhanced for loop to compute the sum of the values in the array of doubles.
// The program also sorts the arrays of ints in order by using the Selection Sort algorithm and display that sorted array.
// The program also implement a binary search algorithm to find the index in an array where a value would be inserted.

// Import Random class
import java.util.Random;

public class Problem2 {
    public static void main(String[] args) {
        // Print out the purpose of the program to the user
        System.out.println("This program was completed by Zyad Khan for CIS-132-01 Lab #7 on 11/21/22");
        System.out.println("The purpose of this program is to use the Random class to fill an array of doubles and an array of ints. ");
        System.out.println("Enhanced for loop to compute the sum of the values in the array of doubles");
        System.out.println("The program then sorts the arrays of ints by using the Selection Sort algorithm and display that sorted array. ");
        System.out.println("The program also implement a binary search algorithm to find the index in an array where a value would be inserted. ");

        // Declare an int constant NUMBER_OF_VALUES to have a value of 100
        int NUMBER_OF_VALUES = 100;

        // Create the instance of Random
        Random random = new Random(1);

        // Create an array of doubles and fill it by using a for loop where the results of calling random.nextDouble() is assigned to each array item in turn
        double[] doubleNumbers = new double[NUMBER_OF_VALUES];
        for (int i = 0; i < NUMBER_OF_VALUES; i++) {
            doubleNumbers[i] = random.nextDouble();
        }


        // Create an array of ints, with the size NUMBER_OF_VALUES, and fill it similarly to the other array by calling random.nextInt(50), which generates random integers in the range 0-49.
        int[] intNumbers = new int[NUMBER_OF_VALUES];
        for (int i = 0; i < NUMBER_OF_VALUES; i++) {
            intNumbers[i] = random.nextInt(50);
        }

        double total = 0;
        double squaredTotal = 0;

        // Enhanced for Loop
        for (double val : doubleNumbers) {
            total += val;
            squaredTotal += Math.pow(val, 2);
        }

        // Total of sums of the values in the array of doubles
        total = total / doubleNumbers.length;
        // Display the mean of the sums of the values in the array of doubles to 4 decimal places
        System.out.printf("\nThe sum of the values in the array of doubles is %.4f.", total);

        // Total of sums of the squares in the array of doubles
        squaredTotal = squaredTotal / doubleNumbers.length;
        // Display the mean of the squares in the array of doubles to 4 decimal places
        System.out.printf("\nThe sum of the squares in the array of doubles is %.4f.\n", squaredTotal);

        // Use the selection sort method to print out the sorted array
        selectionSort(intNumbers);

        // Call the findInsertionPoint with the sorted int array and val = 20
        int ix = findInsertionPoint(intNumbers, 20);
        // Print the value from the findInsertionPoint with the sorted int array and val = 20
        System.out.printf("Insertion point for %d is after index %d\n", 20, ix);

        // Call the findInsertionPoint with the sorted int array and val = 27
        ix = findInsertionPoint(intNumbers, 27);
        // Print the value from the findInsertionPoint with the sorted int array and val = 27
        System.out.printf("Insertion point for %d is after index %d\n", 27, ix);
    }

        // Declare selectionSort method to sort the array of ints
        private static void selectionSort (int[] arr) {
            // Initialize integer length to the length of the array
            int len = arr.length;
            // Initialize the variables for the for statement
            int start, minIndex, minVal;
            for (start = 0; start < (len - 1); ++start) {
                // Initialize the minimum value and index to the start
                minIndex = start;
                minVal = arr[minIndex];

                for (int i = start + 1; i < len; ++i) {
                    // Compare value at index i with current minimum
                    // If it's smaller, then set minIndex and minVal
                    if (arr[i] < minVal) {
                        minVal = arr[i];
                        minIndex = i;}
                    }
                // If the index of minimum value is not start then switch the values
                    arr[minIndex] = arr[start];
                    arr[start] = minVal;
                }
            // Print out the contents of the sorted array
            for (int i = 0; i < arr.length ; i++){
                System.out.printf("%4d:%4d\n", i, arr[i]);
            }
        }

        // declare a method for the binary search algorithm called findInsertionPoint
        private static int findInsertionPoint(int[] arr,int val){
        // Initialize local variables
        int first, last, middle, ix;
        // Set first and last to their starting values
        first = -1;
        last = arr.length;

        // While loop where the condition is (last - first > 1)
        while (last -first > 1){
            // Set middle
            middle = (first + last) / 2;
            // Compare the value of var[middle] to val and reset first or last accordingly
            if (val < arr[middle]){
                last = middle;
            }
            else{
                first = middle;
            }
        }
        // Return first, which can be -1
        return first;
    }
}



