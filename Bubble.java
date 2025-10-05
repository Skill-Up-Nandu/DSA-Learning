import java.util.*;

public class Bubble {
    static int size;
    static int[] arr;
    static Scanner sc = new Scanner(System.in);

    static {

        System.out.println("===== Bubble Sort =====");
        System.out.println("Enter the size :");
        size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter Elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] Solution(int[] arr) {
        int temp = 0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] sortedArr = Solution(arr);
        System.out.println("Sorted : "+Arrays.toString(sortedArr));
    }
}
