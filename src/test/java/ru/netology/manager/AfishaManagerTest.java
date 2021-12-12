package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {

    AfishaManager manager = new AfishaManager();

    @Test
    public void shouldAddFilm() {
        Film film1 = new Film(1, "2", "3");
        Film film2 = new Film(2, "13", "3");
        Film film3 = new Film(3, "14", "3");
        Film film4 = new Film(4, "12", "3");
        Film film5 = new Film(5, "15", "3");
        Film film6 = new Film(6, "16", "3");

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);

        Film[] actual = manager.show();
        Film[] expected = { film6, film5, film4, film3, film2, film1 };

        assertArrayEquals(actual, expected);

    }

//    @Test
//    public void show() {
//        Film film1 = new Film(1, "2", "3");
//        Film film2 = new Film(2, "3", "3");
//        Film film3 = new Film(3, "4", "3");
//
//
//
////        manager.add(film1);
////        manager.add(film2);
////        manager.add(film3);
//
//        Film[] expected = manager.getResultLength(manager.setResultLength(););
//        Film[] actual = manager.show();
//
//        assertArrayEquals(expected, actual);
//
//    }

    @Test
    public void shouldSetResultLength() {
        AfishaManager manager = new AfishaManager();
        manager.setResultLength(10);
        assertEquals(10, manager.getResultLength());

    }
}