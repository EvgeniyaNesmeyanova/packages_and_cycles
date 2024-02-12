package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class calculateTest {

    @ParameterizedTest
    // @CsvSource({
    //         " 3, 10000,3000, 20000 ",
    //         " 2, 100000,60000,150000 "
    // })
    @CsvFileSource(files = "src/test/resources/calc.csv")
    public void testSmallNeeds(int actual, int income, int expenses, int threshold) {
        calculate service = new calculate();

        //int income = 10_000;  //задать параметр доход от работы
        //int expenses = 3_000;  //задать параметр ежемесячные платежи
        //int threshold = 20_000; //задать сумму на счету для предусловия отдыха
        //int actual = 3;         //количество месяцев отдыха должно быть
        int count = service.calculate(income, expenses, threshold); //количество месяцев отдыха фактически по расчету в программе

        Assertions.assertEquals(actual, count);
    }

    //   @Test
    //     public void testGreatNeeds() {
    //       calculate service = new calculate();

    //   int income = 100_000;
    //   int expenses = 60_000;
    //   int threshold = 150_000;
    //   int actual = 2;
    //   int count = service.calculate(income, expenses, threshold);

    //      Assertions.assertEquals(count,actual);
//}
}
