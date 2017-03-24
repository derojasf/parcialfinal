/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

/**
 *
 * @author Estudiantes
 */
public class Calculadora {
    double num1,num2,resultado;
    
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
}
