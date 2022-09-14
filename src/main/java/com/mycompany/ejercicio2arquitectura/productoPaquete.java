/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2arquitectura;

import com.mycompany.ejercicio2arquitectura.transporte.*;

/**
 *
 * @author copad
 */
public class productoPaquete {
    private Tamano t;
    private Servicio s;
    private Transporte transporte;
    private int costoTotal;
    private float tiempoEspera;
    
    
    productoPaquete(){
        
    }
    productoPaquete(Tamano t,Servicio s,Transporte transporte){
        this.t=t;
        this.s=s;
        this.transporte=transporte;
    }

    public void setTamaño(Tamano t) {
        this.t = t;
    }

    public void setServicio(Servicio s) {
        this.s = s;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public Tamano getTamano() {
        return t;
    }

    public Servicio getServicio() {
        return s;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    public float getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(float tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }
    
    

    public void imprimirProducto(){
        System.out.println("Servicio "+s.getNombreServicio()+" Tamaño "+t.getTamaño()+" Transporte"+transporte.getVehiculo()+" Costo "+costoTotal+" tiempo estimado "+tiempoEspera);
    }
    
    
    
}
