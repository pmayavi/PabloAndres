/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2Pila;

/**
 *
 * @author Nelson Jaramillo
 */
public class Proyecto2Pila {

    static Lexico lexico = new Lexico();
    
  //  static String cad="((((5+3)))+5+3+2)-1¬";
    static String cad1 = "0123456789.";
    static String digitos="0123456789";
    static String cad="((2.5+3.5-2)*2^2)/4<20000¬";
    static int indice=0;
    static char sim=' ';
    static Lexico lex1 = new Lexico();
    static String cadavance="";
    static Analizador analizador = new Analizador();
    
    public static void main(String[] args) {

        analisisLexico();
        cad=lex1.cadenaLexico();
        sim=lex1.darElemento(indice).darTipo();
        cadavance=cadavance+sim;
        // crea los nodos para determinar el fondo de pila con v y el axioma
        // o no terminal inicial s

        NoTerminal v = new NoTerminal("v",0,0);
        NoTerminal s = new NoTerminal("s",0,0);
        // adiciona a la pila el fondo v y el axiona s. (en la clase analizador se 
        // tiene un arrayList para controlar la pila
        
        analizador.adicionarNodo(v);
        analizador.adicionarNodo(s);
       // analizador.mostrarCadenaPila();
        NoTerminal nt=null;
        
        // Realiza un ciclo do-while para controlar la cadena y realiza dos switches para
        // controlar la tabla de control, el primero para evaluar la entrada y el
        // segundo para evaluar los símbolos de pila
        
        do{
            
            switch (sim) {
                
            // los símbolos de entrada son i,+,-,*,/,^,¬,(,)
                
            case 'i': 
                
                // en nt se almacena el nodo ultimo de la pila
                
                nt = analizador.getnode(analizador.ultimo());
        
                // los símbolos de pila son s,e,el,t,tl,p,pl,f,)
                
                switch  (nt.getNombre()){
                    case "s": 
                              proceso1();
                              analizador.mostrarCadenaPila();
                              break;
                    case "elo":
                              proceso2();
                              analizador.mostrarCadenaPila();
                              break;
                    case "el2":
                              proceso5();
                              analizador.mostrarCadenaPila();
                              break;
                    case "er":
                              proceso8();
                              analizador.mostrarCadenaPila();
                              break;
                    case "e": 
                              proceso21();
                              analizador.mostrarCadenaPila();
                              break;
                    case "me": 
                              proceso13();
                              analizador.mostrarCadenaPila();
                              break;
                    case "ma":
                              proceso16();
                              analizador.mostrarCadenaPila();
                              break;
                    case "t": 
                              proceso25();
                              analizador.mostrarCadenaPila();
                              break;
                    case "f": 
                              proceso29();
                              analizador.mostrarCadenaPila();
                              break;
                    case "p":
                              proceso33();
                              analizador.mostrarCadenaPila();
                              break;
                    case "resul": 
                              resultado();
                              break;
                    case "procOR":
                              procOR();
                              break;
                    case "procAND":
                              procAND();
                              break;
                    case "pRelacional":
                              pRelacional();
                              break;
                    case "pComparar":
                              pComparar();
                              break;
                    case "suma": 
                              suma();
                              break;
                    case "resta":
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break;
                    case "div":
                              div();
                              break;
                    case "exp":
                              exp();
                              break;
                    
                               
                    default : rechace();
                   // break;
                }
                break;
            case '+':
                
                nt = analizador.getnode(analizador.ultimo());
        
                switch  (nt.getNombre()){
                    case "el": proceso22();
                              analizador.mostrarCadenaPila();
                              break;
                    case "tl": proceso28();
                              analizador.mostrarCadenaPila();
                              break;      
                    case "fl": proceso31();
                               analizador.mostrarCadenaPila();
                               break;
                    case "resul": 
                              resultado();
                              break;
                    case "procOR":
                              procOR();
                              break;
                    case "procAND":
                              procAND();
                              break;
                    case "pRelacional":
                              pRelacional();
                              break;
                    case "pComparar":
                              pComparar();
                              break;
                    case "suma": 
                              suma();
                              break;
                    case "resta":
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break;
                    case "div":
                              div();
                              break;
                    case "exp":
                              exp();
                              break;
                    default : rechace();
                    //break;
                }
                break;
            
           case '-':
                
                nt = analizador.getnode(analizador.ultimo());
        
                switch  (nt.getNombre()){
                    case "el": proceso23();
                              analizador.mostrarCadenaPila();
                              break;
                    case "tl": proceso28();
                              analizador.mostrarCadenaPila();
                              break;      
                    case "fl": proceso31();
                               analizador.mostrarCadenaPila();
                               break;
                    case "resul": 
                              resultado();
                              break;
                    case "procOR":
                              procOR();
                              break;
                    case "procAND":
                              procAND();
                              break;
                    case "pRelacional":
                              pRelacional();
                              break;
                    case "pComparar":
                              pComparar();
                              break;
                    case "suma": 
                              suma();
                              break;
                    case "resta":
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break;
                    case "div":
                              div();
                              break;
                    case "exp":
                              exp();
                              break;
                    default : rechace();
                    //break;
                }
                break;     
            case '*':
                
                nt = analizador.getnode(analizador.ultimo());
        
                switch  (nt.getNombre()){
                    case "tl": proceso26();
                              analizador.mostrarCadenaPila();
                              break;
                    case "fl": proceso31();
                               analizador.mostrarCadenaPila();
                               break;
                    case "resul": 
                              resultado();
                              break;
                    case "procOR":
                              procOR();
                              break;
                    case "procAND":
                              procAND();
                              break;
                    case "pRelacional":
                              pRelacional();
                              break;
                    case "pComparar":
                              pComparar();
                              break;
                    case "suma": 
                              suma();
                              break;
                    case "resta":
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break;
                    case "div":
                              div();
                              break;
                    case "exp":
                              exp();
                              break;
                    default : rechace();
                    //break;
                }
                break;
            case '/':
                
                nt = analizador.getnode(analizador.ultimo());
        
                switch  (nt.getNombre()){
                    case "tl": proceso27();
                              analizador.mostrarCadenaPila();
                              break;
                    case "fl": proceso31();
                               analizador.mostrarCadenaPila();
                               break;
                    case "resul": 
                              resultado();
                              break;
                    case "procOR":
                              procOR();
                              break;
                    case "procAND":
                              procAND();
                              break;
                    case "pRelacional":
                              pRelacional();
                              break;
                    case "pComparar":
                              pComparar();
                              break;
                    case "suma": 
                              suma();
                              break;
                    case "resta":
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break;
                    case "div":
                              div();
                              break;
                    case "exp":
                              exp();
                              break;
                    default : rechace();
                    //break;
                }
                break;
            case '^':
                
                nt = analizador.getnode(analizador.ultimo());
        
                switch  (nt.getNombre()){
                    case "fl": proceso30();
                               analizador.mostrarCadenaPila();
                               break;
                    case "resul": 
                              resultado();
                              break;
                    case "procOR":
                              procOR();
                              break;
                    case "procAND":
                              procAND();
                              break;
                    case "pRelacional":
                              pRelacional();
                              break;
                    case "pComparar":
                              pComparar();
                              break;
                    case "suma": 
                              suma();
                              break;
                    case "resta":
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break;
                    case "div":
                              div();
                              break;
                    case "exp":
                              exp();
                              break;
                    default : rechace();
                    //break;
                }
                break;
            case '<':
                
                nt = analizador.getnode(analizador.ultimo());
        
                switch  (nt.getNombre()){
                    case "erl":proceso9();
                               analizador.mostrarCadenaPila();
                               break;
                    case "or":proceso11();
                               analizador.mostrarCadenaPila();
                               break;
                    case "el":proceso24();
                               analizador.mostrarCadenaPila();
                               break;
                    case "tl": proceso28();
                              analizador.mostrarCadenaPila();
                              break;
                    case "fl": proceso31();
                               analizador.mostrarCadenaPila();
                               break;
                    case "resul": 
                              resultado();
                              break;
                    case "procOR":
                              procOR();
                              break;
                    case "procAND":
                              procAND();
                              break;
                    case "pRelacional":
                              pRelacional();
                              break;
                    case "pComparar":
                              pComparar();
                              break;
                    case "suma": 
                              suma();
                              break;
                    case "resta":
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break;
                    case "div":
                              div();
                              break;
                    case "exp":
                              exp();
                              break;
                    default : rechace();
                    //break;
                }
                break;
            case '>':
                
                nt = analizador.getnode(analizador.ultimo());
        
                switch  (nt.getNombre()){
                    case "erl":proceso9();
                               analizador.mostrarCadenaPila();
                               break;
                    case "or":proceso14();
                               analizador.mostrarCadenaPila();
                               break;
                    case "el":proceso24();
                               analizador.mostrarCadenaPila();
                               break;
                    case "tl": proceso28();
                              analizador.mostrarCadenaPila();
                              break;
                    case "fl": proceso31();
                               analizador.mostrarCadenaPila();
                               break;
                    case "resul": 
                              resultado();
                              break;
                    case "procOR":
                              procOR();
                              break;
                    case "procAND":
                              procAND();
                              break;
                    case "pRelacional":
                              pRelacional();
                              break;
                    case "pComparar":
                              pComparar();
                              break;
                    case "suma": 
                              suma();
                              break;
                    case "resta":
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break;
                    case "div":
                              div();
                              break;
                    case "exp":
                              exp();
                              break;
                    default : rechace();
                    //break;
                }
                break;
            case '=':
                
                nt = analizador.getnode(analizador.ultimo());
        
                switch  (nt.getNombre()){
                    case "erl":proceso9();
                               analizador.mostrarCadenaPila();
                               break;
                    case "or":proceso17();
                               analizador.mostrarCadenaPila();
                               break;
                    case "me":proceso12();
                               analizador.mostrarCadenaPila();
                               break;
                    case "ma":proceso15();
                               analizador.mostrarCadenaPila();
                               break;
                    case "ig":proceso18();
                               analizador.mostrarCadenaPila();
                               break;
                    case "di":proceso20();
                               analizador.mostrarCadenaPila();
                               break;
                    case "el":proceso24();
                               analizador.mostrarCadenaPila();
                               break;
                    case "tl": proceso28();
                              analizador.mostrarCadenaPila();
                              break;
                    case "fl": proceso31();
                               analizador.mostrarCadenaPila();
                               break;
                    case "resul": 
                              resultado();
                              break;
                    case "procOR":
                              procOR();
                              break;
                    case "procAND":
                              procAND();
                              break;
                    case "pRelacional":
                              pRelacional();
                              break;
                    case "pComparar":
                              pComparar();
                              break;
                    case "suma": 
                              suma();
                              break;
                    case "resta":
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break;
                    case "div":
                              div();
                              break;
                    case "exp":
                              exp();
                              break;
                    default : rechace();
                    //break;
                }
                break;
            case '!':
                
                nt = analizador.getnode(analizador.ultimo());
        
                switch  (nt.getNombre()){
                    case "erl":proceso9();
                               analizador.mostrarCadenaPila();
                               break;
                    case "or":proceso19();
                               analizador.mostrarCadenaPila();
                               break;
                    case "el":proceso24();
                               analizador.mostrarCadenaPila();
                               break;
                    case "tl": proceso28();
                              analizador.mostrarCadenaPila();
                              break;
                    case "fl": proceso31();
                               analizador.mostrarCadenaPila();
                               break;
                    case "resul": 
                              resultado();
                              break;
                    case "procOR":
                              procOR();
                              break;
                    case "procAND":
                              procAND();
                              break;
                    case "pRelacional":
                              pRelacional();
                              break;
                    case "pComparar":
                              pComparar();
                              break;
                    case "suma": 
                              suma();
                              break;
                    case "resta":
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break;
                    case "div":
                              div();
                              break;
                    case "exp":
                              exp();
                              break;
                    default : rechace();
                    //break;
                }
                break;
            case '|':
                
                nt = analizador.getnode(analizador.ultimo());
        
                switch  (nt.getNombre()){
                    case "elol":proceso3();
                               analizador.mostrarCadenaPila();
                               break;
                    case "el2l":proceso7();
                               analizador.mostrarCadenaPila();
                               break;
                    case "erl":proceso10();
                               analizador.mostrarCadenaPila();
                               break;
                    case "el":proceso24();
                               analizador.mostrarCadenaPila();
                               break;
                    case "tl": proceso28();
                              analizador.mostrarCadenaPila();
                              break;
                    case "fl": proceso31();
                               analizador.mostrarCadenaPila();
                               break;
                    case "resul": 
                              resultado();
                              break;
                    case "procOR":
                              procOR();
                              break;
                    case "procAND":
                              procAND();
                              break;
                    case "pRelacional":
                              pRelacional();
                              break;
                    case "pComparar":
                              pComparar();
                              break;
                    case "suma": 
                              suma();
                              break;
                    case "resta":
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break;
                    case "div":
                              div();
                              break;
                    case "exp":
                              exp();
                              break;
                    default : rechace();
                    //break;
                }
                break;
            case '&':
                
                nt = analizador.getnode(analizador.ultimo());
        
                switch  (nt.getNombre()){
                    case "el2l":proceso6();
                               analizador.mostrarCadenaPila();
                               break;
                    case "erl":proceso10();
                               analizador.mostrarCadenaPila();
                               break;
                    case "el":proceso24();
                               analizador.mostrarCadenaPila();
                               break;
                    case "tl": proceso28();
                              analizador.mostrarCadenaPila();
                              break;
                    case "fl": proceso31();
                               analizador.mostrarCadenaPila();
                               break;
                    case "resul": 
                              resultado();
                              break;
                    case "procOR":
                              procOR();
                              break;
                    case "procAND":
                              procAND();
                              break;
                    case "pRelacional":
                              pRelacional();
                              break;
                    case "pComparar":
                              pComparar();
                              break;
                    case "suma": 
                              suma();
                              break;
                    case "resta":
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break;
                    case "div":
                              div();
                              break;
                    case "exp":
                              exp();
                              break;
                    default : rechace();
                    //break;
                }
                break;
            case '(':
                nt = analizador.getnode(analizador.ultimo());
                
        
                switch  (nt.getNombre()){
                    case "s": proceso1();
                              analizador.mostrarCadenaPila();
                              break;
                    case "elo": proceso2();
                              analizador.mostrarCadenaPila();
                              break;
                    
                    case "el2": 
                              proceso5();
                              analizador.mostrarCadenaPila();
                              break;
                    case "er": 
                              proceso8();
                              analizador.mostrarCadenaPila();
                              break;          
                    case "e": 
                              proceso21();
                              analizador.mostrarCadenaPila();
                              break;
                    case "me": 
                              proceso13();
                              analizador.mostrarCadenaPila();
                              break;
                    case "ma": 
                              proceso16();
                              analizador.mostrarCadenaPila();
                              break;
                    case "t": 
                              proceso25();
                              analizador.mostrarCadenaPila();
                              break;
                    case "f": 
                              proceso29();
                              analizador.mostrarCadenaPila();
                              break;
                    case "p": 
                              proceso32();
                              analizador.mostrarCadenaPila();
                              break;
                    case "resul": 
                              resultado();
                              
                              break;
                    case "procOR":
                              procOR();
                              break;
                    case "procAND":
                              procAND();
                              break;
                    case "pRelacional":
                              pRelacional();
                              break;
                    case "pComparar":
                              pComparar();
                              break;
                    case "suma": 
                              suma();
                              break;
                    case "resta":
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break;
                    case "div":
                              div();
                              break;
                    case "exp":
                              exp();
                              break;         
                    default : rechace();
                   
                }
                break;
            
                
            case ')':
                nt = analizador.getnode(analizador.ultimo());
                switch  (nt.getNombre()){
                    
                    case "elol": proceso4();
                              analizador.mostrarCadenaPila();
                              break;
                    case "el2l": proceso7();
                            analizador.mostrarCadenaPila();
                               break;          
                    case "erl": proceso10();
                            analizador.mostrarCadenaPila();
                              break;
                    case "el": proceso24();
                              analizador.mostrarCadenaPila();
                              break;
                    case "tl": proceso28();
                              analizador.mostrarCadenaPila();
                              break;          
                    case "fl": proceso31();
                              analizador.mostrarCadenaPila();
                              break;
                    case ")":procesoParentesis();
                              analizador.mostrarCadenaPila();
                              break;
                    case "resul": 
                              resultado();
                              break;
                    case "procOR":
                              procOR();
                              break;
                    case "procAND":
                              procAND();
                              break;
                    case "pRelacional":
                              pRelacional();
                              break;
                    case "pComparar":
                              pComparar();
                              break;
                    case "suma": 
                             suma();
                              break;
                    case "resta":
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break;
                    case "div":
                              div();
                              break;
                    case "exp":
                              exp();
                              break;

                    default : rechace();
                    //break;
                }
                break;
                case '¬':
                nt = analizador.getnode(analizador.ultimo());
                switch  (nt.getNombre()){
                    case "elol": proceso4();
                              analizador.mostrarCadenaPila();
                              break;
                    case "el2l": proceso7();
                               analizador.mostrarCadenaPila();
                               break;          
                    case "erl": proceso10();
                              analizador.mostrarCadenaPila();
                              break;
                    case "el": proceso24();
                              analizador.mostrarCadenaPila();
                              break;
                    case "tl": proceso28();
                             analizador.mostrarCadenaPila();
                              break;
                    case "fl": proceso31();
                              analizador.mostrarCadenaPila();
                              break;
                    case "resul": 
                              resultado();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procOR":
                              procOR();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procAND":
                              procAND();
                              analizador.mostrarCadenaPila();
                              break;
                    case "pRelacional":
                              pRelacional();
                              analizador.mostrarCadenaPila();
                              break;
                    case "pComparar":
                              pComparar();
                              analizador.mostrarCadenaPila();
                              break;
                    case "suma": 
                              suma();
                              analizador.mostrarCadenaPila();
                              break;
                    case "resta":
                              resta();
                              analizador.mostrarCadenaPila();
                              break;
                    case "mul": 
                              mul();
                              break;
                    case "div":
                              div();
                              break;
                    case "exp":
                              exp();
                              break;

                    default : rechace();
                    //break;
                }
                break;
            
            default  : rechace();
        }
              
       // }
           
           nt=analizador.getnode(analizador.ultimo());
        }while (!nt.getNombre().equalsIgnoreCase("v"));
        
        if (nt.getNombre().equalsIgnoreCase("v"))
            System.out.println("Se acepta la secuencia");
        else
            System.out.println("Se rechaza la secuencia");
    
    }
    
    
    
