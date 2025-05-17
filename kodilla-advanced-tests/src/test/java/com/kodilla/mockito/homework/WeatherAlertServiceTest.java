package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class WeatherAlertServiceTest {

    WeatherAlertService service;
    Client client1;
    Client client2;
    Notification notification;

    @BeforeEach
    public void setup() {
        service = new WeatherAlertService();
        client1 = mock(Client.class);
        client2 = mock(Client.class);
        notification = mock(Notification.class);
    }

    @Test
    public void shouldAddSubscriberToLocation() {
        // Given
        service.addSubscriber("London", client1);

        // When
        service.sendNotificationToLocation("London", notification);

        // Then
        verify(client1, times(1)).receive(notification);
    }

    @Test
    public void shouldNotAddSameClientTwiceToLocation() {
        // Given
        service.addSubscriber("New York", client1);
        service.addSubscriber("New York", client1);

        // When
        service.sendNotificationToLocation("New York", notification);

        // Then
        verify(client1, times(1)).receive(notification);
    }

    @Test
    public void shouldRemoveSubscriberFromLocation() {
        // Given
        service.addSubscriber("Paris", client1);
        service.removeSubscriberFromLocation("Paris", client1);

        // When
        service.sendNotificationToLocation("Paris", notification);

        // Then
        verify(client1, never()).receive(notification);
    }

    @Test
    public void shouldRemoveSubscriberFromAllLocations() {
        // Given
        service.addSubscriber("Berlin", client1);
        service.addSubscriber("Madrid", client1);

        // When
        service.removeSubscriberFromAllLocations(client1);
        service.sendNotificationToLocation("Berlin", notification);
        service.sendNotificationToLocation("Madrid", notification);

        // Then
        verify(client1, never()).receive(notification);
    }

    @Test
    public void shouldSendNotificationToLocationSubscribersOnly() {
        // Given
        service.addSubscriber("Rome", client1);
        service.addSubscriber("Rome", client2);
        service.addSubscriber("Tokyo", client2);

        // When
        service.sendNotificationToLocation("Rome", notification);

        // Then
        verify(client1, times(1)).receive(notification);
        verify(client2, times(1)).receive(notification);

        // When
        reset(client1, client2);
        service.sendNotificationToLocation("Tokyo", notification);

        // Then
        verify(client1, never()).receive(notification);
        verify(client2, times(1)).receive(notification);
    }

    @Test
    public void shouldSendNotificationToAllSubscribersOnlyOnce() {
        // Given
        service.addSubscriber("Chicago", client1);
        service.addSubscriber("Miami", client1);
        service.addSubscriber("Miami", client2);

        // When
        service.sendNotificationToAll(notification);

        // Then
        verify(client1, times(1)).receive(notification);
        verify(client2, times(1)).receive(notification);
    }

    @Test
    public void shouldRemoveLocation() {
        // Given
        service.addSubscriber("Toronto", client1);

        // When
        service.removeLocation("Toronto");
        service.sendNotificationToLocation("Toronto", notification);

        // Then
        verify(client1, never()).receive(notification);
    }
}
