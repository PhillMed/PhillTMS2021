package com.Transport.Air.Civil;

import com.Transport.Air.Air;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@ToString(callSuper = true)
@SuperBuilder
public class Civil extends Air {
    private int countPassengers;
    private boolean businessClass;

    public void checkPassengerCapacity(int people) {
        if (people <= countPassengers) {
            System.out.println("Самолёт загружен");
        } else {
            System.out.println("Вам нужен самолёт побольше");
        }
    }
}