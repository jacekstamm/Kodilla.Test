package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();

        Map<Integer, ForumUser> theForumUserMapStream = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getForumUserSex() == 'M')
                .filter(forumUser -> forumUser.getForumUserDateOfBirth().isBefore(LocalDate.of(1998,11,5)))
                .filter(forumUser -> forumUser.getForumUserQuantityOfPosts() > 1)
                .collect(Collectors.toMap(ForumUser::getForumUserID, forumUser -> forumUser));

        System.out.println("Liczba użytkowników spełniających wymagania: " + theForumUserMapStream.size());
        theForumUserMapStream.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);





    }
}