
package com.criterio1.clasesPrincipales;

import com.criterio1.clasesPrincipales.screens.sistemaEcuaciones.ResultadoEcuaciones;



public class Determinantes {
    private static float matriz[][] = new float[4][4];
    private static float reset[]=new float[3];
    private float suma , suma2, det,detS, detX, detY, detZ ;
    private String datosSumaEnviar1,datosSuma2Enviar, llenado,llenado2;
    public  float ingresar(float[][] vi){
        for(int i=0;i<3 ;i++){
            for(int j=0; j<4 ;j++){
                matriz[i][j] = vi[i][j];
            }
        }
        for(int i=0;i<3 ;i++){
            for(int j=0; j<4 ;j++){
                System.out.println(matriz[i][j]);
            }
        }
        proceso();
        return matriz[0][0];
    }
    
    public  void proceso(){
        determinante();
        detS=det;
        resultadoEcuaciones.mostrarSumaPrincipal(datosSumaEnviar1,datosSuma2Enviar);
        cambioX();
        resultadoEcuaciones.mostrarSumaPrincipal(datosSumaEnviar1,datosSuma2Enviar);
        cambioY();
        resultadoEcuaciones.mostrarSumaPrincipal(datosSumaEnviar1,datosSuma2Enviar);
        cambioZ();
        resultadoEcuaciones.mostrarSumaPrincipal(datosSumaEnviar1,datosSuma2Enviar);
        resultadoEcuaciones.mostraValoresFinales(detS,detX,detY,detZ);
    }
    
    public  float determinante(){
        det=0;
        for(int i = 0; i<3; i++){
            if(i==0){
                //suma1
                suma = (matriz[i][i]*matriz[i+1][i+1]*matriz[i+2][i+2])+ suma;
                llenado= Float.toString(matriz[i][i]*matriz[i+1][i+1]*matriz[i+2][i+2]);
                datosSumaEnviar1 = "(" + llenado;
                //suma2
                suma2 = (matriz[i][i+2]*matriz[i+1][i+1]*matriz[i+2][i])+ suma2;
                llenado2 = Float.toString(matriz[i][i+2]*matriz[i+1][i+1]*matriz[i+2][i]);
                datosSuma2Enviar =  "(" +  llenado2;
            }
            if(i==1){
                //suma1
                suma = (matriz[i][0]*matriz[i+1][i]*matriz[i-1][i+1])+ suma;
                llenado= Float.toString(matriz[i][0]*matriz[i+1][i]*matriz[i-1][i+1]);
                datosSumaEnviar1 = datosSumaEnviar1 + " + " + llenado;
                //suma2
                suma2 = (matriz[i][i+1]*matriz[i+1][i]*matriz[i-1][i-1])+ suma2;
                llenado2 = Float.toString(matriz[i][i+1]*matriz[i+1][i]*matriz[i-1][i-1]);
                datosSuma2Enviar = datosSuma2Enviar + " + " + llenado2;
            }
            if(i==2){
                //suma1
                suma = (matriz[i][0]*matriz[i-2][i-1]*matriz[i-1][i])+ suma;
                llenado= Float.toString(matriz[i][0]*matriz[i-2][i-1]*matriz[i-1][i]);
                datosSumaEnviar1 = datosSumaEnviar1 + " + " + llenado +")";
                //suma2
                suma2 = (matriz[i][i]*matriz[i-2][i-1]*matriz[i-1][i-2])+ suma2;
                llenado2 = Float.toString(matriz[i][i]*matriz[i-2][i-1]*matriz[i-1][i-2]);
                datosSuma2Enviar = datosSuma2Enviar + " + " + llenado2 + ")";
            }
         }
        det = suma + (-1*suma2);
        suma =0;
        suma2=0;
        return det;
    }
   public  void cambioX(){
       for(int i =0; i<3; i++){
           reset[i] = matriz[i][0];
           matriz[i][0]=matriz[i][3];
       }
       detX =determinante();
       
       for(int i =0; i<3; i++){
           matriz[i][0] = reset[i];
       }
    }
   
   public  void cambioY(){
       for(int i =0; i<3; i++){
           reset[i] = matriz[i][1];
           if(i==0) matriz[i][i+1]=matriz[i][3];
           if(i==1)matriz[i][i]=matriz[i][3];
           if(i==2)matriz[i][i-1]=matriz[i][3];
       }
       detY =determinante();
       for(int i =0; i<3; i++){
           matriz[i][1] = reset[i];
       }
    }
   
      public void cambioZ(){
       for(int i =0; i<3; i++){
           reset[i]=matriz[i][2];
           if(i==0) matriz[i][i+2]=matriz[i][3];
           if(i==1)matriz[i][i+1]=matriz[i][3];
           if(i==2)matriz[i][i]=matriz[i][3];
       }
       detZ =determinante();
       for(int i =0; i<3; i++){
           matriz[i][2] = reset[i];
       }
    }
     
      
     ResultadoEcuaciones resultadoEcuaciones;
     
    public void setIntanceSistemaEcuaciones(ResultadoEcuaciones resultadoEcuaciones) {
        this.resultadoEcuaciones = resultadoEcuaciones;
    }
}
