package com.kodilla.patterns.prototype.library;
import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;
public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //Given
        Library library = new Library("BIG Library");

        Book book1 = new Book("Dzieci z Bullerbyn", "Astrid Lindgren",
                LocalDate.of(1947, 2, 4));
        Book book2 = new Book("Pinokio", "Carlo Collodi",
                LocalDate.of(1883, 12, 8));
        Book book3 = new Book("Slepnac od swiatel", "Jakub Zulczyk",
                LocalDate.of(2014, 10, 5));
        Book book4 = new Book("ZLE PSY. W IMIE ZASAD", "Patryk Vega",
                LocalDate.of(2015, 1, 30));

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        //shallow copy
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Shallow copy BIG Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //deep copy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deep copy BIG Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        System.out.println("Remove first book from library: 'Library'");
        library.getBooks().remove(book1);
        int size1 = library.getBooks().size();
        int size2 = clonedLibrary.getBooks().size();
        int size3 = deepClonedLibrary.getBooks().size();

        //Then
        System.out.println("1st Library size: " + size1);
        System.out.println("2nd Cloned Library size: " + size2);
        System.out.println("3nd Deep cloned Library size: " + size3);
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());

    }
}
