package State;

public class DefeatedState implements CharacterState {
    public void attack(Character character) {
        System.out.println("Cannot attack, character is defeated.");
    }
}
