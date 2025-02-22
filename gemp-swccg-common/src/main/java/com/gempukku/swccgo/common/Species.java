package com.gempukku.swccgo.common;

/**
 * Represents the species for characters in SWCCG.
 */
public enum Species implements Filterable {
    ABEDNEDO("Abednedo", true),
    ABYSSIN("Abyssin", true),
    ALDERAANIAN("Alderaanian", true),
    AMANIN("Amanin", true),
    ANX("Anx", true),
    ANZATI("Anzati", true),
    ANZELLAN("Anzellan", true),
    AQUALISH("Aqualish", true),
    ARCONA("Arcona", true),
    ARDENNIAN("Ardennian", true),
    BALOSAR("Balosar", true),
    BARAGWIN("Baragwin", true),
    BESALISK("Besalisk", true),
    BITH("Bith", true),
    BOTHAN("Bothan", true),
    BRIZZIT("Brizzit", true),
    CEREAN("Cerean", true),
    CHADRAFAN("Chadra-Fan", true),
    CHAGRIAN("Chagrian", true),
    CHEVIN("Chevin", true),
    CLAWDITE("Clawdite", true),
    CORELLIAN("Corellian", true),
    CROLUTE("Crolute", true),
    DATHOMIRIAN("Dathomirian", true),
    DEFEL("Defel", true),
    DELPHIDIAN("Delphidian", true),
    DEVARONIAN("Devaronian", true),
    DOWUTIN("Dowutin", true),
    DRABATAN("Drabatan", true),
    DRESSELIAN("Dresselian", true),
    DUG("Dug", true),
    DUROS("Duros", true),
    ELOM("Elom", true),
    EWOK("Ewok", true),
    FALLEEN("Falleen", true),
    FLORN_LAMPROID("Florn Lamproid", true),
    GABDORIN("Gabdorin", true),
    GAMORREAN("Gamorrean", true),
    GAND("Gand", true),
    GEONOSIAN("Geonosian", true),
    GLEE_ANSELMIAN("Glee Anselmian", true),
    GOTAL("Gotal", true),
    GRAN("Gran", true),
    GRINDALID("Grindalid", true),
    GUNGAN("Gungan", true),
    HARCH("Harch", true),
    HNEMTHE("H'nemthe", true),
    HUTT("Hutt", true),
    HYLOBON("Hylobon", true),
    IMROOSIAN("Imroosian", true),
    IMZIG("Imzig", true),
    ISHI_TIB("Ishi Tib", true),
    ITHORIAN("Ithorian", true),
    JAWA("Jawa", true),
    KEL_DOR("Kel Dor", true),
    KERKOIDEN("Kerkoiden", true),
    KITONAK("Kitonak", true),
    KLATOOINIAN("Klatooinian", true),
    KOWAKIAN("Kowakian", true),
    KUBAZ("Kubaz", true),
    LASAT("Lasat", true),
    LOBEL("Lobel", true),
    LUTRILLIAN("Lutrillian", true),
    MANDALORIAN("Mandalorian", true),
    MIRIALAN("Mirialan", true),
    MON_CALAMARI("Mon Calamari", true),
    MORSEERIAN("Morseerian", true),
    MUUN("Muun", true),
    MYTHROL("Mythrol", true),
    NAUTOLAN("Nautolan", true),
    NEIMOIDIAN("Neimoidian", true),
    NIKTO("Nikto", true),
    NIMBANEL("Nimbanel", true),
    NOGHRI("Noghri", true),
    ORTOLAN("Ortolan", true),
    PACITHHIP("Pacithhip", true),
    PALOWICK("Pa'lowick", true),
    QIRAASH("Qiraash", true),
    QUARREN("Quarren", true),
    QUORSAV("Quor'sav", true),
    RANAT("Ranat", true),
    RODIAN("Rodian", true),
    SAKIYAN("Sakiyan", true),
    SARKAN("Sarkan", true),
    SAURIN("Saurin", true),
    SERENNIAN("Serennian", true),
    SHAWDA_UBB("Shawda Ubb", true),
    SHISTAVANEN("Shistavanen", true),
    SICSIX("Sic-Six", true),
    SINITEEN("Siniteen", true),
    SKAKOAN("Skakoan", true),
    SKRILLING("Skrilling", true),
    SNIVVIAN("Snivvian", true),
    SULLUSTAN("Sullustan", true),
    SWOKES_SWOKES("Swokes Swokes", true),
    TALZ("Talz", true),
    TERRELIAN_JANGO_JUMPER("Terrelian Jango Jumper", true),
    TOGRUTA("Togruta", true),
    TOYDARIAN("Toydarian", true),
    TRANDOSHAN("Trandoshan", true),
    TUSKEN_RAIDER("Tusken Raider", true),
    TWILEK("Twi'lek", true),
    UGNAUGHT("Ugnaught", true),
    VUVRIAN("Vuvrian", true),
    WEEQUAY("Weequay", true),
    WHIPHID("Whiphid", true),
    WOL_CABBASSHITE("Wol Cabbasshite", true),
    WOOKIEE("Wookiee", true),
    XEXTO("Xexto", true),
    YAMRII("Yam'rii", true),
    YARKORA("Yarkora", true),
    YUZZUM("Yuzzum", true);


    private String _humanReadable;
    private boolean _infoDisplayable;

    Species(String humanReadable) {
        this(humanReadable, false);
    }

    Species(String humanReadable, boolean infoDisplayable) {
        _humanReadable = humanReadable;
        _infoDisplayable = infoDisplayable;
    }

    public String getHumanReadable() {
        return _humanReadable;
    }

    public boolean isInfoDisplayable() {
        return _infoDisplayable;
    }
}
