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
public abstract class Personaje implements Cloneable{
    
    protected Arma arma;
    protected Armadura armadura;

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }
    
    public void ToString(){
        System.out.println(this.arma.nombre + "daño base de :" + this.arma.dañoBase);
        System.out.println(this.armadura.nombre + "defensa base de :" + this.armadura.defensaBase);
    }
    
    
    @Override
    public Personaje clone() {
        Personaje clonePersonaje = null;
        try {
            clonePersonaje = (Personaje) super.clone();
            clonePersonaje.setArma(arma);
            clonePersonaje.setArmadura(armadura);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clonePersonaje;
    } // method clone
}
