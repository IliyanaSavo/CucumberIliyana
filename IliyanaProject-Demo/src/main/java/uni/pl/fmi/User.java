package uni.pl.fmi;
import java.util.*;


public class User {


    private String userName;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    public Set<Order> orders;
    
    public User() {
    }

    
    public String getUsername() {
        
        return userName;
    }

    public void setUsername(String username) {
        this.userName=username;
    }

    public String getPassword() {
        // TODO implement here
        return password;
    }

    public void setPassword(String password) {
        // TODO implement here
        this.password=password;
    }

    public String getEmail() {
        // TODO implement here
        return email;
    }


    public void setEmail(String email) {
        // TODO implement here
        this.email=email;
    }

    public String getFirstName() {
        // TODO implement here
        return firstName;
    }

    public void setFirstName(String firstName) {
        // TODO implement here
        this.firstName=firstName;
    }


    public String getLastName() {
        // TODO implement here
        return lastName;
    }

    public void setLastName(String lastName) {
        // TODO implement here
        this.lastName=lastName;
    }

    public Set<Order> getOrders() {
        // TODO implement here
        return orders;
    }


    public void setOrders(Set<Order> orders) {
        // TODO implement here
        this.orders=orders;
    }


    public void addOrder(Order order) {
        if(null == orders) {
        	this.orders=new HashSet<Order>();
        }
        
        this.orders.add(order);
    
    }

}