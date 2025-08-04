package com.kodilla.spring.basic.dependency_injection.homework;

import org.junit.jupiter.api.Test;

class ShippingCenterTest {
    @Test
    void testShippingCenter() {
        new ShippingCenter(new com.kodilla.spring.basic.dependency_injection.homework.DeliveryServiceImpl(), new com.kodilla.spring.basic.dependency_injection.homework.NotificationServiceImpl());
    }
}