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
public class ControlTamano extends Middlewere{

    @Override
    public boolean check(paquete paquete, productoPaquete productoPaquete, Logistica logistica) {
        String tamano=paquete.getTamano();
        
        productoPaquete.setTamaño(logistica.buscarTamano(tamano));
        
        
        return checkNext(paquete, productoPaquete, logistica);
    }
    
}
