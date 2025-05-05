package com.kodilla.stream.homework;

import com.kodilla.stream.UserForumStats;
import com.kodilla.stream.UsersRepositoryForumStats;

import java.util.List;

public class ForumStats {

    public static double averagePostsForUsersOver40(List<UserForumStats> users) {
        return users.stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(UserForumStats::getNumberOfPosts)
                .average()
                .orElse(0);
    }

    public static double averagePostsForUsersUnder40(List<UserForumStats> users) {
        return users.stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(UserForumStats::getNumberOfPosts)
                .average()
                .orElse(0);
    }

    public static void main(String[] args) {
        List<UserForumStats> users = UsersRepositoryForumStats.getUsersList();

        double avgOver40 = averagePostsForUsersOver40(users);
        double avgUnder40 = averagePostsForUsersUnder40(users);

        System.out.println("Average number of posts for users aged 40 and over: " + avgOver40);
        System.out.println("Average number of posts for users under 40: " + avgUnder40);
    }
}
