package com.gempukku.swccgo.cards.set301.dark;

import com.gempukku.swccgo.cards.AbstractPermanentWeapon;
import com.gempukku.swccgo.cards.AbstractSith;
import com.gempukku.swccgo.cards.conditions.WithCondition;
import com.gempukku.swccgo.common.ExpansionSet;
import com.gempukku.swccgo.common.Icon;
import com.gempukku.swccgo.common.Keyword;
import com.gempukku.swccgo.common.Persona;
import com.gempukku.swccgo.common.Rarity;
import com.gempukku.swccgo.common.Side;
import com.gempukku.swccgo.common.Species;
import com.gempukku.swccgo.common.Statistic;
import com.gempukku.swccgo.common.TargetingReason;
import com.gempukku.swccgo.common.Title;
import com.gempukku.swccgo.common.Uniqueness;
import com.gempukku.swccgo.filters.Filter;
import com.gempukku.swccgo.filters.Filters;
import com.gempukku.swccgo.game.PhysicalCard;
import com.gempukku.swccgo.game.SwccgGame;
import com.gempukku.swccgo.logic.actions.FireWeaponAction;
import com.gempukku.swccgo.logic.actions.FireWeaponActionBuilder;
import com.gempukku.swccgo.logic.modifiers.Modifier;
import com.gempukku.swccgo.logic.modifiers.PowerModifier;

import java.util.LinkedList;
import java.util.List;


/**
 * Set: Virtual Premium Set
 * Type: Character
 * Subtype: Sith
 * Title: Asajj Ventress With Lightsabers
 */
public class Card301_003 extends AbstractSith {
    public Card301_003() {
        super(Side.DARK, 1, 5, 4, 5, 7, "Asajj Ventress With Lightsabers", Uniqueness.UNIQUE, ExpansionSet.DEMO_DECK, Rarity.V);
        setLore("Female Dathomirian assassin");
        setGameText("Power +1 with Dooku. Permanent weapon is •Asajj's Lightsabers (may target a character for free, or target two characters using 1 Force; draw two destiny; target(s) hit and forfeit -2 if total destiny > total defense value).");
        addIcons(Icon.PREMIUM, Icon.EPISODE_I, Icon.PILOT, Icon.WARRIOR, Icon.PERMANENT_WEAPON, Icon.SEPARATIST, Icon.VIRTUAL_SET_P);
        addKeywords(Keyword.FEMALE, Keyword.ASSASSIN);
        setSpecies(Species.DATHOMIRIAN);
        addPersona(Persona.VENTRESS);
    }

    @Override
    protected List<Modifier> getGameTextWhileActiveInPlayModifiers(SwccgGame game, final PhysicalCard self) {
        List<Modifier> modifiers = new LinkedList<Modifier>();
        modifiers.add(new PowerModifier(self, new WithCondition(self, Filters.Dooku), 1));
        return modifiers;
    }

    // Define "Asajj's Lightsabers" permanent weapon
    @Override
    protected AbstractPermanentWeapon getGameTextPermanentWeapon() {
        AbstractPermanentWeapon permanentWeapon = new AbstractPermanentWeapon(Title.Asajjs_Lightsabers, Uniqueness.UNIQUE) {
            @Override
            public List<FireWeaponAction> getGameTextFireWeaponActions(String playerId, SwccgGame game, PhysicalCard self, boolean forFree, int extraForceRequired, PhysicalCard sourceCard, boolean repeatedFiring, Filter targetedAsCharacter, Float defenseValueAsCharacter, Filter fireAtTargetFilter, boolean ignorePerAttackOrBattleLimit) {
                List<FireWeaponAction> actions = new LinkedList<FireWeaponAction>();

                FireWeaponActionBuilder actionBuilder = FireWeaponActionBuilder.startBuildPrep(playerId, game, sourceCard, self, this, forFree, extraForceRequired, repeatedFiring, targetedAsCharacter, defenseValueAsCharacter, fireAtTargetFilter, ignorePerAttackOrBattleLimit)
                        .targetForFree(Filters.or(Filters.character, targetedAsCharacter), TargetingReason.TO_BE_HIT).finishBuildPrep();
                if (actionBuilder != null) {

                    // Build action using common utility
                    FireWeaponAction action = actionBuilder.buildFireWeaponWithHitAction(2, Statistic.DEFENSE_VALUE, false, -2);
                    actions.add(action);
                }

                FireWeaponActionBuilder actionBuilder2 = FireWeaponActionBuilder.startBuildPrep(playerId, game, sourceCard, self, this, forFree, extraForceRequired, repeatedFiring, targetedAsCharacter, defenseValueAsCharacter, fireAtTargetFilter, ignorePerAttackOrBattleLimit)
                        .targetUsingForce(2, Filters.or(Filters.character, targetedAsCharacter), 1, TargetingReason.TO_BE_HIT).finishBuildPrep();
                if (actionBuilder2 != null) {

                    // Build action using common utility
                    FireWeaponAction action2 = actionBuilder2.buildFireWeaponWithHitAction(2, Statistic.DEFENSE_VALUE, false, -2);
                    actions.add(action2);
                }

                return actions;
            }
        };
        permanentWeapon.addKeyword(Keyword.LIGHTSABER);
        return permanentWeapon;
    }
}


