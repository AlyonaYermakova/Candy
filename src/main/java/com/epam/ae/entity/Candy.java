package com.epam.ae.entity;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;

public abstract class Candy {

    public DecimalFormat format = new DecimalFormat("###.##");
    private Shape candyShape;
    private double sugarContent;
    private double weight;
    private BigDecimal price;

    public Candy(Shape candyShape, double sugarContent, double weight, BigDecimal price) {
        this.candyShape = candyShape;
        this.sugarContent = sugarContent;
        this.weight = weight;
        this.price = price;
    }

    public static Shape randomShape() {
        int pick = new Random().nextInt(Shape.values().length);
        return Shape.values()[pick];
    }

    @Override
    public String toString() {
        return
                ", candyShape=" + candyShape +
                        ", sugarContent=" + format.format(sugarContent) +
                        ", weight=" + format.format(weight) +
                        ", price=" + format.format(price) +
                        '}' + "\n";
    }

    public enum Shape {
        CONE, CUBE, SPHERE, PYRAMID, CYLINDER;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }
}
