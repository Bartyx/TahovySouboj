/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package tahovyboj;

import java.util.Random;

/** Třída která reprezentuje hrací kostku */
public class Kostka {
    /** Generátor náhodných čísel */
    private Random random;
    /** Počet stěn kostky */
    private int pocetSten;
    /** Konstruktor pro kostku
     * @param PocetSten */
    public Kostka(int PocetSten){
        this.pocetSten = PocetSten;
        random = new Random();
        
    } 
    /** Konstruktor pro kostku bez parametru počtu stěn.
     * Výchozí parametr je 6 stěn.
     */
    public Kostka() {
    pocetSten = 6;
    random = new Random();
    }
    
    /**
    * Vrátí počet stěn hrací kostky
    * @return      počet stěn hrací kostky
    */
    public int vratPocetSten() {
    return pocetSten;
    }
    
    public int hod(){
        return random.nextInt(pocetSten) + 1;
        
    }
    /**
     * Vrací textovou reprezentaci kostky
     * @return Textová reprezentace kostky
     */
    @Override
    public String toString() {
    return String.format("Kostka s %s stěnami", pocetSten);
    }
    
}
