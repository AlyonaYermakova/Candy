package com.epam.ae.entity;

import java.math.BigDecimal;

public abstract class Candy {

    public enum Shape {
        CONE, CUBE, SPHERE, PYRAMID, CYLINDER;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
        }

    protected long id;
    protected Shape candyShape;
    protected double sugarContent;
    protected double weight;
    protected BigDecimal price;

    protected Candy(long id, Shape candyShape, double sugarContent, double weight, BigDecimal price) {
        this.id = id;
        this.candyShape = candyShape;
        this.sugarContent = sugarContent;
        this.weight = weight;
        this.price = price;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setCandyShape(Shape candyShape) {
        this.candyShape = candyShape;
    }

    public Shape getCandyShape() {
        return candyShape;
    }

    public void setSugarContent(double sugarContent) {
        this.sugarContent = sugarContent;
    }

    public double getSugarContent() {
        return sugarContent;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
