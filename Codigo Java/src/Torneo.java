package gestormundial;

import java.util.ArrayList;
import java.util.List;

public class Torneo {
    private List<String> partidos;
    private List<String> resultados;
    private List<TorneoObserver> observers;

    public Torneo() {
        partidos = new ArrayList<>();
        resultados = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void agregarPartido(String partido, String resultado) {
        partidos.add(partido);
        resultados.add(resultado);
        notificarObservers();
    }

    public List<String> getPartidos() {
        return partidos;
    }

    public List<String> getResultados() {
        return resultados;
    }

    public void agregarObserver(TorneoObserver observer) {
        observers.add(observer);
    }

    private void notificarObservers() {
        for (TorneoObserver observer : observers) {
            observer.actualizar();
        }
    }
}
