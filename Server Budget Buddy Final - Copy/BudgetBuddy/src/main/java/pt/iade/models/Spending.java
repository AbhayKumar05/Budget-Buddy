package pt.iade.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "spending")
public class Spending {
    @Id
    @Column(name = "spend_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "spend_value")
    private int spendValue;
    @Column(name = "spend_date")
    private LocalDate date;
    @Column(name = "spend_name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "spend_user_id")
    private User user;

    public Spending(int id, int spendValue, LocalDate date, String name, User user) {
        this.id = id;
        this.spendValue = spendValue;
        this.date = date;
        this.name = name;
        this.user = user;
    }

    public Spending() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSpendValue() {
        return spendValue;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setSpendValue(int spendValue) {
        this.spendValue = spendValue;
    }

    public User getUser() {
        return user;
    }

    public String getUserName() {
        return user.getName();
    }

    public void setUserName(String userName) {
        this.user.setName(userName);
    }

    public void setUser(User user) {
        this.user = user;
    }

}
