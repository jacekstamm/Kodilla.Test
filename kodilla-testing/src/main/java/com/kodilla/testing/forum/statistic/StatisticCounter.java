package com.kodilla.testing.forum.statistic;

import java.util.List;

public class StatisticCounter{
    int usersQuantity;
    int postsQuantity;
    int commentsQuantity;
    double averagePostPerUser;
    double averageCommentPerUser;
    double averageCommentPerPost;

    public StatisticCounter() {

    }

    public void calculateAdvStatistics(Statistic statistic) {
        usersQuantity = statistic.userNames().size();
        postsQuantity = statistic.postsCount();
        commentsQuantity = statistic.commentsCount();
        averagePostPerUser = postsQuantity / usersQuantity;
        averageCommentPerUser = commentsQuantity / usersQuantity;
        averageCommentPerPost = commentsQuantity / postsQuantity;
    }

    public String showStatistics(Statistic statistic) {
        return "Forum got: " + usersQuantity + " users. The number of all posts: " + postsQuantity + ". The number of all commentes: "
                + commentsQuantity + ". Average posts per users is: " + averagePostPerUser + ", average comments per users is: "
                + averageCommentPerUser + " and average comments per posts is: " + averageCommentPerPost;
    }

    public double getAveragePostPerUser() { return averagePostPerUser; }

    public double getAverageCommentPerUser() { return averageCommentPerUser; }

    public double getAverageCommentPerPost() { return averageCommentPerPost; }
}