    public static void proceso1(){
        //1. <s>---><ELO>s1 {resultado}i1 i1<-s1
        //1. <S> --> <E> {resultado}   i1<-s1         V0|s   V0|i1|resultado|elo|s1
        int u = analizador.ultimo();
        // se van a crear cuatro objetos para el analizador             
        NoTerminal i1 = new NoTerminal("i1",0,0);    //u
        NoTerminal res = new NoTerminal("resul",0,0);  //u+1
        NoTerminal elo = new NoTerminal("elo",0,0);      //u+2
        NoTerminal s1 = new NoTerminal("s1",u,0);    //u+3
        analizador.removeNodo(u);  //pop <S> 
        analizador.adicionarNodo(i1);  
        analizador.adicionarNodo(res); 
        analizador.adicionarNodo(s1);  
        analizador.adicionarNodo(elo);  
    }

    public static void proceso2(){
        //2.<ELO>s1 --><El2>s2<ELOL>i1,s3 s1<-s3 il<-s2
        //2. <E>s1 --> <T>s2<E_L> i1,s3   i1<-s2  s1<-s3
        NoTerminal nt1;
               
        int u = analizador.ultimo();//<ELO> u
        nt1=analizador.getnode(u-1);//s1 u-1
        
        NoTerminal s3 = new NoTerminal("s3",nt1.getDirec(),0);  //u-1
        NoTerminal i1 = new NoTerminal("i1",0,0);               //u
        NoTerminal elol = new NoTerminal("elol",0,0);               //u+1
        NoTerminal s2 = new NoTerminal("s2",u,0);               //u+2
        NoTerminal el2 = new NoTerminal("el2",0,0);                 //u+3
        
        analizador.removeNodo(u);   // Pop (<E>)
        analizador.removeNodo(u-1);   // Pop (s1)
        
        analizador.adicionarNodo(s3); // Push(s3)
        analizador.adicionarNodo(i1);  // Push(i1)
        analizador.adicionarNodo(elol); // Push(<E_L>)
        analizador.adicionarNodo(s2);  // Push(s2)
        analizador.adicionarNodo(el2); // Push(<T>)
        
    }
    
    
    public static void proceso3(){
        //3.<ELO_L> i1,s1-> | <EL2> s2{pRelacional} i2,i3 {procOR} i4,i5,s4 <ELO_L> i6,s5 
        //s1<-s3    i1<-s2    (i2,i4)<-i1     (i3,i5)<-s2     i6<-s4    s1<-s5 
        NoTerminal nt1,nt2;
        int u = analizador.ultimo(); //<ELO_L>
        nt1 = analizador.getnode(u-1);//i1
        nt2 = analizador.getnode(u-2);//s1
        
        NoTerminal s4 = new NoTerminal("s4",nt2.getDirec(),0);  //u-2
        NoTerminal i6 = new NoTerminal("i6",0,0);  //u-1
        NoTerminal elol = new NoTerminal("elol",0,0); //u
        NoTerminal s3 = new NoTerminal("s3",u-1,0); //u+1
        NoTerminal i5 = new NoTerminal("i5",0,0); //u+2
        NoTerminal i4 = new NoTerminal("i4",0,0); //u+3
        i4.setValorLogico(nt1.getValorLogico());
        NoTerminal procOR = new NoTerminal("procOR",0,0); //u+4
        NoTerminal i3 = new NoTerminal("i3",u+2,0); //u+5
        NoTerminal i2 = new NoTerminal("i2",0,0); //u+6
        i2.setValorLogico(nt1.getValorLogico());
        i2.setRelacional(nt1.getRelacional());
        NoTerminal pRelacional = new NoTerminal("pRelacional",0,0); //u+7
        NoTerminal s2 = new NoTerminal("s2",u+2,0); //u+8
        NoTerminal el2 = new NoTerminal("el2",0,0); //u+9
                      
        
        analizador.removeNodo(u);   // Pop  (e_l)
        analizador.removeNodo(u-1);   // Pop  (i1)
        analizador.removeNodo(u-2);   // Pop  (s1)
        analizador.adicionarNodo(s4); //  Push (s4)
        analizador.adicionarNodo(i6);  // Push(i6)
        analizador.adicionarNodo(elol); //  Push (elol)
        analizador.adicionarNodo(s3); //  Push (s3)
        analizador.adicionarNodo(i5); //  Push (i5)
        analizador.adicionarNodo(i4); //  Push (i4)
        analizador.adicionarNodo(procOR); //  Push (procOR)
        analizador.adicionarNodo(i3); //  Push (i3)
        analizador.adicionarNodo(i2); //  Push (i2)
        analizador.adicionarNodo(pRelacional); //  Push (pRelacional)
        analizador.adicionarNodo(s2); //  Push (s2)
        analizador.adicionarNodo(el2); //  Push (el2)
        avance();
    }
    
    
    public static void proceso4(){
        //4. <ELO_L> i1,s1->e s1<- i1
        NoTerminal nt1,nt2,nt3;
        int u = analizador.ultimo();  // elol 
        nt1=analizador.getnode(u-1);  // i1
        nt2=analizador.getnode(u-2);  // s1
        nt3=analizador.getnode(nt2.getDirec());
        nt3.setValor(nt1.getValor());
        nt3.setValorLogico(nt1.getValorLogico());
        nt3.setRelacional(nt1.getRelacional());
        analizador.removeNodo(u);  // Pop  (elol)
        analizador.removeNodo(u-1);// Pop  i1
        analizador.removeNodo(u-2);// Pop  s1
    }
    
