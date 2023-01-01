import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        task2(0, 2022);
        task3();
    }

    public static void printIsLeapYearResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println("Год " + year + " - високосный");
        } else {
            System.out.println("Год " + year + " - не високосный");
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2021;
        printIsLeapYearResult(year, isLeapYear(year));
    }

    public static boolean isDeviseOld(int deviseYear) {
        int currentYear = LocalDate.now().getYear();
        return deviseYear < currentYear;
    }

    public static void task2(int clientOS, int deviseYear) {
        System.out.println("Задача 2");
        boolean deviseIsOld = isDeviseOld(deviseYear);
        System.out.print("Установите ");
        if (deviseIsOld) {
            System.out.print("Lite ");
        }
        System.out.print("версию для ");
        if (clientOS == 0) {
            System.out.println("IOS");
        } else if (clientOS == 1) {
            System.out.println("Android");
        }
    }

    public static String calcDeliveryTime(int deliveryDistance) {
        int day = 0;
        if (deliveryDistance <= 20) {
            day = day + 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            day = day + 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            day = day + 3;
        } else if (deliveryDistance > 100) {
            return "Доставка не производится";
        }
        return "Потребуется дней: " + day;
    }

    public static void task3() {
        System.out.println("Задача 3");
        System.out.println(calcDeliveryTime(53));
    }
}