package com.kodilla.testing.library;

import org.junit.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    @Test
    public void testListBooksWithConditionsReturnList() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listsBooksWithCondition("Secret");

        //Then
        Assert.assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        //When
        List<Book> theListOfBooks0 = bookLibrary.listsBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listsBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listsBooksWithCondition("FortyBooks");

        //Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);

        //When
        List<Book> theListOf10Books = bookLibrary.listsBooksWithCondition("An");

        //Then
        assertEquals(0, theListOf10Books.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for(int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title" + n, "Author" + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    //Exercise 6.6

    @Test
    public void testShouldCheck0BookBorrowedStatus() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user = new LibraryUser("Adam", "Kowalski", "987909765");
        List<Book> borrowedBooksList = new ArrayList<>();
        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(borrowedBooksList);

        //When
        List<Book> theBorrowedList = bookLibrary.listBooksInHandsOf(user);

        //Then
        assertEquals(0, theBorrowedList.size());
    }

    @Test
    public void testShouldCheck1BookBorrowedStatus() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user = new LibraryUser("Adam", "Kowalski", "987909765");
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        List<Book> borrowedBookListUser = new ArrayList<>();
        borrowedBookListUser.add(book1);
        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(borrowedBookListUser);

        //When
        List<Book> theBorrowedList = bookLibrary.listBooksInHandsOf(user);

        //Then
        assertEquals(1, theBorrowedList.size());
    }

    @Test
    public void testShouldCheck5BooksBorrowedStatus() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user = new LibraryUser("Adam", "Kowalski", "987909765");
        List<Book> listOf5Books = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(listOf5Books);

        //When
        List<Book> theBorrowedList = bookLibrary.listBooksInHandsOf(user);

        //Then
        assertEquals(5, theBorrowedList.size());
    }
}