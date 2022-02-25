/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author julietagamez
 */
public class Caballo extends Animal {

    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public Caballo() {
    }
    @Override
    
    public void alimentarse(){
        System.out.println("El Caballo "+ super.nombre +" se alimenta de "+ super.alimento+ ", tiene "+super.edad+" y su raza es "+super.raza);
    }
}
