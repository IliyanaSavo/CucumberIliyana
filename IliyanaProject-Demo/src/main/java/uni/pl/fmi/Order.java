package uni.pl.fmi;
import java.util.*;

public class Order {


    private int number;

    public User user;

    public Set<Book> book;


    public Order() {
    	
    }
    
    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Book> getBook() {
		return book;
	}

	public void setBook(Set<Book> book) {
		this.book = book;
	}

	public Order(String bookName, String author) {
		// TODO Auto-generated constructor stub
	}

	public int getNumber() {
        // TODO implement here
        return number;
    }


    public void setNumber(int number) {
        // TODO implement here
        this.number=number;
    }

  
    public User getUsers() {
        // TODO implement here
        return user;
    }

    public void setUsers(User users) {
        // TODO implement here
        this.user=users;
    }

    public Set<Book> getBooks() {
        // TODO implement here
        return book;
    }

   
    public void setBooks(Set<Book> books) {
        // TODO implement here
        this.book=books;
    }

	public void clickOrder(Order order) {
		// TODO Auto-generated method stub
		this.clickOrder(order);
	}

}
