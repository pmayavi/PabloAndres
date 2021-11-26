/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2Pila;

/**
 *
 * @author SistemaInvestigacion
 */
public class NoTerminal {
 
    //Atributos
    
    private String nombre;
    private int direc;
    private double valor;
    private boolean valorLogico;
    private boolean relacional;
    
    
    // Métodos
    
    public NoTerminal(){
     
    }
    public NoTerminal(String nom,int val1,double val2){
        nombre=nom;
        direc=val1;
        valor=val2;
        relacional=false;
        valorLogico=false;
        
    }
    public String getNombre(){
        return nombre;
    }
    public int getDirec(){
        return (int)direc;
    }
    public double getValor(){
        return (double)valor;
    }
    
    public void setNombre(String nom){

        nombre=nom;
    }
    
    public void setDirec(int val1){
        direc=val1;
    }
    public void setValor(double val2){
        valor=val2;
    }
    
    public void setRelacional(boolean val1){
        relacional=val1;
    }
    public void setValorLogico(boolean val2){
        valorLogico=val2;
    }
    public boolean getRelacional(){
        return relacional;
    }
    public boolean getValorLogico(){
        return valorLogico;
    }
    
}