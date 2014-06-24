package com.epam.ae.entity;

import java.math.BigDecimal;

public class Waffle extends Candy {

    private double flourContent;

    public Waffle(Shape candyShape,
                  double sugarContent,
                  double weight,
                  BigDecimal price,
                  double flourContent) {
        super(candyShape, sugarContent, weight, price);
        this.flourContent = flourContent;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Waffle{" +
                "flourContent=" + format.format(flourContent) + super.toString();
    }


}
