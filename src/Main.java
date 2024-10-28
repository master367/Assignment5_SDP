import Pattern.AttackAction;
import Pattern.DefendAction;
import Pattern.GameAction;
import Pattern.HealAction;
import State.PoweredUpState;
import Strategy.MagicStrategy;
import Visitor.BoostVisitor;
import Visitor.DamageVisitor;
import Visitor.EffectVisitor;
import State.Character;

public class Main {
    public static void main(String[] args) {
        Character character = new Character();


        character.setState(new PoweredUpState());
        character.attack();


        character.setStrategy(new MagicStrategy());
        character.attack();


        GameAction attack = new AttackAction();
        GameAction defend = new DefendAction();
        GameAction heal = new HealAction();

        attack.executeAction(character);
        defend.executeAction(character);
        heal.executeAction(character);


        EffectVisitor boost = new BoostVisitor();
        EffectVisitor damage = new DamageVisitor();

        character.accept(boost);
        character.accept(damage);
    }
}
