
/**
 * Abstract class Dinosaur - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Dinosaur
{
    // instance variables - replace the example below with your own
    private String type;   
    private int age;
    private String gender; 
    private int wins;
    private int battleCount;
    private int health; // 0 = dead and 100 = perfectly alive
    private boolean isAlive;
    
    public Dinosaur (String t)
    {
      this.type = t;
      this.age = 0;
      this.wins = 0;
      this.health = 10; 
      this.isAlive = true;
      if (Math.random() < 0.5)
      this.gender = "M";
      else 
      this.gender = "F";
      
        
    }
      
    /** **********************************  getters **************************************************** */
    public String getType()
    {
          return this.type;
    }
    public String getGender()
    {
        return this.gender;
    }
    
    public int getAge ()
    {
        return this.age;
        
        
    }
    public int getWins ()
    {
        return this.wins;
        
    }
    public int getBattleCount ()
    {
        return this.battleCount;
        
    }
    public int getHealth()
    {
     return this.health;   
        
    }
    public boolean getisAlive()
    {
        return true;
        
    }
    
    /** **********************************  setters **************************************************** */
    
     public void setType (String t)
    {
        
        this.type = t;
        
    }
    public void setGender (String g)
    {
        this.gender = g;
        
    }
    public void setAge (int a)
    {
        
        this.age = a;
        
    }
    public void setWins (int w)
    {
        this.wins = w;
        
    }
    public void setBattleCount (int bc)
    {
        this.battleCount = bc;
        
    }
    public void setHealth(int h)
    {
       this.health = h;
        
    }
    public void setIsAlive(boolean isAlive)
    {
        this.isAlive = true;
        
    }
    /** **********************************  Methods  **************************************************** */
    
    
     public void ageUp()
    {
        this.age++;
        // increase health by 10 until age is 10, 
        // decrease health by 10 between ages 25 -30
        // decrease heath by 20 over the age of 30. 
     
        if (age > 10)
        {
            this.health += 10;
        }
        else if ( age < 30)
        {
            this.health -= 20;
        }
        else if (age < 25)
        {
            this.health -= 10;
        }
        
        this.checkHealth();
        
        
        
        
        
    }
    
    public void checkHealth ()
    {
       if (this.health <= 0)
       {
         if (this.isAlive == true) // health is 0, but isAlive is true = just died
           System.out.println("This dino: " + this.toString() + ", just died."); 
           this.isAlive = false;
         this.health = 0;
           
        }
        else if (this.health > 100)
        this.health = 100;
    }
    public void update( Dinosaur def, boolean winner)
    {
     this.battleCount++;
     def.setBattleCount(def.getBattleCount () + 1);
     if(winner ==  true) // if (winner)  //
     {
         this.wins++;   //increase wins of winning dino
         def.setHealth (def.getHealth() -20); // decreasing the health of losing defender
         def.checkHealth(); //check health of losing dino
        }
        else
        {
         def.setWins(def.getWins()+1);   //def wins increase
         this.health -= 20; // decreasing the health of losing attacker
         this.checkHealth(); //check health of losing dino (attacker)
            
        }
        
        
        
    }
    
    public abstract boolean attack(Dinosaur def);
    
    
    public String toString()
    {
      String temp = "";
      temp = this.type + " " + this.age + " " +this.gender + " " + this.health;
      
      
      return temp;
        
    }

   
    
}
    

