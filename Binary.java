// optimization 
// in calculating mid , if we have start = INT_MAX AND end = INT_MAX
// then (start+end)/2 ,will give a condition of overflow.
// to resolve it use ->
// start + (end - start)/2





import java.util.*;

public class Binary {

    // function having login of binary search
    public static int logic(int[] arr, int start, int end , int key){

        // loop for finding value
        while ( start <= end){

            // middle element of array

            // normal mid calculation (overflow condition may occur)
            // int mid = ( start + end )/2;

            // Optimised mid calculation
            int mid = start + (end -start)/2;
            

            // conditions to find exact element
            if (key > arr[mid]){
                start = mid+1;
            }
            else if (key < arr[mid]) {
                end = mid - 1;
            }else{
                return mid;
            }
        }

        // return if not found
        return -1;  
    }

    public static void main(String[] args) {

        // initialize array
        int[] arr = { 12, 36, 45, 51, 66, 71, 84, 99 };
        System.out.println("Array : " + Arrays.toString(arr));

        // get key
        Scanner sc = new Scanner(System.in);
        System.out.println("Key : ");
        int key = sc.nextInt();

        // function call
        int result = logic(arr, 0, arr.length - 1, key);

        // print result
        if (result == -1) {
            System.out.println("Element " + key + " not found.");
        } else {
            System.out.println("Element " + key + " found at index : " + result);
        }
    }
}


