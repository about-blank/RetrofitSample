package com.vishal.retrofitsample.collection;

import com.vishal.retrofitsample.dao.Flower;

/**
 * Created by Vishal Aroor on 16-Aug-17.
 */

public class FlowerCollection {

    private Flower[] flowers;

    public FlowerCollection() {}

    public  FlowerCollection(Flower[] flowers) {
        this.flowers = flowers;
    }

    public Flower[] getFlowers() {
        return flowers;
    }

    public void setFlowers(Flower[] flowers) {
        this.flowers = flowers;
    }
}
