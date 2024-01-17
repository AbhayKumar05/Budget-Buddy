package pt.iade.models;

import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "challenge")
public class Challenge {
    @Id
    @Column(name = "chall_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "chall_name")
    private String name;
    @Column(name = "chall_time")
    private Time time;
    
    public Challenge(int id, String name, Time time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }

    public Challenge() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Time getTime() {
        return time;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}

    