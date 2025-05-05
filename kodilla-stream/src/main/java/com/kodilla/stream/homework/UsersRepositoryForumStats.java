package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryForumStats {
    public static List<UserForumStats> getUsersList() {
        List<UserForumStats> users = new ArrayList<>();
        users.add(new UserForumStats("Walter White senior", 50, 7, "Chemists"));
        users.add(new UserForumStats("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new UserForumStats("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new UserForumStats("Gus Firing", 49, 0, "Board"));
        users.add(new UserForumStats("Gale Boetticher", 44, 2, "Chemists"));
        users.add(new UserForumStats("Mike Ehrmantraut", 57, 0, "Security"));
        return users;
    }
}
