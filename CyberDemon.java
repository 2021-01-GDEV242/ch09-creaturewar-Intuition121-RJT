
/**
 * Class creates an instance of a CyberDemon Demon Creature
 *
 * @author Robert Tallafer
 * @version 2021-4-5
 */
public class CyberDemon extends Demon
{
    private static final int MAX_CYBRDMN_HP = 100;
    private static final int MIN_CYBRDMN_HP = 25;
    private static final int MAX_CYBRDMN_STR = 40;
    private static final int MIN_CYBRDMN_STR = 20;
    /**
     * Constructor for Cyber Demon Creature
     */
    public CyberDemon()
    {
        super(
      Randomizer.nextInt(MAX_CYBRDMN_STR-MIN_CYBRDMN_STR)+MIN_CYBRDMN_STR,
      Randomizer.nextInt(MAX_CYBRDMN_HP-MIN_CYBRDMN_HP)+MIN_CYBRDMN_HP  
     );
          
    }

    /**
     * Method that calculates the damage done by the Cyber Demon
     * @return dmg the amount of damage done by the cyber demon's attack
     */
    public int cyberdemonDamage()
    {
     
       dmg = super.demonDamage();
        
        return dmg;   
    }
}
