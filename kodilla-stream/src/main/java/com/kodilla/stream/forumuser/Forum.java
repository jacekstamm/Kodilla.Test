package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.*;

public final class Forum {
    private final ArrayList<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(1, "Bogurodzica", 'M', LocalDate.of(1987, 12, 21), 120));
        theForumUserList.add(new ForumUser(2, "JacS123", 'M', LocalDate.of(1991, 9, 29), 19));
        theForumUserList.add(new ForumUser(3, "Andzixx112", 'F', LocalDate.of(1989, 10, 17), 840));
        theForumUserList.add(new ForumUser(4, "ZbyszekZBogdańca", 'M', LocalDate.of(1988, 04, 18), 1));
        theForumUserList.add(new ForumUser(5, "Lolitka", 'F', LocalDate.of(1990, 7, 29), 123));
        theForumUserList.add(new ForumUser(6, "Zdzisława", 'F', LocalDate.of(1991, 9, 28), 759));
        theForumUserList.add(new ForumUser(7, "TwardaSkała", 'M', LocalDate.of(1994, 11, 28), 0));
        theForumUserList.add(new ForumUser(8, "Maciorek Paciorek", 'M', LocalDate.of(1999, 6, 15), 2));
        theForumUserList.add(new ForumUser(9, "PięknaKusząca", 'F', LocalDate.of(1991, 7, 30), 962));
        theForumUserList.add(new ForumUser(10, "Brzetysław", 'M', LocalDate.of(1990, 1, 02), 381));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUserList);

    }
}
