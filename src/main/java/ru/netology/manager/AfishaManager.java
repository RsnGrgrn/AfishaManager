package ru.netology.manager;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.Film;

@NoArgsConstructor
@Data

public class AfishaManager {

    public AfishaManager(int resultLength) {
        this.resultLength = resultLength;
    }

    private Film[] films = new Film[0];

    private int resultLength = 10;

    public void add(Film film) {
        int length = films.length + 1;

        Film[] tmp = new Film[length];

        System.arraycopy(films, 0, tmp, 0, films.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public Film[] show() {

        if (films.length != 10 && films.length <= 10) {
            resultLength = films.length;
        } else {
            resultLength = 10;
        }

        Film[] result = new Film[resultLength];

        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];

        }

        return result;
    }

}