package com.Transport.Air.Military;

import com.Transport.Air.Air;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
public class Military extends Air {
    private boolean catapultSystem;
    private int countRockets;
}