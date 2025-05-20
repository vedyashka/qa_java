package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class FelineTest {

    Feline feline = new Feline();

    @Test
    void getFamilyReturnsCorrectValue() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    void getKittensDefaultIsOne() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    void getKittensWithParameterReturnsCorrectValue() {
        assertEquals(5, feline.getKittens(5));
    }

    @Test
    void eatMeatReturnsPredatorFood() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }
}
