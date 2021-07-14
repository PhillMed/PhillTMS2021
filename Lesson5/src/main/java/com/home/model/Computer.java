package com.home.model;


import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String cpu;
    private String ram;
    private String hardDisk;
    private int resourceCycles;
    private Random random = new Random();
    private Scanner in = new Scanner(System.in);
    private boolean burned;
    private int isBurned;

    public Computer(String cpu, String ram, String hardDisk, int resourceCycles) {
        this.cpu = cpu;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.resourceCycles = resourceCycles;
        this.isBurned = 0;
    }

    public void info() {
        System.out.printf("Процессор: " + this.cpu + "\nОператива: " + this.ram + "\nЖёсткий диск: " + this.hardDisk + "\nЦиклы: " + this.resourceCycles);
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public int getResourceCycles() {
        return resourceCycles;
    }

    public void setResourceCycles(int resourceCycles) {
        this.resourceCycles = resourceCycles;
    }

    public int getIsBurned() {
        return isBurned;
    }

    public void setIsBurned(int isBurned) {
        this.isBurned = isBurned;
    }

    public void on() {
        if (resourceCycles == 0) {
            System.out.println("Циклы закончились раньше, чем компьютер сгорел. =)");
        } else {
            if (isBurned == 1) {
                burned();
            } else {
                System.out.println("Включение компьютера...");
                System.out.println("Загрузка...");
                if (isBurned == 0 && checkAction() && checkResourceCycles()) {
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
        isBurned = 1;
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
