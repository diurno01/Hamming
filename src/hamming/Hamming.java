/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hamming;


import java.util.ArrayList;
import java.util.Scanner;
import javax.print.DocFlavor;




public class Hamming {

      
   
    public static void main(String[] args) {
        
        StringBuilder a;        
        String cadenaIngresado;

// ingreso de datos        

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingese un num booleano de 7 bits");
        
        cadenaIngresado = teclado.nextLine();                       
        
        a = paridad(cadenaIngresado);
       
        System.out.println(a);
                     
    }  


    public static StringBuilder paridad(String r){
        
   
        
       char[] p1,p2,p3,p4,pfinal;
       String hamming;
       
       char[] aCaracteres = r.toCharArray();     
            
       
       if (esBoolean(aCaracteres)){      
           
           // Guardo en array de char los bits que comprueban
                     
            p1 = new char[]{ aCaracteres[0], aCaracteres[1] ,aCaracteres[3] , aCaracteres[4], aCaracteres[6] };
            p2 = new char[]{ aCaracteres[0], aCaracteres[2] ,aCaracteres[3] , aCaracteres[5], aCaracteres[6] };
            p3 = new char[]{ aCaracteres[1], aCaracteres[2] ,aCaracteres[3] };
            p4 = new char[]{ aCaracteres[4], aCaracteres[5] ,aCaracteres[6] };
            
           //ensamblo el codigo hamming y lo imprimo 
            
            pfinal= new char[] { esPar(cuentaUnos(p1)), esPar(cuentaUnos(p2)), aCaracteres[0], esPar(cuentaUnos(p3)),
                aCaracteres[1], aCaracteres[2], aCaracteres[3], esPar(cuentaUnos(p3)), aCaracteres[4], aCaracteres[5], aCaracteres[6] };
           
            return new StringBuilder(hamming = new String(pfinal));
           
       }else {
           
           
           return new StringBuilder("No es un num Booleano de 7 bits");
                     
       }
   
    }
    
    //verifica si es un numero booleano de 7 bits
    
    public static boolean esBoolean(char[] ingresado){
            
     boolean check = true;    
        if ( ingresado.length == 7){
            for (char x: ingresado){
            if(x != '0' && x != '1') { 
                check =  false;                                           
            }
        }       
        }else {
            check = false;
        }
        
    return check;
    }
    
    //cuenta la cantidad de unos
    
    public static int cuentaUnos(char[] q){
        int i=0;
            for (char x: q){               
               if(x == '1'){
                        i++;
               }              
           }
        return i;
    }
    
    //comprueba si es un numero par
    
    public static char esPar(int i){
        char p;
            if(i%2==0){
               return  p = '0';
           }else          
                             
                return  p = '1' ;          
    }
    
}
