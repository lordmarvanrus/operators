import java.sql.SQLOutput;

public class operatorsHomework {
    public static void main(String[] args) {
        //задание 1
        // 1 вариант (я решил попробовать сделать так, чтобы программа реагировала на иную ОС
        int clientOS = 1;
        System.out.println("1 задание, вариант 1");
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Ваша ОС не поддерживается");
        }
        // 2 вариант
        System.out.println("1 задание, вариант 2");
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // 2 задание
        System.out.println("2 Задание");
        int clientDeviceYear = 2005;
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        // 3 задание
        System.out.println("3 задание");
        int year = 2400;
        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
            System.out.println("Этот не год високосный");
        }
        else  {
            System.out.println("Этот год високосный");
        }
        // 4 задание
        System.out.println("4 задание");
        int deliveryDistance = 95;
        int deliveryTime = 1;
                if (deliveryDistance > 20 && deliveryDistance < 60) {
                    deliveryTime += deliveryTime;
                }
                if (deliveryDistance > 60 && deliveryDistance < 100) {
                    deliveryTime = deliveryTime + 2;
                }
                if (deliveryDistance > 100) {
                    deliveryTime = deliveryTime + 3;
                }
        System.out.println("Потребуется дней на доставку: " + deliveryTime);
        // 5 задание
        System.out.println("5 задание");
        int monthNumber = 25;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Сейчас зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}

