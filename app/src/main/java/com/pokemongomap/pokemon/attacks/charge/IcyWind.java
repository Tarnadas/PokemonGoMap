package com.pokemongomap.pokemon.attacks.charge;

import com.pokemongomap.pokemon.TypeModifier;
import com.pokemongomap.pokemon.attacks.ChargeAttack;

public class IcyWind extends ChargeAttack {

    public IcyWind() {
        super(111, 25, 3800, 20, 5.f, TypeModifier.Type.ICE);
    }

}