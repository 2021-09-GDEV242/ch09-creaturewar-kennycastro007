
/**
 * a demon that can attack twice each round
 *
 * @author Kenny Castro-Monroy
 * @version 2021.11.16
 */
public class Balrog extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_STR = 100;
    private static final int MAX_HP = 200;
    private static final int MIN_STR = 50;
    private static final int MIN_HP = 80;
    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        super(
            Randomizer.nextInt(MAX_HP-MIN_HP)+MIN_HP,    
            Randomizer.nextInt(MAX_STR-MIN_STR)+MIN_STR
        );
    }

    public int attack() {
        int dmg = super.attack();
        return dmg + super.attack();
    }

}
