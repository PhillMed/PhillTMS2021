package com.Transport;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder

public abstract class Transport implements Transportable {
    private double power;
    private double maxSpeed;
    private double weight;
    private String brand;
}
