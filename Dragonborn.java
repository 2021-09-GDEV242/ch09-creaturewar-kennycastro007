
/**
 * a humanoid with the appearance of a dragon standing erect
 *
 * @author Kenny Castro-Monroy
 * @version 2021.11.16
 */
public class Dragonborn extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_STR = 30;
    private static final int MAX_HP = 75;
    private static final int MIN_STR = 15;
    private static final int MIN_HP = 50;
    /**
     * Constructor for objects of class Dragonborn
     */
    public Dragonborn()
    {
        super(
            Randomizer.nextInt(MAX_HP-MIN_HP)+MIN_HP,    
            Randomizer.nextInt(MAX_STR-MIN_STR)+MIN_STR
        );
    }

    public void takeDamage(int damage) {
        if(Randomizer.nextInt(2) == 1) {
            damage /= 10;
        }
        super.takeDamage(damage);
    }

}
