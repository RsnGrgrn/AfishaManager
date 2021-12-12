package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Film {

    private int id;
    private String name;
    private String genre;

//    public Film(int id, String name, String genre, int year) {
//        this.id = id;
//        this.name = name;
//        this.genre = genre;
//        this.year = year;
//
//    }
}
