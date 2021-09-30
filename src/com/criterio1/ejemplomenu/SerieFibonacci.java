/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.criterio1.ejemplomenu;

public class SerieFibonacci {

    private long limite = 0, suma, valor_uno = 0, valor_dos = 1;
    private static long  container[] = new long[1000000];
    public String general = " 0", concatenar;
    public boolean dataIsCorrect;
    private int n = 0;
    public void SerieFibonacci(double i) {
        if(i==0){
            suma=0; valor_uno = 0; valor_dos = 1; n=0;
        }
        if (i < limite) {
            if (i < limite - 1) {
                container[n] = valor_uno;
                System.out.print(valor_uno + ",");
                suma = valor_uno + valor_dos;
                valor_uno = valor_dos;
                container[n] = valor_uno;
                valor_dos = suma;
            } else {
                System.out.print(valor_uno);
            }
            n++;
            SerieFibonacci(i + 1);
        }
        if(i==limite){
            convertToString();
            System.out.println(general);
        }
    }
    //Metodo Getter

    public double getLimite() {
        return limite;
    }

    public void convertToString() {
        general =" 0";
        int cont = 1;
        for (int c = 0; c < n-1; c++) {
            concatenar = String.valueOf(container[c]);
            general = general + ", " + concatenar;
            if(c==25*cont){
                general = general+"\n";
                cont++;
            } 
        }
    }
    //Metodo Setter
    public void setLimite(int limete) {
        this.limite = limete;
    }

}
