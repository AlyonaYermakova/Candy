package com.epam.ae.entity;

import com.epam.ae.entity.Candy;

import java.math.BigDecimal;
import java.util.Random;

public class CandyFactory {

    public static Random random = new Random();
    private int a = random.nextInt(3);

    private static Waffle createRandomWaffle() {
        Waffle.Shape waffleShape = Candy.randomShape();
        double sugarContent;
        sugarContent = random.nextDouble();
        double weight;
        weight = random.nextDouble();
        BigDecimal price = BigDecimal.valueOf(random.nextInt());
        double flourContent;
        flourContent = random.nextDouble();
        Waffle waffle = new Waffle(waffleShape, sugarContent, weight, price, flourContent);
        return waffle;
    }

    private static Chocolate createRandomChocolate() {
        Chocolate.Shape chocolateShape = Candy.randomShape();
        double sugarContent;
        sugarContent = random.nextDouble();
        double weight;
        weight = random.nextDouble();
        BigDecimal price = BigDecimal.valueOf(random.nextInt());
        double cocoaContent;
        cocoaContent = random.nextDouble();
        Chocolate.ChocolateType chocolateType = Chocolate.randomChocolateType();
        Chocolate chocolate = new Chocolate(chocolateShape, sugarContent, weight, price, cocoaContent, chocolateType);
        return chocolate;
    }

    private static Caramel createRandomCaramel() {
        Caramel.Shape caramelShape = Candy.randomShape();
        double sugarContent;
        sugarContent = random.nextDouble();
        double weight;
        weight = random.nextDouble();
        BigDecimal price = BigDecimal.valueOf(random.nextInt());
        double fruitContent;
        fruitContent = random.nextDouble();
        Caramel.CaramelType caramelType = Caramel.randomCaramelType();
        Caramel caramel = new Caramel(caramelShape, sugarContent, weight, price, fruitContent, caramelType);
        return caramel;
    }

    public void createRandomCandy() {
        switch (a) {
            case 0:
                createRandomCaramel();
                break;
            case 1:
                createRandomChocolate();
                break;
            case 2:
                createRandomWaffle();
                break;
        }

    }

}
