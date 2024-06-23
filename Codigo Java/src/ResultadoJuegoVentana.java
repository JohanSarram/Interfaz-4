package gestormundial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResultadoJuegoVentana {

    private JFrame ventana;
    private JTextField txtEquipoLocal;
    private JTextField txtEquipoVisitante;
    private JTextField txtGolesLocal;
    private JTextField txtGolesVisitante;
    private JTextField txtEstadio;
    private JButton btnGuardar;
    private Torneo torneo;

    public ResultadoJuegoVentana(Torneo torneo) {
        this.torneo = torneo;
        initComponents();
    }

    private void initComponents() {
        ventana = new JFrame("Resultado de Juego");
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.setSize(400, 300);

        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));

        JLabel lblEquipoLocal = new JLabel("Equipo Local:");
        txtEquipoLocal = new JTextField();
        JLabel lblEquipoVisitante = new JLabel("Equipo Visitante:");
        txtEquipoVisitante = new JTextField();
        JLabel lblGolesLocal = new JLabel("Goles Equipo Local:");
        txtGolesLocal = new JTextField();
        JLabel lblGolesVisitante = new JLabel("Goles Equipo Visitante:");
        txtGolesVisitante = new JTextField();
        JLabel lblEstadio = new JLabel("Estadio:");
        txtEstadio = new JTextField();

        btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarResultado();
            }
        });

        panel.add(lblEquipoLocal);
        panel.add(txtEquipoLocal);
        panel.add(lblEquipoVisitante);
        panel.add(txtEquipoVisitante);
        panel.add(lblGolesLocal);
        panel.add(txtGolesLocal);
        panel.add(lblGolesVisitante);
        panel.add(txtGolesVisitante);
        panel.add(lblEstadio);
        panel.add(txtEstadio);
        panel.add(new JLabel()); // Espacio en blanco
        panel.add(btnGuardar);

        ventana.add(panel);
        ventana.setVisible(true);
    }

    private void guardarResultado() {
        String equipoLocal = txtEquipoLocal.getText().trim();
        String equipoVisitante = txtEquipoVisitante.getText().trim();
        String golesLocal = txtGolesLocal.getText().trim();
        String golesVisitante = txtGolesVisitante.getText().trim();
        String estadio = txtEstadio.getText().trim();

        if (equipoLocal.isEmpty() || equipoVisitante.isEmpty() || golesLocal.isEmpty() || golesVisitante.isEmpty() || estadio.isEmpty()) {
            JOptionPane.showMessageDialog(ventana, "Por favor completa todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String partido = equipoLocal + " vs " + equipoVisitante + " en " + estadio;
        String resultado = golesLocal + "-" + golesVisitante;

        torneo.agregarPartido(partido, resultado);
        ventana.dispose(); // Cerrar ventana después de guardar
    }
}
