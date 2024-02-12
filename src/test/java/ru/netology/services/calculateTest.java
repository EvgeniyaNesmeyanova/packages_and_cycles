package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.services.calculate;

public class calculateTest {

    @Test
    public void testSmallNeeds() {
        calculate service = new calculate();

        int income = 10_000;  //задать параметр доход от работы
        int expenses = 3_000;  //задать параметр ежемесячные платежи
        int threshold = 20_000; //задать сумму на счету для предусловия отдыха
        int actual = 3;         //
        int count = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(count, actual);
    }

    @Test
    public void testGreatNeeds() {
        calculate service = new calculate();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int actual = 2;
        int count = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(count, actual);
    }
}
