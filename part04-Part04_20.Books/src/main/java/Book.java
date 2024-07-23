/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 23548
 */
public class Book {
    private final String title;
    private final String page;
    private final String year;
    
    public Book(String title, String page, String year) {
        this.title = title;
        this.page = page;
        this.year = year;
    }
    
    public String everyThing() {
        return this.title + ", " + this.page + " pages, " + this.year;
    }
    
    public String name() {
        return this.title;
    }
}
