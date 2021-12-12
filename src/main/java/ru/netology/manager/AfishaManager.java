package ru.netology.manager;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.Film;

@NoArgsConstructor
@Data

public class AfishaManager {

//    public AfishaManager(int resultLength) {
//        this.resultLength = resultLength;
//    }

    private Film[] films = new Film[10];

    private int resultLength;

    public void add(Film film) {
        int length = films.length + 1;

        Film[] tmp = new Film[length];

        System.arraycopy(films, 0, tmp, 0, films.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public Film[] show() {

        if (resultLength != 10) {
            resultLength = films.length;
        }

        Film[] result = new Film[resultLength];

        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];

        }

        return result;
    }

}