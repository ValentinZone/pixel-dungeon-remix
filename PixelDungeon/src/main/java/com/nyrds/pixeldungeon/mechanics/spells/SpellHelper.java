package com.nyrds.pixeldungeon.mechanics.spells;

import com.nyrds.pixeldungeon.ml.R;
import com.watabou.noosa.Game;
import com.watabou.pixeldungeon.actors.hero.Hero;
import com.watabou.pixeldungeon.utils.Utils;

import java.util.HashMap;
import java.util.Map;

public class SpellHelper {

    public static final String AFFINITY_NECROMANCY = "Necromancy";
    public static final String AFFINITY_ELEMENTAL  = "Elemental";
    public static final String AFFINITY_RAGE       = "Rage";

    public static final String AFFINITY_DEMONOLOGY  = "Demolonogy";
    public static final String AFFINITY_NATURE      = "Nature";
    public static final String AFFINITY_SHADOW      = "Shadow";
    public static final String AFFINITY_COMMON      = "Common";

    public static final String TARGET_SELF = "self";
    public static final String TARGET_CELL = "cell";
    public static final String TARGET_NONE = "none";

    private static Map<String, Integer> affinityToIcon = new HashMap<>();


    static {
        affinityToIcon.put(AFFINITY_NECROMANCY, 11);
        affinityToIcon.put(AFFINITY_RAGE, 12);
        affinityToIcon.put(AFFINITY_ELEMENTAL, 6);
        affinityToIcon.put(AFFINITY_COMMON, 6);
    }

    public static int iconIdByAffinity(String affinity) {
        if(affinityToIcon.containsKey(affinity)) {
            return affinityToIcon.get(affinity);
        }
        return 6;
    }

    public static int iconIdByHero(Hero hero) {
        return iconIdByAffinity(hero.heroClass.getMagicAffinity());
    }

    public static String getMasteryTitleByAffinity(String affinity) {
        return Utils.getClassParam("Abilities", affinity, Game.getVar(R.string.Abilities_Default),false);
    }



}
