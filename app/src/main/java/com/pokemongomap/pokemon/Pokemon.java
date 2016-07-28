package com.pokemongomap.pokemon;


import com.google.android.gms.maps.model.LatLng;

import java.util.Date;

public abstract class Pokemon {

    private int mId;
    protected String mName;
    private LatLng mLoc;
    private Date mDisappearTime;
    protected int mResource;

    public Pokemon(int id, LatLng loc, Date disappearTime) {
        mId = id;
        mLoc = loc;
        mDisappearTime = disappearTime;
    }

    public int getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public LatLng getLocation() {
        return  mLoc;
    }

    public Date getDisappearTime() {
        return mDisappearTime;
    }

    public int getResource() {
        return mResource;
    }

    @Override
    public boolean equals(Object object) {
        try {
            Pokemon pokemon = (Pokemon) object;
            return this.mId == pokemon.mId && this.mName.equals(pokemon.mName) && this.mLoc.equals(pokemon.mLoc) && this.mDisappearTime.equals(pokemon.mDisappearTime);
        } catch (ClassCastException e) {
            return false;
        }
    }

}
