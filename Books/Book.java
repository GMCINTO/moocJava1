/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glene
 */
public class Book {
    private String title;
    private int pages;
    private int year;
    
    public Book(String bookTitle, int bookPages, int publishYear){
        
        this.title = bookTitle;
        this.pages = bookPages;
        this.year = publishYear;
        
        
    }
    public String getTitle(){
        return title;
    }
    @Override
    public String toString(){
        
        return title + ", " + pages + " pages, " +  year;
        
    }
    
    
    
    
}
