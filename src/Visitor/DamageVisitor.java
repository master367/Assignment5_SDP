package Visitor;
import State.DefeatedState;
import State.Character;

public class DamageVisitor implements EffectVisitor {
    public void applyEffect(Character character) {
        System.out.println("Damage effect applied to character.");
        character.setState(new DefeatedState());
    }
}
