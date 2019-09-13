package fernando.refactorizar;

import java.util.Arrays;

class Jugador {


    String[] resultados = { "PIEDRA", "PAPEL", "TIJERA" };
    int partidasGanadas;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + partidasGanadas;
		result = prime * result + Arrays.hashCode(resultados);
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
				if (partidasGanadas != other.partidasGanadas)
					return false;
		return Arrays.equals(resultados, other.resultados);
	}

	@Override
	public String toString() {
		return "Jugador [resultados=" + Arrays.toString(resultados) + ", ganados=" + partidasGanadas + "]";
	}

	public String[] getResultados() {
		return resultados;
	}

			public void setResultados(String[] resultados) {
		this.resultados = resultados;
	}

	public int getPartidasGanadas() {
		return partidasGanadas;
	}

    public String getResultado() {
        String resultado = "";
        int i = (int)(Math.random() * 3);
        switch(i) {
            case 0:
            	resultado = "PIEDRA";
            	System.out.println();
                break;
            case 1:
            	resultado = "PAPEL";
            	System.out.println();
                break;
            case 2:
            	resultado = "TIJERA";
            	System.out.println();
                break;
        }
        return resultado;
    }

    public int getGanados() {
        return partidasGanadas;
    }

}
