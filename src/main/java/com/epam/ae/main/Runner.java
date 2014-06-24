package com.epam.ae.main;

import com.epam.ae.entity.*;

public class Runner {
    public static void main(String[] args) throws CloneNotSupportedException {

        CandyBox candyBox = CandyBoxFactory.createRandomCandyBox();
        System.out.println(candyBox);

        CandyBox clonedCandyBox = (CandyBox) candyBox.clone();
        System.out.println("Cloned candy box: " + clonedCandyBox);
    }
}
