/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2016.contest1.gruppoXX;

/**
 *
 * @author cptso
 */
public class AereoAMotore extends Aeromobile {
    
    private int numeroRotori;
    
    public AereoAMotore(String codice, int numeroRotori) {
        super(codice);
        this.numeroRotori = numeroRotori;
    }
    
    public int getNumeroRotori()
    {return numeroRotori;}
    
    @Override
    public String toString()
    {
        return super.toString() + String.format(" - Tipo = Aereo A Motore - Numero Rotori = %d", numeroRotori);
    }
}