    public static void proceso5(){
        //5.<El2>s1-><ER2>s2<El2_l>i1,s3 s1<-S3 i1<-s2
        NoTerminal nt1;
               
        int u = analizador.ultimo();
        nt1=analizador.getnode(u-1);
        
        NoTerminal s3 = new NoTerminal("s3",nt1.getDirec(),0);  //u-1
        NoTerminal i1 = new NoTerminal("i1",0,0);               //u
        NoTerminal el2l = new NoTerminal("el2l",0,0);               //u+1
        NoTerminal s2 = new NoTerminal("s2",u,0);               //u+2
        NoTerminal er = new NoTerminal("er",0,0);                 //u+3
        
        analizador.removeNodo(u);   // Pop (el2)
        analizador.removeNodo(u-1);   // Pop (s1)
        analizador.adicionarNodo(s3); // Push(s3)
        analizador.adicionarNodo(i1);  // Push(i1)
        analizador.adicionarNodo(el2l); // Push(el2l)
        analizador.adicionarNodo(s2);  // Push(s2)
        analizador.adicionarNodo(er); // Push(er)
        
        
    }
    public static void proceso6(){
        // <EL2_L>i1,s1 --> &<ER>s2{pRelational}i2,i3{evalAND}i4,i5,s3<EL2_L>i6,s4 -- s1 <- s4, i1<-s2, (i2,i4)<-i1, i3 <- i5, i5 <- s2, i6<-s3
        NoTerminal nt1,nt2;
               
        int u = analizador.ultimo();
        nt1 = analizador.getnode(u-1);
        nt2 = analizador.getnode(u-2);
        
        NoTerminal s4 = new NoTerminal("s4",nt2.getDirec(),0); //u-2
        NoTerminal i6 = new NoTerminal("i6",0,0); //u-1
        NoTerminal el2l = new NoTerminal("el2l",0,0); //u
        NoTerminal s3 = new NoTerminal("s3",u-1,0); //u+1
        NoTerminal i5 = new NoTerminal("i5",0,0); //u+
        NoTerminal i4 = new NoTerminal("i4",0,0); //u+3
        i4.setValorLogico(nt1.getValorLogico());
        NoTerminal procAND = new NoTerminal("procAND",0,0); //u+4
        NoTerminal i3 = new NoTerminal("i3",u+2,0); //u+5
        NoTerminal i2 = new NoTerminal("i2",0,nt1.getValor()); //u+5
        i2.setValorLogico(nt1.getValorLogico());
        i2.setRelacional(nt1.getRelacional());
        NoTerminal pRelacional = new NoTerminal("pRelacional",0,0); //u+6
        NoTerminal s2= new NoTerminal("s2",u+2,0); //u+7
        NoTerminal er = new NoTerminal("er",0,0); //u+8
        
        analizador.removeNodo(u);   // Pop  (el2_l)
        analizador.removeNodo(u-1);   // Pop  (i1)
        analizador.removeNodo(u-2);   // Pop  (s1)
        analizador.adicionarNodo(s4); //  Push (s4)
        analizador.adicionarNodo(i6);  // Push(i6)
        analizador.adicionarNodo(el2l); //  Push (el2l)
        analizador.adicionarNodo(s3); //  Push (s3)
        analizador.adicionarNodo(i5); //  Push (i5)
        analizador.adicionarNodo(i4); //  Push (i4)
        analizador.adicionarNodo(procAND); //  Push (procAND)
        analizador.adicionarNodo(i3); //  Push (i6)
        analizador.adicionarNodo(i2); //  Push (i2)
        analizador.adicionarNodo(pRelacional);//  Push (pRelacional)
        analizador.adicionarNodo(s2);//  Push (s2)
        analizador.adicionarNodo(er);//  Push (er)
        avance();
    }
    
