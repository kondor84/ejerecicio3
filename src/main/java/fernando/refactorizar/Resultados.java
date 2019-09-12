/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fernando.refactorizar;

/**
 *
 * @author Matias Villarreal
 */
public enum Resultados {
    GANA("Ganaste"),
    PIERDE("Perdiste"),
    EMPATA("Empataste");
    
    private String descripcion;
    
    private Resultados(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
