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
public class CompiladorRecursivo {
    static CLexico lexico= new CLexico();
    static int indice=0;
    static char sim=' ';
    static CLexico lex1=new CLexico();
    static String cadavance="";
    static String cad1="0123456789.";
    static String cad="((2.5+3.5-2)*2^2)/4<20000¬";
    
    
    public static void main(String[] args) {
        analisisLexico();
        cad=lex1.cadenaLexico();
        sim=lex1.darElemento(indice).getTipo();
        cadavance=cadavance+sim;
        procS();
        if(sim=='¬')
            System.out.println("Secuencia se acepta final");
        else
            System.out.println("Secuencia se rechaza final");
    }
    
    public static void procS(){
        // <S> --> <E> 
        
        
        switch (sim) {
            case 'i', '(' -> {
                NoTerminal s1 = new NoTerminal(0);
                procELO(s1);
                resultado(s1);
                return;
            }
        default ->  {
                System.out.println("Secuencia"+cad+" no se acepta");
                rechace();
            }
        }        
    }
    public static void procELO(NoTerminal s1)
    {
       
        switch(sim){
            case 'i', '(' -> {
                NoTerminal s2 = new NoTerminal(0);
                procEL2(s2);
                procELO_L(s2,s1);
                return;
            }
        default ->  {
                System.out.println("Secuencia"+cad+" no se acepta");
                rechace();
            }
        }
        
    }
    public static void procELO_L(NoTerminal i1,NoTerminal s1)
    {
        switch(sim){
            case '|' -> {
                NoTerminal s2 = new NoTerminal(0);
                NoTerminal s4 = new NoTerminal(0);
                avance();
                procEL2(s2);
                pRelacional(i1,s2);
                procfOR(i1,s2,s4);
                procELO_L(s4,s1);
                return;
            }
            case '¬', ')' -> {
                s1.setValor(i1.getValor());
                s1.setValorLogico(i1.getValorLogico());
                s1.setRelacional(i1.getRelacional());
                return;
            }
            default ->  {
                System.out.println("Secuencia"+cad+" no se acepta");
                rechace();
            }
        }
    }
    
    public static void procEL2(NoTerminal s1){
        switch(sim){
            case'i', '(' -> {
                NoTerminal s2= new NoTerminal(0);
                procER(s2);
                procEL2_L(s2,s1);
                return;
            }
            default ->  {
                System.out.println("Secuencia"+cad+" no se acepta");
                rechace();
            }
        }
        
    }
    public static void procEL2_L(NoTerminal i1,NoTerminal s1)
    {
        switch(sim){
            case'&' -> {
                NoTerminal s2 = new NoTerminal(0);
                NoTerminal s4 = new NoTerminal(0);
                avance();
                procER(s2);
                pRelacional(i1,s2);
                procAND(i1,s2,s4);
                procEL2_L(s4,s1);
                return;
            }
            case')', '|', '¬' -> {
                s1.setValor(i1.getValor());
                s1.setValorLogico(i1.getValorLogico());
                s1.setRelacional(i1.getRelacional());
                return;
            }
            default ->  {
                System.out.println("Secuencia"+cad+" no se acepta");
                rechace();
            }
        }
    }
    public static void procER(NoTerminal s1)
    {
        switch(sim){
            case'i', '(' -> {
                NoTerminal s2 = new NoTerminal(0);
                procE(s2);
                procER_L(s2,s1);
                return;
            }
            default ->  {
                System.out.println("Secuencia"+cad+" no se acepta");
                rechace();
            }
        }
    }
    
    public static void procER_L(NoTerminal i1, NoTerminal s1)
    {
        switch(sim){
            case'<', '>', '=', '!' -> {
                NoTerminal s2 = new NoTerminal(0);
                NoTerminal s3 = new NoTerminal(0);
                procOR(s2);
                procE(s3);
                pCompare(i1,s3,s2,s1);
                System.out.println("valor logico s1 "+s1.getRelacional());
                return;
            }
            case'¬', ')', '&', '|' -> {
                s1.setValor(i1.getValor());
                s1.setValorLogico(i1.getValorLogico());
                s1.setRelacional(i1.getRelacional());
                return;
            }
            default ->  {
                System.out.println("Secuencia"+cad+" no se acepta");
                rechace();
            }
        }
    }
    
