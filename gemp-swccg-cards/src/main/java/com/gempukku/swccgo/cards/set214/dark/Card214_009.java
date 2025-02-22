package com.gempukku.swccgo.cards.set214.dark;

import com.gempukku.swccgo.cards.AbstractCapitalStarship;
import com.gempukku.swccgo.cards.AbstractPermanentAboard;
import com.gempukku.swccgo.cards.AbstractPermanentPilot;
import com.gempukku.swccgo.cards.conditions.AloneCondition;
import com.gempukku.swccgo.common.*;
import com.gempukku.swccgo.filters.Filters;
import com.gempukku.swccgo.game.PhysicalCard;
import com.gempukku.swccgo.game.SwccgGame;
import com.gempukku.swccgo.logic.modifiers.ForceIconsEqualizedModifier;
import com.gempukku.swccgo.logic.modifiers.ImmuneToAttritionLessThanModifier;
import com.gempukku.swccgo.logic.modifiers.Modifier;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Set: Set 14
 * Type: Starship
 * Subtype: Capital
 * Title: Steadfast
 */
public class Card214_009 extends AbstractCapitalStarship {
    public Card214_009() {
        super(Side.DARK, 1, 7, 9, 6, null, 3, 8, "Steadfast", Uniqueness.UNIQUE);
        setLore("");
        setGameText("May add 6 pilots, 8 passengers, and 2 starfighters. Permanent pilot provides ability of 2. While alone at an [EPVII] system, adds Force icons to equalize them for both sides here. Immune to attrition < 4.");
        addPersona(Persona.STEADFAST);
        addIcons(Icon.EPISODE_VII, Icon.FIRST_ORDER, Icon.PILOT, Icon.NAV_COMPUTER, Icon.SCOMP_LINK, Icon.VIRTUAL_SET_14);
        addModelType(ModelType.RESURGENT_CLASS_STAR_DESTROYER);
        setPilotCapacity(6);
        setPassengerCapacity(8);
        setStarfighterCapacity(2);
    }

    @Override
    protected List<? extends AbstractPermanentAboard> getGameTextPermanentsAboard() {
        return Collections.singletonList(new AbstractPermanentPilot(2) {});
    }

    @Override
    protected List<Modifier> getGameTextWhileActiveInPlayModifiers(SwccgGame game, final PhysicalCard self) {
        List<Modifier> modifiers = new LinkedList<Modifier>();
        modifiers.add(new ForceIconsEqualizedModifier(self, Filters.and(Icon.EPISODE_VII, Filters.sameLocation(self)), new AloneCondition(self)));
        modifiers.add(new ImmuneToAttritionLessThanModifier(self, 4));
        return modifiers;
    }
}
