/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2arquitectura.CadenaResponsabilidad;


import com.mycompany.ejercicio2arquitectura.paquete;
import com.mycompany.ejercicio2arquitectura.productoPaquete;
import com.mycompany.ejercicio2arquitectura.transporte.*;
import com.mycompany.ejercicio2arquitectura.transporte.Logistica;
import com.mycompany.ejercicio2arquitectura.transporte.Transporte;

/**
 *
 * @author copad
 */
public class ControlTransporte extends Middlewere{
    
    String sobre="sobre",pequeño="pequeño",mediano="mediano",grande="grande";

    @Override
    public boolean check(paquete paquete, productoPaquete productoPaquete, Logistica logistica) {
        String tipoServicio=productoPaquete.getServicio().getNombreServicio();
        String tamano=productoPaquete.getTamano().getTamaño();
        float distancia=paquete.getDistancia();
        
        if(distancia<=1&&(tamano.equals(sobre)||tamano.equals(pequeño))){
            if(tipoServicio.equals("express")){
                productoPaquete.setTransporte(new Dron());
            }
            if(tipoServicio.equals("estandar")){
                productoPaquete.setTransporte(new Bicicleta());
                
            }
        }
        
        if(distancia>1&&(tamano.equals(sobre)||tamano.equals(pequeño))){
            if(tipoServicio.equals("express")){
                productoPaquete.setTransporte(new Moto());
            }
            if(tipoServicio.equals("estandar")){
                productoPaquete.setTransporte(new Bicicleta());
            }
        }
        if(distancia<5&&tamano.equals(mediano)){
            if(tipoServicio.equals("express")){
                productoPaquete.setTransporte(new Moto());
            }
            if(tipoServicio.equals("estandar")){
                productoPaquete.setTransporte(new Bicicleta());
            }
        }
        if(tamano.equals(mediano)&&distancia>=5){
            productoPaquete.setTransporte(new Moto());
        }
        if(tamano.equals(grande)){
            productoPaquete.setTransporte(new Auto());
        }
        
        return checkNext(paquete, productoPaquete, logistica);
    }
    
    /*
    public void transporte(){
        tipoServicio();
        tamano();
        if (distancia <= 1 && (t == NumTamano.sobre || t == NumTamano.pequeño)) {
            if (s == NumServicio.Express) {
                transporte = NumTransporte.DRON;
            } else if (s == NumServicio.Estandar) {
                transporte = NumTransporte.BICICLETA;
            }

        }
        if (distancia > 1 && (t == NumTamano.sobre || t == NumTamano.pequeño)) {
            if (s == NumServicio.Estandar) {
                transporte = NumTransporte.BICICLETA;
            } else if (s == NumServicio.Express) {
                transporte = NumTransporte.MOTOCICLETA;
            }

        }
        if (distancia < 5 && t == NumTamano.mediano) {
            if (s == NumServicio.Estandar) {
                transporte = NumTransporte.BICICLETA;
            }
            if (s == NumServicio.Express) {
                transporte = NumTransporte.MOTOCICLETA;
            }
        }
        if(t==NumTamano.mediano&&distancia>=5){
            transporte=NumTransporte.MOTOCICLETA;
        }
        if (t == NumTamano.grande) {
            transporte = NumTransporte.AUTO;
        }

        
    }
    */
   
    
    
}
