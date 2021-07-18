package com.home.model;


import lombok.Getter;
import lombok.Setter;

import java.util.Random;
import java.util.Scanner;

@Getter
@Setter

public class Computer {
    private String cpu;
    private String ram;
    private String hardDisk;
    private int resourceCycles;
    private Random random = new Random();
    private Scanner in = new Scanner(System.in);
    private boolean burned;
    private boolean isBurned;

    public Computer(String cpu, String ram, String hardDisk, int resourceCycles) {
        this.cpu = cpu;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.resourceCycles = resourceCycles;
    }

    public void info() {
        System.out.print("Процессор: " + this.cpu + "\nОператива: " + this.ram + "\nЖёсткий диск: " + this.hardDisk + "\nЦиклы: " + this.resourceCycles);
    }

    public void on() {
        if (resourceCycles == 0) {
            System.out.println("Циклы закончились раньше, чем компьютер сгорел. =)");
        } else {
            if (isBurned) {
                burned();
            } else {
                System.out.println("Включение компьютера...");
                System.out.println("Загрузка...");
                if (!isBurned && checkAction() && checkResourceCycles()) {
                    off();
                } else {
                    burned();
                }
            }
        }
    }

    private void burned() {
        System.out.println("Компьютер сгорел...");
        burned = true;
        isBurned = true;
    }

    private void off() {
        resourceCycles--;
        System.out.println("Выключение компьютера...");
        System.out.println("Количество оставшихся циклов: " + resourceCycles);
    }

    private boolean checkAction() {
        while (true) {
            System.out.println("Внимание! Введите 0 или 1");
            if (in.hasNextInt()) {
                int value = in.nextInt();
                if (value == 0 || value == 1) {
                    return random.nextInt(2) == value;
                } else {
                    System.out.println("Некорректные данные.");
                }
            } else {
                System.out.println("Некорректные данные.");
                in.next();
            }
        }
    }
    private boolean checkResourceCycles() {
        return resourceCycles > 0;
    }
}
