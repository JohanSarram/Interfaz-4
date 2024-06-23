
package gestormundial;
import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nombre;
    private List<Equipo> equipos;

    public Grupo(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
    }

    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void mostrarInfo() {
        System.out.println("Grupo: " + nombre);
        for (Equipo equipo : equipos) {
            equipo.mostrarInfo();
        }
    }
}