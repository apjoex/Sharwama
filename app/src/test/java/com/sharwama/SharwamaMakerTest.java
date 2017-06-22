package com.sharwama;

import android.support.annotation.NonNull;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by apjoe on 6/22/2017.
 */
public class SharwamaMakerTest {

    private static final int  CHICKEN_DOUBLE= 2;
    
    @Test
    public void canMakeChickenSharwama(){
        SharwamaMaker maker = getSharwamaMaker(CHICKEN_DOUBLE);

        SharwamaType type = SharwamaType.ChickenSingle;

        Sharwama sharwama = maker.make(type);
        Assert.assertEquals(SharwamaType.ChickenSingle,sharwama.getType());
    }

    @Before
    public void runBefore(){
        System.out.println("Run ths before");
    }

    @NonNull
    private SharwamaMaker getSharwamaMaker(int chickenDouble) {
        SharwamaMaker maker = new SharwamaMaker();
        maker.restockSausage(chickenDouble);
        return maker;
    }

    @Test
    public void makingSharwamaConsumesSausage(){

        SharwamaMaker maker = new SharwamaMaker();
        SharwamaType type = SharwamaType.ChickenDouble;

        maker.restockSausage(4);
        maker.make(type,2);

        Assert.assertEquals(0,maker.getSausageInStock());
       // assertTrue(maker.getSausageInStock() == 2);
    }

    @Test
    public void doesRestockWork(){
        SharwamaMaker maker = getSharwamaMaker(5);

        Assert.assertEquals(5,maker.getSausageInStock());

        maker.make(SharwamaType.ChickenDouble,2);
        maker.restockSausage(2);

        Assert.assertEquals(3,maker.getSausageInStock());
    }

}