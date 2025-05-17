package com.kodilla.mockito.homework;

import java.util.*;

public class WeatherAlertService {
    private final Map<String, Set<Client>> locationSubscriptions = new HashMap<>();

    public void addSubscriber(String location, Client client) {
        locationSubscriptions
                .computeIfAbsent(location, loc -> new HashSet<>())
                .add(client);
    }

    public void removeSubscriberFromLocation(String location, Client client) {
        Set<Client> clients = locationSubscriptions.get(location);
        if (clients != null) {
            clients.remove(client);
        }
    }

    public void removeSubscriberFromAllLocations(Client client) {
        for (Set<Client> clients : locationSubscriptions.values()) {
            clients.remove(client);
        }
    }

    public void sendNotificationToLocation(String location, Notification notification) {
        Set<Client> clients = locationSubscriptions.get(location);
        if (clients != null) {
            for (Client client : clients) {
                client.receive(notification);
            }
        }
    }

    public void sendNotificationToAll(Notification notification) {
        Set<Client> notifiedClients = new HashSet<>();
        for (Set<Client> clients : locationSubscriptions.values()) {
            for (Client client : clients) {
                if (notifiedClients.add(client)) {
                    client.receive(notification);
                }
            }
        }
    }

    public void removeLocation(String location) {
        locationSubscriptions.remove(location);
    }
}
