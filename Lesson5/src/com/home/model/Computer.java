package com.home.model;

import java.util.Scanner;

public class Computer {
    String processor;
    String ram;
    String hardDisk;
    String on = "Компьютер включается...";
    String off = "Завершение работы";

    public Computer(String processor, String ram, String hardDisk, String on, String off) {
        System.out.println(this.processor = "Процессор: I5-8660");
        System.out.println(this.ram = "ОЗУ: 16 Gb");
        System.out.println(this.hardDisk = "Жёсткий диск: Toshiba 2 Tb");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1 для включения компьютера: ");
        int i = in.nextInt();
        int power = i;
        while (power == 1) {
            System.out.println(on);
            int zeroOne = (int) Math.random();
            System.out.println("Внимание! Введите 0 или 1");
            int chance = in.nextInt();
            System.out.println(off);
            if (chance != zeroOne) {
                power = 0;
            }
        }
        System.out.println("Введите 1 для включения компьютера: ");
        System.out.println("Компьютер сгорел!");
    }
}
