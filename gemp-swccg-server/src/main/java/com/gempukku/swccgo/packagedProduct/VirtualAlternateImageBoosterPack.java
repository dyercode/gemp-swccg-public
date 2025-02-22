package com.gempukku.swccgo.packagedProduct;

import com.gempukku.swccgo.game.CardCollection;
import com.gempukku.swccgo.game.SwccgCardBlueprintLibrary;

import java.util.*;

/**
 * Defines a Virtual Alternate Image booster pack.
 */
public class VirtualAlternateImageBoosterPack extends BasePackagedCardProduct {
    private Random _random = new Random();
    private int _series;
    /**
     * Creates a Virtual Alternate Image booster pack.
     * @param library the blueprint library
     */
    public VirtualAlternateImageBoosterPack(SwccgCardBlueprintLibrary library, int series) {
        super(library);
        _series = series;
    }

    /**
     * Gets the name of the product.
     * @return the name of the product.
     */
    @Override
    public String getProductName() {
        switch(_series) {
            case 1:
                return ProductName.VIRTUAL_ALTERNATE_IMAGE_BOOSTER_PACK_SERIES_1;
            case 2:
                return ProductName.VIRTUAL_ALTERNATE_IMAGE_BOOSTER_PACK_SERIES_2;
            case 3:
                return ProductName.VIRTUAL_ALTERNATE_IMAGE_BOOSTER_PACK_SERIES_3;
            case 4:
                return ProductName.VIRTUAL_ALTERNATE_IMAGE_BOOSTER_PACK_SERIES_4;
        }

        return ProductName.VIRTUAL_ALTERNATE_IMAGE_BOOSTER_PACK_SERIES_1;
    }

    /**
     * Gets the price of the product.
     * @return the price of the product.
     */
    @Override
    public float getProductPrice() {
        return ProductPrice.VIRTUAL_ALTERNATE_IMAGE_BOOSTER_PACK;
    }

    /**
     * Opens the packaged card product.
     * @return the card collection items contained in the packaged card product.
     */
    @Override
    public List<CardCollection.Item> openPackage() {
        List<CardCollection.Item> result = new LinkedList<CardCollection.Item>();
        addRandomCard(result, 4);
        return result;
    }

