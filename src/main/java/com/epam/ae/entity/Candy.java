package com.epam.ae.entity;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;

public abstract class Candy implements Cloneable {


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

    public BigDecimal getPrice() {
        return price;
    }

    public double getSugarContent() {
        return sugarContent;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Candy) super.clone();
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
