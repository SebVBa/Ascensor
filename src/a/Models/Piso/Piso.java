/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.Models.Piso;

/**
 *
 * @author sebas
 */
public class Piso {

    private int numPiso;

    public int getNumPiso() {
        return numPiso;
    }

    public void setNumPiso(int numPiso) {
        this.numPiso = numPiso;
    }


    @Override
    public String toString() {
        return "Piso{" + "numPiso=" + numPiso + '}';
    }

    public boolean estadoDisponibilidad() {
        return disponible ? true : false;
    }

    public boolean ValidarNumPiso() {
        if (this.numPiso > 10) {
            return false;
        } else {
            return true;
        }
    }
}