    public static void proceso7(){
        // <EL2_L>i1,s1 --> e -- s1<-i1
        NoTerminal nt1,nt2,nt3;
        int u = analizador.ultimo();  // el2l 
        nt1=analizador.getnode(u-1);  // i1
        nt2=analizador.getnode(u-2);  // s1
        nt3=analizador.getnode(nt2.getDirec());
        nt3.setValor(nt1.getValor());
        nt3.setValorLogico(nt1.getValorLogico());
        nt3.setRelacional(nt1.getRelacional());
        analizador.removeNodo(u);  // Pop  (el2l)
        analizador.removeNodo(u-1);//pop i1
        analizador.removeNodo(u-2);//pop s1
    }

    
    public static void proceso8(){
        //<er>s1-><e>s2<erl>i1,s3 s1<-s3    i1<-s2
        NoTerminal nt;       
        int u = analizador.ultimo();//er
        nt=analizador.getnode(u-1);//s1
        
        NoTerminal s3 = new NoTerminal("s3",nt.getDirec(),0); //u-1
        NoTerminal i1 = new NoTerminal("i1",0,0); //u
        NoTerminal erl = new NoTerminal("erl",0,0); //u+1
        NoTerminal s2 = new NoTerminal("s2",u,0); //u+2
        NoTerminal e = new NoTerminal("e",0,0); //u+3
        analizador.removeNodo(u);
        analizador.removeNodo(u-1);
        analizador.adicionarNodo(s3); //  Push (s3)
        analizador.adicionarNodo(i1); //  Push (i1)
        analizador.adicionarNodo(erl); //  Push (erl)
        analizador.adicionarNodo(s2); //  Push (s2)
        analizador.adicionarNodo(e); //  Push (e)
        
        
    }
    
    public static void proceso9(){
        //9.	<ER_L> i1,s1-> <OR> s2 <E > s3{pComparar} i2,i3,i4,s4 i2<- i1    i3<- s3    i4<-s2 s1<-s4
        NoTerminal nt,nt1 ;
        int u = analizador.ultimo(); //erl
        nt = analizador.getnode(u-1);//i1
        nt1 = analizador.getnode(u-2);//s1
        
        NoTerminal s4 = new NoTerminal("s4",nt1.getDirec(),0);//u-2
        NoTerminal i4 = new NoTerminal("i4",0,0);//u-1
        NoTerminal i3 = new NoTerminal("i3",0,0);//u
        NoTerminal i2 = new NoTerminal("i2",0,nt.getValor());//u+1
        NoTerminal pComparar = new NoTerminal("pComparar",0,0);//u+2
        NoTerminal s3 = new NoTerminal("s3",u,0);//u+3
        NoTerminal e = new NoTerminal("e",0,0);//u+4
        NoTerminal s2 = new NoTerminal("s2",u-1,0);
        NoTerminal or = new NoTerminal("or",0,0);
        
        analizador.removeNodo(u);   // Pop  (erl)
        analizador.removeNodo(u-1);   // Pop  (i1)
        analizador.removeNodo(u-2); // Pop (s1)
        analizador.adicionarNodo(s4); //  Push (s4 )
        analizador.adicionarNodo(i4);   //  Push (i4)
        analizador.adicionarNodo(i3);   //  Push (i3)
        analizador.adicionarNodo(i2); //  Push (i2 )
        analizador.adicionarNodo(pComparar);   //  Push (pComparar)
        analizador.adicionarNodo(s3);   //  Push (s3)
        analizador.adicionarNodo(e); //  Push ( e )
        analizador.adicionarNodo(s2);   //  Push (s2)
        analizador.adicionarNodo(or);   //  Push (or)
        
    }
    
