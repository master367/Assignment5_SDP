package Strategy;

public class MeleeStrategy implements FightingStrategy {
    public void fight() {
        System.out.println("Character attacks in melee range.");
    }
}
