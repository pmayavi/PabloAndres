/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.util.ArrayList;

/**
 *
 * @author SistemaInvestigacion
 */

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class CLexico {
    //Atributos
    private ArrayList<Elemento> cadena;
    //Métodos
    public CLexico(){
        cadena = new ArrayList();
    }
    
    public void adicionarElemento(Elemento ele){
        cadena.add(ele);
    }
    
    public Elemento darElemento(int ind){
        return cadena.get(ind);
    }
    
    public int darTamañoCadena(){
        return cadena.size();
    }
    
    public void mostrarLexico(){
        Elemento ele; 
        for (int i=0;i<cadena.size();i++){
            ele=darElemento(i);
            System.out.print("Tipo "+(char)ele.getTipo()+"  ");
            System.out.println("Valor "+ele.getValor());
            //System.out.println("Indice "+ele.darIndice());
        }
    }
    public String cadenaLexico(){
        String cadena1="";
        Elemento ele1;
        for(int i=0;i<cadena.size();i++){
            ele1 = darElemento(i);
                    
        cadena1=cadena1+ele1.getTipo();
        }
        return cadena1;
    }    
}