    public static void proceso10(){
        // <ER_L>i1,s1 --> e -- s1<-i1
        NoTerminal nt1,nt2,nt3;
        int u = analizador.ultimo();  // erl
        nt1=analizador.getnode(u-1);  // i1
        nt2=analizador.getnode(u-2);  // s1
        nt3=analizador.getnode(nt2.getDirec());
        nt3.setValor(nt1.getValor());
        nt3.setValorLogico(nt1.getValorLogico());
        nt3.setRelacional(nt1.getRelacional());
        analizador.removeNodo(u);  // Pop  (erl)
        analizador.removeNodo(u-1);// Pop  i1
        analizador.removeNodo(u-2);// Pop  s1
    }
    
    public static void proceso11(){
        //<OR>s1->< <ME>s2 s1<-s2
       NoTerminal nt ;
        int u = analizador.ultimo(); //or
        nt = analizador.getnode(u-1);//s1
        NoTerminal s2 = new NoTerminal("s2",nt.getDirec(),0);//u-1
        NoTerminal me = new NoTerminal("me",0,0);//u
        analizador.removeNodo(u);//pop or
        analizador.removeNodo(u-1);//pop s1
        analizador.adicionarNodo(s2);//push (s2)
        analizador.adicionarNodo(me);//push (me)
        avance();

    }
    
    public static void proceso12(){
        // <ME>s1 -->  = -- s1<-2
        NoTerminal nt1,nt2;
        int u = analizador.ultimo();  // ME
        nt1=analizador.getnode(u-1);  // s1
        nt2=analizador.getnode(nt1.getDirec());
        nt2.setValor(2);
        analizador.removeNodo(u);  // Pop  (ME)
        analizador.removeNodo(u-1);// Pop  (s1)
        avance();
    }
    public static void proceso13(){
        NoTerminal nt1,nt2;
        int u = analizador.ultimo();  // ME
        nt1=analizador.getnode(u-1);  // s1
        nt2=analizador.getnode(nt1.getDirec());
        nt2.setValor(1);
        analizador.removeNodo(u);  // Pop  (ME)
        analizador.removeNodo(u-1);//Pop s1
    }
    
    public static void proceso14(){
        //<OR>s1-> > <MA>s2 s1<-s2
       NoTerminal nt ;
        int u = analizador.ultimo(); //or
        nt = analizador.getnode(u-1);//s1
        NoTerminal s2 = new NoTerminal("s2",nt.getDirec(),0);//u-1
        NoTerminal ma = new NoTerminal("ma",0,0);//u
        analizador.removeNodo(u);
        analizador.removeNodo(u-1);
        analizador.adicionarNodo(s2);
        analizador.adicionarNodo(ma);
        avance();

    }
    public static void proceso15(){
        NoTerminal nt1,nt2;
        int u = analizador.ultimo();  // MA
        nt1=analizador.getnode(u-1);  // s1
        nt2=analizador.getnode(nt1.getDirec());
        nt2.setValor(4);
        analizador.removeNodo(u);  // Pop  (el)
        analizador.removeNodo(u-1);
        avance();
    }
    public static void proceso16(){
        NoTerminal nt1,nt2;
        int u = analizador.ultimo();  // ME
        nt1=analizador.getnode(u-1);  // s1
        nt2=analizador.getnode(nt1.getDirec());
        nt2.setValor(3);
        analizador.removeNodo(u);  // Pop  (el)
        analizador.removeNodo(u-1);
    }
    
    public static void proceso17(){
        //<OR>s1->=<ig>s2 s1<-s2
       NoTerminal nt ;
        int u = analizador.ultimo(); //or
        nt = analizador.getnode(u-1);//s1
        NoTerminal s2 = new NoTerminal("s2",nt.getDirec(),0);//u-1
        NoTerminal ig = new NoTerminal("ig",0,0);//u
        analizador.removeNodo(u);
        analizador.removeNodo(u-1);
        analizador.adicionarNodo(s2);
        analizador.adicionarNodo(ig);
        avance();

    }
    public static void proceso18(){
        NoTerminal nt1,nt2;
        int u = analizador.ultimo();  // ig
        nt1=analizador.getnode(u-1);  // s1
        nt2=analizador.getnode(nt1.getDirec());
        nt2.setValor(5);
        analizador.removeNodo(u);  // Pop  (el)
        analizador.removeNodo(u-1);
        avance();
    }
    
    public static void proceso19(){
        //<OR>s1->! <DI>s2 s1<-s2
       NoTerminal nt ;
        int u = analizador.ultimo(); //or
        nt = analizador.getnode(u-1);//s1
        NoTerminal s2 = new NoTerminal("s2",nt.getDirec(),0);//u-1
        NoTerminal di = new NoTerminal("di",0,0);//u
        analizador.removeNodo(u);
        analizador.removeNodo(u-1);
        analizador.adicionarNodo(s2);
        analizador.adicionarNodo(di);
        avance();

    }
    public static void proceso20(){
        NoTerminal nt1,nt2;
        int u = analizador.ultimo();  // di
        nt1=analizador.getnode(u-1);  // s1
        nt2=analizador.getnode(nt1.getDirec());
        nt2.setValor(6);
        analizador.removeNodo(u);  // Pop  (el)
        analizador.removeNodo(u-1);
        avance();
    }
    public static void proceso21(){
        //2. <E> --> <T><E_L>    i1<-s2  s1<-s3
        NoTerminal nt1;
               
        int u = analizador.ultimo();
        nt1=analizador.getnode(u-1);
        
        NoTerminal s3 = new NoTerminal("s3",nt1.getDirec(),0);  //u-1
        NoTerminal i1 = new NoTerminal("i1",0,0);               //u
        NoTerminal el = new NoTerminal("el",0,0);               //u+1
        NoTerminal s2 = new NoTerminal("s2",u,0);               //u+2
        NoTerminal t = new NoTerminal("t",0,0);                 //u+3
        
        analizador.removeNodo(u);   // Pop (<E>)
        analizador.removeNodo(u-1);   // Pop (s1)
        
        analizador.adicionarNodo(s3); // Push(s3)
        analizador.adicionarNodo(i1);  // Push(i1)
        analizador.adicionarNodo(el); // Push(<E_L>)
        analizador.adicionarNodo(s2);  // Push(s2)
        analizador.adicionarNodo(t); // Push(<T>)
        
    }
    
    
    public static void proceso22(){
        // 3. <E_L> --> +<T>{suma}<E_L>   
        NoTerminal nt1,nt2;
        int u = analizador.ultimo();
        nt1 = analizador.getnode(u-1);
        nt2 = analizador.getnode(u-2);
        NoTerminal s4 = new NoTerminal("s4",nt2.getDirec(),0);  //u-2
        NoTerminal i4 = new NoTerminal("i4",0,0);               //u-1
        NoTerminal el = new NoTerminal("el",0,0);               //u
        NoTerminal s3 = new NoTerminal("s3",u-1,0);             //u+1
        NoTerminal i3 = new NoTerminal("i3",0,0);               //u+2
        NoTerminal i2 = new NoTerminal("i2",0,nt1.getValor());  //u+3
        NoTerminal suma = new NoTerminal("suma",0,0);             //u+4
        NoTerminal s2 = new NoTerminal("s2",u+2,0);             //u+5
        NoTerminal t = new NoTerminal("t",0,0);                 //u+5
        
        analizador.removeNodo(u);   // Pop  (e_l)
        analizador.removeNodo(u-1);   // Pop  (i1)
        analizador.removeNodo(u-2);   // Pop  (s1)
        analizador.adicionarNodo(s4); //  Push (s4)
        analizador.adicionarNodo(i4);  // Push(i4)
        analizador.adicionarNodo(el); //  Push (el)
        analizador.adicionarNodo(s3); //  Push (s3)
        analizador.adicionarNodo(i3); //  Push (i3)
        analizador.adicionarNodo(i2); //  Push (i2)
        analizador.adicionarNodo(suma); //  Push (sum)
        analizador.adicionarNodo(s2); //  Push (s2)
        analizador.adicionarNodo(t); //  Push (t)
        avance();
    }
    
