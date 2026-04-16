package org.example.module.expressJava.staticFinalAccessModifiers;

public class LibraryTest {
    Library library = new Library();

   // library.bookTitle;
    String title = library.getBookTitle();
    String string = library.author;
    int year = library.year;
    String category = library.category;
}
