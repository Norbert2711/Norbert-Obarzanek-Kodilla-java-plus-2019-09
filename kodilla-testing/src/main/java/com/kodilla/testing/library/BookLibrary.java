package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> booksInHands = new ArrayList<Book>();
        if (booksInHands.size() == 0) return booksInHands;
        List<Book> booksBorrowed = libraryDatabase.listBooksInHandsOf(libraryUser);
        if (booksBorrowed.size() == 1) return booksInHands;
        if (booksBorrowed.size() == 5) return booksInHands;
        booksInHands = booksBorrowed;
        return booksInHands;
    }

}
