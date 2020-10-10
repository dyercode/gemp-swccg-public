package com.gempukku.swccgo.logic.effects;

import com.gempukku.swccgo.game.PhysicalCard;
import com.gempukku.swccgo.game.SwccgGame;
import com.gempukku.swccgo.logic.modifiers.Modifier;
import com.gempukku.swccgo.logic.timing.Action;

/**
 * An effect that adds a modifier until the end of battle.
 */
public class MindscanCharacterUntilEndOfBattleEffect extends AddModifierWithDurationEffect {
    private PhysicalCard _self;
    private PhysicalCard _mindscanned;
    /**
     * Creates an effect that adds a modifier until the end of battle.
     * @param action the action adding the modifier
     * @param modifier the modifier
     * @param actionMsg the action message
     */
    public MindscanCharacterUntilEndOfBattleEffect(Action action, Modifier modifier, String actionMsg, PhysicalCard self, PhysicalCard mindscanned) {
        super(action, modifier, actionMsg);
        _self = self;
        _mindscanned = mindscanned;
    }

    @Override
    public final void doPlayEffect(SwccgGame game) {
        sendMsg(game);
        game.getModifiersEnvironment().addUntilEndOfBattleModifier(_modifier);

        //TODO if mindscanned character is a maintenance card give Bane a maintenance icon
        //TODO if mindscanned character has a keyword from its game text (Lando Calrissian (V) is a smuggler, for example) add that
        //TODO need to give Bane Malar all of the mindscanned character's modifiers since you can't do that in getGameTextWhileActiveInPlayModifiers
        if(game.getModifiersQuerying().hasMindscannedCharacter(game.getGameState(), _self)) {
            int i=0;
//            System.out.println("debug Bane Malar modifiers from source size="+game.getModifiersQuerying().getModifiersFromSource(game.getGameState(), _mindscanned).size());
            System.out.println("debug Bane Malar modifiers from source size="+_mindscanned.getBlueprint().getWhileInPlayModifiers(game, _mindscanned).size());
            for(Modifier m: _mindscanned.getBlueprint().getWhileInPlayModifiers(game, _mindscanned)) {//game.getModifiersQuerying().getModifiersFromSource(game.getGameState(), _mindscanned)) {
                System.out.println("debug Bane Malar "+(i++)+": "+m.getModifierType().toString() + "\t" + m.getForPlayer());
                try {
                    game.getModifiersEnvironment().addUntilEndOfBattleModifier(m.getCopyWithNewSource(_self, _self.getOwner(), game.getOpponent(_self.getOwner()),true));
                } catch(CloneNotSupportedException e) {
                    System.out.println("Bane Malar: clone modifier not allowed");
                }
            }
        }

    }
}
