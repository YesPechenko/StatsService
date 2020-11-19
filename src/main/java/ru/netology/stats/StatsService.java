package ru.netology.stats;

public class StatsService {
    public static void main(String[] args) {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int amount = findAmount(purchases);
        System.out.println("Сумма всех продаж: " + amount + " рублей");

        int average = findAverage(purchases);
        System.out.println("Средняя сумма продаж в месяц: " + average + " рублей");

       int monthMax = findMax(purchases);
        System.out.println("Номер месяца, в котором был пик продаж; " + monthMax);

        int monthMin = findMin(purchases);
        System.out.println("Номер месяца, в котором был минимум продаж: " + monthMin);

        int monthUnderAverage = findUnderAverage(purchases);
        System.out.println("Количество месяцев с продажами ниже среднего: " + monthUnderAverage);

        int monthOverAverage = findOverAverage(purchases);
        System.out.println("Количество месяцев с продажами выше среднего: " + monthOverAverage);
    }

    public static int findAmount(int[] purchases) {
        int amount = 0;
        for (int purchase : purchases) {
            amount += purchase;
        }
        return amount;
    }

    public static int findAverage(int[] purchases) {
        return findAmount(purchases)/purchases.length;
    }

    public static int findMax(int[] purchases) {
        int max = purchases[0];
        int number = 0;
        int numberMax = 0;
        for (int purchase : purchases) {
            number++;
            if (max <= purchase) {
                max = purchase;
                numberMax = number;
            }
        }
        return numberMax;
    }
    public static int findMin(int[] purchases) {
        int min = purchases[0];
        int number = 0;
        int numberMin = 0;
        for (int purchase : purchases) {
            number++;
            if (min >= purchase) {
                min = purchase;
                numberMin = number;
            }
        }
        return numberMin;
    }

    public static int findUnderAverage(int[] purchases) {
        int average = findAverage(purchases);
        int month = 0;
        int quantityUnder = 0;
        for (int purchase : purchases) {
            if (purchase < average) {
                month++;
                quantityUnder = month;
            }
        }
        return quantityUnder;
    }

    public static int findOverAverage(int[] purchases) {
        int average = findAverage(purchases);
        int month = 0;
        int quantityOver = 0;
        for (int purchase : purchases) {
            if (purchase > average) {
                month++;
                quantityOver = month;
            }
        }
        return quantityOver;
    }
}
