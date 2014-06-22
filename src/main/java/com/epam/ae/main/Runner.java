package com.epam.ae.main;

import com.epam.ae.entity.*;

public class Runner {
    public static void main(String[] args) {

        CandyBox candyBox = CandyBoxFactory.createRandomCandyBox();
        System.out.println(candyBox);

    }
}
