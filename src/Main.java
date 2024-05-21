public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1");
        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Несовместимость клиента.");
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 2");
        int releaseYear = 2014;
        int clientDeviceYear = 2015;

        if (clientOS == 0 && releaseYear < clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && releaseYear >= clientDeviceYear) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && releaseYear < clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && releaseYear >= clientDeviceYear) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 3");
        int year = 2021;
        boolean yearIsLeap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        boolean yearIsLeapIntroduction = year >= 1584;

        if (yearIsLeap && yearIsLeapIntroduction) {
            System.out.printf("%s год является високосным.%n", year);
        } else {
            System.out.printf("%s год не является високосным.%n", year);
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDays + ".");
        } else if (deliveryDistance < 60) {
            deliveryDays++;
            System.out.println("Потребуется дней: " + deliveryDays + ".");
        } else if (deliveryDistance < 100) {
            deliveryDays += 2;
            System.out.println("Потребуется дней: " + deliveryDays + ".");
        } else {
            System.out.println("Доставки нет.");
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
                System.out.printf("%s - й месяц (он же декабрь) принадлежит к сезону зима.%n", monthNumber);
                break;
            case 1:
                System.out.printf("%s - й месяц (он же январь) принадлежит к сезону зима.%n", monthNumber);
                break;
            case 2:
                System.out.printf("%s - й месяц (он же февраль) принадлежит к сезону зима.%n", monthNumber);
                break;
            case 3:
                System.out.printf("%s - й месяц (он же март) принадлежит к сезону весна.%n", monthNumber);
                break;
            case 4:
                System.out.printf("%s - й месяц (он же апрель) принадлежит к сезону весна.%n", monthNumber);
                break;
            case 5:
                System.out.printf("%s - й месяц (он же май) принадлежит к сезону весна.%n", monthNumber);
                break;
            case 6:
                System.out.printf("%s - й месяц (он же июнь) принадлежит к сезону лето.%n", monthNumber);
                break;
            case 7:
                System.out.printf("%s - й месяц (он же июль) принадлежит к сезону лето.%n", monthNumber);
                break;
            case 8:
                System.out.printf("%s - й месяц (он же август) принадлежит к сезону лето.%n", monthNumber);
                break;
            case 9:
                System.out.printf("%s - й месяц (он же сентябрь) принадлежит к сезону осень.%n", monthNumber);
                break;
            case 10:
                System.out.printf("%s - й месяц (он же октябрь) принадлежит к сезону осень.%n", monthNumber);
                break;
            case 11:
                System.out.printf("%s - й месяц (он же ноябрь) принадлежит к сезону осень.%n", monthNumber);
                break;
            default:
                System.out.println("Номер месяца больше 12-ти.");
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}