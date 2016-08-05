package com.pokemongomap.pokemon.gen1;

import com.google.android.gms.maps.model.LatLng;
import com.pokemongomap.pokemon.Pokemon;
import com.pokemongomap.pokemon.TypeModifier;
import com.pokemongomap.pokemon.attacks.BasicAttack;
import com.pokemongomap.pokemon.attacks.ChargeAttack;
import com.pokemongomap.pokemon.attacks.basic.Acid;
import com.pokemongomap.pokemon.attacks.basic.Bite;
import com.pokemongomap.pokemon.attacks.basic.Bubble;
import com.pokemongomap.pokemon.attacks.basic.BugBite;
import com.pokemongomap.pokemon.attacks.basic.Confusion;
import com.pokemongomap.pokemon.attacks.basic.Ember;
import com.pokemongomap.pokemon.attacks.basic.Peck;
import com.pokemongomap.pokemon.attacks.basic.PoisonJab;
import com.pokemongomap.pokemon.attacks.basic.PoisonSting;
import com.pokemongomap.pokemon.attacks.basic.QuickAttack;
import com.pokemongomap.pokemon.attacks.basic.RazorLeaf;
import com.pokemongomap.pokemon.attacks.basic.Scratch;
import com.pokemongomap.pokemon.attacks.basic.SteelWing;
import com.pokemongomap.pokemon.attacks.basic.Tackle;
import com.pokemongomap.pokemon.attacks.basic.ThunderShock;
import com.pokemongomap.pokemon.attacks.basic.VineWhip;
import com.pokemongomap.pokemon.attacks.basic.WaterGun;
import com.pokemongomap.pokemon.attacks.basic.WingAttack;
import com.pokemongomap.pokemon.attacks.charge.AerialAce;
import com.pokemongomap.pokemon.attacks.charge.AirCutter;
import com.pokemongomap.pokemon.attacks.charge.AquaJet;
import com.pokemongomap.pokemon.attacks.charge.AquaTail;
import com.pokemongomap.pokemon.attacks.charge.BodySlam;
import com.pokemongomap.pokemon.attacks.charge.BugBuzz;
import com.pokemongomap.pokemon.attacks.charge.DarkPulse;
import com.pokemongomap.pokemon.attacks.charge.Dig;
import com.pokemongomap.pokemon.attacks.charge.Discharge;
import com.pokemongomap.pokemon.attacks.charge.DragonClaw;
import com.pokemongomap.pokemon.attacks.charge.DrillPeck;
import com.pokemongomap.pokemon.attacks.charge.DrillRun;
import com.pokemongomap.pokemon.attacks.charge.FireBlast;
import com.pokemongomap.pokemon.attacks.charge.FirePunch;
import com.pokemongomap.pokemon.attacks.charge.FlameBurst;
import com.pokemongomap.pokemon.attacks.charge.FlameCharge;
import com.pokemongomap.pokemon.attacks.charge.Flamethrower;
import com.pokemongomap.pokemon.attacks.charge.FlashCannon;
import com.pokemongomap.pokemon.attacks.charge.GunkShot;
import com.pokemongomap.pokemon.attacks.charge.Hurricane;
import com.pokemongomap.pokemon.attacks.charge.HydroPump;
import com.pokemongomap.pokemon.attacks.charge.HyperBeam;
import com.pokemongomap.pokemon.attacks.charge.HyperFang;
import com.pokemongomap.pokemon.attacks.charge.IceBeam;
import com.pokemongomap.pokemon.attacks.charge.PowerWhip;
import com.pokemongomap.pokemon.attacks.charge.Psychic;
import com.pokemongomap.pokemon.attacks.charge.SeedBomb;
import com.pokemongomap.pokemon.attacks.charge.SignalBeam;
import com.pokemongomap.pokemon.attacks.charge.SludgeBomb;
import com.pokemongomap.pokemon.attacks.charge.SludgeWave;
import com.pokemongomap.pokemon.attacks.charge.SolarBeam;
import com.pokemongomap.pokemon.attacks.charge.Struggle;
import com.pokemongomap.pokemon.attacks.charge.Thunder;
import com.pokemongomap.pokemon.attacks.charge.Thunderbolt;
import com.pokemongomap.pokemon.attacks.charge.Twister;
import com.pokemongomap.pokemon.attacks.charge.WaterPulse;
import com.pokemongomap.pokemon.attacks.charge.Wrap;
import com.pokemongomap.pokemon.attacks.charge.XScissor;
import com.pokemongomap.pokemongomap.R;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Pikachu extends Pokemon {

    private static int HP_RATIO = 70;
    private static int ATTACK_RATIO = 124;
    private static int DEFENSE_RATIO = 108;
    private static int MIN_CP = 673;
    private static int MAX_CP = 888;

    private static List<BasicAttack> BASE_ATTACKS = new ArrayList<>();
    private static BasicAttack BASE_ATTACK_1 = new QuickAttack();
    private static BasicAttack BASE_ATTACK_2 = new ThunderShock();
    private static List<ChargeAttack> CHARGE_ATTACKS = new ArrayList<>();
    private static ChargeAttack CHARGE_ATTACK_1 = new Discharge();
    private static ChargeAttack CHARGE_ATTACK_2 = new Thunder();
    private static ChargeAttack CHARGE_ATTACK_3 = new Thunderbolt();

    public Pikachu() {
        super();
        super.mResource = R.drawable.p25;
        super.HP_RATIO = HP_RATIO;
        super.ATTACK_RATIO = ATTACK_RATIO;
        super.DEFENSE_RATIO = DEFENSE_RATIO;
        super.MIN_CP = MIN_CP;
        super.MAX_CP = MAX_CP;
        super.TYPE = TypeModifier.Type.ELECTRIC;
        super.TYPE_SECONDARY = TypeModifier.Type.NONE;

        BASE_ATTACKS = new ArrayList<>();
        BASE_ATTACKS.add(BASE_ATTACK_1);
        if (BASE_ATTACK_1 != null) {
            BASE_ATTACKS.add(BASE_ATTACK_2);
        }
        super.BASE_ATTACKS = BASE_ATTACKS;
        CHARGE_ATTACKS = new ArrayList<>();
        CHARGE_ATTACKS.add(CHARGE_ATTACK_1);
        if (CHARGE_ATTACK_2 != null) {
            CHARGE_ATTACKS.add(CHARGE_ATTACK_2);
        }
        if (CHARGE_ATTACK_3 != null) {
            CHARGE_ATTACKS.add(CHARGE_ATTACK_3);
        }
        super.CHARGE_ATTACKS = CHARGE_ATTACKS;
    }

    public Pikachu(int id, LatLng loc, Date disappearTime) {
        super(id, loc, disappearTime);
        super.mName = "Pikachu";
        super.mResource = R.drawable.p25;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) && obj instanceof Pikachu;
    }
}
