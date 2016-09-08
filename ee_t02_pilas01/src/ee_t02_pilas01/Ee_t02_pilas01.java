/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee_t02_pilas01;

/**
 *
 * @author JUAN ANTONIO JUAREZ OLIVERA
 */
  public class Ee_t02_pilas01
{
    private int max;
    private int tope;
    private char obj[];
    public Ee_t02_pilas01(int max){
     this.max=max;
     tope=-1;
     obj=new char [max];
    }
    public boolean llena(){
     return tope==max-1;
    }
    public boolean vacio(){
     return tope==-1;
    }
    public void push(char c){
        if(!llena()){
         tope++;
         obj[tope]=c;
        }else{
         System.out.println("No se puede y ocasiona un desbordamiento");
        }
    }
     public char pop(){
     char c=' ';
     if(!vacio()){
        c=obj[tope];
        tope--;
        return c;
        }else{
         System.out.println("No se puede y ocasiona un subdesbordamiento");
        }
     return c;
    }
    public char peek(){
     char n=' ';
     if(!vacio()){
        n=obj[tope];
       return n;
        }else{
        System.out.println("Esta pila esta  vacia");
        }
     return n;
    }
    public void comparachar(String cadena){
      int i=0;
        while(i<cadena.length()){
         if(cadena.charAt(i)=='('){
            push('(');
            }else if(cadena.charAt(i)==')' && peek()=='('){
             if(!vacio()){
                pop();
                }else{
                 push(')');
                 break;
                }
            }
          if(cadena.charAt(i)=='{'){
              push('{');
            }
             else if(cadena.charAt(i)=='}' && peek()=='{'){
             if(!vacio()){
                pop();
                }else{
                 push('}');
                 break;
                }
            }
          if(cadena.charAt(i)=='['){
            push('[');
            }
            else if(cadena.charAt(i)==']' && peek()=='['){
             if(!vacio()){
                pop();
                }else{
                 push(']');
                 break;
                }
            }
                 
            i++;
        }
        if(vacio()){
         System.out.println("Si tiene su par");
          }else{
            System.out.println("No tiene su par");
            }
    }
    
      public static void main(String [] args){
    Ee_t02_pilas01 p=new Ee_t02_pilas01(30);
   System.out.println("{[()]}"); 
   System.out.println("{[(])}");
   System.out.println("{{[[(())]]}}"); 
   
   //p.comparachar("{[()]}");
   p.comparachar("{[(])}");
   //p.comparachar("{{[[(())]]}}");
   
  }
}



