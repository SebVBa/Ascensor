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

    public Ascensor(int pisoActual, int pesoMax, int solicitudes, Direccion estado) {
        this.pisoActual = pisoActual;
        this.pesoMax = pesoMax;
        this.solicitudes = solicitudes;
        this.estado = estado;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }

    public int getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(int pesoMax) {
        this.pesoMax = pesoMax;
    }

    public int getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(int solicitudes) {
        this.solicitudes = solicitudes;
    }

    public Direccion getEstado() {
        return estado;
    }

    public void setEstado(Direccion estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Ascensor{" + "pisoActual=" + pisoActual + ", pesoMax=" + pesoMax + ", solicitudes=" + solicitudes + ", estado=" + estado + '}';
    }

    public void moverseAPiso(int destino) {
        if (destino > pisoActual) {
            estado = Direccion.subir;
        } else if (destino < pisoActual) {
            estado = Direccion.bajar;
        } else {
            estado = Direccion.estatico;
        }
        pisoActual = destino;
    }

    public boolean estaSobrepasandoPeso(int pesoActual) {
        return pesoActual > pesoMax;
    }

    public void detenerAscensor() {
        estado = Direccion.estatico;
    }
   
}
