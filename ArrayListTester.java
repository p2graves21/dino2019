
/**
 * Write a description of class ArrayListTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTester
{
    public static void main (String[] args)
    {
        System.out.println("How many words: ");
        Scanner scan = new Scanner (System.in);
        Scanner scan2 = new Scanner (System.in);
        int numWords = scan.nextInt();
        System.out.println (numWords);
        
        ArrayList<String> words = new ArrayList<String>(); // to create an array, only thing that can go into
        //an array list are objects; the <string> tells the compiler that I want to make a list where I 
        // can add string to it
        
        //words.add("fun"); //adds to the array, the method used is add
        
        System.out.println(words.size());
        words.add("fun");
        words.add("work");
        words.add (0 , "sleep"); // wants to know the position on where to put it in and then the object
        System.out.println(words.size());
        words.remove("work");
        
        
        System.out.println(words); // it will compile because words is an object, the the object has a tostring
        
        
        
        
        
        //difference between Array and Array list is Array list can grow and shrink on the fly
        //Arrays are helpful, but you gotta know how many slots you are working with
        //
        
    }
}
