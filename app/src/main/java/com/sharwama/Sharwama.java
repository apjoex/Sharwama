package com.sharwama;

/**
 * Created by apjoe on 6/22/2017.
 */

public class Sharwama {

    public final SharwamaType type;
    public int sausage;

    public Sharwama(SharwamaType type, int sausage) {
        this.type = type;
        this.sausage = sausage;
    }

    public SharwamaType getType() {
        return type;
    }

    public int getSausage() {
        return sausage;
    }

    @Override
    public String toString() {
        return "Sharwama{" +
                "type=" + type +
                ", sausage=" + sausage +
                '}';
    }
}
