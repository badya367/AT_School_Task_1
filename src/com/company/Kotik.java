package com.company;



import org.junit.Test;

import java.util.Scanner;

public class Kotik {
    int prettiness;
    int weight;
    int satiety;
    String name;
    String meow;
    private boolean isHungry;


    void liveAnotherDay() {
        name = "Рыжий";
        prettiness = 9999;
        weight = 6327; //в граммах
        meow = "Мяу";
        satiety = 100;
        isHungry = false;
        for (int i = 0; i <= 24; i++) {
            isHungry = satiety <= 0;
            prettiness = 9999;

            int act = (int) (Math.random() * 7);
            boolean isActionComplete = false;
            switch (act) {
                case 0:
                    isActionComplete = sayMeow();
                    break;

                case 1:
                    isActionComplete = play();
                    break;

                case 2:
                    isActionComplete = sleep();
                    break;

                case 3:
                    isActionComplete = troll();
                    break;

                case 4:
                    isActionComplete = magicDoor();
                    break;

                case 5:
                    isActionComplete = hoba();
                    break;

                case 6:
                    if (isHungry) {
                        eat(100);
                        isActionComplete = true;
                    }
                    break;

                default:
                    break;
            }
            System.out.println(isActionComplete ? "Котик совершил действие" : "Котик бездействовал");
        }

    }

    void eat(int satiety) {

        System.out.println("Показать котику секрет кота Бориса? y/n");
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();

        switch (answer) {
            case "y":
                System.out.println("Котя накормлен и рад");
                this.satiety = satiety;
                break;
            case "n":
                System.out.println("Котик не накормлен, берегите тапки");
                break;
        }
    }

    void eat(int satiety, String food) {
        System.out.printf("Котик будет кушать %s, с коллорийностью в %d единиц \n", food, satiety);
        eat(satiety);
    }

    void eat() {
        eat(100, "Рыба");
    }

    boolean sayMeow() {
        if (isHungry) {
            return false;
        }
        System.out.println("________ ");
        System.out.println(name + " говорит " + meow);
        System.out.println("________ ");
        satiety -= 10;
        return true;
    }

    boolean sleep() {
        if (isHungry) {
            return false;
        }
        prettiness = 100000;
        System.out.println("________ ");
        System.out.println(name + " укладывается поудобнее и ложится спать, милота возрастает до: "
                + prettiness);
        System.out.println("________ ");
        satiety -= 10;
        return true;
    }

    boolean play() {
        if (isHungry) {
            return false;
        }
        System.out.println("________ ");
        System.out.println(name + " захотел поиграть");
        System.out.println(name + " прокладывает маршрут");
        System.out.println("ПОЕХАЛИ!");
        System.out.println("3 космическая скорость - on");
        for (int i = 0; i <= 17; i++) {
            System.out.print(i + " м/с; ");
        }
        System.out.println("________ ");
        satiety -= 10;
        return true;
    }

    boolean troll() {
        if (isHungry) {
            return false;
        }
        System.out.println("________ ");
        System.out.println(name + " загадочно смотрит в одну точку, \n" +
                "тем самым, пугая своего человека ");
        System.out.println("________ ");
        satiety -= 10;
        return true;
    }

    boolean magicDoor() {
        if (isHungry) {
            return false;
        }
        System.out.println("________ ");
        int door = (int) (Math.random() * 3);
        if (door == 1) {
            System.out.println(name + " очень настойчиво просит открыть дверь");
        } else {
            System.out.println(name + " закрывает дверь и настойчиво просит её открыть");
        }
        System.out.println("________ ");
        satiety -= 10;
        return true;
    }

    boolean hoba() {
        if (isHungry) {
            return false;
        }
        System.out.println("________ ");
        System.out.println(name + " грациозно выставляет лапку");
        System.out.println("________ ");
        satiety -= 10;
        return true;
    }


}
