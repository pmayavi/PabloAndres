/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author jfons
 */
public class NoTerminal {
    private double valor;
    private boolean valorLogico;
    private boolean relacional;
    
    public NoTerminal(double valor)
    {
        this.valor=valor;
        this.valorLogico=false;
        this.relacional=false;
    
    }
    public NoTerminal(double valor,boolean valorLogico,boolean relacional)
    {
        this.valor=valor;
        this.valorLogico=valorLogico;
        this.relacional=relacional;
    
    }
    public double getValor()
    {
        return valor;
    }
    public void setValor(double valor)
    {
        this.valor=valor;
    }
    
    public boolean getValorLogico()
    {
        return valorLogico;
    }
    public void setValorLogico(boolean valorLogico)
    {
        this.valorLogico=valorLogico;
    }
    
    public boolean getRelacional()
    {
        return relacional;
    }
    public void setRelacional(boolean relacional)
    {
        this.relacional=relacional;
    }
    
}
