import java.util.*;

// class of having searching logic
public class Linear{

    // fun for linear search
    public static int search(int[] arr , int x){

        // loop for search
        for(int i=0; i<arr.length; i++){

            // return the index of key
            if (arr[i] == x){
                return i;
            }
        }
        // if not found return 
        return -1;

    }


    public static void main(){
        
        // initialize an array
        int[] arr = {5,8,9,63,45,12,01,77,56};
        System.out.println("Array : "+ Arrays.toString(arr));

        // get key
        Scanner sc = new Scanner(System.in);
        System.out.println("Element for Search : ");
        int x = sc.nextInt();

        // function call
        int result = search(arr , x);

        // print the result
        if (result == -1){
            System.out.println("Element "+ x + " not found !");
        }else{
            System.out.println("Element "+x+" found at index : "+result);
        }
    }
}