    public static void procOR(NoTerminal s1)
    {
        switch(sim){
            case'<' -> {
                avance();
                procME(s1);
                return;
            }
            case'>' -> {
                avance();
                procMA(s1);
                return;
            }
            case'=' -> {
                avance();
                procIG(s1);
                return;
            }
            case'!' -> {
                avance();
                procDI(s1);
                return;
            }
            default -> {
                System.out.println("Secuencia"+cad+" no se acepta");
                rechace();
            }
        }    
    }
    
    public static void procME(NoTerminal s1)
    {
        switch(sim)
        {
            case'=' -> {
                avance();
                s1.setValor(2);
                return;
            }
            case'i', '(' -> {
                s1.setValor(1);
                return;
            }
            default ->  {
                System.out.println("Secuencia"+cad+" no se acepta");
                rechace();
            }
        }
        
    }
    public static void procMA(NoTerminal s1)
    {
        switch(sim)
        {
            case'=' -> {
                avance();
                s1.setValor(4);
                return;
            }
            case'i', '(' -> {
                s1.setValor(3);
                return;
            }
            default ->  {
                System.out.println("Secuencia"+cad+" no se acepta");
                rechace();
            }
        }
        
    }
    public static void procIG(NoTerminal s1)
    {
        switch(sim)
        {
            case'=' -> {
                avance();
                s1.setValor(5);
                return;
            }
            default -> {
                System.out.println("Secuencia"+cad+" no se acepta");
                rechace();
            }
        } 
    }
    public static void procDI(NoTerminal s1)
    {
        switch(sim)
        {
            case'=' -> {
                avance();
                s1.setValor(6);
                return;
            }
            default -> {
                System.out.println("Secuencia"+cad+" no se acepta");
                rechace();
            }
        }
        
    }
    public static void procE(NoTerminal s1){
        // <E> --> <T><E_L>
        
        switch (sim) {
            case 'i', '(' -> {
                NoTerminal s2 = new NoTerminal(0);
                procT(s2);
                procE_L(s2,s1);
                System.out.println("el "+s1.getValor());
                return;
            }
            default ->  {
                System.out.println("Secuencia"+cad+" no se acepta");
                rechace();
            }
        }
    }
    public static void procE_L(NoTerminal i1, NoTerminal s1){
        // <E_L> --> +<T><E_L>
        // <E_L> --> -<T><E_L>  no está implementada
        // <E_L> --> e
        NoTerminal s2 = new NoTerminal(0);
        switch (sim) {
            case '+' -> {
                avance();
                procT(s2);
                i1.setValor(i1.getValor()+s2.getValor());
                procE_L(i1,s1);
                System.out.println("el "+s1.getValor());
                return;
            }

            case '-' -> {
                avance();
                procT(s2);
                i1.setValor(i1.getValor()-s2.getValor());
                procE_L(i1,s1);
                System.out.println("el "+s1.getValor());
                return;
            }
            case ')', '¬', '&', '|', '>', '<', '=', '!' -> {
                s1.setValor(i1.getValor());
                s1.setValorLogico(i1.getValorLogico());
                s1.setRelacional(i1.getRelacional());
                return;
            }
            default ->  {
                System.out.println("Secuencia procel "+cad+" no se acepta");
                rechace();
            }
        }
    }
    
