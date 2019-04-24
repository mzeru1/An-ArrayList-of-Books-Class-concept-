//  The second class is the book class which allows the user to create a book
// object with its author and title.

package com.company;

public class Book {
    private String author;
    private String title;

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String value){
        author = value;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String value){
        title = value;
    }
}
