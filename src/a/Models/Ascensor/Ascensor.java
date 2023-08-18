/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.Models.Ascensor;

import a.Models.Direccion.Direccion;

/**
 *
 * @author sebas
 */
public class Ascensor {
    private int pisoActual;
    private int pesoActual;
    private int pesoMax;
    private int solicitudes;
    private Direccion estado;

    public int getPisoActual() {
        return pisoActual;
    }

    public int getPesoActual() {
        return pesoActual;
    }

    public int getPesoMax() {
        return pesoMax;
    }

    public int getSolicitudes() {
        return solicitudes;
    }

    public Direccion getEstado() {
        return estado;
    }
    
    
}
