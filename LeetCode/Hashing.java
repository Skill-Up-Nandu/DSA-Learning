// HASHSET : it i s a technique used in Data Stricture that eficiently stores and retrieve data in a way that allows for quick access.

import java.util.HashSet;
import java.util.Scanner;

public class Hashing {

    public static void main(String[] args){

        // creation
        HashSet <Integer> mySet = new HashSet<>();

        // insertion
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr five unique number : ");
        for(int i=0; i<5; i++){
            int key = sc.nextInt();
            mySet.add(key);
        }

        // print
        System.out.println("HashSet : "+mySet);
        System.out.println("Size : "+mySet.size());

        // deletion
        System.out.println("Element to remove : ");
        int rem = sc.nextInt();
        if(mySet.contains(rem)){
            mySet.remove(rem);
            System.out.println("Removed Successfully");
        }else{
            System.out.println("Element not Exists.");
        }
        
        System.out.println("Updated HashSet : "+mySet);
        System.out.println("Updated Size : "+mySet.size());
    
    }
}