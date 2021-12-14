package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {

    AfishaManager manager = new AfishaManager();

    Film film1 = new Film(1, "2", "3");
    Film film2 = new Film(2, "13", "3");
    Film film3 = new Film(3, "14", "3");
    Film film4 = new Film(4, "12", "3");
    Film film5 = new Film(5, "15", "3");
    Film film6 = new Film(6, "16", "3");
    Film film7 = new Film(7, "17", "3");
    Film film8 = new Film(8, "18", "3");
    Film film9 = new Film(9, "19", "3");
    Film film10 = new Film(10, "20", "3");
    Film film11 = new Film(11, "21", "3");

    @Test
    public void shouldAddFilm() {
        Film[] films = {film1, film2, film3, film4, film5, film6};

        for (Film film : films) {
            manager.add(film);
        }

        Film[] expected = {film1, film2, film3, film4, film5, film6};
        Film[] actual = manager.getFilms();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldGetFilm() {
        Film[] films = {film1, film2, film3, film4, film5, film6};

        for (Film film : films) {
            manager.add(film);
        }

        Film[] expected = {film6, film5, film4, film3, film2, film1};
        Film[] actual = manager.show();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldGet10() {
        Film[] films = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};

        for (Film film : films) {
            manager.add(film);
        }

        Film[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        Film[] actual = manager.show();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldGetMoreThen10() {
        Film[] films = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11};

        for (Film film : films) {
            manager.add(film);
        }

        Film[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};
        Film[] actual = manager.show();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldGetDefault() {
        AfishaManager afishaManager = new AfishaManager();

        int expected = 10;
        int actual = afishaManager.getResultLength();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldChangeDefault() {
        AfishaManager afishaManager = new AfishaManager(15);

        int expected = 15;
        int actual = afishaManager.getResultLength();

        assertEquals(expected, actual);

    }

}