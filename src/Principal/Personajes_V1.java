/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import fabricas.Controlador;
import Constructoras.Constructora_Abstracta;
import Constructoras.Constructora_Concreta;
import Constructoras.PersonajesCreador;
import Personajes.Personaje;
import java.util.Scanner;

/**
 *
 * @author ivanr
 */
public class Personajes_V1 {

    public static void main(String[] args) {
        
        PersonajesCreador clonador = new PersonajesCreador();
        Scanner sc = new Scanner(System.in);
        System.out.println("escriba el tipo de personaje: ");
        String tipo = sc.nextLine();
        System.out.println("Cuantos personajes desea crear? ");
        int numeroPersonajes = Integer.parseInt(sc.nextLine());
        
        Constructora_Abstracta creadora = new Constructora_Concreta(tipo);
        creadora.builderArma();
        creadora.builderArmadura();
        creadora.buildPersonaje();
        Personaje personaje = creadora.getPersonaje();
        
        Personaje[] listaPersonajes = new Personaje[numeroPersonajes];
        for (int i = 0; i < numeroPersonajes; i++){
            listaPersonajes[i] = clonador.clonadoPersonaje(personaje);
        }
        
        for (int i = 0; i < numeroPersonajes; i++){
            listaPersonajes[i].ToString();
        }
     
    }
}
