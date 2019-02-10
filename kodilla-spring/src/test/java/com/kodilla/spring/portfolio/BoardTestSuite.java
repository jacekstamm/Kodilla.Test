package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
    public void testIfToDoListIsCreated() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("Things to do!");
        board.getInProgressList().getTasks().add("Things in progress");
        board.getDoneList().getTasks().add("Done things");
        //Then
        Assert.assertEquals("Things to do!", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("Things in progress", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("Done things", board.getDoneList().getTasks().get(0));

        System.out.println(board.getToDoList().getTasks().get(0));
        System.out.println(board.getInProgressList().getTasks().get(0));
        System.out.println(board.getDoneList().getTasks().get(0));
    }
}
