package com.epam.ae.main;

import com.epam.ae.entity.CandyBox;
import com.epam.ae.entity.CandyBoxFactory;

public class Runner {
    public static void main(String[] args) {

        CandyBox candyBox = CandyBoxFactory.createRandomCandyBox();

    }
}