    public static void proceso23(){
        // 3. <E_L> --> +<T>{resta}<E_L>   
        NoTerminal nt1,nt2;
        int u = analizador.ultimo();
        nt1 = analizador.getnode(u-1);
        nt2 = analizador.getnode(u-2);
        NoTerminal s4 = new NoTerminal("s4",nt2.getDirec(),0);  //u-2
        NoTerminal i4 = new NoTerminal("i4",0,0);               //u-1
        NoTerminal el = new NoTerminal("el",0,0);               //u
        NoTerminal s3 = new NoTerminal("s3",u-1,0);             //u+1
        NoTerminal i3 = new NoTerminal("i3",0,0);               //u+2
        NoTerminal i2 = new NoTerminal("i2",0,nt1.getValor());  //u+3
        NoTerminal resta = new NoTerminal("resta",0,0);             //u+4
        NoTerminal s2 = new NoTerminal("s2",u+2,0);             //u+5
        NoTerminal t = new NoTerminal("t",0,0);                 //u+5
        
        analizador.removeNodo(u);   // Pop  (e_l)
        analizador.removeNodo(u-1);   // Pop  (i1)
        analizador.removeNodo(u-2);   // Pop  (s1)
        analizador.adicionarNodo(s4); //  Push (s4)
        analizador.adicionarNodo(i4);  // Push(i4)
        analizador.adicionarNodo(el); //  Push (el)
        analizador.adicionarNodo(s3); //  Push (s3)
        analizador.adicionarNodo(i3); //  Push (i3)
        analizador.adicionarNodo(i2); //  Push (i2)
        analizador.adicionarNodo(resta); //  Push (resta)
        analizador.adicionarNodo(s2); //  Push (s2)
        analizador.adicionarNodo(t); //  Push (t)
        avance();
    }
    
    
    public static void proceso24(){
        // 5. <E-L> --> e
        NoTerminal nt1,nt2,nt3;
        int u = analizador.ultimo();  // el 
        nt1=analizador.getnode(u-1);  // i1
        nt2=analizador.getnode(u-2);  // s1
        nt3=analizador.getnode(nt2.getDirec());
        nt3.setValor(nt1.getValor());
        nt3.setValorLogico(nt1.getValorLogico());
        nt3.setRelacional(nt1.getRelacional());
        analizador.removeNodo(u);  // Pop  (el)
        analizador.removeNodo(u-1);
        analizador.removeNodo(u-2);
    }
    
    public static void proceso25(){
        //2. <T> --> <F><T_L>    i1<-s2  s1<-s3
        NoTerminal nt1;
               
        int u = analizador.ultimo();
        nt1=analizador.getnode(u-1);
        
        NoTerminal s3 = new NoTerminal("s3",nt1.getDirec(),0);  //u-1
        NoTerminal i1 = new NoTerminal("i1",0,0);               //u
        NoTerminal tl = new NoTerminal("tl",0,0);               //u+1
        NoTerminal s2 = new NoTerminal("s2",u,0);               //u+2
        NoTerminal f = new NoTerminal("f",0,0);                 //u+3
        
        analizador.removeNodo(u);   // Pop (<E>)
        analizador.removeNodo(u-1);   // Pop (s1)
        
        analizador.adicionarNodo(s3); // Push(s3)
        analizador.adicionarNodo(i1);  // Push(i1)
        analizador.adicionarNodo(tl); // Push(<E_L>)
        analizador.adicionarNodo(s2);  // Push(s2)
        analizador.adicionarNodo(f); // Push(<T>)
        
    }
    public static void proceso26(){
        // 4. <T_L> --> *<F>{mul}<T_L>   
        NoTerminal nt1,nt2;
               
        int u = analizador.ultimo();
        nt1 = analizador.getnode(u-1);
        nt2 = analizador.getnode(u-2);
        NoTerminal s4 = new NoTerminal("s4",nt2.getDirec(),0); //u-2
        NoTerminal i4 = new NoTerminal("i4",0,0); //u-1
        NoTerminal tl = new NoTerminal("tl",0,0); //u
        NoTerminal s3 = new NoTerminal("s3",u-1,0); //u+1
        NoTerminal i3 = new NoTerminal("i3",0,0); //u+2
        NoTerminal i2 = new NoTerminal("i2",0,nt1.getValor()); //u+3
        NoTerminal mul = new NoTerminal("mul",0,0); //u+4
        NoTerminal s2 = new NoTerminal("s2",u+2,0); //u+5
        NoTerminal f = new NoTerminal("f",0,0); //u+5
        analizador.removeNodo(u);   // Pop  (e_l)
        analizador.removeNodo(u-1);   // Pop  (i1)
        analizador.removeNodo(u-2);   // Pop  (s1)
        analizador.adicionarNodo(s4); //  Push (s4)
        analizador.adicionarNodo(i4);  // Push(i4)
        analizador.adicionarNodo(tl); //  Push (el)
        analizador.adicionarNodo(s3); //  Push (s3)
        analizador.adicionarNodo(i3); //  Push (i3)
        analizador.adicionarNodo(i2); //  Push (i2)
        analizador.adicionarNodo(mul); //  Push (res)
        analizador.adicionarNodo(s2); //  Push (s2)
        analizador.adicionarNodo(f); //  Push (t)
        avance();
    }
    public static void proceso27(){
        // 4. <T_L> --> /<F>{mul}<T_L>   
        NoTerminal nt1,nt2;
               
        int u = analizador.ultimo();
        nt1 = analizador.getnode(u-1);
        nt2 = analizador.getnode(u-2);
        NoTerminal s4 = new NoTerminal("s4",nt2.getDirec(),0); //u-2
        NoTerminal i4 = new NoTerminal("i4",0,0); //u-1
        NoTerminal tl = new NoTerminal("tl",0,0); //u
        NoTerminal s3 = new NoTerminal("s3",u-1,0); //u+1
        NoTerminal i3 = new NoTerminal("i3",0,0); //u+2
        NoTerminal i2 = new NoTerminal("i2",0,nt1.getValor()); //u+3
        NoTerminal div = new NoTerminal("div",0,0); //u+4
        NoTerminal s2 = new NoTerminal("s2",u+2,0); //u+5
        NoTerminal f = new NoTerminal("f",0,0); //u+5
        analizador.removeNodo(u);   // Pop  (tl)
        analizador.removeNodo(u-1);   // Pop  (i1)
        analizador.removeNodo(u-2);   // Pop  (s1)
        analizador.adicionarNodo(s4); //  Push (s4)
        analizador.adicionarNodo(i4);  // Push(i4)
        analizador.adicionarNodo(tl); //  Push (tl)
        analizador.adicionarNodo(s3); //  Push (s3)
        analizador.adicionarNodo(i3); //  Push (i3)
        analizador.adicionarNodo(i2); //  Push (i2)
        analizador.adicionarNodo(div); //  Push (div)
        analizador.adicionarNodo(s2); //  Push (s2)
        analizador.adicionarNodo(f); //  Push (f)
        avance();
    }
    
