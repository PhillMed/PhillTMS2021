package com.Transport.Land;

import com.Transport.Transport;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@ToString
@SuperBuilder
public abstract class Land extends Transport {
    private int wheels;
    private double fuelConsumption;
}