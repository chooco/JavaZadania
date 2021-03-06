package kalkulatoronp.narzedzia;

/**
 * Wyjątek dzielenia przez 0
 * @author kayne
 */
public class ONP_DzieleniePrzez0 extends WyjatekONP {

	
    /**
     * Konstruktor wyjątku
     * @param s treść wyjątku
     */
    public ONP_DzieleniePrzez0 (String s) {
        super(s);
    }
	
    /**
     * Zwraca wyjątek w postaci stringa
     * @return wyjątek
     */
    public String toString() {
        return "ONP_DzieleniePrzez0 " + super.kumunikat;
    }
}
