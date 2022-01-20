import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JInternalFrame;
import java.awt.Point;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTable;
import java.awt.Scrollbar;
import javax.swing.JRadioButtonMenuItem;
import java.awt.TextArea;
import javax.swing.Box;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Cursor;
import javax.swing.JSeparator;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;

public class VentanaRegistrado extends JFrame {

	private JPanel contentPane;
	private JTextField txtBuscarEnLa;
	private JLayeredPane layeredPane;
	private JPanel panelPerfil;
	private JPanel panelBuscar;
	private JPanel panelVender;
	private JPanel panelMensajes;
	private JPanel panelInicio;
	private JTextField txtAnNoHay;
	private JTextField txtBuscar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistrado frame = new VentanaRegistrado();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void switchscreen(JPanel p) {
		layeredPane.removeAll();
		layeredPane.add(p);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	/**
	 * Create the frame.
	 */
	public VentanaRegistrado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 1564, 882); 838
		setExtendedState(MAXIMIZED_BOTH); // la ventana se expande por toda la pantalla
		setSize(1561, 838);
		setLocationRelativeTo(null); // la ventana se mantiene en el centro de la pantalla
		contentPane = new JPanel();
		contentPane.setFont(new Font("Arial", Font.PLAIN, 13));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelIzq = new JPanel();
		panelIzq.setBounds(0, 0, 280, 801);
		panelIzq.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelIzq.setBackground(new Color(0, 0, 153));
		panelIzq.setForeground(Color.BLACK);
		contentPane.add(panelIzq);
		panelIzq.setLayout(null);
		
