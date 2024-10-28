package Pattern;

import State.Character;

public class AttackAction extends GameAction {
    protected void performAction(Character character) {
        character.attack();
    }
}
