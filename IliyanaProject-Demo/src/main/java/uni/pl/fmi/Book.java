package uni.pl.fmi;
import java.util.*;

import uni.pl.fmi.Genre;
import uni.pl.fmi.Order;

/**
 * 
 */
public class Book {

    /**
     * Default constructor
     */
    private String name;

    private float price;

    private String author;

    private int count;

    private int year;
 
    public Book() {
    }
    
    public Set<Order> orders;

    public Genre genre;

    public String getName() {
        // TODO implement here
        return name;
    }

    public void setName(String name) {
        // TODO implement here
        this.name=name;
    }

    public float getPrice() {
        // TODO implement here
        return price;
    }

    public void setPrice(float price) {
        // TODO implement here
        this.price=price;
    }

    public String getAuthor() {
        // TODO implement here
        return author;
    }


    public void setAuthor(String author) {
        // TODO implement here
        this.author=author;
    }

    public int getCount() {
        // TODO implement here
        return count;
    }


    public void setCount(int count) {
        // TODO implement here
        this.count=count;
    }

    public int getYear() {
        // TODO implement here
        return year;
    }

    public void setYear(int year) {
        // TODO implement here
        this.year=year;
    }

    public Set<Order> getOrders() {
        // TODO implement here
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        // TODO implement here
        this.orders=orders;
    }
    public Genre getGenres() {
        // TODO implement here
        return genre;
    }

    public void setGenres(Genre genres) {
        // TODO implement here
        this.genre=genres;
    }
}
