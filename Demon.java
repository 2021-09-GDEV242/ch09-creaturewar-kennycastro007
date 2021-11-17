
/**
 * a demonic creature
 *
 * @author Kenny Castro-Monroy
 * @version 2021.11.16
 */
public class Demon extends Creature
{
    /**
     * Constructor for objects of class Demon
     */
    public Demon(int str, int hp)
    {
        super(str, hp);
    }

    public int attack() {
        int dmg = super.attack();
        if(Randomizer.nextInt(20) == 1)
            return dmg + 50;
        else return dmg;
    }

}
