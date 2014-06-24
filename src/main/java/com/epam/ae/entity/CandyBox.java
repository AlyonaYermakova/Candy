package com.epam.ae.entity;

import java.util.ArrayList;
import java.util.List;

public class CandyBox implements Cloneable {
    List<Candy> candies = new ArrayList<Candy>();

    public CandyBox() {
        this.candies = candies;
    }

    public void addCandy(Candy c) {
        candies.add(c);
    }

    public List<Candy> getCandies() {
        return candies;
    }

    public void setCandies(List<Candy> candies) {
        this.candies = candies;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        CandyBox clonedCandyBox = (CandyBox) super.clone();
        clonedCandyBox = new CandyBox();
        for (Candy candy : candies) {
            clonedCandyBox.addCandy((Candy) candy.clone());
        }
        return clonedCandyBox;
    }

    @Override
    public String toString() {
        return "CandyBox{" +
                "candies=" + candies +
                '}';
    }
}
