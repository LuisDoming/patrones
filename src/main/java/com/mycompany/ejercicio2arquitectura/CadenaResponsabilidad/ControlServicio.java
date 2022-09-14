/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2arquitectura.CadenaResponsabilidad;

import com.mycompany.ejercicio2arquitectura.NumServicio;
import com.mycompany.ejercicio2arquitectura.paquete;
import com.mycompany.ejercicio2arquitectura.productoPaquete;
import com.mycompany.ejercicio2arquitectura.transporte.Logistica;
import com.mycompany.ejercicio2arquitectura.transporte.Servicio;

/**
 *
 * @author copad
 */
public class ControlServicio extends Middlewere{
    NumServicio s=null;

    @Override
    public boolean check(paquete paquete, productoPaquete productoPaquete,Logistica logistica) {
        String servicio=paquete.getServicio();
        if(logistica==null){
            return true;
        }
        productoPaquete.setServicio(logistica.buscarServicio(servicio));
        
        return checkNext(paquete, productoPaquete,logistica);
    }

   
    
}
