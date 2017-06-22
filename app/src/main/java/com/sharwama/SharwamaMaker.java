package com.sharwama;

import java.util.regex.Matcher;

/**
 * Created by apjoe on 6/22/2017.
 */

public class SharwamaMaker {

    private int sausageInStock = 0;

    public Sharwama make(SharwamaType type){
        return make(type, 1);
    }

    public Sharwama make(SharwamaType type, int quantity ) {
        requirePositiveQuantity(quantity);

        int requiredSausage = type.getRequiredSausage() * quantity;

        if(requiredSausage > sausageInStock){
            throw new IllegalStateException("Insufficient sausage");
        }

        sausageInStock -= requiredSausage;

        return new Sharwama(type,requiredSausage);
    }

    public void requirePositiveQuantity(int quantity) {
        if (!(quantity > 0)){
            throw new IllegalStateException("Quantity cannot be zero");
        };
    }

    public void restockSausage(int stock){
        sausageInStock += stock;
    }

    public int getSausageInStock() {
        return sausageInStock;
    }

}
