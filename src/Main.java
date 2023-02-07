import java.awt.*;

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
    }
    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 7673789;
        System.out.println(paper);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper = 7673789;
        paper = paper + 4;
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 7673789;
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19.0;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес боксеров " + totalWeight + " кг");
        var weightDifference = secondBoxer - firstBoxer;
        System.out.println("Разница в весе составляет " + weightDifference + " кг");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var weightDifference = secondBoxer - firstBoxer;
        System.out.println("Разница в весе составляет " + weightDifference + " кг");
        var remainderOfTheDivision = secondBoxer % firstBoxer;
        System.out.println("Разница в весе при расчете остатка от деления " + remainderOfTheDivision + " кг");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var hourWork = 640.0;
        var workers = hourWork / 8;
        System.out.println("Всего работников в компании " + workers + " человек");
        var moreEmploees = workers + 94;
        var workHourWithMoreEmployees = hourWork / moreEmploees;
        System.out.println("Если в компании работает " + moreEmploees + " то всего " + workHourWithMoreEmployees + " часов работы может быть поделено между сотрудниками");
    }
}