package com.kodilla.testing.forum.statistic;

public class StatisticCounter {
    int usersQuantity;
    int postsQuantity;
    int commentsQuantity;
    double averagePostPerUser;
    double averageCommentPerUser;
    double averageCommentPerPost;

    public StatisticCounter(int usersQuantity, int postsQuantity, int commentsQuantity, double averagePostPerUser, double averageCommentPerUser, double averageCommentPerPost) {
        this.usersQuantity = usersQuantity;
        this.postsQuantity = postsQuantity;
        this.commentsQuantity = commentsQuantity;
        this.averagePostPerUser = averagePostPerUser;
        this.averageCommentPerUser = averageCommentPerUser;
        this.averageCommentPerPost = averageCommentPerPost;
    }

    public void calculateAdvStatistics(Statistic statistic) {

    }

    public void showStatistics() {

    }
}
