package fernando.refactorizar;

import static fernando.refactorizar.Resultados.*;

public abstract class Juego {

	public static void main(String args[]) {
            Jugador j1 = new Jugador();
            Jugador j2 = new Jugador();
            boolean termino = false;
            int op1;
        
            do {
		op1 = Consola.getInstance().menuOpciones();
                if(op1 == 4){
                   termino = true;
                }else{
                    j1.setEleccion(Rutinas.getOpcion(op1));
                    j2.setEleccion(Rutinas.getOpcionRandom());
                    
                    switch(Rutinas.getResultado(j1.getEleccion(), j2.getEleccion())){
                        case GANA:
                            j1.aumentaGanadas();
                            j1.setResultadoParcial(GANA);
                            j2.setResultadoParcial(PIERDE);
                            break;
                        case PIERDE:
                            j2.aumentaGanadas();
                            j2.setResultadoParcial(GANA);
                            j1.setResultadoParcial(PIERDE);
                            break;
                        case EMPATA:
                        default:
                            j1.setResultadoParcial(EMPATA);
                            j2.setResultadoParcial(EMPATA);
                            break;
                    }
                    Consola.getInstance().muestraResultado(j1, j2);
                    
                    if(j1.getGanadas() == 3 || j2.getGanadas() == 3){
                        Consola.getInstance().mensajeFinal((j1.getGanadas()==3)?GANA.getDescripcion():PIERDE.getDescripcion());
                        termino = true;
                    }
                }
            } while(!termino);
    }   
}