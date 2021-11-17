
/**
 * A simple Orc, lots of hp and good damage
 *
 * @author Kenny Castro-Monroy
 * @version 2021.11.16
 */
public class Orc extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_STR = 40;
    private static final int MAX_HP = 150;
    private static final int MIN_STR = 20;
    private static final int MIN_HP = 60;
    /**
     * Constructor for objects of class Orc
     */
    public Orc()
    {
        super(
            Randomizer.nextInt(MAX_HP-MIN_HP)+MIN_HP,    
            Randomizer.nextInt(MAX_STR-MIN_STR)+MIN_STR
        );
    }

}
