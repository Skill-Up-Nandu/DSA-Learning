import java.util.HashSet;
import java.util.Scanner;

public class LoopH{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet <Integer> mySet = new HashSet<>();

        // length of array
        System.out.println("Enter lenght of values : ");
        int len = sc.nextInt();

        // insertion of values
        System.out.println("Enter Values : ");
        for(int i=0; i<len ; i++){
            int num = sc.nextInt();
            mySet.add(num);
        }

        // printing
        System.out.println("Values : ");
        for(int num : mySet){
            System.out.println(num);
        }

    }
}