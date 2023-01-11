public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    private static void task1() {
        System.out.println("Задача №1");
        //Задача №1
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }

    private static void task2() {
        System.out.println("Задача №2");
        //Задача №2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    private static void task3() {
        System.out.println("Задача №3");
        //Задача №3
        for (int i = 0; i < 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void task4() {
        System.out.println("Задача №4");
        //Задача №4
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
    }

    private static void task5() {
        System.out.println("Задача №5");
        //Задача №5
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високсным");
        }
    }

    private static void task6() {
        System.out.println("Задача №6");
        //Задача №6
        for (int number = 1; number < 100; number++) {
            if (number % 7 == 0) {
                System.out.println(number);
            }
        }
    }

    private static void task7() {
        System.out.println("Задача №7");
        //Задача №7
        for (int number = 1; number <= 512; number = number * 2) {
            System.out.println(number);
        }
    }

    private static void task8() {
        System.out.println("Задача №8");
        //Задача №8
        int month = 0;
        int sum = 29000;
        for (int i = 1; i < 13; i++) {
            sum = sum + sum;
            sum = month + sum;
            System.out.println("Месяц " + i + " сумма накоплений равна " + sum + " рублей");
        }
    }

    private static void task9() {
        System.out.println("Задача №9");
        //Задача №9
        int month = 0;
        int sum = 29000;
        for (int t = 1; t < 13; t++) {
            sum = sum + sum / 100;
            sum = month + sum;
            System.out.println("Месяц " + t + " сумма накоплений равна " + sum + " рублей");
        }
    }

    private static void task10() {
        System.out.println("Задача №10");
        //Задача №10
        for(int i = 1; i < 11; i++){
            System.out.println("2 * "+i+" = "+(i*2));
        }
    }
}
