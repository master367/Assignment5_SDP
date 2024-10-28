package State;

public class NormalState implements CharacterState {
    public void attack(Character character) {
        System.out.println("Normal attack with base strength.");
    }
}
