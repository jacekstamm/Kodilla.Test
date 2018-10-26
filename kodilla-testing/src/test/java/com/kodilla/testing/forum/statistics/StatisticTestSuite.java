package com.kodilla.testing.forum.statistics;


import com.kodilla.testing.forum.statistic.Statistic;
import com.kodilla.testing.forum.statistic.StatisticCounter;
import java.util.*;
import org.junit.*;
import java.lang.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticTestSuite {
    @Test
    public void testShouldCalculateStatisticWith0Posts() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        when(statisticMock.postsCount()).thenReturn(1);
        when(statisticMock.commentsCount()).thenReturn(123);
        when(statisticMock.userNames()).thenReturn(prepareUserNames());
        StatisticCounter statisticCounter = new StatisticCounter();


        //When
        statisticCounter.calculateAdvStatistics(statisticMock);

        //Then
        Assert.assertEquals(0.0, statisticCounter.getAveragePostPerUser(), 0.0);
        Assert.assertEquals(10.25, statisticCounter.getAverageCommentPerUser(), 0.25);
        Assert.assertEquals(123.0, statisticCounter.getAverageCommentPerPost(), 0.0);
    }

    @Test
    public void testShouldCalculateStatisticWith1000Posts() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        when(statisticMock.postsCount()).thenReturn(1000);
        when(statisticMock.userNames()).thenReturn(prepareUserNames());
        when(statisticMock.commentsCount()).thenReturn(123);
        StatisticCounter statisticCounter = new StatisticCounter();

        //When
        statisticCounter.calculateAdvStatistics(statisticMock);

        //Then
        Assert.assertEquals(83.33, statisticCounter.getAveragePostPerUser(),0.33);
        Assert.assertEquals(10.25, statisticCounter.getAverageCommentPerUser(), 0.25);
        Assert.assertEquals(0.123, statisticCounter.getAverageCommentPerPost(), 0.123);
    }

    @Test
    public void testShouldCalculateStatisticWith0Comment() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        when(statisticMock.commentsCount()).thenReturn(0);
        when(statisticMock.postsCount()).thenReturn(125);
        when(statisticMock.userNames()).thenReturn(prepareUserNames());
        StatisticCounter statisticCounter = new StatisticCounter();

        //When
        statisticCounter.calculateAdvStatistics(statisticMock);

        //Then
        Assert.assertEquals(10.0, statisticCounter.getAveragePostPerUser(), 0.0);
        Assert.assertEquals(0.0, statisticCounter.getAverageCommentPerUser(), 0.0);
        Assert.assertEquals(0, statisticCounter.getAverageCommentPerPost(), 0.0);
    }

    @Test
    public void testShouldCalculateStatisticWhenIsMorePostsThanComments() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        when(statisticMock.userNames()).thenReturn(prepareUserNames());
        when(statisticMock.postsCount()).thenReturn(125);
        when(statisticMock.commentsCount()).thenReturn(100);
        StatisticCounter statisticCounter = new StatisticCounter();

        //When
        statisticCounter.calculateAdvStatistics(statisticMock);

        //Then
        Assert.assertEquals(10.0, statisticCounter.getAveragePostPerUser(),0.0);
        Assert.assertEquals(8.33, statisticCounter.getAverageCommentPerUser(), 1.0);
        Assert.assertEquals(0.8, statisticCounter.getAverageCommentPerPost(), 1.0);
    }

    @Test
    public void testShouldCalculateStatisticWhenIsMoreCommentsThanPosts() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        when(statisticMock.userNames()).thenReturn(prepareUserNames());
        when(statisticMock.postsCount()).thenReturn(125);
        when(statisticMock.commentsCount()).thenReturn(187);
        StatisticCounter statisticCounter = new StatisticCounter();

        //When
        statisticCounter.calculateAdvStatistics(statisticMock);

        //Then
        Assert.assertEquals(10.41, statisticCounter.getAveragePostPerUser(), 1.0);
        Assert.assertEquals(15.58, statisticCounter.getAverageCommentPerUser(), 1.0);
        Assert.assertEquals(1.49, statisticCounter.getAverageCommentPerPost(), 1.0);
    }

    @Test
    public  void testShouldCalculateStatisticWith0User() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        when(statisticMock.userNames()).thenReturn(prepare0UserName());
        when(statisticMock.postsCount()).thenReturn(125);
        when(statisticMock.commentsCount()).thenReturn(130);
        StatisticCounter statisticCounter = new StatisticCounter();

        //When
        statisticCounter.calculateAdvStatistics(statisticMock);

        //Then
        Assert.assertEquals(125, statisticCounter.getAveragePostPerUser(), 0.0);
        Assert.assertEquals(130, statisticCounter.getAverageCommentPerUser(), 0.0);
        Assert.assertEquals(1.04, statisticCounter.getAverageCommentPerPost(), 1.0);
    }

    @Test
    public void testShouldCalculateStatisticWith100Users() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        when(statisticMock.userNames()).thenReturn(prepare100UserNames());
        when(statisticMock.postsCount()).thenReturn(125);
        when(statisticMock.commentsCount()).thenReturn(130);
        StatisticCounter statisticCounter = new StatisticCounter();

        //When
        statisticCounter.calculateAdvStatistics(statisticMock);

        //Then
        Assert.assertEquals(1.25, statisticCounter.getAveragePostPerUser(), 0.25);
        Assert.assertEquals(1.3, statisticCounter.getAverageCommentPerUser(), 1.0);
        Assert.assertEquals(1.04, statisticCounter.getAverageCommentPerPost(), 1.0);
    }

    private ArrayList<String> prepareUserNames() {
        ArrayList<String> userNamesTest = new ArrayList<>();
        userNamesTest.add("Kowalski");
        userNamesTest.add("Kowalski");
        userNamesTest.add("Kowalski");
        userNamesTest.add("Kowalski");
        userNamesTest.add("Kowalski");
        userNamesTest.add("Kowalski");
        userNamesTest.add("Kowalski");
        userNamesTest.add("Kowalski");
        userNamesTest.add("Kowalski");
        userNamesTest.add("Kowalski");
        userNamesTest.add("Kowalski");
        userNamesTest.add("Kowalski");
        return userNamesTest;
    }

    private ArrayList<String> prepare0UserName() {
        ArrayList<String> userNameTest0User = new ArrayList<>();
        userNameTest0User.add("Nowak");
        return userNameTest0User;
    }

    private ArrayList<String> prepare100UserNames() {
        ArrayList<String> userNameTest100Users = new ArrayList<>();
        String name = "JAVA";
        for (int n = 0; n < 100; n++) {
            userNameTest100Users.add(name);
        }
        return userNameTest100Users;
    }
}