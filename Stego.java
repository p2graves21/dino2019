
/**
 * Abstract class Stego - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public class Stego extends Dinosaur
{
   
    /**
     * Constructor for objects of class Stego
     */
    public Stego()
    {
        super("Stego");
    }

    public boolean attack (Dinosaur def) // def stands for defender
    {
       if (def.getType().equals("Stego"))
       {
         if(Math.random() < 0.45)  
           {
               this.update(def, true);
               
               return true;
               
            }
           else
           {
             this.update(def, false);
             return false;
           
        }
        }
        else 
        {
         if (Math.random() < 0.95)
         {
             this.update(def, true);
             return true;
             
            }
            else 
            {
                this.update(def, false);
                return false;
            }
        }
       
   }
}
