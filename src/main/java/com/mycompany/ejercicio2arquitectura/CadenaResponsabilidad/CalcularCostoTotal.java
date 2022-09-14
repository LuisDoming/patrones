/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2arquitectura.CadenaResponsabilidad;

import com.mycompany.ejercicio2arquitectura.paquete;
import com.mycompany.ejercicio2arquitectura.productoPaquete;
import com.mycompany.ejercicio2arquitectura.transporte.Logistica;

/**
 *
 * @author copad
 */
public class CalcularCostoTotal extends Middlewere{

    @Override
    public boolean check(paquete paquete, productoPaquete productoPaquete, Logistica logistica) {
       int costoServicio=productoPaquete.getServicio().getCosto();
       int costoTamano=productoPaquete.getTamano().getCosto();
       int costoTrasporte=productoPaquete.getTransporte().getCosto();
       int costoExtra=0;
       if(costoExtra>10){
           costoExtra=((int)paquete.getDistancia()-10)*5;
       }
       
       int costoTotal=costoServicio+costoTamano+costoTrasporte+costoExtra;
       productoPaquete.setCostoTotal(costoTotal);
       
       
       
       return checkNext(paquete, productoPaquete, logistica);
    }
    
}
