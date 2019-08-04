package com.gempukku.swccgo.cards.set211.dark;

import com.gempukku.swccgo.cards.AbstractUniqueStarshipSite;
import com.gempukku.swccgo.cards.conditions.HereCondition;
import com.gempukku.swccgo.common.*;
import com.gempukku.swccgo.filters.Filters;
import com.gempukku.swccgo.game.PhysicalCard;
import com.gempukku.swccgo.game.SwccgGame;
import com.gempukku.swccgo.logic.conditions.Condition;
import com.gempukku.swccgo.logic.modifiers.*;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Card211_027 extends AbstractUniqueStarshipSite {
    public Card211_027() {
        super(Side.DARK, "Invisible Hand: Observatory Entrance", Persona.INVISIBLE_HAND);
        setLocationDarkSideGameText("While Insidious Prisoner here, your characters are +1 power here.");
        setLocationLightSideGameText("While your [Clone Army] character here, your characters are defense value +1 here.");
        addIcon(Icon.DARK_FORCE, 2);
        addIcon(Icon.LIGHT_FORCE, 1);
        addIcons(Icon.SCOMP_LINK, Icon.EPISODE_I, Icon.INTERIOR_SITE, Icon.STARSHIP_SITE, Icon.MOBILE, Icon.VIRTUAL_SET_11);
    }

    @Override
    protected List<Modifier> getGameTextDarkSideWhileActiveModifiers(String playerOnDarkSideOfLocation, SwccgGame game, PhysicalCard self) {
        Condition InsidiousPrisonerPresent = new HereCondition(self, Filter.title(Title.Insidious_Prisoner));

        List<Modifier> modifiers = new LinkedList<Modifier>();
        modifiers.add(new PowerModifier(self,Filters.and(Filters.your(playerOnDarkSideOfLocation), Filters.here(self)), InsidiousPrisonerPresent, 1));
        return modifiers;
    }

    @Override
    protected List<Modifier> getGameTextLightSideWhileActiveModifiers(String playerOnLightSideOfLocation, SwccgGame game, PhysicalCard self) {
        Condition yourCloneArmyCharPresent = new HereCondition(self, Filters.and(Filters.your(playerOnLightSideOfLocation), Icon.CLONE_ARMY));

        List<Modifier> modifiers = new LinkedList<Modifier>();
        modifiers.add(new DefenseValueModifier(self, Filters.and(Filters.your(playerOnLightSideOfLocation), Filters.here(self)), yourCloneArmyCharPresent, 1));
        return modifiers;
    }
}
