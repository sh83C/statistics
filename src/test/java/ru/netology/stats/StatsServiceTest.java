package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test

    public void ShouldSum() {
        long[] sales = {8, 6, 10, 11, 15, 23, 25, 24, 21, 18, 16, 21};
        StatsService Service = new StatsService();

        long actual = Service.sum(sales);
        long expected = 8 + 6 + 10 + 11 + 15 + 23 + 25 + 24 + 21 + 18 + 16 + 21;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void ShouldCountAverageSum() {
        long[] sales = {8, 6, 10, 11, 15, 23, 25, 24, 21, 18, 16, 21};
        StatsService Service = new StatsService();

        long actual = Service.averageSum(sales);
        long expected = (8 + 6 + 10 + 11 + 15 + 23 + 25 + 24 + 21 + 18 + 16 + 21) / 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void numberOfMonthMaxSales() {
        long[] sales = {8, 6, 10, 11, 15, 23, 25, 24, 21, 18, 16, 21};
        StatsService Service = new StatsService();

        int actual = Service.maxSales(sales);
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void numberOfMonthMinSales() {
        long[] sales = {8, 6, 10, 11, 15, 23, 25, 24, 21, 18, 16, 21};
        StatsService Service = new StatsService();

        int actual = Service.minSales(sales);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void HowManyMonthsBelowAverage() {
        long[] sales = {8, 6, 10, 11, 15, 23, 25, 24, 21, 18, 16, 21};
        StatsService Service = new StatsService();

        int actual = Service.quantityOFMonthsBelowAverage(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void HowManyMonthsAboveAverage() {
        long[] sales = {8, 6, 10, 11, 15, 23, 25, 24, 21, 18, 16, 21};
        StatsService Service = new StatsService();

        int actual = Service.quantityOFMonthsAboveAverage(sales);
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }
}