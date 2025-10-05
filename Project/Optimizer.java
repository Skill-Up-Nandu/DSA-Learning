import java.util.*;

class Solution {

    public int showMenu(Scanner sc){
        System.out.println("========= Main Menu =========");
        System.out.println("1. Sorting");
        System.out.println("2. Searching");
        System.out.println("------------------------------");
        System.out.println("Your Choice : ");
        return sc.nextInt();
    }
}


public class Optimizer {

    // static ArrayList<Integer> arrS = new ArrayList<>();
    static ArrayList<Integer> arrI = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    static {
        System.out.println("Enter Elements ('end' as the last element) : ");
        while (sc.hasNextInt()){
            arrI.add(sc.nextInt());
        }
        sc.nextLine();
    }

    
    public static void main(String[] args) {
        System.out.println(arrI);
        Solution obj = new Solution();
        int option = obj.showMenu(sc); 
        System.out.println(option);
    }
}
