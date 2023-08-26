package org.example.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class CzlonekStowarzyszenia extends OsobaFizyczna {
    public static final BigDecimal WYMAGANA_SKLADKA_WSPIERAJACY = BigDecimal.valueOf(2);
    public static final BigDecimal WYMAGANA_SKLADKA_ZWYCZAJNY = BigDecimal.valueOf(20);
    public static final BigDecimal WYMAGANA_SKLADKA_HONOROWY = BigDecimal.ZERO;
    String emailSluzbowy;
    String nrTelefonu;
    LocalDate dataUrodzenia;
    String pesel;
    String emailPrywatny;


}
