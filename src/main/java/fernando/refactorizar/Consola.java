package fernando.refactorizar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Consola extends Jugador {

    private static BufferedReader data;

    static {
        Consola.data = new BufferedReader(new InputStreamReader(System.in));
    }

    private static String readLine() throws IOException {
        return Consola.data.readLine();
    }

    static int readInt() {
        while (true) {
            try {
                return Integer.parseInt(Consola.readLine().trim());
            } catch (NumberFormatException ex) {
                System.out.println("El valor ingresado no es \"INTEGER\", vuelva a intentar");
            } catch (IOException ignored) {
            } catch (Exception ignored) {

            }
        }
    }

    @Override
    public int getGanados() {
        return g + 10;
    }

    public String getResultado() {
        String resultado = "";
        int i = (int) (Math.random() * 3);
        switch (i) {
            case 0:
                resultado = "PIEDRA";
                break;
            case 1:
                resultado = "PAPEL";
                break;
            case 2:
                resultado = "TIJERA";
                break;
        }
        return resultado;
    }

    public String getResultado(String piedra, String papel, String tijera) {
        String resultado = "";
        int i = (int) (Math.random() * 3);
        switch (i) {
            case 0:
                resultado = "PIEDRA";
                break;
            case 1:
                resultado = "PAPEL";
                break;
            case 2:
                resultado = "TIJERA";
                break;
        }
        return resultado;
    }

}
