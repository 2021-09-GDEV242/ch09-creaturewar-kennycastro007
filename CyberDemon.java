
/**
 * a basic demon
 *
 * @author Kenny Castro-Monroy
 * @version 2021.11.16
 */
public class CyberDemon extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_STR = 40;
    private static final int MAX_HP = 100;
    private static final int MIN_STR = 20;
    private static final int MIN_HP = 25;
    /**
     * Constructor for objects of class CyberDemon
     */
    public CyberDemon()
    {
        super(
            Randomizer.nextInt(MAX_HP-MIN_HP)+MIN_HP,    
            Randomizer.nextInt(MAX_STR-MIN_STR)+MIN_STR
        );
    }

}
