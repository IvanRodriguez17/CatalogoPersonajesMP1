/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import Personajes.Arma;
import Personajes.ArmaElfo;
import Personajes.Armadura;
import Personajes.ArmaduraElfo;
import Personajes.Elfo;
import Personajes.Personaje;

/**
 *
 * @author ivanr
 */
public class Fabrica_Elfo extends Fabrica_Abstracta{

    @Override
    public Arma crearArma() {
        arma = new ArmaElfo();
        arma.setNombre("espada corta");
        arma.setDañoBase(15);
        return arma;
    }

    @Override
    public Armadura crearArmadura() {
        armadura = new ArmaduraElfo();
        armadura.setNombre("Cota de malla");
        armadura.setDefensaBase(10);
        return armadura;
    }

    @Override
    public Personaje crearPersonaje() {
        pj = new Elfo();
        return pj;
    }
    
}
