import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //Задача 1
        int clientOS = 0;

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
        defineAppVersion(clientOS, LocalDate.now().getYear());
        System.out.println();

        //Задача 3
        isLeapYear(2027);
        System.out.println();

        //Задача 4
        int deliveryDistance = 95;
        int deliveryTime = calculateDeliveryTime(deliveryDistance);

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

    /**
     * Метод задачи 1.
     * @param year год для проверки.
     */
    private static void isLeapYear(int year) {

        if (year % 4 == 0) {

            if (year % 100 == 0) {

                if (year % 400 == 0) {
                    System.out.println(year + " год - високосный год");
                } else {
                    System.out.println(year + " год невисокосный год");
                }
            } else {
                System.out.println(year + " год - високосный год");
            }
        } else {
            System.out.println(year + " год невисокосный год");
        }
    }

    /**
     * Метод задачи 2.
     * @param operationSystem операционная система (0 - IOS, 1 - Android).
     * @param deviceYear год выпуска устройства пользователя.
     */
    private static void defineAppVersion(int operationSystem, int deviceYear) {

        if (operationSystem == 0) {

            if (deviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        } else if (operationSystem == 1) {

            if (deviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("К сожалению, приложение не поддерживает вашу операционную систему");
        }
    }

    /**
     * Метод задачи 3.
     * @param deliveryDistance дистанция для доставки заказа.
     * @return количество дней, необходимое для доставки.
     */
    private static int calculateDeliveryTime(int deliveryDistance) {

        if (deliveryDistance > 100) {
            return -1;
        } else if (deliveryDistance >  60) {
            return 3;
        } else if (deliveryDistance > 20) {
            return 2;
        } else {
            return 1;
        }
    }
}
