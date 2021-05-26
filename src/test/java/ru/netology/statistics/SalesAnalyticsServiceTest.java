package ru.netology.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesAnalyticsServiceTest {

    @Test
    void serviceSum() {
        SalesAnalyticsService serviceSum = new SalesAnalyticsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = serviceSum.calculateSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void maxSale() {
        SalesAnalyticsService serviceMax = new SalesAnalyticsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = serviceMax.maxSale(sales);

        assertEquals(expected, actual);

    }

    @Test
    void minSale() {
        SalesAnalyticsService serviceMin = new SalesAnalyticsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = serviceMin.minSale(sales);

        assertEquals(expected, actual);

    }

    @Test
    void averageSale() {
        SalesAnalyticsService serviceAverage = new SalesAnalyticsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = serviceAverage.averageSale(sales);

        assertEquals(expected, actual);

    }

    @Test
    void belowAverageSale() {
        SalesAnalyticsService serviceBelowAverageSale = new SalesAnalyticsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 11;

        int actual = serviceBelowAverageSale.belowAverageSale(sales);

        assertEquals(expected, actual);

    }

    @Test
    void aboveAverageSale() {
        SalesAnalyticsService serviceAboveAverageSale = new SalesAnalyticsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 12;

        int actual = serviceAboveAverageSale.aboveAverageSale(sales);

        assertEquals(expected, actual);

    }
}
