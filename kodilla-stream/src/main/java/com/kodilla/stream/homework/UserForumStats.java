package com.kodilla.stream.homework;

public class UserForumStats {
    private String username;
    private int age;
    private int numberOfPosts;
    private String group;

    public UserForumStats(String username, int age, int numberOfPosts, String group) {
        this.username = username;
        this.age = age;
        this.numberOfPosts = numberOfPosts;
        this.group = group;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public String getGroup() {
        return group;
    }
}
