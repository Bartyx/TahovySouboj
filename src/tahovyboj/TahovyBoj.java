/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tahovyboj;

/**
 *
 * @author Computel
 */
public class TahovyBoj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //vytvoření dvou kostek s různými počty stěn
        Kostka sestistenka = new Kostka();
        Kostka desetistenka = new Kostka(10);
        
        System.out.println(sestistenka);
            for(int i = 0; i < 10; i++){
                System.out.print(sestistenka.hod() + " ");
            }
        
        System.out.println("\n\n" + desetistenka);
            for(int i = 0; i < 10; i++){
                System.out.print(desetistenka.hod() + " ");
            }    
    }
    
}
