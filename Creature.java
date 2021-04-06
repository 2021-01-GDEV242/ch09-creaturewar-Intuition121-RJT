import java.util.Random;

/**
 * Abstract class Creature - 
 * The creature is the main class from which all other battling creatures derive.
 * It is the creature's job to maintain current health values in response to 
 * requests to takeDamage. It also must report if
 * the creature is alive or knocked out. The creature is also responsible for calculating
 * damage delivered based on the creature's strength (1 to str) 
 * 
 * @author Robert Tallafer
 * @version 2021-4-5
 */

public abstract class Creature
{
    public int strength;        // The strength of this creature
    private int max_hp;     // The maximum hit points the creature can have (used if healing enabled)
    public int health;         // the current numberof hit points the creature has
    public int dmg;        // The number of damage a creature inflicts
    public Random rndm = new Random();
    
    /**
     * default constructor - this should never actually run.
     * It is the job of dervived classes to set up the proper number of hit points and 
     * strength for the subclass
     */
    public Creature (){
        strength=10;
        health=10;
        max_hp = health;
    }
    
    /**
     * Create a creature with a given strength and hit point level. 
     * Store max hitpoints to allow for healing to be implemented later
     * Heals must never allow for more hit points than the creature started
     * with
     * @param str the strength of the creature, used to calculate damage
     * @param hp the health of the creature at the start of the simulation, and the current health levels during battle
     */
    public Creature (int str, int hp) {
       strength =str; // store starting str
       health = hp;  // store starting hp
       max_hp = hp;
       if(hp>max_hp)
       {
         hp=max_hp;  
           
        }
       
    }
    
    
    /**
     * Allows a creature to determine how much damage it is causing in this round of battle
     * @return a value between 1 and str to be used to cause damage to another creature
     */
    public int attack(){

        dmg= rndm.nextInt(strength)+1;
        return dmg;
    }
    
    
    /**
     * Is this creature still capable of fighting?
     * @return true when current hit point level is greater than zero
     */
    public boolean isAlive() {
        boolean alive=false;
        if(health >0)
        {
         alive= true;   
        }
        
        return alive; 
    }
    
    /**
     * Is this creature knockedOut?
     * @return true when current hit point level is less than or equal to zero
     */
    public boolean isKnockedOut() {
        boolean KOed=false;
        if(health <=0)
        {
         KOed= true;   
        }
        
        return KOed;
    }
    
    
    /**
     * takeDamage receives a value for the amount of damage to subtract from 
     * the current total of hit points
     * @param damage value to remove from hit point count
     */
    public void takeDamage(int damage) {
        health=health-damage;
    }
    
    /**
     * getHealth return your current hit points 
     * 
     */
    public int getHealth() {
        
        return health;
    }
}
