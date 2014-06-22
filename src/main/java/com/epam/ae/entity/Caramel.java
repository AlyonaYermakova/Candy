package com.epam.ae.entity;

import java.math.BigDecimal;
import java.util.Random;

public class Caramel extends Candy {

    private double fruitContent;
    private CaramelType caramelType;

    public Caramel(Shape candyShape,
                   double sugarContent,
                   double weight,
                   BigDecimal price,
                   double fruitContent,
                   CaramelType caramelType) {
        super(candyShape, sugarContent, weight, price);
        this.fruitContent = fruitContent;
        this.caramelType = caramelType;
    }

    public static CaramelType randomCaramelType() {
        int pick = new Random().nextInt(CaramelType.values().length);
        return CaramelType.values()[pick];
    }

    @Override
    public String toString() {
        return "Caramel{" +
                "fruitContent=" + format.format(fruitContent) +
                ", caramelType=" + caramelType + super.toString();
    }

    public enum CaramelType {
        LOLLIPOP, STUFFED, TOFFEE;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }


}
