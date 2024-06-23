package gestormundial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestorMundial {

    private JFrame ventanaPrincipal;
    private Torneo torneo;
    private ImageIcon iconoLogo; // ImageIcon para la imagen del logo
    private ImageIcon iconoFondo; // ImageIcon para la imagen de fondo

    public GestorMundial(String rutaImagenLogo, String rutaImagenFondo) {
        // Cargar las imágenes del logo y fondo desde las rutas proporcionadas
        iconoLogo = new ImageIcon(getClass().getClassLoader().getResource(rutaImagenLogo));
        iconoFondo = new ImageIcon(getClass().getClassLoader().getResource(rutaImagenFondo));
        initComponents();
        torneo = new Torneo();
    }

    private void initComponents() {
        ventanaPrincipal = new JFrame("Gestor Mundial");
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un JPanel personalizado para el fondo
        JPanel panelFondo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibujar la imagen de fondo ajustándola al tamaño del panel
                if (iconoFondo != null) {
                    g.drawImage(iconoFondo.getImage(), 0, 0, getWidth(), getHeight(), this);
                }
            }
        };
        panelFondo.setLayout(new BorderLayout());

        // Panel para los botones con GridLayout
        JPanel panelBotones = new JPanel(new GridLayout(3, 1, 0, 10));

        // Crear los botones
        JButton btnOrganizarMundial = new JButton("Organizar Mundial");
        JButton btnTablaMundial = new JButton("Tabla de Mundial");
        JButton btnResultadoJuego = new JButton("Resultado de Juego");

        // Añadir los botones al panel de botones
        panelBotones.add(btnOrganizarMundial);
        panelBotones.add(btnTablaMundial);
        panelBotones.add(btnResultadoJuego);

        // Añadir el panel de botones al panel de fondo en el centro
        panelFondo.add(panelBotones, BorderLayout.CENTER);

        // Redimensionar la imagen del logo a un tamaño más pequeño
        Image imagenLogo = iconoLogo.getImage();
        Image nuevaImagenLogo = imagenLogo.getScaledInstance(100, 100, Image.SCALE_SMOOTH); // Cambia aquí el tamaño
        iconoLogo = new ImageIcon(nuevaImagenLogo);

        // Crear JLabel para mostrar la imagen del logo encima de los botones
        JLabel labelLogo = new JLabel(iconoLogo);
        labelLogo.setHorizontalAlignment(SwingConstants.CENTER); // Centrar la imagen horizontalmente

        // Añadir el logo encima de los botones en la parte superior del panel de fondo
        panelFondo.add(labelLogo, BorderLayout.NORTH);

        // Añadir el panel de fondo a la ventana principal
        ventanaPrincipal.setContentPane(panelFondo);

        // Ajustar el tamaño de la ventana según el contenido y hacerla visible
        ventanaPrincipal.pack();
        ventanaPrincipal.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        ventanaPrincipal.setVisible(true);

        // Acción del botón "Organizar Mundial"
        btnOrganizarMundial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirVentanaOrganizarMundial();
            }
        });

        // Acción del botón "Tabla de Mundial"
        btnTablaMundial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirVentanaTablaMundial();
            }
        });

        // Acción del botón "Resultado de Juego"
        btnResultadoJuego.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirVentanaResultadoJuego();
            }
        });
    }

    private void abrirVentanaOrganizarMundial() {
        // Aquí deberías abrir la ventana para organizar el mundial
        OrganizarMundialVentana ventanaOrganizarMundial = new OrganizarMundialVentana(torneo);
    }

    private void abrirVentanaTablaMundial() {
        // Crear ventana de Tabla Mundial
        TablaMundialVentana ventanaTabla = new TablaMundialVentana(torneo);
    }

    private void abrirVentanaResultadoJuego() {
        // Abrir ventana para ingresar el resultado de un partido
        ResultadoJuegoVentana ventanaResultadoJuego = new ResultadoJuegoVentana(torneo);
    }

    public static void main(String[] args) {
        // Ejemplo de uso: Pasa las rutas de las imágenes como argumentos
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Rutas relativas al classpath (src/gestormundial/Logo.png y src/gestormundial/Fondo.png)
                String rutaLogo = "gestormundial/Logo.png";
                String rutaFondo = "gestormundial/Fondo.png";
                new GestorMundial(rutaLogo, rutaFondo); // Reemplaza con las rutas correctas de tus imágenes
            }
        });
    }
}
