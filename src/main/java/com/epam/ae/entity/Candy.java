package com.epam.ae.entity;

import java.math.BigDecimal;

public abstract class Candy {

    private long id;
    private Shape candyShape;
    private double sugarContent;
    private double weight;
    private BigDecimal price;

    public Candy(long id, Shape candyShape, double sugarContent, double weight, BigDecimal price) {
        this.id = id;
        this.candyShape = candyShape;
        this.sugarContent = sugarContent;
        this.weight = weight;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Shape getCandyShape() {
        return candyShape;
    }

    public void setCandyShape(Shape candyShape) {
        this.candyShape = candyShape;
    }

    public double getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(double sugarContent) {
        this.sugarContent = sugarContent;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public enum Shape {
        CONE, CUBE, SPHERE, PYRAMID, CYLINDER;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

}
