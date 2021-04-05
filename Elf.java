
/**
 * Class creates an instance of an Elf Creature
 *
 * @author Robert Tallafer
 * @version 2021-4-5
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;
    /**
     * Constructor for Elf Creature
     */
    public Elf()
    {
     super(
      Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR,     
      Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP    
     );   
          
    }

    /**
     * Method that calculates the damage done by the Elf
     * 
     * @return dmg the amount of damage done by the elf's attack
     */
    public int elfDamage()
    {
        dmg=0;
        int percent;
        percent = rndm.nextInt(10) + 1;  //10% chance that elf will inflict magical damage
        dmg = super.attack();
        if (percent == 2) {
            dmg = strength * 2;
         
        }
        return dmg;   
    }
}
