package com.dxctraining.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")//table name
public class Item {

    @Id
    @GeneratedValue
    private int id;

    private String name;
;

    public Item() {

    }

    public Item(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item that = (Item) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
