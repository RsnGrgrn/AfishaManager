package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {

    AfishaManager film = new AfishaManager();

    @Test
    public void shouldAddFilm() {
        Film film1 = new Film(1, "2", "3");
        Film film2 = new Film(1, "3", "3");
        Film film3 = new Film(1, "4", "3");
        Film film4 = new Film(1, "2", "3");
        Film film5 = new Film(1, "2", "3");
        Film film6 = new Film(1, "2", "3");

        film.add(film1);
        film.add(film2);

        Film[] actual = film.show();

    }

    @Test
    void show() {
        Film film1 = new Film(1, "2", "3");
        Film film2 = new Film(1, "3", "3");
        Film film3 = new Film(1, "4", "3");

        film.add(film1);
        film.add(film2);
        film.add(film3);

        Film[] expected = { film1, film2, film3};
        Film[] actual = film.getResultLength();

        assertArrayEquals(expected, actual);

    }
}