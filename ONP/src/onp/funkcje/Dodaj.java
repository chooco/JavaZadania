/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package onp.funkcje;

import onp.Obliczalny;
import onp.wyjątki.WyjątekONP;

/**
 *
 * @author kayne
 */
public class Dodaj extends Funkcja implements Obliczalny {
    
    double wartość = 0;

    public Dodaj (double w, double w2) {
        wartość = w + w2;
    }
    @Override
    public double obliczWartość() throws WyjątekONP {
        return wartość;
    }
    
}
