
/**
 * Write a description of class Br here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bagualosaurus extends Dinosaur
{

    /**
     * Constructor for objects of class Bagualosaurus
     */
    public Bagualosaurus()
    {
        super("Bagualosaurus");
    }

    public boolean attack (Dinosaur def) // def stands for defender
    {
        if (def.getType().equals("Bagualosaurus"))
        {
            if(Math.random() < 0.25)  
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
            if (Math.random() < 0.55)
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
