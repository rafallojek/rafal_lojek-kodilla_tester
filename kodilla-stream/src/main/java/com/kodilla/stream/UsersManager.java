package com.kodilla.stream;

public class UsersManager {
    public static void main(String[] args) {
        processUsersStream();
    }

    private static void processUsersStream() {
        UsersRepository.getUsersList()
                .stream()
                .map(user -> user.getUsername())
                .forEach(username -> System.out.println(username));
    }
}