package com.epam.ae.entity;

import java.util.ArrayList;
import java.util.List;

public class CandyBox {
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
    public String toString() {
        return "CandyBox{" +
                "candies=" + candies +
                '}';
    }
}
