package State;

public class PoweredUpState implements CharacterState {
    public void attack(Character character) {
        System.out.println("Powered-up attack with increased strength!");
    }
}
