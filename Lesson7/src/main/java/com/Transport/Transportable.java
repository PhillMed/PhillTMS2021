package com.Transport;

public interface Transportable {
    default double getPower(double power) {
        return power * 0.74;
    }
}