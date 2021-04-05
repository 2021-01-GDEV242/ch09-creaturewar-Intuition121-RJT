import java.util.ArrayList;
/**
 * The Battle class populates two armies that will fight each other 1v1 until there are none left on a side
 *
 * @author Robert Tallafer
 * @version 2021-4-5
 */
public class Battle
{
    // instance variables - replace the example below with your own
    private ArrayList<Creature> army1;
    private ArrayList<Creature> army2;
    private Creature creature1;
    private Creature creature2;
    /**
     * Constructor for objects of class Battle.The army populates here.
     */
    public Battle()
    {
        army1 = new ArrayList<Creature>();
        army2 = new ArrayList<Creature>();   
        //create army1 creatures
        while(army1.size() <100)
        {
         int num=Randomizer.nextInt(10);
         if(num<6)
         {
          army1.add(new Human());   
            }
            else
         {
          army1.add(new Elf());   
            }
        }
        //create army2 creatures
            while(army2.size() <50)
        {
         int num=Randomizer.nextInt(25);
         if(num<22)
         {
          army2.add(new Human());   
            }
         else if(num<25)
         {
          army2.add(new CyberDemon());   
            }   
            else
         {
          army2.add(new Balrog());   
            }   
        }
        
        Fight();
    }

    /**
     * Method where the battle commences
     * Print in terminal who won and who lost
     */
    public void Fight()
    {
      int c1=0, c2=0; //index variables for each army
      
      
      //The battle
       while(army1.size() != 0 && army2.size() != 0)
      {
        
        if(army1.get(c1).isAlive()&&army2.get(c2).isAlive())
        {
         army1.get(c1).takeDamage(army2.get(c2).attack());
         army2.get(c2).takeDamage(army1.get(c1).attack());   
        }
          
        if(army1.get(c1).isKnockedOut())
        {
         army1.remove(c1); 
        }
        if(army2.get(c2).isKnockedOut())
        {
         army2.remove(c2);  
        }
         

        }
      
        
      //Check who wins 
        if(army1.size()==0&&army2.size() !=0)
        {
         System.out.println("Army1 was defeated, army2 won!");   
        }
        else if(army1.size()!=0&&army2.size() ==0)
        {
         System.out.println("Army2 was defeated, army1 won!");   
        }
        else
        {
         System.out.println("The outcome of the war was a draw");    
        }
        
    }
    
}
