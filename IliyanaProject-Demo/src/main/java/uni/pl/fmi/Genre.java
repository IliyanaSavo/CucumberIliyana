package uni.pl.fmi;
import java.util.Set;

import uni.pl.fmi.Book;
import uni.pl.fmi.Genre;

public class Genre {

    /**
     * Default constructor
     */
    public Genre() {
    }

    private String type;


    public Set<Book> books;


    public Set<Genre> children;

    private Genre parent;

    public String getType() {
        // TODO implement here
        return type;
    }

 
    public void setType(String type) {
        // TODO implement here
        this.type=type;
    }


    public Set<Book> getBooks() {
        // TODO implement here
        return books;
    }

    public void setBooks(Set<Book> books) {
        // TODO implement here
        this.books=books;
    }


	public Set<Genre> getChildren() {
		return children;
	}


	public void setChildren(Set<Genre> children) {
		this.children = children;
	}


	public Genre getParent() {
		return parent;
	}


	public void setParent(Genre parent) {
		this.parent = parent;
	}

}