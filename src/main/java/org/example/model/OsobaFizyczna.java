package org.example.model;

public abstract class OsobaFizyczna {

    private static long ID_COUNTER = 0;
    private long id;
    private String imie;
    private String nazwisko;

    public long getId() {
        return id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
