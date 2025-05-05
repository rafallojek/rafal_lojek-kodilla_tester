package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {

    @Test
    void shouldThrowExceptionWhenOrderDoesNotExist() {
        // Given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1234"));
        warehouse.addOrder(new Order("5678"));

        // When
        // Then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("9999"));
    }
}
