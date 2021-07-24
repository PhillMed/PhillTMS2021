package com.Transport.Land.Light;

import com.Transport.Land.Land;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)

public class Light extends Land {
    private String bodyType;
    private int countPassengers;
}