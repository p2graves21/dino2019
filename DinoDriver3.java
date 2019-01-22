
/**
 * Write a description of class DinoDriver3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.util.ArrayList;

public class DinoDriver3
{
    public static void main (String[] args)
    {
     ArrayList<Dinosaur> myPop = new ArrayList<Dinosaur>();
     System.out.println ("Enter number of dinos you want. ");
     Scanner scan = new Scanner (System.in);
     int s = scan.nextInt();
     
     for (int i = 0; i<s; i++)
     {
         double num = Math.random();
         
         
         if (num < 0.33)
         myPop.add(new TRex());
         else if (num < 0.67)
         myPop.add(new Bagualosaurus());
         else
         myPop.add(new Stego () );
         
        }
     
        
     for(Dinosaur d: myPop)
     {
         int rand = (int) (Math.random() *33);
         for(int i =0 ; i <rand ; i++)
         d.ageUp();
         
        }
        
      int rand = -1;  
     for (Dinosaur d : myPop)   // or for(int i = 0; i <myPop.size(); i++
     {

      rand = (int) (Math.random ()* myPop.size());
      d = myPop.get(rand);
         d.ageUp();
       d.attack (d);
      
      System.out.println (d);
      System.out.println (rand);
     }
      
     for (int i = 0; i > myPop.size(); i++)
     {
         
         
         
         
         
        }
        
     
    }
    public static int getLivingDinos (ArrayList <Dinosaur> p )
    {
        int living = 0;
        
        for (Dinosaur d: p)
        {
            if (d.getisAlive () == true)
            {
                living++;
                
                
                
            }

        
        }
        //System.out.println (living + "are alive");
        return living;
        
        
    }
        public static int getDefender (ArrayList<Dinosaur> p, Dinosaur attacker)
    {
        Dinosaur def = null ;
         int rand = -1;
        do {
             rand = (int) (Math.random()*p.size());
            def = p.get(rand);
            

        }
        while (def == attacker && def.getisAlive() != false);

        return rand;
        
        
        
        
    }
}
