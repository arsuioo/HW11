package org.example;

public class Movies {
    private String[] names = new String[0];
    private int quantity;

    public Movies() {
        quantity = 5;
    }

    public Movies(int quantity) {
        this.quantity = quantity;
    }

    public void add(String newFilm) {
        String[] addFilms = new String[names.length + 1];
        for (int i = 0; i < names.length; i++) {
            addFilms[i] = names[i];
        }
        addFilms[addFilms.length - 1] = newFilm;
        names = addFilms;
    }

    public String[] findAll() {
        return names;
    }

    public String[] findLast() {
        int length;
        if (quantity < names.length) {
            length = quantity;
        } else {
            length = names.length;
        }
        String[] result = new String[length];
        for (int i = 0; i < length; i++) {
            result[i] = names[names.length - i - 1];
        }
        return result;
    }
}