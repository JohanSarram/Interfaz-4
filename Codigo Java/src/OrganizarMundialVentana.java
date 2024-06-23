package gestormundial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrganizarMundialVentana {

    private JFrame ventana;
    private JButton btnVS;
    private JLabel[] lblPartidos;
    private JTextArea[] txtJugadoresEquipoLocal;
    private JTextArea[] txtJugadoresEquipoVisitante;

    private List<Equipo> equipos;
    private List<String> partidosJugados;

    private int numeroPartidosJugados;
    private Torneo torneo; // Referencia al modelo compartido

    public OrganizarMundialVentana(Torneo torneo) {
        this.torneo = torneo;
        cargarEquipos(); // Cargar equipos desde EquiposDatos
        partidosJugados = new ArrayList<>();
        numeroPartidosJugados = 0;

        initComponents(); // Inicializar componentes de la ventana
    }

    private void cargarEquipos() {
        EquiposDatos datos = new EquiposDatos();
        equipos = datos.getEquipos();
    }

    private void initComponents() {
        ventana = new JFrame("Organizar Mundial");
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.setSize(700, 400);
        

        JPanel panel = new JPanel(new BorderLayout());

        btnVS = new JButton("VS");

        JPanel centroPanel = new JPanel(new GridLayout(4, 1));
        centroPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        lblPartidos = new JLabel[4];
        txtJugadoresEquipoLocal = new JTextArea[4];
        txtJugadoresEquipoVisitante = new JTextArea[4];

        for (int i = 0; i < 4; i++) {
            lblPartidos[i] = new JLabel("Partido " + (i + 1), SwingConstants.CENTER);
            txtJugadoresEquipoLocal[i] = new JTextArea(10, 20);
            txtJugadoresEquipoLocal[i].setEditable(false);
            JScrollPane scrollPaneLocal = new JScrollPane(txtJugadoresEquipoLocal[i]);

            txtJugadoresEquipoVisitante[i] = new JTextArea(10, 20);
            txtJugadoresEquipoVisitante[i].setEditable(false);
            JScrollPane scrollPaneVisitante = new JScrollPane(txtJugadoresEquipoVisitante[i]);

            JPanel partidoPanel = new JPanel(new BorderLayout());
            partidoPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            partidoPanel.add(lblPartidos[i], BorderLayout.NORTH);
            JPanel jugadoresPanel = new JPanel(new GridLayout(1, 2));
            jugadoresPanel.add(scrollPaneLocal);
            jugadoresPanel.add(scrollPaneVisitante);
            partidoPanel.add(jugadoresPanel, BorderLayout.CENTER);

            centroPanel.add(partidoPanel);
        }

        panel.add(btnVS, BorderLayout.NORTH);
        panel.add(centroPanel, BorderLayout.CENTER);

        ventana.add(panel);
        ventana.setVisible(true);

        btnVS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jugarPartido();
            }
        });
    }

    private void jugarPartido() {
        if (numeroPartidosJugados >= 4) {
            JOptionPane.showMessageDialog(ventana, "Ya se han formado todos los partidos.", "Fin de Juego", JOptionPane.INFORMATION_MESSAGE);
            btnVS.setEnabled(false);
            return;
        }

        // Selección aleatoria de equipos que no se hayan jugado anteriormente
        List<Equipo> equiposDisponibles = new ArrayList<>(equipos);
        Collections.shuffle(equiposDisponibles);

        Equipo equipoLocal = null;
        Equipo equipoVisitante = null;

        for (Equipo equipo : equiposDisponibles) {
            if (!partidosJugados.contains(equipo.getNombre())) {
                if (equipoLocal == null) {
                    equipoLocal = equipo;
                } else {
                    equipoVisitante = equipo;
                    break;
                }
            }
        }

        if (equipoLocal != null && equipoVisitante != null) {
            String partido = equipoLocal.getNombre() + " vs " + equipoVisitante.getNombre();
            String resultado = "0-0"; // Resultado inicial

            lblPartidos[numeroPartidosJugados].setText(partido);
            partidosJugados.add(equipoLocal.getNombre());
            partidosJugados.add(equipoVisitante.getNombre());

            mostrarJugadores(txtJugadoresEquipoLocal[numeroPartidosJugados], equipoLocal.getJugadores());
            mostrarJugadores(txtJugadoresEquipoVisitante[numeroPartidosJugados], equipoVisitante.getJugadores());

            // Agregar el partido al modelo Torneo
            torneo.agregarPartido(partido, resultado);

            numeroPartidosJugados++;
        } else {
            JOptionPane.showMessageDialog(ventana, "No hay equipos disponibles para jugar otro partido.", "Fin del Mundial", JOptionPane.INFORMATION_MESSAGE);
            btnVS.setEnabled(false); // Desactivar el botón cuando no hay equipos disponibles
        }
    }

    private void mostrarJugadores(JTextArea txtArea, List<Jugador> jugadores) {
        txtArea.setText(""); // Limpiar el área de texto

        for (Jugador jugador : jugadores) {
            txtArea.append(jugador.getNombre() + " (" + jugador.getPosicion() + ")\n");
        }
    }
}
