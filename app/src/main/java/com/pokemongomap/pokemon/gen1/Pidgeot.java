package com.pokemongomap.pokemon.gen1;

import com.google.android.gms.maps.model.LatLng;
import com.pokemongomap.pokemon.Pokemon;
import com.pokemongomap.pokemongomap.R;

import java.util.Date;

public class Pidgeot extends Pokemon {

    public Pidgeot(int id, LatLng loc, Date disappearTime) {
        super(id, loc, disappearTime);
        super.mName = Pidgeot.class.getName();
        super.mResource = R.drawable.p18;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) && obj instanceof Pidgeot;
    }
}
