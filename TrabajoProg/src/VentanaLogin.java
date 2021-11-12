import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.Cursor;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.border.MatteBorder;

public class VentanaLogin extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image img_user = new ImageIcon(VentanaLogin.class.getResource("imagenes/gente.png")).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
	private Image img_lock = new ImageIcon(VentanaLogin.class.getResource("imagenes/candado.png")).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
	private Image img_eye = new ImageIcon(VentanaLogin.class.getResource("imagenes/eye.png")).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
	
	//las imagenes que vamos a utilizar
	
	
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtPass;
	protected int yMouse;
	protected int xMouse;
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin frame = new VentanaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
	public VentanaLogin() {
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                     //los parametros de la ventana
		setBounds(100,100,450,300);
		setSize(800,600);
		setLocationRelativeTo(null);
		
		//panel principal
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0,0,0));
		contentPane.setForeground(new Color(255,255,255));
		contentPane.setBorder(new LineBorder(new Color(0,0,0,0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPanel = new JLabel("panel");
		lblPanel.setForeground(Color.WHITE);
		lblPanel.setHorizontalAlignment(SwingConstants.CENTER);
		lblPanel.setBounds(0, 0, 375, 600);
		lblPanel.setIcon(new ImageIcon(VentanaLogin.class.getResource("/imagenes/panel.png")));
		lblPanel.setSize(375,600);
		contentPane.add(lblPanel);
		
		JLabel lblTitule = new JLabel("INICIAR SESION");
		lblTitule.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));          // label de iniciar sesion
		lblTitule.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitule.setFont(new Font("Arial Black", Font.PLAIN, 30));
		lblTitule.setBounds(425, 89, 328, 51);
		contentPane.add(lblTitule);
		

		JLabel lblUser = new JLabel("USUARIO");
		lblUser.setFont(new Font("Arial Black", Font.PLAIN, 17));                           // label de usuario
		lblUser.setBounds(454, 220, 101, 30);
		contentPane.add(lblUser);

		
		JLabel lblContraseña = new JLabel("CONTRASENA");
		lblContraseña.setForeground(Color.BLACK);                                            //label contrasena
		lblContraseña.setBackground(Color.WHITE);
		lblContraseña.setFont(new Font("Arial Black", Font.PLAIN, 17));
		lblContraseña.setBounds(454, 310, 142, 30);
		contentPane.add(lblContraseña);

		txtUsuario = new JTextField();
		txtUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) { // cuando sea presionado, el texto debe desaparecer
				txtUsuario.setText("");
				txtPass.setText("********");
				txtUsuario.setForeground(Color.BLACK); // despues de haber sido presionado, cambie la letra de color
			}
		});
		
		txtUsuario.setBorder(null);
		txtUsuario.setToolTipText("");
		txtUsuario.setBackground(Color.WHITE);
		txtUsuario.setFont(new Font("Arial Black", Font.PLAIN, 13));								//parametros usuario
		txtUsuario.setForeground(Color.LIGHT_GRAY);															
		txtUsuario.setText("Ingrese su nombre de usuario");
		txtUsuario.setBounds(454, 257, 270, 30);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtPass = new JPasswordField();
		txtPass.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) { // cuando sea presionado, el texto debe desaparecer
				txtUsuario.setText("Ingrese su nombre de usuario");
				txtPass.setText("");
				txtPass.setForeground(Color.BLACK); // despues de haber sido presionado, cambie la letra de color

			}
		});
		txtPass.setBorder(null);
		txtPass.setText("********");
		txtPass.setSelectedTextColor(Color.WHITE);
		txtPass.setToolTipText("");
		txtPass.setFont(new Font("Arial Black", Font.PLAIN, 13));									//parametros contraseña
		txtPass.setHorizontalAlignment(SwingConstants.LEFT);										
		txtPass.setBackground(Color.WHITE);
		txtPass.setForeground(Color.LIGHT_GRAY);
		txtPass.setBounds(454, 350, 270, 30);
		contentPane.add(txtPass);
		
		JPanel btnEntrar = new JPanel();
		btnEntrar.setForeground(new Color(153, 204, 204));								 // parametros del boton entrar
		btnEntrar.setBackground(new Color(153, 204, 204));
		btnEntrar.setBounds(568, 425, 156, 51);
		contentPane.add(btnEntrar);
		btnEntrar.setLayout(null);
		
		JLabel lblEntrar = new JLabel("ENTRAR");																		
		lblEntrar.setBounds(0, 0, 156, 51);													// label del boton entrar
		btnEntrar.add(lblEntrar);	
		lblEntrar.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblEntrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnEntrar.setBackground(new Color( 0, 153, 153)); // debo escribir a mano el color que quiero, porque no esta en la lista
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnEntrar.setBackground(new Color( 153, 204, 204)); // debo escribir a mano el color que quiero, porque no esta en la lista
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				VentanaInicio newframe = new VentanaInicio();
				newframe.setVisible(true);
				dispose();
			}
		});
		lblEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblEntrar.setForeground(Color.WHITE);
		lblEntrar.setBackground(Color.WHITE);
		lblEntrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblEntrar.setFont(new Font("Arial Black", Font.PLAIN, 17));
		
		JPanel panel_move = new JPanel();
		
		panel_move.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) { // cuando el mouse es arrastrado
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - xMouse, y - yMouse); // con esto me permite mover la pagina a mi gusto
			}
		});
		panel_move.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) { // localizar el mouse
				xMouse = e.getX();
				yMouse = e.getY();
			}
		});
		panel_move.setBorder(null);
		panel_move.setBackground(Color.WHITE);
		panel_move.setBounds(0, 0, 742, 58);
		contentPane.add(panel_move);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(new Color(255, 255, 255));
		separator.setBounds(454, 290, 270, 10);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(454, 381, 270, 10);
		contentPane.add(separator_1);
		
		JPanel btnSalir = new JPanel();
		btnSalir.setBackground(Color.WHITE);
		btnSalir.setForeground(Color.BLACK);										//parametros boton salir
		btnSalir.setBounds(742, 0, 58, 58);
		contentPane.add(btnSalir);
		btnSalir.setLayout(null);
		
		JLabel lblSalir = new JLabel("x");
		lblSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { // salir de la pestaña
				System.exit(0);
			}
			@Override
			public void mouseEntered(MouseEvent e) { // agregar color cuando el mouse entra
				btnSalir.setBackground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) { // cuando el mouse sale, vuelve a su color natural
				btnSalir.setBackground(Color.WHITE);
			}
		});
		lblSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblSalir.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalir.setFont(new Font("Arial", Font.PLAIN, 30));
		lblSalir.setBounds(0, 0, 58, 58);
		btnSalir.add(lblSalir);
		
		JLabel lblUserImg = new JLabel("");
		lblUserImg.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserImg.setIcon(new ImageIcon(img_user));
		lblUserImg.setBounds(725, 253, 45, 40);
		contentPane.add(lblUserImg);
		
		JLabel lblLockImg = new JLabel("");
		lblLockImg.setHorizontalAlignment(SwingConstants.CENTER);
		lblLockImg.setIcon(new ImageIcon(img_lock));
		lblLockImg.setBounds(725, 339, 45, 40);
		contentPane.add(lblLockImg);
		
		JLabel lblCrear = new JLabel("Nuevo? crea una cuenta");
		lblCrear.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCrear.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblCrear.setBounds(454, 495, 178, 30);
		contentPane.add(lblCrear);
		
		JPanel btnRegis = new JPanel();
		btnRegis.setBackground(Color.WHITE);
		btnRegis.setBounds(635, 495, 38, 30);
		contentPane.add(btnRegis);
		btnRegis.setLayout(null);
		
		JLabel lblAqui = new JLabel("aqui");
		lblAqui.setForeground(Color.BLACK);
		lblAqui.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {				//al poner el cursor en "aqui" cambia el color
				lblAqui.setForeground(new Color( 0, 153, 153));
			}
			@Override
			public void mouseExited(MouseEvent e) {					//al quitar el cursor de "aqui" vuelve al color negro
				lblAqui.setForeground(Color.BLACK);
			}
			@Override
			public void mouseClicked(MouseEvent e) {				//al presionar "aqui" cambia a la VentanaRegistrar
				VentanaRegistrar newframe = new VentanaRegistrar();
				newframe.setVisible(true);
				dispose();
			}
		});
		lblAqui.setHorizontalAlignment(SwingConstants.LEFT);
		lblAqui.setBounds(0, 0, 38, 30);
		btnRegis.add(lblAqui);
		lblAqui.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblAqui.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		JPanel btnEye = new JPanel();
		btnEye.setBackground(Color.WHITE);
		btnEye.setBounds(454, 390, 46, 40);
		contentPane.add(btnEye);
		btnEye.setLayout(null);
		
		JLabel lblEyeImg = new JLabel("");
		lblEyeImg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {				//al clickar a la imagen del ojo se cambia el color del fondo
				btnEye.setBackground(Color.LIGHT_GRAY);
			}
		});
		lblEyeImg.setBounds(0, 0, 45, 40);
		btnEye.add(lblEyeImg);
		lblEyeImg.setHorizontalAlignment(SwingConstants.CENTER);
		lblEyeImg.setIcon(new ImageIcon(img_eye));
		
	}
}
