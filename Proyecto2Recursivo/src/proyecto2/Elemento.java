/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author SistemaInvestigacion
 */
public class Elemento {
 
    //atributos
    private char tipo;
    private double  valor;
    private int indice;
    
    //Métodos
    
    public Elemento(){ }
    public Elemento(char tip,double val,int ind){
        tipo=tip;
        valor=val;
        indice=ind;
        
    }
    
    public char getTipo(){
        return tipo;
    }
    public double getValor(){
        return valor;
    }
    public int getIndice(){
        return tipo;
    }
    public void setTipo(char tip){
        tipo=tip;
    }
    public void setValor(float val){
        valor=val;
    }
    public void setIndice(int ind){
        indice=ind;
    }   
}
