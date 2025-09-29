import java.util.*;

public class Linear{

    public static int search(int[] arr , int x){

        // loop for search
        for(int i=0; i<arr.length; i++){

            if (arr[i] == x){
                return i;
            }
        }
        return -1;

    }


    public static void main(){
        int[] arr = {5,8,9,63,45,12,01,77,56};
        System.out.println("Array : "+ Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);

        System.out.println("Element for Search : ");
        int x = sc.nextInt();

        int result = search(arr , x);

        if (result == -1){
            System.out.println("Element "+ x + " not found !");
        }else{
            System.out.println("Element "+x+" found at index : "+result);
        }
    }
}