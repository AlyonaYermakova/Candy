package com.epam.ae.entity;

import java.math.BigDecimal;

public class Chocolate extends Candy {

    public enum ChocolateType {
        DARK, MILK, WHITE, DIABETIC;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

    protected double cocoaContent;
    protected ChocolateType chocolateType;

    public Chocolate(long id,
                     Shape candyShape,
                     double sugarContent,
                     double weight,
                     BigDecimal price,
                     double cocoaContent,
                     ChocolateType chocolateType) {
        super(id, candyShape, sugarContent, weight, price);
        this.cocoaContent = cocoaContent;
        this.chocolateType = chocolateType;
    }

    public double getCocoaContent() {
        return cocoaContent;
    }

    public void setCocoaContent(double cocoaContent) {
        this.cocoaContent = cocoaContent;
    }

    public ChocolateType getChocolateType() {
        return chocolateType;
    }

    public void setChocolateType(ChocolateType chocolateType) {
        this.chocolateType = chocolateType;
    }
}
