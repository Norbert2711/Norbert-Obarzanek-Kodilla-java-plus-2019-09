package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

        @Test
        public void publicationYearMedianTest() {

            //Given
            MedianAdapter medianAdapter = new MedianAdapter();
            Set<Book> book1 = new HashSet<>();
            book1.add(new Book("Sofokles",
                    "Antygona",
                    1998,
                    "XYZ2468"));

            book1.add(new Book("Władysław Stanisław Reymont",
                    "Chłopi",
                    1980,
                    "XYZ8642"));

            book1.add(new Book("Adam Mickiewicz",
                    "Dobranoc",
                    1985,
                    "XYZ1234"));

            book1.add(new Book("Adam Mickiewicz",
                    "Dziady",
                    1979,
                    "XYZ5678"));

            //When
            int median = medianAdapter.publicationYearMedian(book1);

            //Then
            Assert.assertEquals(1985, median);
        }

    }
