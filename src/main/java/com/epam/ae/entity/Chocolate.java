package com.epam.ae.entity;

import java.math.BigDecimal;
import java.util.Random;

public class Chocolate extends Candy {

    private double cocoaContent;
    private ChocolateType chocolateType;

    public Chocolate(Shape candyShape,
                     double sugarContent,
                     double weight,
                     BigDecimal price,
                     double cocoaContent,
                     ChocolateType chocolateType) {
        super(candyShape, sugarContent, weight, price);
        this.cocoaContent = cocoaContent;
        this.chocolateType = chocolateType;
    }

    public static ChocolateType randomChocolateType() {
        int pick = new Random().nextInt(ChocolateType.values().length);
        return ChocolateType.values()[pick];
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "cocoaContent=" + format.format(cocoaContent) +
                ", chocolateType=" + chocolateType + super.toString();
    }

    public enum ChocolateType {
        DARK, MILK, WHITE, DIABETIC;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }


}
