package com.kodilla.stream.beautifier;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import org.junit.*;
import static org.mockito.Mockito.*;

public class BeautifierTestSuite {
    @Test
    public void testShouldPrintTheSameText() {
        //Given
        PoemBeautifier poemBeautifier = new PoemBeautifier();


        //When
        String poem1 = poemBeautifier.beautify("Litwo Ojczyzno Moja!", text -> text + " " + text.toUpperCase());
        String poem2 = poemBeautifier.beautify("Giełda Słów", text -> "ABC " + text + " ABC");
        String poem3 = poemBeautifier.beautify("Zasady wywierania wpływu na ludzi", text -> text.toLowerCase());
        String poem4 = poemBeautifier.beautify("Przeszkoda czy wyzwanie?", text -> "Tytuł: " + text + " Rok wydania: 2016");
        String poem5 = poemBeautifier.beautify("Jazda! ", text -> text + text + text + text.toUpperCase());

        //Then
        Assert.assertEquals("Litwo Ojczyzno Moja! LITWO OJCZYZNO MOJA!", poem1);
        Assert.assertEquals("ABC Giełda Słów ABC", poem2);
        Assert.assertEquals("zasady wywierania wpływu na ludzi", poem3);
        Assert.assertEquals("Tytuł: Przeszkoda czy wyzwanie? Rok wydania: 2016", poem4);
        Assert.assertEquals("Jazda! Jazda! Jazda! JAZDA! ", poem5);
    }
}
