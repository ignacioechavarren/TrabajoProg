import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

public class VentanaInicio extends JFrame {

	private JPanel contentPane;
	private JLayeredPane layeredPane;
	private JPanel panelIntro;
	private JPanel panelMujer;
	private JPanel panelHombre;
	private JPanel panelNinos;
	private JPanel panelHogar;
	private JPanel panelNosotros;
	private JPanel panelPlataforma;
	private JTextField txtBuscarEnLa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInicio frame = new VentanaInicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void Switch_screen(JPanel p) { // Lista de paneles
		layeredPane.removeAll();
		layeredPane.add(p);
		layeredPane.repaint();
		layeredPane.revalidate();
		
	}

	/**
	 * Create the frame.
	 */
	public VentanaInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 1564, 882); 838
		setExtendedState(MAXIMIZED_BOTH);
		setSize(1561, 838);
		setLocationRelativeTo(null); // la ventana se mantiene en el centro de la pantalla
		contentPane = new JPanel();
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setToolTipText("Buscar en la plataforma...");
		contentPane.setFont(new Font("Arial", Font.PLAIN, 13));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelIzq = new JPanel();
		panelIzq.setBounds(0, 0, 370, 801);
		panelIzq.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelIzq.setBackground(new Color(0, 0, 153));
		panelIzq.setForeground(Color.BLACK);
		contentPane.add(panelIzq);
		panelIzq.setLayout(null);
		
		JPanel panelMu = new JPanel();
		panelMu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelMu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelMu.setBackground(new Color(0, 51, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelMu.setBackground(new Color(0, 51, 204));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Switch_screen(panelMujer);
			}
		});
		panelMu.setBackground(new Color(0, 51, 204));
		panelMu.setBounds(0, 210, 370, 72);
		panelIzq.add(panelMu);
		panelMu.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("MUJER");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(64, 21, 200, 29);
		panelMu.add(lblNewLabel_1);
		
		JPanel panelHom = new JPanel();
		panelHom.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelHom.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelHom.setBackground(new Color(0, 51, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelHom.setBackground(new Color(0, 51, 204));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Switch_screen(panelHombre);
			}
		});
		panelHom.setBorder(null);
		panelHom.setBackground(new Color(0, 51, 204));
		panelHom.setBounds(0, 281, 370, 72);
		panelIzq.add(panelHom);
		panelHom.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("HOMBRE");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(65, 22, 200, 29);
		panelHom.add(lblNewLabel_2);
		
		JPanel panelNi = new JPanel();
		panelNi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelNi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelNi.setBackground(new Color(0, 51, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelNi.setBackground(new Color(0, 51, 204));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Switch_screen(panelNinos);
			}
		});
		panelNi.setBackground(new Color(0, 51, 204));
		panelNi.setBounds(0, 351, 370, 72);
		panelIzq.add(panelNi);
		panelNi.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("NI\u00D1OS");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(66, 26, 200, 23);
		panelNi.add(lblNewLabel_3);
		
		JPanel panelHo = new JPanel();
		panelHo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelHo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelHo.setBackground(new Color(0, 51, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelHo.setBackground(new Color(0, 51, 204));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Switch_screen(panelHogar);
			}
		});
		panelHo.setBackground(new Color(0, 51, 204));
		panelHo.setBounds(0, 421, 370, 72);
		panelIzq.add(panelHo);
		panelHo.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("HOGAR");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(66, 24, 188, 27);
		panelHo.add(lblNewLabel_4);
		
		JPanel panelSob = new JPanel();
		panelSob.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelSob.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelSob.setBackground(new Color(0, 51, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelSob.setBackground(new Color(0, 51, 204));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Switch_screen(panelNosotros);
			}
		});
		panelSob.setBackground(new Color(0, 51, 204));
		panelSob.setBounds(0, 492, 370, 72);
		panelIzq.add(panelSob);
		panelSob.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("SOBRE NOSOTROS");
		lblNewLabel_6.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(65, 25, 229, 24);
		panelSob.add(lblNewLabel_6);
		
		JPanel panelPlat = new JPanel();
		panelPlat.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelPlat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelPlat.setBackground(new Color(0, 51, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelPlat.setBackground(new Color(0, 51, 204));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Switch_screen(panelPlataforma);
			}
		});
		panelPlat.setBackground(new Color(0, 51, 204));
		panelPlat.setBounds(0, 562, 370, 72);
		panelIzq.add(panelPlat);
		panelPlat.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("NUESTRA PLATAFORMA");
		lblNewLabel_5.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(66, 20, 299, 27);
		panelPlat.add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(444, 18, 32, 32);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(VentanaInicio.class.getResource("/Imagenes/lupa.png")));
		contentPane.add(lblNewLabel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(479, 50, 532, 2);
		contentPane.add(separator_1);
		
		JLabel lblRegistrar = new JLabel("REGISTRATE | INICIA SESI\u00D3N");
		lblRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblRegistrar.setForeground(new Color(0, 51, 204));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblRegistrar.setForeground(Color.BLACK);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				VentanaLogin newframe = new VentanaLogin();
				newframe.setVisible(true);
				dispose();
			}
		});
		lblRegistrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblRegistrar.setBounds(1028, 16, 228, 32);
		contentPane.add(lblRegistrar);
		
		JLabel lblSubirP = new JLabel("SUBIR PRODUCTO");
		lblSubirP.setBorder(new LineBorder(Color.BLACK));
		lblSubirP.setBackground(Color.WHITE);
		lblSubirP.setForeground(Color.BLACK);
		lblSubirP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblSubirP.setForeground(new Color(0, 51, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblSubirP.setForeground(Color.BLACK);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				VentanaLogin newframe = new VentanaLogin();
				newframe.setVisible(true);
				dispose();
			}
		});
		lblSubirP.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblSubirP.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubirP.setToolTipText("");
		lblSubirP.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblSubirP.setBounds(1256, 16, 191, 32);
		contentPane.add(lblSubirP);
		
		JLabel lblInterro = new JLabel("");
		lblInterro.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblInterro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				VentanaAsistencia newframe = new VentanaAsistencia();
