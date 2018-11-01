package com.kodilla.stream.beautifier;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import org.junit.*;
import static org.mockito.Mockito.*;

public class BeautifierTestSuite {
    @Test
    public void testShouldPrintTheSameText() {
        //Given
        PoemDecorator poemDecoratorMock = mock(PoemDecorator.class);
        poemDecoratorMock.decorate("Giełda Słów");
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        //When
        poemBeautifier.beautify("Giełda Słów", text -> text + text);

        //Then

    }
}
