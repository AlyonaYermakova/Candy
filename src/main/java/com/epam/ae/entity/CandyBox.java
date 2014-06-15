package com.epam.ae.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CandyBox {
    long id;
    List<Candy> candies = new ArrayList<Candy>();

    public CandyBox(long id, List<Candy> candies) {
        this.id = id;
        this.candies = candies;
    }

    public void addCandy(Candy candy) {
        candies.add(candy);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Candy> getCandies() {
        return candies;
    }

    public void setCandies(List<Candy> candies) {
        this.candies = candies;
    }
}
