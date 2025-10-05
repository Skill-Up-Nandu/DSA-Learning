import java.util.*;

/**
 * Selection sort example program.
 *
 * Behaviour:
 * - Reads the array size and elements from standard input in a static
 *   initializer, then provides a `solution` method that performs an
 *   in-place selection sort and returns the sorted array.
 *
 * Usage:
 * - Run the program, enter the size, then enter the specified number of
 *   integer elements. The program prints the unsorted and sorted arrays.
 */
public class Selection {

    // Number of elements to read from input
    static int size;

    // Array to hold the input values
    static int[] arr;

    // Scanner for reading user input from System.in
    static Scanner sc = new Scanner(System.in);

    // Static initializer: reads input once when the class is loaded
    static {
        System.out.println("= = = = = SELECTION SORT = = = = =");
        System.out.println("Enter Size : ");
        size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter Elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

    }

    /**
     * Sorts the provided array in-place using the selection sort algorithm
     * and returns the reference to the same array.
     *
     * Algorithm notes:
     * - Selection sort divides the array into a sorted prefix and an
     *   unsorted suffix. For each position i it finds the smallest element
     *   in the suffix and swaps it into position i.
     * - This implementation performs exactly n-1 outer iterations and
     *   finds the minimum by scanning the remainder of the array.
     *
     * Complexity:
     * - Time: O(n^2) in all cases (best/average/worst) because it always
     *   scans the unsorted portion to find the minimum.
     * - Space: O(1) additional space (in-place).
     * - Stability: Not stable by default (swapping can change relative order
     *   of equal elements).
     *
     * @param arr array to sort (modified in-place)
     * @return the same array reference, now sorted
     */
    public static int[] solution(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            // Assume the element at i is the smallest in the remaining array
            int small = i;
            // Find the index of the smallest element in arr[i+1..end]
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[small] > arr[j]) {
                    small = j;
                }
            }
            // Swap the found minimum element into position i
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        // Print unsorted and sorted arrays using the static input array
        System.out.println("Unsorted Array : " + Arrays.toString(arr));
        System.out.println("Sorted Array : "+ Arrays.toString(solution(arr)));
    }
}
