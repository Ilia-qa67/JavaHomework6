package ru.netology.stats;

public class StatsService {
    public int sumSales(int[] sales) {
        int sumSales = 0;

        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
            }
        return sumSales;
        }

    public int averageSales(int[] sales)  {
        int averageSales = 0;

        for (int i = 0; i < sales.length; i++) {
            averageSales = averageSales + sales[i];
        }
        averageSales = averageSales / sales.length;
        return averageSales;
    }

    public int monthHighestPeak(int[] sales) {
        int monthHighestPeak = 0;

        for (int i = 0; i < sales.length; i++) {
            if(sales[i] >= sales[monthHighestPeak])
                monthHighestPeak = i;
        }
        return monthHighestPeak + 1;
    }

    public int monthLowestPeak(int[] sales) {
        int monthLowestPeak = 0;

        for (int i = 0; i < sales.length; i++) {
            if(sales[i] <= sales[monthLowestPeak])
                monthLowestPeak = i;
        }
        return monthLowestPeak + 1;
    }

    public int salesLessAverage(int[] sales) {
        int salesLessAverage = 0;
        int averageSales = 0;

        for (int i = 0; i < sales.length; i++) {
            averageSales = averageSales + sales[i];
        }
        averageSales = averageSales / sales.length;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                salesLessAverage++;
            }
        }
        return salesLessAverage;
    }

    public int salesAboveAverage(int[] sales) {
        int salesAboveAverage = 0;
        int averageSales = 0;

        for (int i = 0; i < sales.length; i++) {
            averageSales = averageSales + sales[i];
        }
        averageSales = averageSales / sales.length;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                salesAboveAverage++;
            }
        }
        return salesAboveAverage;
    }

}
