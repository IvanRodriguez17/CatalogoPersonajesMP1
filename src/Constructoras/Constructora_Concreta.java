/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructoras;

import Personajes.ArmaElfo;
import Personajes.ArmaOrco;
import Personajes.ArmaduraElfo;
import Personajes.ArmaduraOrco;
import Personajes.Elfo;
import Personajes.Orco;
import Personajes.Personaje;

/**
 *
 * @author ivanr
 */
public class Constructora_Concreta extends Constructora_Abstracta {

    /**se entrega un tipo de personaje, se utiliza el personaje abstracto
     * y se hace pasar por un hijo, luego se le pone el arma y la armadura
     * respectiva al tipo.
     * @param tipo 
     */

    @Override
    public void buildPersonaje(String tipo) {
        switch (tipo) {
            case "elfo":
                personaje = new Elfo();
                break;
            case "Orco":
                personaje = new Orco();
                break;
        }
        personaje.setArma(arma_personaje);
        personaje.setArmadura(armadura_personaje);
    }

    /**
     * Se entrega el tipo de personaje para la creacion de sus respectivas 
     * armas.
     * @param tipo
     */
    @Override
    public void builderArma(String tipo) {
        switch (tipo) {
            case "elfo":
                arma_personaje = new ArmaElfo();
                arma_personaje.setNombre("espadaELfo");
                arma_personaje.setDañoBase(15);
                break;
            case "Orco":
                arma_personaje = new ArmaOrco();
                arma_personaje.setNombre("Mazo Orco");
                arma_personaje.setDañoBase(15);
                break;
        }
    }

    /**
     * Se entrega el tipo de personaje para la creacion de sus respctivas
     * armaduras.
     * @param tipo
     */
    @Override
    public void builderArmadura(String tipo) {
        switch (tipo) {
            case "elfo":
                armadura_personaje = new ArmaduraElfo();
                armadura_personaje.setNombre("Cota de malla");
                armadura_personaje.setDefensaBase(10);
                break;
            case "Orco":
                armadura_personaje = new ArmaduraOrco();
                armadura_personaje.setNombre("Perchera de cuero");
                armadura_personaje.setDefensaBase(10);
                break;
        }

    }
}
