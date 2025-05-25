package com.kodilla.spring.basic.spring_dependency_injection.homework2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShippingCenterTest {

    @Test
    public void shouldReturnSuccessMessageWhenWeightIsBelowLimit() {
        // given
        DeliveryService deliveryService = new DeliveryService();
        NotificationService notificationService = new NotificationService();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);
        String address = "Warsaw";

        // when
        String result = shippingCenter.sendPackage(address, 25.0);

        // then
        assertEquals("Package delivered to: Warsaw", result);
    }

    @Test
    public void shouldReturnFailMessageWhenWeightIsAboveLimit() {
        // given
        DeliveryService deliveryService = new DeliveryService();
        NotificationService notificationService = new NotificationService();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);
        String address = "Lublin";

        // when
        String result = shippingCenter.sendPackage(address, 35.0);

        // then
        assertEquals("Package not delivered to: Lublin", result);
    }
}
