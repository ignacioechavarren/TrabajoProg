import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class VentanaRegistrar extends JFrame {
	
	private JPanel contentPane;
	int xMouse, yMouse; // nos servira para el panel_move


	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistrar frame = new VentanaRegistrar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	public VentanaRegistrar() {
		
		setUndecorated(true); // quitaremos los comandos para diseñarlos y localizarlos a nuestro gusto
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(600, 700);
		setLocationRelativeTo(null); // la ventana aparecera en el centro de la pantalla
		
		// 00- panel principal
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		01- este sera un panel que nos permitira mover la ventana, siguiendo al mouse
		
		JPanel panel_move = new JPanel(); 
		panel_move.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - xMouse, y - yMouse); // con esto me permite mover la pagina a mi gusto
			}
		});
		panel_move.addMouseListener(new MouseAdapter() { 
			@Override
			public void mousePressed(MouseEvent e) { // localizara al mouse 
				xMouse = e.getX();
				yMouse = e.getY();
			}
		});
		panel_move.setBorder(null);
		panel_move.setBackground(new Color(153, 204, 204));
		panel_move.setBounds(0, 0, 537, 51);
		contentPane.add(panel_move);
		
//		02- Boton que nos permitira salir de las ventanas
		// Creamos un panel para despues agregar color a la hora de que el mouse se acerque
		
		JPanel btnSalir = new JPanel();
		btnSalir.setBackground(new Color(153, 204, 204));
		btnSalir.setBounds(540, 0, 60, 58);
		contentPane.add(btnSalir);
		btnSalir.setLayout(null);
		
		// Un label donde indicaremos la accion "X"
		
		JLabel lblSalir = new JLabel("X");
		lblSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { // cuando sea clicado, saldremos
				System.exit(0);
			}
			@Override
			public void mouseEntered(MouseEvent e) { // si el mouse entra, cambiara de color
				btnSalir.setBackground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) { // si el mouse sale, volvera al color inicial
				btnSalir.setBackground(new Color(153, 204, 204));
			}
		});
		lblSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // cuando el mouse sobre el label, se mostrara una mano de precionado
		lblSalir.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalir.setFont(new Font("Arial", Font.PLAIN, 30));
		lblSalir.setBounds(0, 0, 60, 58);
		btnSalir.add(lblSalir);
		
//		09- Boton de creado de cuenta: queremos que una vez precionado el boton, se guarden los datos del usuario y salta a la ventanaInicio
		// Creamos un panel para despues agregar color a la hora de que el mouse se acerque
		
		JPanel btnCrear = new JPanel();
		btnCrear.setBounds(139, 522, 328, 42);
		contentPane.add(btnCrear);
		btnCrear.setLayout(null);
		
		// un label donde indicaremos la accion "crear cuenta"
		
		JLabel lblCrear = new JLabel("Crear cuenta");
		lblCrear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // para que aparezca una mano en vez de una flecha
		lblCrear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { // si el mouse es clicado, saltaremos a VentanaInicio
				VentanaInicio newframe = new VentanaInicio();
//				newframe.setVisible(true);
				dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) { // si el mouse entra, cambiara de color
				btnCrear.setBackground(new Color( 0, 153, 153));
				lblCrear.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) { // si el mouse sale, vuelve a su color inicial
				btnCrear.setBackground(Color.WHITE);
				lblCrear.setForeground(Color.BLACK);
			}
		});
		lblCrear.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrear.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblCrear.setBounds(0, 0, 328, 42);
		btnCrear.add(lblCrear);
		
//		10- Boton incia sesion: boton que nos devolvera a la ventana iniciar sesion
		// un label donde indicaremos la accion "iniciar sesion"

		JLabel lblInicia = new JLabel("Inicia sesi\u00F3n");
		lblInicia.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // para que aparezca una mano en vez de una flecha
		lblInicia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { // si el mouse es clicado, volveremos a VentanaLogin
				VentanaLogin newframe = new VentanaLogin();
				newframe.setVisible(true);
				dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) { // si el mouse entra, cambiara de color
				lblInicia.setForeground(new Color( 0, 153, 153));
			}
			@Override
			public void mouseExited(MouseEvent e) { // si el mouse sale, vuelve a su color inicial
				lblInicia.setForeground(new Color(102, 102, 102));
			}
		});
		lblInicia.setForeground(new Color(102, 102, 102));
		lblInicia.setHorizontalAlignment(SwingConstants.CENTER);
		lblInicia.setFont(new Font("Arial Black", Font.PLAIN, 17));
		lblInicia.setBounds(200, 578, 200, 30);
		contentPane.add(lblInicia);
		
	}

}
