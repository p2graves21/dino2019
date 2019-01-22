
/**
 * Write a description of class DinoDriver1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DinoDriver1
{
    public static void main (String[] args)
    {
     //Dinosaur d = new Dinosaur ("Dino");
        
     Dinosaur d1 = new TRex();
     Dinosaur d2 =  new Stego();
     Dinosaur d3 = new Stego();
     Dinosaur d4 = new Bagualosaurus();
     d1.setHealth(100);
     d2.setHealth(100);
     
     int winCount = 0;
     //TRex t1 = new TRex ();
     
    // Dinosaur d1 = new TRex ();
    // def defDino = new def ();
     for (int i = 0; i<10; i++)
     {
         if (d1.attack(d2) )
         winCount++;
         System.out.println(d1.toString() + " *** " + d2.toString());
    }
    System.out.println(" " + winCount + " out of 100 attacks");
    
   }
}
