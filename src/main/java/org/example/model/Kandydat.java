package org.example.model;

public class Kandydat extends OsobaFizyczna {


    private String emailPrywatny;
    private String nrTelefonu;
    private String dodatkoweInformacjeDoKontaktu;

    public Kandydat(String imie, String nazwisko, String emailPrywatny, String nrTelefonu, String dodatkoweInformacjeDoKontaktu) {
        super(imie, nazwisko);
        this.emailPrywatny = emailPrywatny;
        this.nrTelefonu = nrTelefonu;
        this.dodatkoweInformacjeDoKontaktu = dodatkoweInformacjeDoKontaktu;
    }

    public String getEmailPrywatny() {
        return emailPrywatny;
    }

    public void setEmailPrywatny(String emailPrywatny) {
        this.emailPrywatny = emailPrywatny;
    }

    public String getNrTelefonu() {
        return nrTelefonu;
    }

    public void setNrTelefonu(String nrTelefonu) {
        this.nrTelefonu = nrTelefonu;
    }

    public String getDodatkoweInformacjeDoKontaktu() {
        return dodatkoweInformacjeDoKontaktu;
    }

    public void setDodatkoweInformacjeDoKontaktu(String dodatkoweInformacjeDoKontaktu) {
        this.dodatkoweInformacjeDoKontaktu = dodatkoweInformacjeDoKontaktu;
    }
}
