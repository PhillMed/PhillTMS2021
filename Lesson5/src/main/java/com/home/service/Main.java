package com.home.service;

import com.home.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("I5-8660", "16 Gb", "2 Tb", 5);
        computer.info();
        System.out.println();
        while (!computer.isBurned() && computer.getResourceCycles() > 0) {
            computer.on();
        }
        computer.on();
    }
}