    public static void proceso28(){
        // 7. <T-L> --> e
        NoTerminal nt1,nt2,nt3;
        int u = analizador.ultimo();  // tl 
        nt1=analizador.getnode(u-1);  // i1
        nt2=analizador.getnode(u-2);  // s1
        nt3=analizador.getnode(nt2.getDirec());
        nt3.setValor(nt1.getValor());
        nt3.setValorLogico(nt1.getValorLogico());
        nt3.setRelacional(nt1.getRelacional());
        analizador.removeNodo(u);  // Pop  (tl)
        analizador.removeNodo(u-1);// pop i1
        analizador.removeNodo(u-2);// pop s1
    }
    public static void proceso29(){
        //2. <F> --> <P><F_L>    i1<-s2  s1<-s3
        NoTerminal nt1;
               
        int u = analizador.ultimo();
        nt1=analizador.getnode(u-1);
        
        NoTerminal s3 = new NoTerminal("s3",nt1.getDirec(),0);  //u-1
        NoTerminal i1 = new NoTerminal("i1",0,0);               //u
        NoTerminal fl = new NoTerminal("fl",0,0);               //u+1
        NoTerminal s2 = new NoTerminal("s2",u,0);               //u+2
        NoTerminal p = new NoTerminal("p",0,0);                 //u+3
        
        analizador.removeNodo(u);   // Pop (<F>)
        analizador.removeNodo(u-1);   // Pop (s1)
        
        analizador.adicionarNodo(s3); // Push(s3)
        analizador.adicionarNodo(i1);  // Push(i1)
        analizador.adicionarNodo(fl); // Push(<F_L>)
        analizador.adicionarNodo(s2);  // Push(s2)
        analizador.adicionarNodo(p); // Push(<P>)
        
    }
    public static void proceso30(){
        // 4. <fl> --> ^<p>{exp}<f_L>   
        NoTerminal nt1,nt2;
               
        int u = analizador.ultimo();
        nt1 = analizador.getnode(u-1);
        nt2 = analizador.getnode(u-2);
        NoTerminal s4 = new NoTerminal("s4",nt2.getDirec(),0); //u-2
        NoTerminal i4 = new NoTerminal("i4",0,0); //u-1
        NoTerminal fl = new NoTerminal("fl",0,0); //u
        NoTerminal s3 = new NoTerminal("s3",u-1,0); //u+1
        NoTerminal i3 = new NoTerminal("i3",0,0); //u+2
        NoTerminal i2 = new NoTerminal("i2",0,nt1.getValor()); //u+3
        NoTerminal exp = new NoTerminal("exp",0,0); //u+4
        NoTerminal s2 = new NoTerminal("s2",u+2,0); //u+5
        NoTerminal p = new NoTerminal("p",0,0); //u+5
        analizador.removeNodo(u);   // Pop  (F_l)
        analizador.removeNodo(u-1);   // Pop  (i1)
        analizador.removeNodo(u-2);   // Pop  (s1)
        analizador.adicionarNodo(s4); //  Push (s4)
        analizador.adicionarNodo(i4);  // Push(i4)
        analizador.adicionarNodo(fl); //  Push (fl)
        analizador.adicionarNodo(s3); //  Push (s3)
        analizador.adicionarNodo(i3); //  Push (i3)
        analizador.adicionarNodo(i2); //  Push (i2)
        analizador.adicionarNodo(exp); //  Push (exp)
        analizador.adicionarNodo(s2); //  Push (s2)
        analizador.adicionarNodo(p); //  Push (p)
        avance();
    }
    
    public static void proceso31(){
        // 7. <fl> --> e
        NoTerminal nt1,nt2,nt3;
        int u = analizador.ultimo();  // fl 
        nt1=analizador.getnode(u-1);  // i1
        nt2=analizador.getnode(u-2);  // s1
        nt3=analizador.getnode(nt2.getDirec());
        nt3.setValor(nt1.getValor());
        nt3.setValorLogico(nt1.getValorLogico());
        nt3.setRelacional(nt1.getRelacional());
        analizador.removeNodo(u);  // Pop  (fl)
        analizador.removeNodo(u-1);//pop i1
        analizador.removeNodo(u-2);// pop s1
    }
    public static void proceso32(){
        // 7. <p> --> (<ELO>)
        NoTerminal nt ;
        int u = analizador.ultimo();
        avance();
        nt = analizador.getnode(u-1);
        
        NoTerminal pd = new NoTerminal(")",0,0);
        NoTerminal s2 = new NoTerminal("s2",nt.getDirec(),0);
        NoTerminal elo = new NoTerminal("elo",0,0);
        
        analizador.removeNodo(u);   // Pop  (<T>)
        analizador.removeNodo(u-1);   // Pop  (s1)
        analizador.adicionarNodo(pd); //  Push ( ) )
        analizador.adicionarNodo(s2);   //  Push (s2)
        analizador.adicionarNodo(elo);   //  Push (s2)
        
    }
    public static void proceso33(){
        // 3. <P> --> i 
        Elemento ele;
        NoTerminal nt,nt1;       
        int u = analizador.ultimo();
        ele=lex1.darElemento(indice);
        nt=analizador.getnode(u-1);
        nt1=analizador.getnode(nt.getDirec());
        nt1.setValor(ele.darValor());
        avance();
        analizador.removeNodo(u);
        analizador.removeNodo(u-1);
    }
    
    public static void procesoParentesis(){
        // parentesis derecho con paréntesis derecho
        int u = analizador.ultimo();
        avance();
        analizador.removeNodo(u);    //   Pop   ( ) )
     //   analizador.mostrarCadenaPila();
    }

    
   
