/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

/**
 *
 * @author ivanr
 */
public abstract class Arma {
    
    protected String nombre;
    protected int dañoBase;

    public String getNombre() {
        return nombre;
    }

    public int getDañoBase() {
        return dañoBase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDañoBase(int dañoBase) {
        this.dañoBase = dañoBase;
    }

    
}
