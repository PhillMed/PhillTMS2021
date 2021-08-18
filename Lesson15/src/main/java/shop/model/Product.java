package shop.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Product {
    private final int id;
    private String name;
    private int price;
}
