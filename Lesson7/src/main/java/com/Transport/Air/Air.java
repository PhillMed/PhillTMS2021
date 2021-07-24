package com.Transport.Air;

import com.Transport.Transport;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder

public abstract class Air extends Transport {
    private double wingspan;
    private double minRunwayLength;
}