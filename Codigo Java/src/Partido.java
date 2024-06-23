
package gestormundial;

public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private String resultado;

    public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.resultado = "Pendiente";
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public String getResultado() {
        return resultado;
    }

    @Override
    public String toString() {
        return equipoLocal.getNombre() + " vs " + equipoVisitante.getNombre() + " - " + resultado;
    }
}