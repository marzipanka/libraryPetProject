package com.marzipanka.library.books;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Data
@Entity
@Table
public class Book {
    @Id
    @SequenceGenerator(
            name = "book_sequence",
            sequenceName = "book_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "book_sequence"
    )
    private Integer id;
    private String name;
    private Integer authorId;
    private Integer year;
    private Integer typeId;
    private Integer genreId;

    public Book() {
    }

    public Book(Integer id,
                String name,
                Integer authorId,
                Integer year,
                Integer typeId,
                Integer genreId) {
        this.id = id;
        this.name = name;
        this.authorId = authorId;
        this.year = year;
        this.typeId = typeId;
        this.genreId = genreId;
    }

    public Book(String name,
                Integer authorId,
                Integer year,
                Integer typeId,
                Integer genreId) {
        this.name = name;
        this.authorId = authorId;
        this.year = year;
        this.typeId = typeId;
        this.genreId = genreId;
    }
}
