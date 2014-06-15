package com.epam.ae.entity;

import java.math.BigDecimal;

public class Caramel extends Candy {

    protected double fruitContent;
    protected CaramelType caramelType;

    public Caramel(long id,
                   Shape candyShape,
                   double sugarContent,
                   double weight,
                   BigDecimal price,
                   double fruitContent,
                   CaramelType caramelType) {
        super(id, candyShape, sugarContent, weight, price);
        this.fruitContent = fruitContent;
        this.caramelType = caramelType;
    }

    public double getFruitContent() {
        return fruitContent;
    }

    public void setFruitContent(double fruitContent) {
        this.fruitContent = fruitContent;
    }

    public CaramelType getCaramelType() {
        return caramelType;
    }

    public void setCaramelType(CaramelType caramelType) {
        this.caramelType = caramelType;
    }

    public enum CaramelType {
        LOLLIPOP, STUFFED, TOFFEE;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }


}
