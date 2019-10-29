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
public class CodeCheckIT implements CodeChecker {

    @Override
    public boolean check(String codice){
        return codice.matches("IT[a-zA-Z]{2}[0-9]{3}");
    }
}