    /**
     * Adds random cards to the list.
     * @param result the list of cards in the pack
     * @param count the number cards to add
     */
    private void addRandomCard(List<CardCollection.Item> result, int count) {
        List<String> possibleCards = new ArrayList<String>();
        switch(_series) {
            case 1:
                possibleCards.add("200_1^"); //Aayla Secura
                possibleCards.add("203_22^"); //Agent Kallus
                possibleCards.add("200_2^"); //Anakin Skywalker, Padawan Learner
                possibleCards.add("202_7^"); //Azure Angel
                possibleCards.add("204_3^"); //Captain Hera Syndulla
                possibleCards.add("200_3^"); //Captain Rex, 501st Legion
                possibleCards.add("200_57^"); //Coruscant: Night Club
                possibleCards.add("200_80^"); //Droideka
                possibleCards.add("200_77^"); //DS-61-5
                possibleCards.add("203_27^"); //General Grievous
                possibleCards.add("201_18^"); //Green Leader In Green Squadron 1
                possibleCards.add("204_51^"); //Jakku (DS)
                possibleCards.add("201_25^"); //Jango Fett
                possibleCards.add("209_49^"); //Jedha: Jedha City
                possibleCards.add("203_6^"); //Kanan Jarrus
                possibleCards.add("200_58^"); //Nar Shaddaa
                possibleCards.add("204_9^"); //Rey
                possibleCards.add("209_26^"); //Scarif: Landing Pad Nine (Docking Bay)
                possibleCards.add("201_40^"); //Slave I, Symbol Of Fear
                possibleCards.add("203_14^"); //Stolen Data Tapes
                possibleCards.add("203_21^"); //Wild Karrde
                possibleCards.add("204_26^"); //Jakku (LS)
                break;
            case 2:
                possibleCards.add("301_1^"); //Ahsoka Tano With Lightsabers
                possibleCards.add("301_3^"); //Asajj Ventress With Lightsabers
                possibleCards.add("204_38^"); //Captain Phasma
                possibleCards.add("207_2^"); //Chirrut Imwe
                possibleCards.add("200_6^"); //Commander Cody
                possibleCards.add("204_54^"); //Finalizer
                possibleCards.add("207_18^"); //Profundity
                possibleCards.add("207_23^"); //Savage Opress
                possibleCards.add("208_51^"); //Starkiller Base
                possibleCards.add("209_6^"); //General Kenobi
                possibleCards.add("210_1^"); //Ahch-To: Saddle
                possibleCards.add("209_50^"); //Mustafar: Vader's Castle
                possibleCards.add("203_2^"); //CT-5555 (Fives)
                possibleCards.add("209_35^"); //Dr. Chelli Lona Aphra
                possibleCards.add("210_19^"); //Kit Fisto
                possibleCards.add("209_37^"); //Kylo Ren With Lightsaber
                possibleCards.add("209_10^"); //Rey With Lightsaber
                possibleCards.add("206_7^"); //Rogue One
                possibleCards.add("209_39^"); //Supreme Leader Snoke
                break;
            case 3:
                possibleCards.add("200_71^"); //4-LOM With Concussion Rifle (V)
                possibleCards.add("212_5^"); //Admiral Trench
                possibleCards.add("204_36^"); //B2 Battle Droid
                possibleCards.add("200_133^"); //Conquest (V)
                possibleCards.add("200_76^"); //Count Dooku
                possibleCards.add("203_26^"); //Darth Maul, Lone Hunter
                possibleCards.add("200_142^"); //Dooku's Lightsaber
                possibleCards.add("211_28^"); //BB-8 In Black Squadron 1
                possibleCards.add("204_4^"); //Chewie With Bowcaster
                possibleCards.add("204_27^"); //Jakku: Niima Outpost Shipyard
                possibleCards.add("204_8^"); //Poe Dameron
                possibleCards.add("209_25^"); //Scarif: Data Vault
                possibleCards.add("204_11^"); //Solo
                possibleCards.add("201_19^"); //Tantive IV (V)
                possibleCards.add("204_35^"); //The Falcon, Junkyard Garbage
                break;
            case 4:
                possibleCards.add("213_17^"); //A Lawless Time
                possibleCards.add("215_2^"); //A Power Loss
                possibleCards.add("208_30^"); //Darth Vader, Emperor's Enforcer
                possibleCards.add("207_20^"); //Director Orson Krennic
                possibleCards.add("204_6^"); //Finn
                possibleCards.add("204_41^"); //General Hux
                possibleCards.add("207_5^"); //General Leia Organa
                possibleCards.add("208_49^"); //Hoth: Ice Plains (V)
                possibleCards.add("213_20^"); //I've Been Searching For You For Some Time
                possibleCards.add("204_29^"); //Jakku: Rey's Encampment
                possibleCards.add("204_31^"); //Jakku: Tuanul Village (LS)
                possibleCards.add("206_4^"); //Jyn Erso
                possibleCards.add("213_58^"); //Leia's Resistance Transport
                possibleCards.add("213_10^"); //Maul (Hologram)
                possibleCards.add("213_39^"); //Qi'ra (Hologram)
                possibleCards.add("201_6^"); //R2-D2 (V)
                possibleCards.add("210_46^"); //The Grand Inquisitor
                possibleCards.add("209_40^"); //Vanee
                break;
        }

        filterNonExistingCards(possibleCards);
        Collections.shuffle(possibleCards, _random);
        addCards(result, possibleCards.subList(0, Math.min(possibleCards.size(), count)), false);
    }
}
