/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.Models.Sistema;

import a.Models.Ascensor.Ascensor;
import a.Models.Piso.Piso;

/**
 *
 * @author sebas
 */
public class Sistema {
    
    public boolean validarPesoMax(Ascensor ascensor){
        if (ascensor.getPesoActual() >= ascensor.getPesoMax()) {
            return false;
        }
        return true;
    }
    
    public boolean validarPiso(Piso piso){
        if (piso.isDisponible()) {
            return true;
        }
        return false;
    }
    
    public void moverAscensor(int siguientePlanta){
        
    }
}
