package com.kodilla.stream.forumuser;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import org.junit.*;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ForumUserTestSuite {

    @Test
    public void testShouldPrintTheSameResult() {
        //Given
        Forum forum = new Forum();
        ArrayList<ForumUser> forumUserTest = new ArrayList<>();
        forumUserTest.add(new ForumUser(1, "Bogurodzica", 'M', LocalDate.of(1987, 12, 21), 120));
        forumUserTest.add(new ForumUser(2, "JacS123", 'M', LocalDate.of(1991, 9, 29), 19));
        forumUserTest.add(new ForumUser(3, "Andzixx112", 'F', LocalDate.of(1989, 10, 17), 840));
        forumUserTest.add(new ForumUser(4, "ZbyszekZBogdańca", 'M', LocalDate.of(1988, 04, 18), 1));
        forumUserTest.add(new ForumUser(5, "Lolitka", 'F', LocalDate.of(1990, 7, 29), 123));
        forumUserTest.add(new ForumUser(6, "Zdzisława", 'F', LocalDate.of(1991, 9, 28), 759));
        forumUserTest.add(new ForumUser(7, "TwardaSkała", 'M', LocalDate.of(1994, 11, 28), 0));
        forumUserTest.add(new ForumUser(8, "Maciorek Paciorek", 'M', LocalDate.of(1999, 6, 15), 2));
        forumUserTest.add(new ForumUser(9, "PięknaKusząca", 'F', LocalDate.of(1991, 7, 30), 962));
        forumUserTest.add(new ForumUser(10, "Brzetysław", 'M', LocalDate.of(1990, 1, 02), 381));


        //When
        Map<Integer, ForumUser> resultTest = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getForumUserSex() == 'M')
                .filter(forumUser -> forumUser.getForumUserDateOfBirth().isBefore(LocalDate.of(1998,11,5)))
                .filter(forumUser -> forumUser.getForumUserQuantityOfPosts() > 1)
                .collect(Collectors.toMap(ForumUser::getForumUserID, forumUser -> forumUser));

        //Then
        Assert.assertEquals("{1=Username: <<Bogurodzica>>, sex: <<M>>, date of birth: <<1987-12-21>>, this forum user got 120 publicated posts., 2=Username: <<JacS123>>, sex: <<M>>, date of birth: <<1991-09-29>>, this forum user got 19 publicated posts., 10=Username: <<Brzetysław>>, sex: <<M>>, date of birth: <<1990-01-02>>, this forum user got 381 publicated posts.}", resultTest.toString());
        //Trzy aserty które sprawdzają wszystkie przypadki.
    }

    @Test
    public void testShouldGetTheSameMapSize() {
        //Given
        Forum forum = new Forum();
        ArrayList<ForumUser> forumUserTest = new ArrayList<>();
        forumUserTest.add(new ForumUser(1, "Bogurodzica", 'M', LocalDate.of(1987, 12, 21), 120));
        forumUserTest.add(new ForumUser(2, "JacS123", 'M', LocalDate.of(1991, 9, 29), 19));
        forumUserTest.add(new ForumUser(3, "Andzixx112", 'F', LocalDate.of(1989, 10, 17), 840));
        forumUserTest.add(new ForumUser(4, "ZbyszekZBogdańca", 'M', LocalDate.of(1988, 04, 18), 1));
        forumUserTest.add(new ForumUser(5, "Lolitka", 'F', LocalDate.of(1990, 7, 29), 123));
        forumUserTest.add(new ForumUser(6, "Zdzisława", 'F', LocalDate.of(1991, 9, 28), 759));
        forumUserTest.add(new ForumUser(7, "TwardaSkała", 'M', LocalDate.of(1994, 11, 28), 0));
        forumUserTest.add(new ForumUser(8, "Maciorek Paciorek", 'M', LocalDate.of(1999, 6, 15), 2));
        forumUserTest.add(new ForumUser(9, "PięknaKusząca", 'F', LocalDate.of(1991, 7, 30), 962));
        forumUserTest.add(new ForumUser(10, "Brzetysław", 'M', LocalDate.of(1990, 1, 02), 381));

        //When
        Map<Integer, ForumUser> resultTest = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getForumUserSex() == 'M')
                .filter(forumUser -> forumUser.getForumUserDateOfBirth().isBefore(LocalDate.of(1998,11,5)))
                .filter(forumUser -> forumUser.getForumUserQuantityOfPosts() > 1)
                .collect(Collectors.toMap(ForumUser::getForumUserID, forumUser -> forumUser));

        //Then
        Assert.assertEquals(3, resultTest.size());
    }
}
