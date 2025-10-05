/**
 * Bubble sort example program.
 *
 * Behaviour:
 * - Reads array size and elements from standard input when the class is loaded
 *   (static initializer). This is convenient for quick demos but not ideal
 *   for library code because it runs on class load.
 * - Sorts the array using a straightforward bubble sort implementation and
 *   prints the sorted array from main.
 *
 * Usage (interactive):
 * - The program prompts for the array size and then for that many integers.
 * - After input, it prints the original array and then the sorted array.
 */

import java.util.*;

public class Bubble {
    // Number of elements to read from input
    static int size;

    // Array to hold the input elements. Filled in the static initializer.
    static int[] arr;

    // Shared Scanner for reading user input from System.in
    static Scanner sc = new Scanner(System.in);

    // Static initializer: runs once when the class is loaded. It reads the
    // array size and elements from the user and prints the array before sorting.
    static {

        System.out.println("===== Bubble Sort =====");
        System.out.println("Enter the size :");
        size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter Elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // Show the array as entered
        System.out.println("Original Array : "+Arrays.toString(arr));
    }

    /**
     * Sort the given array in-place using bubble sort and return it.
     *
     * Algorithm notes:
     * - Bubble sort repeatedly steps through the list, compares adjacent
     *   items and swaps them if they are in the wrong order. The largest
     *   element "bubbles" to the end in each outer loop iteration.
     * - This implementation is the simple O(n^2) version (no early exit
     *   optimization when the array becomes sorted earlier).
     *
     * Complexity:
     * - Time: O(n^2) worst and average case, O(n^2) best case for this
     *   simple implementation. (An optimized bubble sort can be O(n) best-case.)
     * - Space: O(1) additional space (in-place).
     *
     * Stability: Bubble sort is a stable sort (equal elements keep their
     * relative order).
     *
     * @param arr array to sort (modified in-place)
     * @return the same array reference, now sorted
     */
    public static int[] Solution(int[] arr) {
        int temp = 0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    // swap arr[j] and arr[j+1]
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        // Sort the array that was read in the static initializer and print it
        int[] sortedArr = Solution(arr);
        System.out.println("Sorted : "+Arrays.toString(sortedArr));
    }
}