//				newframe.setVisible(true);
//				dispose();
			}
		});
		lblInterro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblInterro.setHorizontalAlignment(SwingConstants.CENTER);
		lblInterro.setIcon(new ImageIcon(VentanaInicio.class.getResource("/Imagenes/interrogacion.png")));
		lblInterro.setBounds(1471, 18, 45, 32);
		contentPane.add(lblInterro);
		
		txtBuscarEnLa = new JTextField();
		txtBuscarEnLa.setFont(new Font("Arial Black", Font.PLAIN, 13));
		txtBuscarEnLa.setForeground(new Color(192, 192, 192));
		txtBuscarEnLa.setText("Buscar en la plataforma...");
		txtBuscarEnLa.setBorder(null);
		txtBuscarEnLa.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				txtBuscarEnLa.setText("");
				txtBuscarEnLa.setForeground(Color.BLACK);
			}
		});

		txtBuscarEnLa.setBounds(479, 18, 532, 32);
		contentPane.add(txtBuscarEnLa);
		txtBuscarEnLa.setColumns(10);
		
		
//		layeredPane
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(380, 72, 1150, 719);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		// panelIntro
		
		panelIntro = new JPanel();
		layeredPane.add(panelIntro, "name_64702364051000");
		
		// panelMujer
		
		panelMujer = new JPanel();
		layeredPane.add(panelMujer, "name_64702387634800");
		
		// panelHombre
		
		panelHombre = new JPanel();
		layeredPane.add(panelHombre, "name_64702409897200");
		
		// panelNinos
		
		panelNinos = new JPanel();
		layeredPane.add(panelNinos, "name_64702431449800");
		
		// panelHogar
		
		panelHogar = new JPanel();
		layeredPane.add(panelHogar, "name_64702449338500");
		
		// panelNosotros
		
		panelNosotros = new JPanel();
		panelNosotros.setBackground(Color.WHITE);
		layeredPane.add(panelNosotros, "name_64702466116200");
		panelNosotros.setLayout(null);
		
		JTextPane txtpnAFinDe = new JTextPane();
		txtpnAFinDe.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtpnAFinDe.setEditable(false);
		txtpnAFinDe.setPreferredSize(new Dimension(488, 314));
		txtpnAFinDe.setToolTipText("");
		txtpnAFinDe.setText("A fin de abastecer y promover la reutilizaci\u00F3n de pertenencias de otras personas, se dise\u00F1o [esta pagina web]. Debido a que cada dia somos conscientes de que reciclar es un buen camino para la sostenibilidad de nuestro planeta. \r\n\r\nEsta app tiene como onjetivo facilitar ese enlace de comunicaci\u00F3n entre personas. Y si fuera poco, aportar a esta causa te genera recompensas con las que podras usarlas para futuras compras. Vaciando un espacio tuyo, y rellenando el de los demas.\r\n\r\nTeniendo como objetivos:");
		txtpnAFinDe.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 19));
		txtpnAFinDe.setBounds(35, 110, 488, 314);
		panelNosotros.add(txtpnAFinDe);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon(VentanaInicio.class.getResource("/ImgFondos/fondoTrabajo.jpg")));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(523, 10, 617, 343);
		panelNosotros.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8_1 = new JLabel("");
		lblNewLabel_8_1.setIcon(new ImageIcon(VentanaInicio.class.getResource("/Imagenes/el-planeta-tierra.png")));
		lblNewLabel_8_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8_1.setBounds(188, 434, 147, 128);
		panelNosotros.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("");
		lblNewLabel_8_1_1.setIcon(new ImageIcon(VentanaInicio.class.getResource("/Imagenes/ahorro-de-dinero.png")));
		lblNewLabel_8_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8_1_1.setBounds(493, 434, 147, 128);
		panelNosotros.add(lblNewLabel_8_1_1);
		
		JLabel lblNewLabel_8_1_2 = new JLabel("");
		lblNewLabel_8_1_2.setIcon(new ImageIcon(VentanaInicio.class.getResource("/Imagenes/corazon.png")));
		lblNewLabel_8_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8_1_2.setBounds(806, 434, 147, 128);
		panelNosotros.add(lblNewLabel_8_1_2);
		
		JLabel lblNewLabel_9 = new JLabel("PROMOVER UN");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(136, 583, 253, 19);
		panelNosotros.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("CONSUMO SOSTENIBLE");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblNewLabel_10.setBounds(136, 600, 253, 30);
		panelNosotros.add(lblNewLabel_10);
		
		JLabel lblNewLabel_9_1 = new JLabel("FOMENTAR UNA");
		lblNewLabel_9_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblNewLabel_9_1.setBounds(443, 583, 253, 19);
		panelNosotros.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_10_1 = new JLabel("ECONONOM\u00CDA EFICIENTE");
		lblNewLabel_10_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblNewLabel_10_1.setBounds(440, 600, 267, 30);
		panelNosotros.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_9_1_1 = new JLabel("ENRIQUEZER DE");
		lblNewLabel_9_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9_1_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblNewLabel_9_1_1.setBounds(757, 583, 253, 19);
		panelNosotros.add(lblNewLabel_9_1_1);
		
		JLabel lblNewLabel_10_1_1 = new JLabel("CONFIANZA Y AMISTAD");
		lblNewLabel_10_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10_1_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblNewLabel_10_1_1.setBounds(757, 600, 267, 30);
		panelNosotros.add(lblNewLabel_10_1_1);
		
		JTextPane txtpnSalvarAl = new JTextPane();
		txtpnSalvarAl.setEditable(false);
		txtpnSalvarAl.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtpnSalvarAl.setFont(new Font("Arial Black", Font.ITALIC, 20));
		txtpnSalvarAl.setText("\" SALVAR AL PLANETA\r\n    MERECE LA PENA \"");
		txtpnSalvarAl.setBounds(114, 21, 275, 69);
		panelNosotros.add(txtpnSalvarAl);
		
		// panelPlataforma
		
		panelPlataforma = new JPanel();
		panelPlataforma.setLayout(null);
		panelPlataforma.setBackground(Color.WHITE);
		layeredPane.add(panelPlataforma, "name_109898942781900");
		
		JLabel lblNewLabel_8 = new JLabel("INFORMACI\u00D3N GENERAL Y FUNCIONAMIENTO");
		lblNewLabel_8.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(10, 0, 485, 42);
		panelPlataforma.add(lblNewLabel_8);
		
		JTextArea txtrqueEs = new JTextArea();
		txtrqueEs.setEditable(false);
		txtrqueEs.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtrqueEs.setText("1- \u00BFQue es [esta app]?\r\n\t[esta app] es un servicio que confecciona distintas\r\n\tpertenencias que provienen de los usuarios que \r\n\testan registrado en esta plataforma. El cual permite\r\n\tINTERCAMBIAR, COMPRAR, \tVENDER y DONAR articulos\r\n\ta la gente ....\r\n2- \u00BFUsuario o Visitante?\r\n\tVisitante: Es aquella persona que usa la plataforma sin\r\n\testar REGISTRADA.\r\n\r\n\tUsuario: Es aquel que dispone de una cuenta en la misma.\r\n\tPor tanto, se convierte en consumidor al publicar art\u00EDculos.\r\n\r\n3- \u00BFComo registrarse en [esta web]?\r\n\t\r\n4- \u00BFComo vender Art\u00EDculos en [esta web]?\r\n\r\n5- \u00BFQue tipos de Art\u00EDculos se pueden vender en [esta web]?\r\n\r\n6- \u00BFComo efectuar el Intercambio?\r\n\r\n7- \u00BFComo efectuar el Envio?\r\n\r\n8- \u00BFComo efectuar el Pago?");
		txtrqueEs.setBounds(10, 50, 554, 293);
		panelPlataforma.add(txtrqueEs);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setBounds(10, 353, 554, 307);
		panelPlataforma.add(lblNewLabel_11);
		
	}
}
