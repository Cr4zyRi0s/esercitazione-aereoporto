/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2016.contest1.gruppoXX;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author cptso
 */
public class Aeroporto 
{
    private List<Aeromobile> l;
    private CodeChecker checker;
    
    public Aeroporto(CodeChecker checker)
    {
        this.checker = checker;
        l = new LinkedList<>();
    }
    
    public Aeromobile cerca(String codice)
    {
        for(Aeromobile a : l)
        {
            if(a.getCodice().equals(codice))
                return a;
        }
        return null;
    }
    
    public Aeromobile rimuovi(String codice)
    {
        int index = 0;
        for(Aeromobile a : l)
        {
            if(a.getCodice().equals(codice))
            {
                return l.remove(index);
            }
            index++;
        }
        return null;
    }
    
    public boolean inserisci(Aeromobile a)
    {
       
        if(checker == null)
        {
            return l.add(a);
        }
        else
        {
            if(checker.check(a.getCodice()))
            {
                
                return l.add(a);
            }
            else
                return false;
        }
    }
    
    public int elementi()
    {
        return l.size();
    }
    
    @Override
    public String toString()
    {
        String ret = "";
        for(Aeromobile a : l)
            ret = ret.concat(a.toString() + "\n");
        return ret;
    }   
}
