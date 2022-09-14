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
public abstract class Middlewere {
    private Middlewere next;
    
    public static Middlewere link(Middlewere first,Middlewere...cadena){
        Middlewere head=first;
        for (Middlewere nextInChain:cadena) {
            head.next=nextInChain;
            head=nextInChain;
        }
        return first;
    }
    public abstract boolean check(paquete paquete,productoPaquete productoPaquete,Logistica logistica);
    
    protected boolean checkNext(paquete paquete,productoPaquete productoPaquete,Logistica logistica){
        if(next==null){
            return true;
        }
        return next.check(paquete,productoPaquete,logistica);
    }
}
