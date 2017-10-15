/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import Personajes.Arma;
import Personajes.ArmaOrco;
import Personajes.Armadura;
import Personajes.ArmaduraOrco;
import Personajes.Orco;
import Personajes.Personaje;

/**
 *
 * @author ivanr
 */
public class Fabrica_Orco extends Fabrica_Abstracta{

    @Override
    public Arma crearArma() {
        arma = new ArmaOrco();
        arma.setNombre("Mazo de piedra");
        arma.setDañoBase(14);
        return arma;
    }

    @Override
    public Armadura crearArmadura() {
        armadura = new ArmaduraOrco();
        armadura.setNombre("malla de cuero");
        armadura.setDefensaBase(16);
        return armadura;
    }
    
    @Override
    public Personaje crearPersonaje() {
        pj = new Orco();
        return pj;
    }
}
