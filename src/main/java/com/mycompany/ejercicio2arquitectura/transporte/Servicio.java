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
public class Servicio {
    String servicio;
    int costo;

    public Servicio(String servicio, int costo) {
        this.servicio = servicio;
        this.costo = costo;
    }
    
    
    public String getNombreServicio() {
        return servicio;
    }

    public void setNombreServicio(String servicio) {
        this.servicio = servicio;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
}
