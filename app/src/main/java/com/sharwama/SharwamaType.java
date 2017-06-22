package com.sharwama;

/**
 * Created by apjoe on 6/22/2017.
 */

public enum SharwamaType {

    Chicken(0),
    ChickenSingle(1),
    ChickenDouble(2);

    int requiredSausage;

    SharwamaType(int requiredSausage){
        this.requiredSausage = requiredSausage;
    }

    public int getRequiredSausage() {
        return requiredSausage;
    }
}
