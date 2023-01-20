package org.sid.inventoryservice;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="fullProduct",types = Product.class)
public interface InventoryProjection {
    Long getId();
    double getPrice();
    String getName();
    double getQuantity();

}
