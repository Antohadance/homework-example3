package com.company;

public class Main {
    public static void main(String[] args) {
        int clientOs = 1;
        if (clientOs >= 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }


        int clientOs1 = 1;
        int clientDeviceYear = 2015;
        if (clientOs1 >= 1 || clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOs1 == 0 || clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }


        int year = 2022;
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " год является высокосным");
        } else if (year % 4 == 0 && year % 100 > 0) {
            System.out.println(year + " год является высокосным");
        } else if (year % 100 == 0) {
            System.out.println(year + " год является обычным");
        } else {
            System.out.println(year + " год является обычным");
        }


        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней на доставку: 1");
        } else if (20 < deliveryDistance && deliveryDistance <= 60){
            System.out.println("Потребуется дней на доставку: 2");
        } else if (60 < deliveryDistance && deliveryDistance <= 100){
            System.out.println("Потребуется дней на доставку: 3");
        } else if (100 < deliveryDistance){
            System.out.println("Потребуется дней на доставку: 4");
        }


        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует");}
                switch (monthNumber) {
                    case 1:
                    case 2:
                    case 12:
                        System.out.println("Сезон зима");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Сезон весна");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("Сезон лето");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("Сезон осень");
                        break;
                    default:
                        System.out.println("Такого сезона не существует");

        }
    }
}



