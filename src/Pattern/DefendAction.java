package Pattern;
import State.Character;

public class DefendAction extends GameAction {
    protected void performAction(Character character) {
        System.out.println("Character defends.");
    }
}
