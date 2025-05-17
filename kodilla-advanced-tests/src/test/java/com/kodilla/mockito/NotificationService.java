package com.kodilla.mockito;

import com.sun.nio.sctp.Notification;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    private List<Client> clients = new ArrayList<>();

    public void addSubscriber(Client client) {
        this.clients.add(client);
    }

    public void sendNotification(Notification notification) {
        this.clients.forEach(client -> client.receive((javax.management.Notification) notification));
    }
}

    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
        NotificationService notificationService = new NotificationService();
        Client client = Mockito.mock(Client.class);
        Notification notification = Mockito.mock(Notification.class);

        notificationService.sendNotification(notification);
    }

    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
        NotificationService notificationService = new NotificationService();
        Client client = Mockito.mock(Client.class);
        Notification notification = Mockito.mock(Notification.class);

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void subscribedClientShouldReceiveNotification() {
        NotificationService notificationService = new NotificationService();
        Client client = Mockito.mock(Client.class);
        notificationService.addSubscriber(client);
        Notification notification = Mockito.mock(Notification.class);

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

@Test
public void notificationShouldBeSentToAllSubscribedClients() {
    NotificationService notificationService = new NotificationService();
    Client firstClient = Mockito.mock(Client.class);
    Client secondClient = Mockito.mock(Client.class);
    Client thirdClient = Mockito.mock(Client.class);
    notificationService.addSubscriber(firstClient);
    notificationService.addSubscriber(secondClient);
    notificationService.addSubscriber(thirdClient);
    Notification notification = Mockito.mock(Notification.class);

    notificationService.sendNotification(notification);
    Mockito.verify(firstClient, Mockito.times(1)).receive(notification);
    Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
    Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);
}

@Test
public void shouldSendOnlyOneNotificationToMultiTimeSubscriber() {
    NotificationService notificationService = new NotificationService();
    Client client = Mockito.mock(Client.class);
    notificationService.addSubscriber(client);
    notificationService.addSubscriber(client);
    notificationService.addSubscriber(client);
    Notification notification = Mockito.mock(Notification.class);

    notificationService.sendNotification(notification);

    Mockito.verify(client, Mockito.times(1)).receive(notification);
}
}
