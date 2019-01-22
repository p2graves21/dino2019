
/**
 * Write a description of class DinoDriver2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DinoDriver2
{
    public static void main (String[] args)
    {
        Dinosaur[] pop = new Dinosaur[100];

        for (int i = 0; i < 33 ; i++)
        {
            pop[i] = new TRex ();
        }
        for (int i = 33; i < 66 ; i++)
        {
            pop[i] = new Stego ();
        }
        for (int i = 66; i < pop.length ; i++)
        {
            pop[i] = new Bagualosaurus ();
        }

        for (int i = 0 ; i < pop.length; i++)
        {
            int rand = (int) (Math.random() * 35);
            for (int j = 0 ; j > rand ; j++ )
            {
                pop[i].ageUp();
            }

        }    

        //for (Dinosaur d : pop)
        //{   
        //Dinosaur defend = DinoDriver2.getDefender (pop, d);
        // System.out.println (" Att: " + d + "Def: " + defend );
        //}
        int winCount = 0;
        int battleCount = 0;
        int deadCount = 0;
        
        for (Dinosaur d : pop)
        {   
            if (d.getisAlive() == true && DinoDriver2.livingDinos(pop) > 1) //&& //livingDinos(pop) <= 2) 
            {
                Dinosaur defend = DinoDriver2.getDefender (pop, d);
                battleCount++;
                if(d.attack(defend))
                { winCount++;
                 
                }
                
                
             }
        }

        System.out.println ("Total battles: " + battleCount +  "      " + "Total wins: " + winCount + "    " + deadCount + " have died");
        //for (Dinosaur d : pop)     // for each loop
        //System.out.println(d);

        // int[] nums = new int[10];
        // System.out.println (nums[0]);
        // for(int i = 0; i<nums.length; i++)
        // {
        // nums [i] = 10 + i;   

        // }
        // for(int i = 0; i<nums.length; i++)
        // {
        // System.out.println (nums[i]);

        // }

        // for(int answer : nums)
        // {
        // System.out.println(answer);

        // }
    }

    public static int livingDinos ( Dinosaur [] p  )
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
    
    public static Dinosaur getDefender (Dinosaur [] p, Dinosaur attacker)
    {
        Dinosaur def ;

        do {
            int rand = (int) (Math.random()*p.length);
            def = p[rand];

        }
        while (def == attacker && def.getisAlive() != false);

        return def;
    }

}

