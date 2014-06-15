package com.epam.ae.entity;

import java.math.BigDecimal;

public class Waffle extends Candy {

    protected double flourContent;

    protected Waffle(long id,
                     Shape candyShape,
                     double sugarContent,
                     double weight,
                     BigDecimal price) {
        super(id, candyShape, sugarContent, weight, price);
        this.flourContent = flourContent;
    }

    public double getFlourContent() {
        return flourContent;
    }

    public void setFlourContent(double flourContent) {
        this.flourContent = flourContent;
    }
}
