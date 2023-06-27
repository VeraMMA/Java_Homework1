import java.util.*;

public class intern {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       boolean HW = true;

       while (true){
           System.out.println("Укажите номер задачи: ");
           System.out.println("1 - Задача 1: ");
           System.out.println("2 - Задача 2: ");
           System.out.println("3 - Задача 3: ");
           System.out.println("4 - Задача 4: ");
           System.out.println("0 - Завершение работы приложения:");
           System.out.println("Введите номер задачи: ");
           int no = Integer.parseInt(scanner.nextLine());

           if (no == 1){
               task1();
           }
           else if (no == 2){
               task2();
           } else if (no == 3) {
               task3();
           } else if (no == 4) {
               task4();
           } else if (no == 0) {
               System.out.println("Завершение работы приложения:");
               break;
           }
       }

    }

    public static void task1() {
        System.out.println("Вычислить сумму чисел от 1 до N.");
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        int mate;

        int sum = 0;
        mate = 1;
        while (mate <= number) {
            sum = sum + mate;
            mate = mate + 1;
        } System.out.println(sum);
    }

    public static void task2() {
        System.out.println("Вычислить произведение чисел от 1 до N.");
        System.out.println("Введите число:");

        int number = scanner.nextInt();
        int mate;

        int sum = 1;
        mate = 1;
        while (mate <= number) {
            sum = sum * mate;
            mate = mate + 1;
        }
        System.out.println(sum);
    }

      public static void task3(){
          System.out.println("Вывести все простые числа от 1 до 1000");
         for (int i = 2; i <= 1000; i++){
             boolean Prime = true;

             for (int j = 2; j < i; j++) {
                 if (i % j == 0){
                     Prime = false;
                     break;
             }
         }  if(Prime)     System.out.println(i);
             }

      }

    public static void task4() {
        System.out.println("Реализовать простой калькулятор");

        System.out.println("Введите первое число");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе число");
        int number2 = scanner.nextInt();
        int res;
        System.out.println("Выберите действие");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        switch (action) {
            case "+" -> {
                res = number1 + number2;
                System.out.println("Результат: " + res);
            }
            case "-" -> {
                res = number1 - number2;
                System.out.println("Результат: " + res);
            }
            case "/" -> {
                if (number2 == 0)
                    System.out.println("Ошибка");
                else {
                    res = number1 / number2;
                    System.out.println("Результат: " + res);
                }
            }
            case "*" -> {
                res = number1 * number2;
                System.out.println("Результат: " + res);
            }
            default -> System.out.println("Неверный ввод");
        }
    }
}
