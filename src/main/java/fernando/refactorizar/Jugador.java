/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fernando.refactorizar;

import java.util.Arrays;

/**
 *
 * @author Matias Villarreal
 */
public class Jugador {
    String resultados[] = { "PIEDRA", "PAPEL", "TIJERA" };
    Opciones eleccion;
    Resultados resultadoParcial;
    int ganadas;
    
    @Override
    public int hashCode() {
        final int prime = 31;
	int result = 1;
	result = prime * result + ganadas + eleccion.hashCode();
	return result;
    }

    @Override
    public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Jugador other = (Jugador) obj;
				if (ganadas != other.ganadas)
					return false;
				if (!Arrays.equals(resultados, other.resultados))
					return false;
				return true;
    }

    @Override
    public String toString() {
		return "Jugador [resultados= " + resultadoParcial.getDescripcion() + ", ganadas=" + ganadas + "]";
    }

    public int getGanadas() {
	return ganadas;
    }
    
    public void aumentaGanadas(){
        ganadas++;
    }

    public Opciones getEleccion() {
        return eleccion;
    }

    public void setEleccion(Opciones eleccion) {
        this.eleccion = eleccion;
    }

    public String[] getResultados() {
        return resultados;
    }

    public void setResultados(String[] resultados) {
        this.resultados = resultados;
    }

    public Resultados getResultadoParcial() {
        return resultadoParcial;
    }

    public void setResultadoParcial(Resultados resultadoParcial) {
        this.resultadoParcial = resultadoParcial;
    }
    
    
    
}
