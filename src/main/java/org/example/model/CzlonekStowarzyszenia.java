package org.example.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class CzlonekStowarzyszenia extends OsobaFizyczna {
    public static final BigDecimal WYMAGANA_SKLADKA_WSPIERAJACY = BigDecimal.valueOf(2);
    public static final BigDecimal WYMAGANA_SKLADKA_ZWYCZAJNY = BigDecimal.valueOf(20);
    public static final BigDecimal WYMAGANA_SKLADKA_HONOROWY = BigDecimal.ZERO;
    private String emailSluzbowy;
    private String nrTelefonu;
    private LocalDate dataUrodzenia;
    private String pesel;
    private String emailPrywatny;

    public String getEmailSluzbowy() {
        return emailSluzbowy;
    }

    public void setEmailSluzbowy(String emailSluzbowy) {
        this.emailSluzbowy = emailSluzbowy;
    }

    public String getNrTelefonu() {
        return nrTelefonu;
    }

    public void setNrTelefonu(String nrTelefonu) {
        this.nrTelefonu = nrTelefonu;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getEmailPrywatny() {
        return emailPrywatny;
    }

    public void setEmailPrywatny(String emailPrywatny) {
        this.emailPrywatny = emailPrywatny;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CzlonekStowarzyszenia that = (CzlonekStowarzyszenia) o;

        if (!emailSluzbowy.equals(that.emailSluzbowy)) return false;
        if (!dataUrodzenia.equals(that.dataUrodzenia)) return false;
        return emailPrywatny.equals(that.emailPrywatny);
    }

    @Override
    public int hashCode() {
        int result = emailSluzbowy.hashCode();
        result = 31 * result + dataUrodzenia.hashCode();
        result = 31 * result + emailPrywatny.hashCode();
        return result;
    }
}
