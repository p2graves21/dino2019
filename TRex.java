
/**
 * Write a description of class TRex here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TRex extends Dinosaur
{

    /**
     * Constructor for objects of class TRex
     */
    public TRex()
    {
        super("TRex");
    }

    public boolean attack (Dinosaur def) // def stands for defender
    {
        if (def.getType().equals("TRex"))
        {
            if(Math.random() < 0.55)  
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
        
       
        
        else if (def.getType().equals("Stego"))
        {
            if(Math.random() < 0.65)
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
            System.out.println ("defend is an unknown dino");
            if(Math.random () < 0.65)
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
