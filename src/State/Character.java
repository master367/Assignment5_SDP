package State;

import Strategy.FightingStrategy;
import Strategy.MeleeStrategy;
import Visitor.EffectVisitor;


public class Character {
    private CharacterState state;
    private FightingStrategy strategy;

    public Character() {

        this.state = new NormalState();
        this.strategy = new MeleeStrategy();
    }

    public void setState(CharacterState state) {
        this.state = state;
    }

    public void setStrategy(FightingStrategy strategy) {
        this.strategy = strategy;
    }

    public void attack() {
        state.attack(this);
        strategy.fight();
    }

    public void accept(EffectVisitor visitor) {
        visitor.applyEffect(this);
    }
}

