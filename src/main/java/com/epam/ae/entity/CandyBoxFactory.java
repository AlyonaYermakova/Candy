package com.epam.ae.entity;

import java.util.Random;

public class CandyBoxFactory {
    private static Random random = new Random();

    private CandyBoxFactory() {
    }

    public static CandyBox createRandomCandyBox(int qt) {
        CandyBox result = new CandyBox();
        for (int i = 0; i < qt; i++) result.addCandy(CandyFactory.createRandomCandy());
        return result;
    }

    public static CandyBox createRandomCandyBox() {
        return createRandomCandyBox(random.nextInt(10) + 1);
    }
}
