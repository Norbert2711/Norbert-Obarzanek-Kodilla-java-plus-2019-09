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
        List<Book> usersBooks = libraryDatabase.listBooksInHandsOf(libraryUser);
        if (usersBooks.size() != 0)
            booksInHands = usersBooks;
        return booksInHands;
    }

    public boolean rentABook(LibraryUser libraryUser, Book book) {
        List<Book> bookList1 = new ArrayList<>();
        if (bookList1.size() > 0) {
            boolean usersBooks = libraryDatabase.rentABook(libraryUser, book);
            return true;
        }
        List<Book> bookList2 = new ArrayList<>();
        if (bookList2.size() == 0) {
            boolean users1Books = libraryDatabase.rentABook(libraryUser, book);
        }
        return false;
    }

    public int returnBooks(LibraryUser libraryUser) {
        List<Integer> booksReturned = new ArrayList<>();
        int books = libraryDatabase.returnBooks(libraryUser);
        booksReturned.add(books);
        return booksReturned.size();
    }
}
