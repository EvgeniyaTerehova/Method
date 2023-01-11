public abstract class Main {

    private static java.time.LocalDate LocalDate;

    public static void main(String[] args) {
        printIsLeapYear(2024);
        recomendApplicationVersion(1, 2023);
        calculateDeliveryDays(150);
    }

     /**Задача 1
     * Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он
     * високосным, и выводит результат в консоль.
     * Эту проверку вы уже реализовывали в задании по условным операторам.*/

    private static void printIsLeapYearResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(year + " високосный");
        } else {
            System.out.println(year + " не является високосным");
        }
    }
    public static void printIsLeapYear(int year) {
        boolean yearIsLeap = isLeap(year);
        printIsLeapYearResult(year, yearIsLeap);
    }
    private static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    /**
     * Задача 2
     * Вспомните задание 2 из урока «Условные операторы», где вы предлагали пользователю
     * облегченную версию приложения.
     */


   public static void recomendApplicationVersion(int clientOS, int deviceYear){
       System.out.print("установите ");
       boolean deviceOld = isDeviceOld(deviceYear);
       if (deviceOld) {
           System.out.print("lite ");
       }
       System.out.print("версию для ");
       if (clientOS == 1) {
           System.out.println("Android");
       } else {
           System.out.print("ios");
       }
   }

    private static boolean isDeviceOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear <= currentYear;
    }

    /**
     * Задача 3
     * Возвращаемся к задаче на расчет дней доставки банковской карты.
     * Ваша задача — доработать код, а именно написать метод, который на вход
     * принимает дистанцию и возвращает итоговое количество дней доставки.
     */

    public static String calculateDeliveryDays(int deliveryDistance) {
        String message = "";
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays++;
        } else if (deliveryDistance > 100) {
            message = "Доставки нет";
        }
        message = "Потребуется дней: " + deliveryDays;
        System.out.println(message);
        return message;
    }
}