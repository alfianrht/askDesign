package com.github.alfian.askdesign.model;

/**
 * Created by aufa18 on 27/12/17.
 */

public class Cart {
    private Integer id;
    private Book book_id;
    private Integer cost;

    public Integer getId() {
        return id;
    }

    public Book getBook_id() {
        return book_id;
    }

    public Integer getCost() {
        return cost;
    }
}