    public static void suma(){
    
        NoTerminal nt1,nt2,nt3,nt4;
        int u = analizador.ultimo();
        nt1=analizador.getnode(u-1);//i1
        nt2=analizador.getnode(u-2);//i2
        nt3=analizador.getnode(u-3);
        nt4=analizador.getnode(nt3.getDirec());        
        nt4.setValor(nt1.getValor()+nt2.getValor());
        //desapilar suma y sus atributos
        analizador.removeNodo(u);
        analizador.removeNodo(u-1);
        analizador.removeNodo(u-2);
        analizador.removeNodo(u-3);
        
    }
    public static void resta(){
    
        NoTerminal nt1,nt2,nt3,nt4;
        int u = analizador.ultimo();
        nt1=analizador.getnode(u-1);
        nt2=analizador.getnode(u-2);
        nt3=analizador.getnode(u-3);
        nt4=analizador.getnode(nt3.getDirec());
        nt4.setValor(nt1.getValor()-nt2.getValor());
        //desapilar resta y sus atributos
        analizador.removeNodo(u);
        analizador.removeNodo(u-1);
        analizador.removeNodo(u-2);
        analizador.removeNodo(u-3);
        
    }
    public static void mul(){
        
        NoTerminal nt1,nt2,nt3,nt4;
        int u = analizador.ultimo();
        nt1=analizador.getnode(u-1);
        nt2=analizador.getnode(u-2);
        nt3=analizador.getnode(u-3);
        nt4=analizador.getnode(nt3.getDirec());
        nt4.setValor(nt1.getValor()*nt2.getValor());
        //desapilar mul y sus atributos
        analizador.removeNodo(u);
        analizador.removeNodo(u-1);
        analizador.removeNodo(u-2);
        analizador.removeNodo(u-3);
        
    }
    public static void div(){
        
        NoTerminal nt1,nt2,nt3,nt4;
        int u = analizador.ultimo();
        nt1=analizador.getnode(u-1);
        nt2=analizador.getnode(u-2);
        nt3=analizador.getnode(u-3);
        nt4=analizador.getnode(nt3.getDirec());
        nt4.setValor(nt1.getValor()/nt2.getValor());
        //desapilar div y sus atributos
        analizador.removeNodo(u);
        analizador.removeNodo(u-1);
        analizador.removeNodo(u-2);
        analizador.removeNodo(u-3);
        
    }
    public static void exp(){
        
        NoTerminal nt1,nt2,nt3,nt4;
        int u = analizador.ultimo();
        nt1=analizador.getnode(u-1);
        nt2=analizador.getnode(u-2);
        nt3=analizador.getnode(u-3);
        nt4=analizador.getnode(nt3.getDirec());
        double exp=nt1.getValor();
        for(int i =1;i<nt2.getValor();i++)
            exp=exp*nt1.getValor();
       
        nt4.setValor(exp);
        //desapilar suma y sus atributos
        analizador.removeNodo(u);
        analizador.removeNodo(u-1);
        analizador.removeNodo(u-2);
        analizador.removeNodo(u-3);
        
    }
    public static void procOR()
    {
        NoTerminal nt1,nt2,nt3,nt4;
        int u = analizador.ultimo();
        nt1=analizador.getnode(u-1);
        nt2=analizador.getnode(u-2);
        nt3=analizador.getnode(u-3);
        nt4=analizador.getnode(nt3.getDirec());
        
        nt4.setValorLogico(nt1.getValorLogico()||nt2.getValorLogico());
        nt4.setRelacional(nt2.getRelacional());
        analizador.removeNodo(u);
        analizador.removeNodo(u-1);
        analizador.removeNodo(u-2);
        analizador.removeNodo(u-3);
        
    }
    public static void procAND()
    {
        NoTerminal nt1,nt2,nt3,nt4;
        int u = analizador.ultimo();
        nt1=analizador.getnode(u-1);
        nt2=analizador.getnode(u-2);
        nt3=analizador.getnode(u-3);
        nt4=analizador.getnode(nt3.getDirec());
        nt4.setValorLogico(nt1.getValorLogico()&&nt2.getValorLogico());
        nt4.setRelacional(nt2.getRelacional());
        analizador.removeNodo(u);
        analizador.removeNodo(u-1);
        analizador.removeNodo(u-2);
        analizador.removeNodo(u-3);
        
    }
    private static void pRelacional()
    {
        NoTerminal nt1,nt2,nt3;
        int u = analizador.ultimo();
        nt1=analizador.getnode(u-1);//i1
        nt2=analizador.getnode(u-2);//i2
        nt3=analizador.getnode(nt2.getDirec());
        if (nt1.getRelacional() && nt3.getRelacional()) {
            analizador.removeNodo(u);
            analizador.removeNodo(u-1);
            analizador.removeNodo(u-2);
            return;
        } else {
            throw new IllegalArgumentException("operadores relacionales invalidos");
        }
        
        
    }
    public static void pComparar()
    {
        NoTerminal nt1,nt2,nt3,nt4,nt5;
        int u = analizador.ultimo(); //2>1
        nt1=analizador.getnode(u-1);//i1  //2
        nt2=analizador.getnode(u-2);//i2 //1
        nt3=analizador.getnode(u-3);//op //3
        nt4=analizador.getnode(u-4);//nt  // resultado
        nt5=analizador.getnode(nt4.getDirec());
        switch((int)nt3.getValor())
        {
            case 1:
                nt5.setValorLogico(nt1.getValor()<nt2.getValor());
                break;
            case 2:
                nt5.setValorLogico(nt1.getValor()<=nt2.getValor());
                break;
            case 3:
                nt5.setValorLogico(nt1.getValor()>nt2.getValor());
                break;
            case 4:
                nt5.setValorLogico(nt1.getValor()>=nt2.getValor());
                break;
            case 5:
                nt5.setValorLogico(nt1.getValor()==nt2.getValor());
                break;
            case 6:
                nt5.setValorLogico(nt1.getValor()!=nt2.getValor());
                break;
            default:
                rechace();
                
        }
        nt5.setRelacional(true); //true
        analizador.removeNodo(u);
        analizador.removeNodo(u-1);
        analizador.removeNodo(u-2);
        analizador.removeNodo(u-3);
        analizador.removeNodo(u-4);
    }
    public static void resultado(){
        NoTerminal nt;
        int u=analizador.ultimo();
        nt=analizador.getnode(u-1);
        System.out.println("Resultado matematico="+nt.getValor());
        System.out.println("Resultado boolean="+nt.getValorLogico());
        analizador.removeNodo(u);
        analizador.removeNodo(u-1);
    }

    public static void analisisLexico(){
        // Este analizador es sencillo determina solo constantes enteras y reales positivas
        // Trabaja los diferentes elementos en un ArrayList que trabaja con la clase Clexico
        // la cual define el ArrayList con la clase CElemento
        // Almacen los valores para poder hallar los resultados
        
        Elemento ele1; 
        
        int i=0;
        int ind=0;
        char tip=0;
        char sim1=cad.charAt(i);
        double val=0;
        
        while (sim1!='¬'){
            // determina si sim1 esta en la cadena de digitos cad1 que es global
            if (cad1.indexOf(sim1)!=-1){
                String num="";
                while(cad1.indexOf(sim1)!=-1){
                    num=num+sim1;
                    i++;
                    sim1=cad.charAt(i);
        
                }
                // en el String num se almacena el entero y se lo almacena en val como doble
                // DeterminarNumero(num);
                if (determinarNumero(num)){
                    val=Double.parseDouble(num);
                    tip='i';
                
                    // se tipifica el valor como i
                }
                else{
                    System.out.println("Se rechaza la secuencia");
                    System.exit(0);
                }
        
            }
            else {
               // si el simbolo de entrada no esta en cad1 lo tipifica como tal ej
               // +,-,* (,) etc.
                
               tip=(char)sim1;
               i++;
               sim1=cad.charAt(i);
              
               val=0;
              
            }
        
            // con los elementos establecidos anteriormente se crea el elemento y se lo
            // adicina a lex1 que es el objeto de la clase Clexico
            
            ele1=new Elemento(tip,val,ind);
            lex1.adicionarElemento(ele1);
            
            ind=ind+1;
            //System.out.print("indice ="+ind);
               
        }
        ele1=new Elemento('¬',0,ind);
        lex1.adicionarElemento(ele1);
        lex1.mostrarLexico();
        System.out.println(" cadena"+lex1.cadenaLexico());
    }
    
    public static boolean determinarNumero(String numero){
     // Este método recibe un número en string y determina mediante un autómata finito
     // si está o no correcto. El string es una cadena de dígitos y el punto.
     // Retorna un valor booleano.
     
        int estado=1,i=0;
        char simbolo;
        boolean b=true;
        while (i<numero.length()&&b) {
            simbolo = numero.charAt(i);
            switch (simbolo) {
                case '0':case '1':case '2':case '3':case '4':case '5':case '6':  
                case '7':case '8':case '9':    
                    switch (estado) {
                        case 1:
                           estado=2;
                           i++;
        
                           break;
                        case 2:
                           estado=2;
                           i++;
        
                           break;
                        case 3:
                           estado=4;
                           i++;
        
                           break;
                        case 4:
                            estado=4;
                           i++;
        
                           break;
                    
                    }
                    break;
                case '.':    
                    switch (estado) {
                        case 1:case 3: case 4:
                           b=false;
                           break;
                        case 2:
                           estado=3;
                           i++;
        
                           break;
                        
                    
                    }
                    break;
                default: b=false;
            }
        
    }
        return b;
    }
    
    
    public static void resultado(boolean res){
        System.out.println("Resultado "+res);
    }
    public static void avance(){
        indice++;
        if (indice<cad.length()) {
        sim=lex1.darElemento(indice).darTipo();
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
}
