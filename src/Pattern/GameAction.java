package Pattern;
import State.Character;

public abstract class GameAction {
    public final void executeAction(Character character) {
        prepareAction();
        performAction(character);
        completeAction();
    }

    protected abstract void performAction(Character character);

    protected void prepareAction() {
        System.out.println("Preparing action...");
    }

    protected void completeAction() {
        System.out.println("Action complete.");
    }
}
