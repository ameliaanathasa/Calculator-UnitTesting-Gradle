package com.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    //Menguji operasi penjumlahan dengan input operand dan operator valid.
    @Test
    public void M3TC1penjumlahanTest(){
        int hasil = Penjumlahan.penjumlahan(10,5);
        Assertions.assertEquals(15, hasil);
    }

    //Menguji operasi pengurangan dengan input operand dan operator valid.
    @Test
    public void M4TC1penguranganTest(){
        int hasil = Pengurangan.pengurangan(10,5);
        Assertions.assertEquals(5, hasil);
    }

    //Menguji operasi perkalian dengan input operand dan operator valid.
    @Test
    public void M5TC1perkalianTest(){
        int hasil = Perkalian.perkalian(10,5);
        Assertions.assertEquals(50, hasil);
    }

    //Menguji operasi pembagian dengan input operand dan operator valid.
    @Test
    public void M6TC1pembagianTest(){
        int hasil = Pembagian.pembagian(10,5);
        Assertions.assertEquals(2, hasil);
    }
}
