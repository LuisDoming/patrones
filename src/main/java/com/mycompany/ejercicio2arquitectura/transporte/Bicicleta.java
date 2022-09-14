/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2arquitectura.transporte;

/**
 *
 * @author copad
 */
public class Bicicleta extends Transporte{
    String nombre="Bicicleta";
    int costo=5;
    float velocidad=20;

    @Override
    public String getVehiculo() {
        return nombre;
    }

    @Override
    public int getCosto() {
        return costo;
    }

    @Override
    public float getVelocidadPromedio() {
        return velocidad;
    }
}
