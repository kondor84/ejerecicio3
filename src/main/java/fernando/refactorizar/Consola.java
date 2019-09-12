/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fernando.refactorizar;

import javax.swing.JOptionPane;

/**
 *
 * @author Matias Villarreal
 */
public class Consola {
    private static Consola instancia;
    
    private Consola(){
    }
    
    public static Consola getInstance(){
        if(instancia == null){
           instancia = new Consola(); 
        }
        return instancia;
    }
    
    public int menuOpciones(){
        int opcion = 4;
        boolean terminar;
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "**** Elije una Opción***\n"
                    + "   1- Piedra\n"
                    + "   2- Papel\n"
                    + "   3- Tijera\n"
                    + "   4- Salir\n\n"));
                if(opcion <= 0 || opcion > 4){
                    JOptionPane.showMessageDialog(null, "Ingresaste una opción inválida");
                    terminar = false;
                }else{
                    terminar = true;
                    if(opcion == 4)
                        JOptionPane.showMessageDialog(null, "Hasta la vista, baby!");
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Ingresa un número entero válido");
                terminar = false;
            }
        }while(!terminar);
        return opcion;
    }
    
    public void mensajeFinal(String resultado){
        JOptionPane.showMessageDialog(null, "** Fin del Juego **\n"
                                          + "     " + resultado + "!!");
    }
    
    public void muestraResultado(Jugador j1, Jugador j2){
        JOptionPane.showMessageDialog(null,
                "Resultado Jugada:\n"
               +"  Tu elección: " + j1.getEleccion().name() + "\n"
               +"  Jugador   2: " + j2.getEleccion().name() + "\n\n"
               +"  Resultado  : " + j1.getResultadoParcial().getDescripcion() + "\n");
    }
}