    public static void procT(NoTerminal s1){
        // <T> --> <P><T_L>
        
        switch (sim) {
            case 'i', '(' -> {
                NoTerminal s2 = new NoTerminal(0);
                procP(s2);
                procT_L(s2,s1);
                return;
            }
            default ->  {
                System.out.println("Secuencia"+cad+" no se acepta");
                rechace();
            }
        }
    }
    public static void procT_L(NoTerminal i1, NoTerminal s1){
        // <T_L> --> *<P><T_L>
        // <T_L> --> /<P><T_L>   no está implementada
        // <T_L> --> e
        NoTerminal s2 = new NoTerminal(0);
        switch (sim) {
            case '*' -> {
                avance();
                procP(s2);
                i1.setValor(i1.getValor()*s2.getValor());
                procT_L(i1,s1);
                return;
            }
            case'/' -> {
                avance();
                procP(s2);
                i1.setValor(i1.getValor()/s2.getValor());
                procT_L(i1,s1);
                return;
            }
                 
            case '+', ')', '¬', '-', '&', '|', '>', '<', '=', '!' -> {
                s1.setValor(i1.getValor());
                s1.setValorLogico(i1.getValorLogico());
                s1.setRelacional(i1.getRelacional());
                return;
            }
            default ->  {
                System.out.println("Secuencia"+cad+" no se acepta");
                rechace();
            }
        }
    }
    
    
        public static void procP(NoTerminal s1){
        // <F> --> i
        // <F> --> ( <ELO> )
        NoTerminal s2= new NoTerminal(0);
        switch (sim) {
            
            case 'i', '(' -> {
                procF(s2);
                procP_L(s2,s1);
                return;
            }
        default ->  {
            System.out.println("Secuencia"+cad+" no se acepta");
            rechace();
            }
        }
        
    }
    public static void procP_L(NoTerminal i1, NoTerminal s1)
    {
        NoTerminal s2= new NoTerminal(0);
        switch(sim)
        {
            case'^' -> {
                avance();
                procF(s2);
                exponente(i1,s2);
                procP_L(i1,s1);
                return;
            }
            case '+', ')', '¬', '-', '&', '|', '>', '<', '=', '!', '*', '/' -> {
                s1.setValor(i1.getValor());
                s1.setValorLogico(i1.getValorLogico());
                s1.setRelacional(i1.getRelacional());
                return;
            }
            default ->  {
                System.out.println("Secuencia"+cad+" no se acepta");
                rechace();
            }
        }
    }
    
    public static void procF(NoTerminal s1)
    {
        Elemento l1;
        l1= lex1.darElemento(indice);
        switch(sim)
        {
            case'(' -> {
                avance();
                procELO(s1);
                if (sim==')') {avance();
                }
                else {
                    System.out.println("Secuencia"+cad+" no se acepta");
                    rechace();
                }
            }
            case'i' -> {
                double val= l1.getValor();
                s1.setValor(val);
                avance();
                return;
            }
            default -> {
                System.out.println("Secuencia"+cad+" no se acepta");
                rechace();
            }
        }
    }
    
    public static void pRelacional(NoTerminal i1, NoTerminal i2)
    {
        if(i1.getRelacional())
        {
            if(!i2.getRelacional())
            {
                System.out.println("Debe sser el resultado de una expresion relacional 2");
                System.out.println("Secuencia "+cad+" no se acepta");
                rechace();
            }
        }
        else
        {
            System.out.println("Debe sser el resultado de una expresion relacional 1");
            System.out.println("Secuencia "+cad+" no se acepta");
            rechace();
        }
            
    }
    public static void procfOR(NoTerminal i1,NoTerminal i2, NoTerminal s4)
    {
        s4.setValorLogico(i1.getValorLogico()||i2.getValorLogico());
        s4.setRelacional(i2.getRelacional());
    }
    public static void procAND(NoTerminal i1,NoTerminal i2, NoTerminal s4)
    {
        s4.setValorLogico(i1.getValorLogico()&&i2.getValorLogico());
        s4.setRelacional(i2.getRelacional());
    }
    
