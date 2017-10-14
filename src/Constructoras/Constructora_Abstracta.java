/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructoras;

import Personajes.Arma;
import Personajes.Armadura;
import Personajes.Personaje;

/**
 *
 * @author ivanr
 */
public abstract class Constructora_Abstracta {
    
    protected Personaje personaje;
    protected Arma arma_personaje;
    protected Armadura armadura_personaje;
    
    //dejara a la hija construir al personaje segun su tipo;
    public abstract void buildPersonaje(String tipo);
    public abstract void builderArma(String tipo);
    public abstract void builderArmadura(String tipo);
    

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public Arma getArma_personaje() {
        return arma_personaje;
    }
}
