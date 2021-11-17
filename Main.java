import java.util.ArrayList;

/**
 * Main class, only has a main method for entry
 *
 * @author Kenny Castro-Monroy
 * @version 2021.11.16
 */
public class Main
{

    public static void main() {

        //Team 1
        ArrayList<Creature> PlanktonFromEdEddAndEddy = new ArrayList<Creature>();

        // Team 2
        ArrayList<Creature> FourLabradorsInATrenchCoat = new ArrayList<Creature>();

        final int teamSize = 175;

        // fill team 1
        for (int index = 0; index < teamSize; index++) {
            int rand = Randomizer.nextInt(100);
            if(rand <= 30) {
                PlanktonFromEdEddAndEddy.add(new Human()); // 30% chance
            } else if(rand <= 60) {
                PlanktonFromEdEddAndEddy.add(new Elf()); // 30% chance
            } else if(rand <= 75) {
                PlanktonFromEdEddAndEddy.add(new Orc()); // 15% chance
            } else if(rand <= 90) {
                PlanktonFromEdEddAndEddy.add(new Dragonborn()); // 15% chance
            } else if(rand <= 93) {
                PlanktonFromEdEddAndEddy.add(new CyberDemon()); // 7% chance
            } else {
                PlanktonFromEdEddAndEddy.add(new Balrog()); // 3% chance
            }
        }

        // fill team 2
        for (int index = 0; index < teamSize; index++) {
            int rand = Randomizer.nextInt(100);
            if(rand <= 30) {
                FourLabradorsInATrenchCoat.add(new Human()); // 30% chance
            } else if(rand <= 60) {
                FourLabradorsInATrenchCoat.add(new Elf()); // 30% chance
            } else if(rand <= 75) {
                FourLabradorsInATrenchCoat.add(new Orc()); // 15% chance
            } else if(rand <= 90) {
                FourLabradorsInATrenchCoat.add(new Dragonborn()); // 15% chance
            } else if(rand <= 93) {
                FourLabradorsInATrenchCoat.add(new CyberDemon()); // 7% chance
            } else {
                FourLabradorsInATrenchCoat.add(new Balrog()); // 3% chance
            }
        }

        int challengerOneIndex = Randomizer.nextInt(PlanktonFromEdEddAndEddy.size()) - 1; 
        int challengerTwoIndex = Randomizer.nextInt(FourLabradorsInATrenchCoat.size()) - 1; 
        Creature challengerOne = PlanktonFromEdEddAndEddy.remove(challengerOneIndex);
        Creature challengerTwo = FourLabradorsInATrenchCoat.remove(challengerTwoIndex);

        while(PlanktonFromEdEddAndEddy.size() > 0 && FourLabradorsInATrenchCoat.size() > 0) {

            if (!challengerOne.isAlive()) {
                challengerOneIndex = Randomizer.nextInt(PlanktonFromEdEddAndEddy.size()) - 1;
                challengerOne = PlanktonFromEdEddAndEddy.remove(challengerOneIndex); 
            }
            if (!challengerTwo.isAlive()) {
                challengerTwoIndex = Randomizer.nextInt(FourLabradorsInATrenchCoat.size()) - 1; 
                challengerTwo = FourLabradorsInATrenchCoat.remove(challengerTwoIndex);
            }
            
            while(challengerOne.isAlive() && challengerTwo.isAlive()) {
                challengerOne.takeDamage(challengerTwo.attack());
                challengerTwo.takeDamage(challengerOne.attack());
            }
        }

        if(PlanktonFromEdEddAndEddy.size() == 0 && FourLabradorsInATrenchCoat.size() != 0) {
            System.out.println("Plankton from Ed, Edd, and Eddy has won!");
        } else if(PlanktonFromEdEddAndEddy.size() != 0 && FourLabradorsInATrenchCoat.size() == 0){
            System.out.println("The winner was four labradors in a trench coat");
        } else {
            System.out.println("Pause!!! Who ate my PB & J? Oh, they all ded");
        }
    }
    public static void runOneHundred() {
        for (int i = 0; i < 100; i++) {
            main();
        }
    }
}
