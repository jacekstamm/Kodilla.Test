package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int forumUserID;
    private final String forumUserName;
    private final char forumUserSex;
    private final LocalDate forumUserDateOfBirth;
    private final int forumUserQuantityOfPosts;

    public ForumUser(int forumUserID, String forumUserName, char forumUserSex, LocalDate forumUserDateOfBirth, int forumUserQuantityOfPosts) {
        this.forumUserID = forumUserID;
        this.forumUserName = forumUserName;
        this.forumUserSex = forumUserSex;
        this.forumUserDateOfBirth = forumUserDateOfBirth;
        this.forumUserQuantityOfPosts = forumUserQuantityOfPosts;
    }

    public int getForumUserID() {
        return forumUserID;
    }

    public String getForumUserName() {
        return forumUserName;
    }

    public char getForumUserSex() {
        return forumUserSex;
    }

    public LocalDate getForumUserDateOfBirth() {
        return forumUserDateOfBirth;
    }

    public int getForumUserQuantityOfPosts() {
        return forumUserQuantityOfPosts;
    }

    @Override
    public String toString() {
        return "Username: " + forumUserName + ", sex: " + forumUserSex + ", date of birth: " + forumUserDateOfBirth
                + ", this forum user got " + forumUserQuantityOfPosts + " publicated posts.";
    }
}
