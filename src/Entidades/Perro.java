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
public class Perro extends Animal {

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public Perro() {
    }
    @Override
    public void alimentarse(){
        System.out.println("El perro "+ super.nombre +", se alimenta de "+ super.alimento+ ", tiene "+super.edad+" años y su raza es "+super.raza);
    }
}
