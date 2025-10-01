import java.util.Scanner;

public class Recursion {
    
    public static void calFact(int n, int fact){

        // baxse case
        if(n <= 1){
            System.out.println("Factorial : "+fact);
            return ;
        }

        // recursion logic
        fact = fact*n;
        
        calFact(n-1, fact);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("===========FACTORIAL CALCULATION=========");
        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        int f = 1;
        calFact(num , f);
        
    }
}
