package com.example.project2;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
public class Book {

    private @Id @GeneratedValue Long bookId;
    private @NonNull String bookName;
    private @NonNull String description;
    private java.time.LocalDate date;

    public Book() {
    }

    public Book(@NonNull String bookName, @NonNull String description, LocalDate date) {
        this.bookName = bookName;
        this.description = description;
        this.date = date;
    }
}