		final JPanel panelIni = new JPanel();
		panelIni.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelIni.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelIni.setBackground(new Color(0, 51, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelIni.setBackground(new Color(0, 51, 204));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				switchscreen(panelInicio);
			}
		});
		panelIni.setBackground(new Color(0, 51, 204));
		panelIni.setBounds(0, 210, 280, 72);
		panelIzq.add(panelIni);
		panelIni.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("INICIO");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(64, 21, 200, 29);
		panelIni.add(lblNewLabel_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("");
		lblNewLabel_5_1_1.setIcon(new ImageIcon(VentanaRegistrado.class.getResource("/Imagenes/hogar (1).png")));
		lblNewLabel_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_1.setBounds(10, 10, 56, 52);
		panelIni.add(lblNewLabel_5_1_1);
		
		final JPanel panelBus = new JPanel();
		panelBus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelBus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelBus.setBackground(new Color(0, 51, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelBus.setBackground(new Color(0, 51, 204));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				switchscreen(panelBuscar);
			}
		});
		panelBus.setBorder(null);
		panelBus.setBackground(new Color(0, 51, 204));
		panelBus.setBounds(0, 281, 280, 72);
		panelIzq.add(panelBus);
		panelBus.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("BUSCAR");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(65, 22, 200, 29);
		panelBus.add(lblNewLabel_2);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setIcon(new ImageIcon(VentanaRegistrado.class.getResource("/Imagenes/lupa.png")));
		lblNewLabel_5_1.setBounds(10, 10, 56, 52);
		panelBus.add(lblNewLabel_5_1);
		
		final JPanel panelVen = new JPanel();
		panelVen.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelVen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelVen.setBackground(new Color(0, 51, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelVen.setBackground(new Color(0, 51, 204));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				switchscreen(panelVender);
			}
		});
		panelVen.setBackground(new Color(0, 51, 204));
		panelVen.setBounds(0, 351, 280, 72);
		panelIzq.add(panelVen);
		panelVen.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("VENDER");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(66, 26, 200, 23);
		panelVen.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5_1_2 = new JLabel("");
		lblNewLabel_5_1_2.setIcon(new ImageIcon(VentanaRegistrado.class.getResource("/Imagenes/mas.png")));
		lblNewLabel_5_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_2.setBounds(10, 10, 56, 52);
		panelVen.add(lblNewLabel_5_1_2);
		
		final JPanel panelMen = new JPanel();
		panelMen.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelMen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelMen.setBackground(new Color(0, 51, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelMen.setBackground(new Color(0, 51, 204));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				switchscreen(panelMensajes);
			}
		});
		panelMen.setBackground(new Color(0, 51, 204));
		panelMen.setBounds(0, 421, 280, 72);
		panelIzq.add(panelMen);
		panelMen.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("MENSAJES");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(66, 24, 188, 27);
		panelMen.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5_1_3 = new JLabel("");
		lblNewLabel_5_1_3.setIcon(new ImageIcon(VentanaRegistrado.class.getResource("/Imagenes/carta.png")));
		lblNewLabel_5_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_3.setBounds(10, 10, 56, 52);
		panelMen.add(lblNewLabel_5_1_3);
		
		final JPanel panelPer = new JPanel();
		panelPer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelPer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelPer.setBackground(new Color(0, 51, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelPer.setBackground(new Color(0, 51, 204));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				switchscreen(panelPerfil);
			}
		});
		panelPer.setBackground(new Color(0, 51, 204));
		panelPer.setBounds(0, 492, 280, 72);
		panelIzq.add(panelPer);
		panelPer.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("PERFIL");
		lblNewLabel_6.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(65, 25, 181, 24);
		panelPer.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5_1_4 = new JLabel("");
		lblNewLabel_5_1_4.setIcon(new ImageIcon(VentanaRegistrado.class.getResource("/Imagenes/gente (2).png")));
		lblNewLabel_5_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_4.setBounds(10, 10, 56, 52);
		panelPer.add(lblNewLabel_5_1_4);
		
		txtBuscarEnLa = new JTextField();
		txtBuscarEnLa.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				txtBuscarEnLa.setText("");
				txtBuscarEnLa.setForeground(Color.BLACK);
			}
		});
		txtBuscarEnLa.setFont(new Font("Arial Black", Font.PLAIN, 13));
		txtBuscarEnLa.setText("Buscar en la plataforma...");
		txtBuscarEnLa.setBounds(479, 18, 532, 32);
		txtBuscarEnLa.setDisabledTextColor(new Color(109, 109, 109));
		txtBuscarEnLa.setCaretColor(new Color(0, 0, 0));
		txtBuscarEnLa.setBorder(null);
		txtBuscarEnLa.setBackground(new Color(255, 255, 255));
		txtBuscarEnLa.setForeground(Color.LIGHT_GRAY);
		contentPane.add(txtBuscarEnLa);
		txtBuscarEnLa.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(444, 18, 32, 32);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(VentanaRegistrado.class.getResource("/Imagenes/lupa.png")));
		contentPane.add(lblNewLabel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(479, 50, 532, 2);
		contentPane.add(separator_1);
		
		JLabel lblInterro = new JLabel("");
		lblInterro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				VentanaAsistencia newframe = new VentanaAsistencia();
				newframe.setVisible(true);
				dispose();
			}
		});
		lblInterro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblInterro.setHorizontalAlignment(SwingConstants.CENTER);
		lblInterro.setIcon(new ImageIcon(VentanaRegistrado.class.getResource("/Imagenes/interrogacion.png")));
		lblInterro.setBounds(1471, 18, 45, 32);
		contentPane.add(lblInterro);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(290, 73, 1240, 718);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		panelPerfil = new JPanel();
		layeredPane.add(panelPerfil, "name_20240932910100");
		panelPerfil.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon(VentanaRegistrado.class.getResource("/Imagenes/icono perfil.png")));
		lblNewLabel_7.setBounds(10, 25, 485, 413);
		panelPerfil.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("USUARIO:");
		lblNewLabel_8.setBounds(31, 449, 97, 67);
		panelPerfil.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("UBICACION:\r\n");
		lblNewLabel_9.setBounds(31, 517, 97, 25);
		panelPerfil.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("DESCRIPCION USUARIO:");
		lblNewLabel_10.setBounds(31, 566, 161, 25);
		panelPerfil.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("\r\nAJUSTES :");
		lblNewLabel_11.setBounds(31, 612, 81, 14);
		panelPerfil.add(lblNewLabel_11);
		
		panelBuscar = new JPanel();
		layeredPane.add(panelBuscar, "name_20246212901900");
		panelBuscar.setLayout(null);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setBounds(178, 106, 300, 142);
		lblNewLabel_13.setIcon(new ImageIcon(VentanaRegistrado.class.getResource("/Imagenes/lupa.png")));
		panelBuscar.add(lblNewLabel_13);
		
		txtBuscar = new JTextField();
		txtBuscar.setText("BUSCAR: ...");
		txtBuscar.setBounds(178, 216, 86, 20);
		panelBuscar.add(txtBuscar);
		txtBuscar.setColumns(10);
		
		panelVender = new JPanel();
		layeredPane.add(panelVender, "name_20250574729300");
		panelVender.setLayout(null);
		
		JLabel lblNewLabel_20= new JLabel("");
		lblNewLabel_20.setIcon(new ImageIcon(VentanaRegistrado.class.getResource("/Imagenes/camara.png")));
		lblNewLabel_20.setBounds(10, 10, 463, 380);
		panelVender.add(lblNewLabel_20);
		
		panelMensajes = new JPanel();
		layeredPane.add(panelMensajes, "name_20254777720100");
		panelMensajes.setLayout(null);
		
		panelInicio = new JPanel();
		layeredPane.add(panelInicio, "name_20254777720667");
		panelInicio.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(VentanaRegistrado.class.getResource("/ImgFondos/img_fondoCarta.jpg")));
		lblNewLabel_5.setBounds(666, 10, 564, 570);
		panelMensajes.add(lblNewLabel_5);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(VentanaRegistrado.class.getResource("/Imagenes/mensajes icono.png")));
		lblNewLabel_12.setBounds(99, 23, 423, 256);
		panelMensajes.add(lblNewLabel_12);
		
		txtAnNoHay = new JTextField();
		txtAnNoHay.setEditable(false);
		txtAnNoHay.setText("A\u00DAN NO HAY MENSAJES NUEVOS.\r\n");
		txtAnNoHay.setBounds(99, 336, 312, 20);
		panelMensajes.add(txtAnNoHay);
		txtAnNoHay.setColumns(10);
	}
}
