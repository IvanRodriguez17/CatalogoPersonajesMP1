/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructoras;

/**
 *
 * @author ivanr
 */
public class Controlador {
    
    private static Constructora_Abstracta builderPersonaje;
    
    /**
     * Se permite la unica entrada y creacion de la constructora de personajes
     * por medio del patron singleton.
     * @return la constructora concreta
     */
    public static Constructora_Abstracta getSingletonInstance() {
        if(builderPersonaje == null){
            builderPersonaje = new Constructora_Concreta();
            return builderPersonaje;
        }else{
            return builderPersonaje;
        }
    }
}
