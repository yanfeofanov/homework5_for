public class Main {

    public static void main(String[] args) {
        task1_1();
        task2_2();
        task3_3();
        task4_4();
        task5_5();
        task6_6();
        task7_7();
        task8_8();
    }

//    private static void task1() {
//        System.out.println("Задача №1");
//        //Задача №1
//        for (int i = 1; i < 11; i++) {
//            System.out.println(i);
//        }
//    }
//
//    private static void task2() {
//        System.out.println("Задача №2");
//        //Задача №2
//        for (int i = 10; i > 0; i--) {
//            System.out.println(i);
//        }
//    }
//
//    private static void task3() {
//        System.out.println("Задача №3");
//        //Задача №3
//        for (int i = 0; i < 17; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//    }
//
//    private static void task4() {
//        System.out.println("Задача №4");
//        //Задача №4
//        for (int i = 10; i > -11; i--) {
//            System.out.println(i);
//        }
//    }
//
//    private static void task5() {
//        System.out.println("Задача №5");
//        //Задача №5
//        for (int year = 1904; year <= 2096; year = year + 4) {
//            System.out.println(year + " год является високсным");
//        }
//    }
//
//    private static void task6() {
//        System.out.println("Задача №6");
//        //Задача №6
//        for (int number = 1; number < 100; number++) {
//            if (number % 7 == 0) {
//                System.out.println(number);
//            }
//        }
//    }
//
//    private static void task7() {
//        System.out.println("Задача №7");
//        //Задача №7
//        for (int number = 1; number <= 512; number = number * 2) {
//            System.out.println(number);
//        }
//    }
//
//    private static void task8() {
//        System.out.println("Задача №8");
//        //Задача №8
//        int month = 0;
//        int sum = 29000;
//        for (int i = 1; i < 13; i++) {
//            sum = sum + sum;
//            sum = month + sum;
//            System.out.println("Месяц " + i + " сумма накоплений равна " + sum + " рублей");
//        }
//    }
//
//    private static void task9() {
//        System.out.println("Задача №9");
//        //Задача №9
//        int month = 0;
//        int sum = 29000;
//        for (int t = 1; t < 13; t++) {
//            sum = sum + sum / 100;
//            sum = month + sum;
//            System.out.println("Месяц " + t + " сумма накоплений равна " + sum + " рублей");
//        }
//    }
//
//    private static void task10() {
//        System.out.println("Задача №10");
//        //Задача №10
//        for(int i = 1; i < 11; i++){
//            System.out.println("2 * "+i+" = "+(i*2));
//        }
//    }

    private static void task1_1() {
        System.out.println("Задание №1");
        int month = 1;
        int salary = 0;
        while (salary < 2459000) {
            System.out.println("Месяц " + month + " сумма накоплений равна " + salary + " рублей");
            salary = salary + 15000;
            month++;
        }
    }

    private static void task2_2() {
        System.out.println("Задание №2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
    }

    private static void task3_3() {
        System.out.println("Задание №3");
        int death = 8;
        int born = 17;
        int population = 12000000;
        int differenceDeathBirth = born - death;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Год " + i + " численность населения составляет " + population);
            population = population + population * differenceDeathBirth / 1000;
        }
    }

    private static void task4_4() {
        System.out.println("Задание №4");
        int depositAmount = 15000;
        int purposeOfAccumulation = 12000000;
        int mount = 1;
        while (depositAmount <= purposeOfAccumulation) {
            System.out.println("Месяц " + mount + " сумма накоплений составляет " + depositAmount);
            depositAmount += depositAmount / 100 * 7;
            mount++;
        }
    }

    private static void task5_5() {
        System.out.println("Задание №5");
        int depositAmount = 15000;
        int purposeOfAccumulation = 12000000;
        int mount = 1;
        while (depositAmount <= purposeOfAccumulation) {
            depositAmount += depositAmount / 100 * 7;
            mount++;
            if (mount % 6 == 0) {
                System.out.println("Месяц " + mount + " сумма накоплений составляет " + depositAmount);
            }
        }
    }

    private static void task6_6() {
        System.out.println("Задание №6");
        int depositAmount = 15000;
        for (int i = 1; i <= 108; i++) {
            depositAmount += depositAmount / 100 * 7;
            if (i % 6 == 0) {
                System.out.println("За " + i + " месяцев, сумма накоплений составляет " + depositAmount);
            }
        }
    }

    private static void task7_7() {
        System.out.println("Задание №7");
        int week = 6;
        do {
            System.out.println("Сегодня пятница " + week + "-e число. Необходимо подготовить отчет");
            week = week + 7;
        }
        while (week <= 31);
    }

    private static void task8_8() {
        System.out.println("Задание №8");
        int year = 0;
        do {
            if (year >= 1823)
                System.out.println(year);
                year += 79;
        }
            while (year <= 2123);
        }
}