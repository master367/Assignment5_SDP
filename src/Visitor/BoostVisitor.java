package Visitor;

import State.PoweredUpState;
import State.Character;

public class BoostVisitor implements EffectVisitor {
    public void applyEffect(Character character) {
        System.out.println("Boost effect applied to character.");
        character.setState(new PoweredUpState());
    }
}
