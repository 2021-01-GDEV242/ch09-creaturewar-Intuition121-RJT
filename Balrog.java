
/**
 * Class creates an instance of a Balrog Demon Creature
 *
 * @author Robert Tallafer
 * @version 2021-4-5
 */
public class Balrog extends Demon
{
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;
    /**
     * Constructor for Balrog Demon Creature
     */
    public Balrog()
    {
        super(
      Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR,
      Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP  
     );
          
    }

    /**
     * Method that calculates the damage done by the balrog
     * @return dmg the amount of damage done by the balrog's attack
     */
    public int balrogDamage()
    {
        dmg=0;
        
        int dmg_twice = super.demonDamage();
        dmg_twice+=super.demonDamage();//attack is done twice
        
        dmg=dmg_twice;
        return dmg;   
    }
}
