package com.ea.ecommerceaccountbackend.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Data
public class OrderLine {

    private Long id;

    @NotNull
    private Long productId;

    @NotNull
    private Integer quantity;

    private Order order;
}
