
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

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
	private JTextField textNom;
	private JTextField textEmail;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

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

//		00- panel principal

		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);

//		01- este sera un panel que nos permitira mover la ventana, siguiendo al mouse

		JPanel panel_move = new JPanel();
		panel_move.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) { // localizara al mouse cuando sea arrastrado
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - xMouse, y - yMouse);
			}
		});
		panel_move.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) { // localizara al mouse cuando sea presionado
				xMouse = e.getX();
				yMouse = e.getY();
			}
		});
		panel_move.setBorder(null);
		panel_move.setBackground(new Color(153, 204, 204));
		panel_move.setBounds(0, 0, 537, 51);
		contentPane.add(panel_move);

//		02- Boton que nos permitira salir de las ventanas
		// Creamos un panel para despues agregar color a la hora de que el mouse se
		// acerque

		final JPanel btnSalir = new JPanel();
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
		lblSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // cuando el mouse sobre el label, se
																			// mostrara una mano de precionado
		lblSalir.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalir.setFont(new Font("Arial", Font.PLAIN, 30));
		lblSalir.setBounds(0, 0, 60, 58);
		btnSalir.add(lblSalir);

//		03- titulo

		JLabel lblTitle = new JLabel("REGISTRATE");
		lblTitle.setBackground(Color.WHITE);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Arial Black", Font.PLAIN, 30));
		lblTitle.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblTitle.setBounds(139, 53, 328, 51);
		contentPane.add(lblTitle);

//		04- usuario: solicitaremos un nombre de usuario

		JLabel lblNombreYApellidos = new JLabel("Nombre de usuario:");
		lblNombreYApellidos.setForeground(new Color(102, 102, 102));
		lblNombreYApellidos.setFont(new Font("Arial Black", Font.PLAIN, 17));
		lblNombreYApellidos.setBounds(139, 139, 200, 30);
		contentPane.add(lblNombreYApellidos);

//		05- correo: solicitaremos un correo

		JLabel lblCorreo = new JLabel("Direcci\u00F3n de email:");
		lblCorreo.setForeground(new Color(102, 102, 102));
		lblCorreo.setFont(new Font("Arial Black", Font.PLAIN, 17));
		lblCorreo.setBounds(139, 220, 200, 30);
		contentPane.add(lblCorreo);

//		06- contraseña: solicitaremos una contraseña

		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setForeground(new Color(102, 102, 102));
		lblContrasea.setFont(new Font("Arial Black", Font.PLAIN, 17));
		lblContrasea.setBounds(139, 300, 200, 30);
		contentPane.add(lblContrasea);

//		07- confirmacion: solicitaremos la comfirmacion de la contraseña

		JLabel lblConfirmacin = new JLabel("Confirma tu contrase\u00F1a:");
		lblConfirmacin.setForeground(new Color(102, 102, 102));
		lblConfirmacin.setFont(new Font("Arial Black", Font.PLAIN, 17));
		lblConfirmacin.setBounds(139, 380, 240, 30);
		contentPane.add(lblConfirmacin);

//		08- nombre: apartado donde el usuario escribira su nombre

		textNom = new JTextField();
		textNom.setToolTipText("");
		textNom.setForeground(Color.BLACK);
		textNom.setFont(new Font("Arial Black", Font.PLAIN, 13));
		textNom.setColumns(10);
		textNom.setBorder(null);
		textNom.setBackground(Color.WHITE);
		textNom.setBounds(139, 180, 328, 30);
		contentPane.add(textNom);

//		09- email: apartado donde el usuario escribira su email

		textEmail = new JTextField();
		textEmail.setToolTipText("");
		textEmail.setForeground(Color.BLACK);
		textEmail.setFont(new Font("Arial Black", Font.PLAIN, 13));
		textEmail.setColumns(10);
		textEmail.setBorder(null);
		textEmail.setBackground(Color.WHITE);
		textEmail.setBounds(139, 260, 328, 30);
		contentPane.add(textEmail);

//		10- contraseña: apartado donde el usuario escribira su contraseña

		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setSelectedTextColor(Color.WHITE);
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		passwordField.setForeground(Color.BLACK);
		passwordField.setFont(new Font("Arial Black", Font.PLAIN, 13));
		passwordField.setBorder(null);
		passwordField.setBackground(Color.WHITE);
		passwordField.setBounds(139, 340, 270, 30);
		contentPane.add(passwordField);

//		11- confirmar: apartado donde el usuario confirmara su contraseña

		passwordField_1 = new JPasswordField();
		passwordField_1.setToolTipText("");
		passwordField_1.setSelectedTextColor(Color.WHITE);
		passwordField_1.setHorizontalAlignment(SwingConstants.LEFT);
		passwordField_1.setForeground(Color.BLACK);
		passwordField_1.setFont(new Font("Arial Black", Font.PLAIN, 13));
		passwordField_1.setBorder(null);
		passwordField_1.setBackground(Color.WHITE);
		passwordField_1.setBounds(139, 420, 270, 30);
		contentPane.add(passwordField_1);

//		12- Boton de creado de cuenta: queremos que una vez precionado el boton, se guarden los datos del usuario y salta a la ventanaInicio
		// Creamos un panel para despues agregar color a la hora de que el mouse se
		// acerque

		JPanel btnCrear = new JPanel();
		btnCrear.setBounds(139, 522, 328, 42);
		contentPane.add(btnCrear);
		btnCrear.setLayout(null);

		// un label donde indicaremos la accion "crear cuenta"

		JLabel lblCrear = new JLabel("Crear cuenta");
		lblCrear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // para que aparezca una mano en vez de una
																			// flecha
		lblCrear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { // si el mouse es clicado, saltaremos a VentanaInicio
				VentanaInicio newframe = new VentanaInicio();
				newframe.setVisible(true);
			}
		});
//		13- Boton incia sesion: boton que nos devolvera a la ventana iniciar sesion
		// un label donde indicaremos la accion "iniciar sesion"

		final JLabel lblInicia = new JLabel("Inicia sesion");
		lblInicia.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // para que aparezca una mano en vez de una
																				// flecha
		lblInicia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { // si el mouse es clicado, volveremos a VentanaLogin
				VentanaLogin newframe = new VentanaLogin();
				newframe.setVisible(true);
				dispose();
			}

			@Override
			public void mouseEntered(MouseEvent e) { // si el mouse entra, cambiara de color
				lblInicia.setForeground(new Color(0, 153, 153));
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
