
/**
 * a basic creature with additional magical potential
 *
 * @author Kenny Castro-Monroy
 * @version 2021.11.16
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_STR = 18;
    private static final int MAX_HP = 25;
    private static final int MIN_STR = 5;
    private static final int MIN_HP = 8;
    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        super(
            Randomizer.nextInt(MAX_HP-MIN_HP)+MIN_HP,    
            Randomizer.nextInt(MAX_STR-MIN_STR)+MIN_STR
        );
    }

    public int attack() {
        int dmg = super.attack();
        if(Randomizer.nextInt(10) == 1)
            return dmg * 2;
        else return dmg;
    }

}