    public static void resultado(NoTerminal s1)
    {
        System.out.println("Resultado valor "+s1.getValor());
        System.out.println("Resultado boolean "+s1.getValorLogico());
    }
    public static void exponente(NoTerminal i1, NoTerminal s1)
    {
        double res=i1.getValor();
        for(int i =1;i<s1.getValor();i++)
            res=res*i1.getValor();
        i1.setValor(res);
    }
    public static void avance(){
           indice++;
       if (indice<cad.length()) {
            sim=lex1.darElemento(indice).getTipo();
            cadavance=cadavance+sim;
            System.out.println("Cadena procesada "+cadavance);
       }
    }
    
    public static void mostrarContador(int i2){
    System.out.println("Cantidad de unos "+i2);
    }
    
    public static void rechace(){
        System.out.println("Se rechaza la secuencia");
        System.exit(0);
    }

    public static void pCompare(NoTerminal i1, NoTerminal i2, NoTerminal s2, NoTerminal s1)
    {
        switch((int)s2.getValor())
        {
            case 1 -> s1.setValorLogico(i1.getValor()<i2.getValor());
            case 2 -> s1.setValorLogico(i1.getValor()<=i2.getValor());
            case 3 -> s1.setValorLogico(i1.getValor()>i2.getValor());
            case 4 -> s1.setValorLogico(i1.getValor()>=i2.getValor());
            case 5 -> s1.setValorLogico(i1.getValor()==i2.getValor());
            case 6 -> s1.setValorLogico(i1.getValor()!=i2.getValor());
                
                
        }
        s1.setRelacional(true);
    }
    public static void analisisLexico(){
        // Este analizador es sencillo determina solo constantes enteras positivas
        // Trabaja los diferentes elementos en un ArrayListque trabaja con la clase Clexico
        // la cual define el ArrayListcon la clase CElemento
        // Almacenlos valores para poder hallar los resultados
        Elemento ele1; 
        int i=0;
        int ind=0;
        char tip=0;
        char sim1=cad.charAt(i);
        double val=0;
        while(sim1!='¬'){
            // determina si sim1 esta en la cadena 
            // de digitoscad1 que es global
            if(cad1.indexOf(sim1)!=-1)
            {
                String num="";
            
                while(cad1.indexOf(sim1)!=-1)
                {
                    num=num+sim1;
                    i++;
                    sim1=cad.charAt(i);
                }
                if(determinarNumero(num))
                {
                    val=Double.parseDouble(num);
                    tip='i';
                    // se tipifica el valor como i
                }
                else{
                    System.out.println("Se rechaza la secuencia");
                    System.exit(0);
                }
            }
            else{
                // si el simbolode entrada no esta en cad1 lo tipifica como tal ej
                // +,-,* (,) etc.
                tip=(char)sim1;
                i++;
                sim1=cad.charAt(i);
                val=0;
            }
            // con los elementos establecidos anteriormente se crea el elemento y se lo
            // adicinaa lex1 que es el objeto de la clase Clexico
            ele1=new Elemento(tip,val,ind);
            lex1.adicionarElemento(ele1);
            ind=ind+1;
        }
        ele1=new Elemento('¬',0,ind);
        lex1.adicionarElemento(ele1);
        lex1.mostrarLexico();
        System.out.println(" cadena"+lex1.cadenaLexico());
    }
    
    public static boolean determinarNumero(String numero){
        int estado=1,i=0;
        char simbolo;
        boolean b=true;
        while (i<numero.length()&&b) {
            simbolo = numero.charAt(i);
            switch (simbolo) {
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> {    
                    switch (estado) {
                        case 1 -> {
                            estado=2;
                            i++;
                        }
                        case 2 -> {
                            estado=2;
                            i++;
                        }
                        case 3 -> {
                            estado=4;
                            i++;
                        }
                        case 4 -> {
                            estado=4;
                            i++;
                        }
                    
                    }
                }
case '.' ->     {
    switch (estado) {
        case 1, 3, 4 -> b=false;
        case 2 ->
        {
            estado=3;
            i++;
        }
        
    }
                }

            }
        
    }
        return b;
    }
                
} 
    
