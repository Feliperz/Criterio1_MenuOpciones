/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.criterio1.ejemplomenu;

import static java.lang.Math.pow;


public class TipoDeRaices {

    public String clase;
    
    public double calcularRaices(double valores[]){
        double delta = Math.pow(valores[1],2) - (4*valores[0]*valores[2]);
        if(delta>0){
            System.out.println("existen 2 raices reales diferentes");
            clase ="existen 2 raices reales diferentes, el resultado de su operacion es: " + delta;
        }else if(delta<0){
            System.out.println("existen 2 raices complejas diferentes");
           clase ="existen 2 raices complejas diferentes, el resultado de su operacion es: " + delta;
            
        }else{
            System.out.println("existen dos raices reales iguales");
            clase ="existen dos raices reales iguales, el resultado de su operacion es: " + delta;
        }
          return delta;  
    }
}
