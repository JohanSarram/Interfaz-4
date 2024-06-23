package gestormundial;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TablaMundialVentana implements TorneoObserver {

    private JFrame ventana;
    private JLabel[] lblPartidos;
    private JLabel[] lblResultados;
    private Torneo torneo;

    public TablaMundialVentana(Torneo torneo) {
        this.torneo = torneo;
        this.torneo.agregarObserver(this);
        initComponents();
    }

    private void initComponents() {
        ventana = new JFrame("Tabla Mundial - Resultados");
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.setSize(600, 300);

        JPanel panelPrincipal = new JPanel(new BorderLayout());

        JPanel panelResultados = new JPanel();
        panelResultados.setLayout(new GridLayout(0, 2));

        List<String> partidos = torneo.getPartidos();
        List<String> resultados = torneo.getResultados();

        lblPartidos = new JLabel[partidos.size()];
        lblResultados = new JLabel[partidos.size()];

        for (int i = 0; i < partidos.size(); i++) {
            lblPartidos[i] = new JLabel(partidos.get(i), SwingConstants.CENTER);
            lblResultados[i] = new JLabel(resultados.get(i), SwingConstants.CENTER);

            panelResultados.add(lblPartidos[i]);
            panelResultados.add(lblResultados[i]);
        }

        panelPrincipal.add(panelResultados, BorderLayout.CENTER);

        ventana.add(panelPrincipal);
        ventana.setVisible(true);
    }

    @Override
    public void actualizar() {
        actualizarVista();
    }

    private void actualizarVista() {
        List<String> partidos = torneo.getPartidos();
        List<String> resultados = torneo.getResultados();

        JPanel panel = new JPanel(new GridLayout(partidos.size(), 2));
        lblPartidos = new JLabel[partidos.size()];
        lblResultados = new JLabel[partidos.size()];

        for (int i = 0; i < partidos.size(); i++) {
            lblPartidos[i] = new JLabel(partidos.get(i), SwingConstants.CENTER);
            lblResultados[i] = new JLabel(resultados.get(i), SwingConstants.CENTER);

            panel.add(lblPartidos[i]);
            panel.add(lblResultados[i]);
        }

        ventana.getContentPane().removeAll();
        ventana.add(panel);
        ventana.revalidate();
        ventana.repaint();
    }
}
