import java.util.Arrays;
import java.util.Scanner;

/**
 * Insertion sort example program.
 *
 * Behaviour:
 * - Reads the array size and elements from standard input via a static
 *   initializer, then performs insertion sort on the array and prints the
 *   sorted result.
 *
 * Notes:
 * - The static initializer pattern is convenient for quick demos but will
 *   run on class load and is not recommended for library code.
 */
public class Insertion {
    // Number of elements to read
    static int size;

    // Input array populated by the static initializer
    static int[] arr;

    // Scanner used to read from System.in
    static Scanner sc = new Scanner(System.in);

    // Static initializer: read size and elements from stdin
    static {

        System.out.println("===== Insertion Sort =====");
        System.out.println("Enter the size :");
        size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter Elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

    }

    /**
     * Sort the array using insertion sort and return it.
     *
     * Algorithm notes:
     * - Insertion sort builds a sorted portion of the array one element at a time.
     *   For each element arr[i], it inserts it into the correct position among
     *   the previously sorted elements arr[0..i-1].
     * - The inner loop shifts larger elements to the right to make space for
     *   the key element.
     *
     * Complexity:
     * - Time: O(n^2) worst/average, O(n) best case (when the array is already sorted).
     * - Space: O(1) additional (in-place).
     * - Stable: Yes (relative order of equal elements is preserved).
     *
     * @param arr the array to sort (modified in-place)
     * @return the same array reference, now sorted
     */
    public static int[] solution(int[] arr) {
        for(int i =1; i<arr.length; i++){

            int key = arr[i];
            int j = i-1;
            // Shift elements of the sorted prefix that are greater than key
            // to one position ahead to make space for the key
            while (j >= 0 && key < arr[j]){

                arr[j+1] = arr[j];
                j--;
            }
            // Insert key at the correct position
            arr[j+1] = key;
        }

            return arr;
    }

    public static void main(String[] args) {
        System.out.println("Original Array : " + Arrays.toString(arr));
        System.out.println(Arrays.toString(solution(arr)));
    }
}