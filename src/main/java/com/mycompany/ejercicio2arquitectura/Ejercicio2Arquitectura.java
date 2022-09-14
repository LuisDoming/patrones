/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio2arquitectura;

import com.mycompany.ejercicio2arquitectura.CadenaResponsabilidad.CalcularCostoTotal;
import com.mycompany.ejercicio2arquitectura.CadenaResponsabilidad.CalcularTiempo;
import com.mycompany.ejercicio2arquitectura.CadenaResponsabilidad.ControlServicio;
import com.mycompany.ejercicio2arquitectura.CadenaResponsabilidad.ControlTamano;
import com.mycompany.ejercicio2arquitectura.CadenaResponsabilidad.ControlTransporte;
import com.mycompany.ejercicio2arquitectura.CadenaResponsabilidad.Middlewere;
import com.mycompany.ejercicio2arquitectura.transporte.Logistica;
import com.mycompany.ejercicio2arquitectura.transporte.Servicio;
import com.mycompany.ejercicio2arquitectura.transporte.Tamano;
import com.mycompany.ejercicio2arquitectura.transporte.Transporte;
import java.util.ArrayList;

/**
 *
 * @author copad
 */
public class Ejercicio2Arquitectura {
    
    
    public static void main(String[] args) {
        Logistica logistica=new Logistica();
        logistica.registrarServicio(new Servicio("estandar", 30));
        logistica.registrarServicio(new Servicio("express", 50));
        
        logistica.registrarTamano(new Tamano("sobre", 5));
        logistica.registrarTamano(new Tamano("pequeño", 10));
        logistica.registrarTamano(new Tamano("mediano", 20));
        logistica.registrarTamano(new Tamano("grande",50));
        
        
        
        paquete p=new paquete("estandar","pequeño",4);
        productoPaquete productoPaquete=new productoPaquete();
        
        Middlewere middlewere=Middlewere.link(new ControlServicio(),new ControlTamano(),new ControlTransporte(), new CalcularCostoTotal(), new CalcularTiempo());
        
        middlewere.check(p, productoPaquete, logistica);
        
        
        
        
    }
}
