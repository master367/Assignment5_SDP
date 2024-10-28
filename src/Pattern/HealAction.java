package Pattern;
import State.Character;

public class HealAction extends GameAction {
    protected void performAction(Character character) {
        System.out.println("Character heals.");
    }
}
