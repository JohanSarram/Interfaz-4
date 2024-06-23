
package gestormundial;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mundial {
    private List<Grupo> grupos;
    private List<Estadio> estadios;
    private List<Partido> partidos;

    public Mundial() {
        this.grupos = new ArrayList<>();
        this.estadios = new ArrayList<>();
        this.partidos = new ArrayList<>();
    }

    public void registrarGrupo(Grupo grupo) {
        grupos.add(grupo);
    }

    public void registrarEstadio(Estadio estadio) {
        estadios.add(estadio);
    }

    public void generarFixture() {
        // Generar los partidos de cada grupo
        Random rand = new Random();
        for (Grupo grupo : grupos) {
            List<Equipo> equipos = grupo.getEquipos();
            for (int i = 0; i < equipos.size(); i++) {
                for (int j = i + 1; j < equipos.size(); j++) {
                    Equipo equipoLocal = equipos.get(i);
                    Equipo equipoVisitante = equipos.get(j);
                    partidos.add(new Partido(equipoLocal, equipoVisitante));
                }
            }
        }

        // Asignar estadios de manera aleatoria a los partidos
        for (Partido partido : partidos) {
            Estadio estadio = estadios.get(rand.nextInt(estadios.size()));
            System.out.println("Partido: " + partido.getEquipoLocal().getNombre() + " vs " + partido.getEquipoVisitante().getNombre());
            System.out.println("Estadio: " + estadio.getNombre());
        }
    }

    public List<Partido> getPartidos() {
        return partidos;
    }
}
