package pt.iade.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "community")
public class Community {
    @Id
    @Column(name = "comm_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "comm_name")
    private String name;
    @Column(name = "comm_value")
    private int value;
    

    public Community(int id, String name, int value) {
        this.id = id;
        this.name = name;
        this.value = value;	
        
    }

    public Community() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public int getValue() {
        return value;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setValue(int value) {
        this.value = value;
    }
    
}

    