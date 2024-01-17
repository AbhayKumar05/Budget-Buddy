package pt.iade.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cat")
public class Category {

    @Id
    @Column(name = "cat_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "cat_name")
    private String name;
    @Column(name = "cat_tip_id") // TODO substituir por cat_parentid por cattip_id (id´s 1 sao categorias e 2 sao
                                 // tipos das bills)

    private int tipId;

    public Category(int id, String name, int tipId) {
        this.id = id;
        this.name = name;
        this.tipId = tipId;
    }

    public Category() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTipId() {
        return tipId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTipId(int tipId) {
        this.tipId = tipId;
    }

}