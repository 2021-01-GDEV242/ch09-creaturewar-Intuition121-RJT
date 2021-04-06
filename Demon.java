
/**
 * Base demon class, not to be instantiated.
 *
 * @author Robert Tallafer
 * @version 2021-4-5
 */
public class Demon extends Creature
{
    
    /**
     * Constructor for Demon Creature
     */
    public Demon(int demon_strength,int demon_hp)
    {
     super(demon_strength,demon_hp);
    }

    /**
     * Method that calculates the damage done by the Demon
     * @return dmg the amount of damage done by the demon's attack
     */
    public int demonDamage()
    {
     
        int percent;
        percent = rndm.nextInt(20) + 1;  //5% chance that demon will inflict magical damage
        dmg = super.attack();
        if (percent == 2) {
            dmg = strength +50;
         
        }
        return dmg;   
    }
}
