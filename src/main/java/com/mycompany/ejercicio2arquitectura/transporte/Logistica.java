/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2arquitectura.transporte;

import java.util.ArrayList;

/**
 *
 * @author copad
 */
public class Logistica {
    private ArrayList<Servicio> servicios=new ArrayList<>();
    
    private ArrayList<Tamano> tamanos=new ArrayList<>();
    
    public void registrarServicio(Servicio s){
        servicios.add(s);
    }
   
    public void registrarTamano(Tamano t){
        tamanos.add(t);
    }

    public Servicio buscarServicio(String nombre) {
        for (Servicio s:servicios) {
            if(s.getNombreServicio().equals(nombre))
                return s;
        }
        return null;
    }

    public Tamano buscarTamano(String tamano) {
        for (Tamano t:tamanos) {
            if(t.getTamaño().equals(tamano))
                return t;
        }
        return null;
    }
    
}
