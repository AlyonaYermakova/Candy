package com.epam.ae.entity;

import java.util.ArrayList;
import java.util.List;

public class CandyBox {
    List<Candy> candies = new ArrayList<Candy>();

    public CandyBox(long id, List<Candy> candies) {
        this.candies = candies;
    }

    public void addCandy(Candy candy) {
        candies.add(candy);
    }

    public List<Candy> getCandies() {
        return candies;
    }

    public void setCandies(List<Candy> candies) {
        this.candies = candies;
    }
}
