public class Address {

    String kraj, miasto, kodPocztowy, nazwaUlicy;
    int numerMieszkania;

    public String createAddress(String kraj){
        this.kraj = kraj;
        return String.format("Kraj: %s", kraj );
    }
    public String createAddress(String kraj, String miasto){
        this.kraj = kraj;
        this.miasto = miasto;
        return String.format("Kraj: %s, Miasto: %s", kraj, miasto);
    }
    public String createAddress(String kraj, String miasto, String kodPocztowy){
        this.kraj = kraj;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
        return String.format("Kraj: %s, Miasto: %s, Kod pocztowy: %s", kraj, miasto, kodPocztowy);
    }
    public String createAddress(String kraj, String miasto, String kodPocztowy, String nazwaUlicy){
        this.kraj = kraj;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
        this.nazwaUlicy = nazwaUlicy;
        return String.format("Kraj: %s, Miasto: %s, Kod pocztowy: %s, Nazwa Ulicy: %s", kraj, miasto, kodPocztowy, nazwaUlicy);
    }
    public String createAddress(String kraj, String miasto, String kodPocztowy, String nazwaUlicy, int numerMieszkania){
        this.kraj = kraj;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
        this.nazwaUlicy = nazwaUlicy;
        this.numerMieszkania = numerMieszkania;
        return String.format("Kraj: %s, Miasto: %s, Kod pocztowy: %s, Nazwa Ulicy: %s, Numer mieszkania: %d", kraj, miasto, kodPocztowy, nazwaUlicy, numerMieszkania);
    }
}
