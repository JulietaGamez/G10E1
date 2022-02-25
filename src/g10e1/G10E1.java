/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g10e1;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author julietagamez
 */
public class G10E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perrito= new Perro("Rufo", "alimento balanceado", 4, "ovejero");
        perrito.alimentarse();
        Animal gatito= new Gato("Duraznito",  "atun",5, "siames");
        gatito.alimentarse();
        Animal caballo= new Caballo("Percheron", "pasto", 5, "zaino");
        gatito.alimentarse();
    }
    
}
