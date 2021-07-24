package com.Transport.Land.Cargo;

import com.Transport.Land.Land;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
@ToString(callSuper = true)
public class Cargo extends Land {//грузовой
    private double carryingCapacity;//Грузоподъёмность(т)

    public void checkWeightCapacity(double weight) {
        double kw = getPower(34.4);
        if (weight <= carryingCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}