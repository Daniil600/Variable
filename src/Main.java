public class Main {
    public static void main(String[] args) {
        task1();

        System.out.println();

        task2();

        System.out.println();

        task3();

        System.out.println();

        task4();

        System.out.println();

        task5();

        System.out.println();

        task6();

        System.out.println();

        task7();

        System.out.println();

        task8();


    }

    public static void task1(){
        System.out.println("Задача 1:");
        var dog = 8.0; var cat = 3.6; var paper = 763789;

        System.out.println("Собака: "+ dog);
        System.out.println("Кот: " + cat);
        System.out.println("Бумага: " + paper);
    }

    public static void task2(){
        System.out.println("Задача 2:");
        var dog = 8.0; var cat = 3.6; var paper = 763789;
        var number = 4;

        var dog1 = dog + number;
        var cat1 = cat +number;
        var paper1 = paper + number;

        System.out.println("Собака: "+ dog1);
        System.out.println("Кот: " + cat1);
        System.out.println("Бумага: " + paper1);
    }

    public static void task3(){
        System.out.println("Задача 3:");
        var dog = 8.0; var cat = 3.6; var paper = 763789;

        var dog2 = dog - 3;
        var cat2 = cat - 1.6;
        var paper2 = paper - 7639;

        System.out.println("Собака: "+ dog2);
        System.out.println("Кот: " + cat2);
        System.out.println("Бумага: " + paper2);
    }
    public static void task4(){
        System.out.println("Задача 4:");
        var friend = 19;
        System.out.println("Друзья: " + friend);

        friend = friend + 2;
        System.out.println("Друзья: " + friend);

        friend = friend / 7;
        System.out.println("Друзья: " + friend);

    }
    public static void task5(){
        System.out.println("Задача 5:");
        var frog = 3.5;
        System.out.println("Лягушка: " + frog);

        frog = frog * 10;
        System.out.println("Лягушка: " + frog);

        frog = frog / 3.5;
        System.out.println("Лягушка: " + frog);

        frog = frog + 4;
        System.out.println("Лягушка: " + frog);

    }
    public static void task6(){
        System.out.println("Задача 6:");
        var boxer1 = 78.2;
        var boxer2 = 82.7;

        var totalWeight = boxer1 + boxer2;
        var weightDifference = boxer2 - boxer1;

        System.out.println("Общий вес боксеров " + totalWeight + " кг.");
        System.out.println("Разница в весе " + weightDifference + " кг.");
    }
    public static void task7(){
        System.out.println("Задача 7:");
        var boxer1 = 78.2;
        var boxer2 = 82.7;

        var totalWeight = boxer2 - boxer1;
        var weightDifference = boxer2 % boxer1;

        System.out.println(totalWeight);
        System.out.println(weightDifference);
    }
    public static void task8(){
        System.out.println("Задача 8:");
        int timeOfJob = 640;
        int timeOfWork = 8;
        int countOfHuman = timeOfJob / timeOfWork;
        System.out.println("Всего работников в компании — " + countOfHuman + " человек");

        int plusCountOfHuman = countOfHuman + 94;
        int timeOfWorkPlus = timeOfJob / plusCountOfHuman;

        System.out.println("Если в компании работает " + plusCountOfHuman + " человек, то всего " + timeOfWorkPlus + " часов работы может быть поделено между сотрудниками");

    }
}