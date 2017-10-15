/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructoras;

import fabricas.Controlador;

/**
 *
 * @author ivanr
 */
public class Constructora_Concreta extends Constructora_Abstracta {
    
    public Constructora_Concreta(String tipo){
        fabrica = Controlador.getSingletonInstance(tipo);
    }
    
    @Override
    public void buildPersonaje() {
        personaje = fabrica.crearPersonaje();
        personaje.setArma(arma);
        personaje.setArmadura(armadura); 
    }

    @Override
    public void builderArma() {
        arma = fabrica.crearArma();
    }

    @Override
    public void builderArmadura() {
        armadura = fabrica.crearArmadura();
    }

    
}
