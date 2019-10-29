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
public abstract class Aeromobile {
    private String codice;
    private int numeroSequenziale;
    private static int allocati;
    
    public Aeromobile(String codice)
    {
        this.codice = codice;
        numeroSequenziale = allocati;
        allocati++;
    }
    
    public String getCodice()
    {
        return codice;
    }
    @Override
    public String toString()
    {
        return String.format("Aereomobile n.%d - Codice = %s",numeroSequenziale,codice);
    }
    
    public int getNumeroSequenziale()
    {
        return numeroSequenziale;
    }
}
