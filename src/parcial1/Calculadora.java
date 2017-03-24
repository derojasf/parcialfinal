/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.tan;

/**
 *
 * @author Estudiantes
 */
public class Calculadora {
    double num1,num2,resultado,rads;
    
    public double sumar(){
        
        resultado=num1+num2;
        
        return resultado;
    }
    public double restar(){
        
        resultado=num1-num2;
        
        return resultado;
    }
    public double multiplicar(){
        
        resultado=num1*num2;
        
        return resultado;
    }
    public double dividir(){
        
        if(num2==0){
            resultado=0;
        }
        else{
            resultado=num1/num2;
        }
        
        
        return resultado;
    }
    public double seno(){
        
        resultado=sin(Math.toRadians(num1));
        
        return resultado;
    }
    public double coseno(){
       
        
        resultado=cos(num1);
        
        return resultado;
    }
    public double tangente(){
        
        resultado=tan(Math.toRadians(num1));
        
        return resultado;
    }
}
