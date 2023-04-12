package com.Association.Mapping.OneToManyUni;

import jakarta.persistence.*;

@Entity
public class BookUni {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToOne
    @JoinColumn(name="a_id")
    private AuthorUni author;

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

    public AuthorUni getAuthor() {
        return author;
    }

    public void setAuthor(AuthorUni author) {
        this.author = author;
    }
}
