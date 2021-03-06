package com.epam.ae.entity;

import java.math.BigDecimal;
import java.util.Random;

public class CandyFactory {

    public static Random random = new Random();


    private static Waffle createRandomWaffle() {
        Waffle.Shape waffleShape = Candy.randomShape();
        double sugarContent;
        sugarContent = random.nextDouble();
        double weight;
        weight = random.nextDouble();
        BigDecimal price = BigDecimal.valueOf(random.nextInt(100) + 5);
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
        BigDecimal price = BigDecimal.valueOf(random.nextInt(100) + 5);
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
        BigDecimal price = BigDecimal.valueOf(random.nextInt(100) + 5);
        double fruitContent;
        fruitContent = random.nextDouble();
        Caramel.CaramelType caramelType = Caramel.randomCaramelType();
        Caramel caramel = new Caramel(caramelShape, sugarContent, weight, price, fruitContent, caramelType);
        return caramel;
    }

    public static Candy createRandomCandy() {
        int a = random.nextInt(3);
        switch (a) {
            case 0:
                return createRandomCaramel();

            case 1:
                return createRandomChocolate();

            case 2:
                return createRandomWaffle();

        }
        return createRandomCandy();
    }

}
