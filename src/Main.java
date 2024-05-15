public class Main {

    public static void main(String[] args) {
        //Задача 1
        byte clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("К сожалению, приложение не поддерживает вашу операционную систему");
        }
        System.out.println();

        //Задача 2
        clientOS = 1;
        short clientDeviceYear = 2013;

        if (clientOS == 0) {

            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        } else if (clientOS == 1) {

            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("К сожалению, приложение не поддерживает вашу операционную систему");
        }
        System.out.println();

        //Задача 3
        short year = 2001;
        boolean result;

        if (year % 4 == 0) {

            if (year % 100 == 0) {
                result = year % 400 == 0;
            } else {
                result = true;
            }
        } else {
            result = false;
        }

        if (result) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();

        //Задача 4
        short deliveryDistance = 95;
        byte deliveryTime;

        if (deliveryDistance > 100) {
            deliveryTime = -1;
        } else if (deliveryDistance >  60) {
            deliveryTime = 3;
        } else if (deliveryDistance > 20) {
            deliveryTime = 2;
        } else {
            deliveryTime = 1;
        }

        if (deliveryTime == -1) {
            System.out.println("Свыше 100 км нет доставки");
        } else {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        System.out.println();

        //Задача 5
        byte monthNumber = 11;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Это зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осень");
                break;
            default:
                System.out.println("Номер месяца может быть от 1 до 12");
        }
    }
}
