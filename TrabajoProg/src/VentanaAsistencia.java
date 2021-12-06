import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JMenuBar;
import java.awt.CardLayout;
import javax.swing.JTable;
import java.awt.Dimension;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextPane;

public class VentanaAsistencia extends JFrame {

	private JPanel contentPane;
	private JLayeredPane layeredPane_1;
	private JPanel panelCovid;
	private JPanel panelVender;
	private JPanel panelComprar;
	private JPanel panelEnvios;
	private JPanel panelSeguridad;
	private JPanel panelComunidad;
	private JPanel panelInicio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAsistencia frame = new VentanaAsistencia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void Switchscreen(JPanel p) {
		layeredPane_1.removeAll();
		layeredPane_1.add(p);
		layeredPane_1.repaint();
		layeredPane_1.revalidate();
	}

	/**
	 * Create the frame.
	 */
	public VentanaAsistencia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 1564, 882); 838
		setExtendedState(MAXIMIZED_BOTH);
		
		
		setSize(1561, 838);
		setLocationRelativeTo(null); // la ventana se mantiene en el centro de la pantalla
		contentPane = new JPanel();
		contentPane.setFont(new Font("Arial", Font.PLAIN, 13));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelIzq = new JPanel();
		panelIzq.setBounds(0, 78, 1540, 49);
		panelIzq.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelIzq.setBackground(new Color(0, 0, 153));
		panelIzq.setForeground(Color.BLACK);
		contentPane.add(panelIzq);
		panelIzq.setLayout(null);
		
		final JPanel panelCom = new JPanel();
		panelCom.setBounds(665, 10, 212, 29);
		panelIzq.add(panelCom);
		panelCom.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelCom.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelCom.setBackground(new Color(0, 51, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelCom.setBackground(new Color(0, 51, 204));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Switchscreen(panelComprar);
			}
		});
		panelCom.setBackground(new Color(0, 51, 204));
		panelCom.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("COMPRAR");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(10, 0, 192, 30);
		panelCom.add(lblNewLabel_6);
		
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
				Switchscreen(panelVender);
			}
		});
		panelVen.setLayout(null);
		panelVen.setBackground(new Color(0, 51, 204));
		panelVen.setBounds(455, 10, 212, 29);
		panelIzq.add(panelVen);
		
		JLabel lblNewLabel_6_1 = new JLabel("VENDER");
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setForeground(Color.WHITE);
		lblNewLabel_6_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_6_1.setBounds(10, 0, 192, 31);
		panelVen.add(lblNewLabel_6_1);
		
		final JPanel panelCov = new JPanel();
		panelCov.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelCov.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelCov.setBackground(new Color(0, 51, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelCov.setBackground(new Color(0, 51, 204));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Switchscreen(panelCovid);
			}
		});
		panelCov.setLayout(null);
		panelCov.setBackground(new Color(0, 51, 204));
		panelCov.setBounds(244, 10, 212, 29);
		panelIzq.add(panelCov);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("COVID-19");
		lblNewLabel_6_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1_1.setForeground(Color.WHITE);
		lblNewLabel_6_1_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_6_1_1.setBounds(10, 0, 192, 29);
		panelCov.add(lblNewLabel_6_1_1);
		
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
				Switchscreen(panelInicio);
			}
		});
		panelIni.setLayout(null);
		panelIni.setBackground(new Color(0, 51, 204));
		panelIni.setBounds(33, 10, 212, 29);
		panelIzq.add(panelIni);
		
		JLabel lblNewLabel_6_1_2 = new JLabel("INICIO");
		lblNewLabel_6_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1_2.setForeground(Color.WHITE);
		lblNewLabel_6_1_2.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_6_1_2.setBounds(10, 0, 192, 29);
		panelIni.add(lblNewLabel_6_1_2);
		
		final JPanel panelEnv = new JPanel();
		panelEnv.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelEnv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelEnv.setBackground(new Color(0, 51, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelEnv.setBackground(new Color(0, 51, 204));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Switchscreen(panelEnvios);
			}
		});
		panelEnv.setLayout(null);
		panelEnv.setBackground(new Color(0, 51, 204));
		panelEnv.setBounds(875, 10, 212, 29);
		panelIzq.add(panelEnv);
		
		JLabel lblNewLabel_6_1_3 = new JLabel("ENVIOS");
		lblNewLabel_6_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1_3.setForeground(Color.WHITE);
		lblNewLabel_6_1_3.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_6_1_3.setBounds(10, 0, 192, 30);
		panelEnv.add(lblNewLabel_6_1_3);
		
		final JPanel panelSegu = new JPanel();
		panelSegu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelSegu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelSegu.setBackground(new Color(0, 51, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelSegu.setBackground(new Color(0, 51, 204));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Switchscreen(panelSeguridad);
			}
		});
		panelSegu.setLayout(null);
		panelSegu.setBackground(new Color(0, 51, 204));
		panelSegu.setBounds(1085, 10, 212, 29);
		panelIzq.add(panelSegu);
		
		JLabel lblNewLabel_6_1_4 = new JLabel("SEGURIDAD");
		lblNewLabel_6_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1_4.setForeground(Color.WHITE);
		lblNewLabel_6_1_4.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_6_1_4.setBounds(10, 0, 192, 30);
		panelSegu.add(lblNewLabel_6_1_4);
		
		final JPanel panelComu = new JPanel();
		panelComu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelComu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelComu.setBackground(new Color(0, 51, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelComu.setBackground(new Color(0, 51, 204));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Switchscreen(panelComunidad);
			}
		});
		panelComu.setBounds(1296, 10, 213, 29);
		panelIzq.add(panelComu);
		panelComu.setLayout(null);
		panelComu.setBackground(new Color(0, 51, 204));
		
		JLabel lblNewLabel_6_1_4_1 = new JLabel("COMUNIDAD");
		lblNewLabel_6_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1_4_1.setForeground(Color.WHITE);
		lblNewLabel_6_1_4_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_6_1_4_1.setBounds(10, 0, 192, 30);
		panelComu.add(lblNewLabel_6_1_4_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VentanaAsistencia.class.getResource("/Imagenes/lupa.png")));
		lblNewLabel.setBounds(444, 18, 32, 32);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNewLabel.setIcon(new ImageIcon(VentanaRegistrado.class.getResource("/iconos/lupa.png")));
		contentPane.add(lblNewLabel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(479, 50, 532, 2);
		separator_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		separator_1.setForeground(Color.BLACK);
		contentPane.add(separator_1);
		
		final JLabel lblRegistrar = new JLabel("REGISTRATE | INICIA SESI\u00D3N");
		lblRegistrar.setBounds(1028, 16, 228, 32);
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
		contentPane.add(lblRegistrar);
		
		final JLabel lblSubirP = new JLabel("SUBIR PRODUCTO");
		lblSubirP.setBounds(1256, 16, 191, 32);
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
		contentPane.add(lblSubirP);
		
		JLabel lblInterro = new JLabel("");
		lblInterro.setIcon(new ImageIcon(VentanaAsistencia.class.getResource("/Imagenes/interrogacion.png")));
		lblInterro.setBounds(1471, 18, 45, 32);
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
//		lblInterro.setIcon(new ImageIcon(VentanaRegistrado.class.getResource("/iconos/interrogacion.png")));
		contentPane.add(lblInterro);
		
		JLabel lblNewLabel_1 = new JLabel("Centro de Asistencia");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(33, 10, 377, 69);
		contentPane.add(lblNewLabel_1);
		
//		JLayeredPane: serie de ventanas que seran llamadas mediente botones
		
		layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(10, 137, 1520, 654);
		contentPane.add(layeredPane_1);
		layeredPane_1.setLayout(new CardLayout(0, 0));
		
		// panelInicio: este panel sera llamado al pulsar [Inicio]. En el mostraremos los distintos campos de información que se encuentran
		
		panelInicio = new JPanel();
		panelInicio.setBackground(new Color(255, 255, 255));
		layeredPane_1.add(panelInicio, "name_82817569209700");
		panelInicio.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("TEMAS GENERALES");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(88, 10, 440, 80);
		panelInicio.add(lblNewLabel_2);
		
		final JPanel panCovid = new JPanel();
		panCovid.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panCovid.setBackground(Color.LIGHT_GRAY); // Si el mouse entra, cambiara de color
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panCovid.setBackground(Color.WHITE); // Si el mouse sale, volvera a su color inicial
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Switchscreen(panelCovid); // saltara al panel [panelCovid]
			}
		});
		panCovid.setBackground(Color.WHITE);
		panCovid.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panCovid.setBounds(88, 100, 257, 238);
		panelInicio.add(panCovid);
		panCovid.setLayout(null);
		
		JLabel lblNewLabel_5_4 = new JLabel("");
		lblNewLabel_5_4.setBounds(33, 21, 194, 153);
		panCovid.add(lblNewLabel_5_4);
		lblNewLabel_5_4.setIcon(new ImageIcon(VentanaAsistencia.class.getResource("/Imagenes/mascarilla-protectora.png")));
		lblNewLabel_5_4.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_4 = new JLabel("COVID-19");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4.setBounds(33, 184, 194, 40);
		panCovid.add(lblNewLabel_4);
		
		final JPanel panVender = new JPanel();
		panVender.setBackground(Color.WHITE);
		panVender.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panVender.setBackground(Color.LIGHT_GRAY); // Si el mouse entra, cambiara de color
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panVender.setBackground(Color.WHITE); // Si el mouse sale, volvera a su color inicial
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Switchscreen(panelVender); // Saltara al panel [panelVender]
			}
		});
		panVender.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panVender.setLayout(null);
		panVender.setBounds(386, 100, 257, 238);
		panelInicio.add(panVender);
		
		JLabel lblNewLabel_5_4_1 = new JLabel("");
		lblNewLabel_5_4_1.setIcon(new ImageIcon(VentanaAsistencia.class.getResource("/Imagenes/vendido (3).png")));
		lblNewLabel_5_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_4_1.setBounds(33, 21, 194, 153);
		panVender.add(lblNewLabel_5_4_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("VENDER");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4_1.setBounds(33, 184, 194, 40);
		panVender.add(lblNewLabel_4_1);
		
		final JPanel panComprar = new JPanel();
		panComprar.setBackground(Color.WHITE);
		panComprar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panComprar.setBackground(Color.LIGHT_GRAY); // Si el mouse entra, cambiara de color
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panComprar.setBackground(Color.WHITE); // Si el mouse sale, volvera a su color inicial
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Switchscreen(panelComprar); // Saltara al panel [panelComprar]
			}
		});
		panComprar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panComprar.setLayout(null);
		panComprar.setBounds(689, 100, 257, 238);
		panelInicio.add(panComprar);
		
		JLabel lblNewLabel_5_4_2 = new JLabel("");
		lblNewLabel_5_4_2.setIcon(new ImageIcon(VentanaAsistencia.class.getResource("/Imagenes/compras.png")));
		lblNewLabel_5_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_4_2.setBounds(33, 21, 194, 153);
		panComprar.add(lblNewLabel_5_4_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("COMPRAR");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4_2.setBounds(33, 184, 194, 40);
		panComprar.add(lblNewLabel_4_2);
		
		final JPanel panEnvios = new JPanel();
		panEnvios.setBackground(Color.WHITE);
		panEnvios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panEnvios.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panEnvios.setBackground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Switchscreen(panelEnvios);
			}
		});
		panEnvios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panEnvios.setLayout(null);
		panEnvios.setBounds(88, 375, 257, 238);
		panelInicio.add(panEnvios);
		
		JLabel lblNewLabel_5_4_3 = new JLabel("");
		lblNewLabel_5_4_3.setIcon(new ImageIcon(VentanaAsistencia.class.getResource("/Imagenes/enviando.png")));
		lblNewLabel_5_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_4_3.setBounds(33, 21, 194, 153);
		panEnvios.add(lblNewLabel_5_4_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("ENVIOS");
		lblNewLabel_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4_3.setBounds(33, 184, 194, 40);
		panEnvios.add(lblNewLabel_4_3);
		
		final JPanel panSeguridad = new JPanel();
		panSeguridad.setBackground(Color.WHITE);
		panSeguridad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panSeguridad.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panSeguridad.setBackground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Switchscreen(panelSeguridad);
			}
		});
		panSeguridad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panSeguridad.setLayout(null);
		panSeguridad.setBounds(386, 375, 257, 238);
		panelInicio.add(panSeguridad);
		
		JLabel lblNewLabel_5_4_4 = new JLabel("");
		lblNewLabel_5_4_4.setIcon(new ImageIcon(VentanaAsistencia.class.getResource("/Imagenes/escudo.png")));
		lblNewLabel_5_4_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_4_4.setBounds(33, 21, 194, 153);
		panSeguridad.add(lblNewLabel_5_4_4);
		
		JLabel lblNewLabel_4_4 = new JLabel("SEGURIDAD");
		lblNewLabel_4_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_4.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4_4.setBounds(33, 184, 194, 40);
		panSeguridad.add(lblNewLabel_4_4);
		
		final JPanel panComunidad = new JPanel();
		panComunidad.setBackground(Color.WHITE);
		panComunidad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panComunidad.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panComunidad.setBackground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Switchscreen(panelComunidad);
			}
		});
		panComunidad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panComunidad.setLayout(null);
		panComunidad.setBounds(689, 375, 257, 238);
		panelInicio.add(panComunidad);
		
		JLabel lblNewLabel_5_4_5 = new JLabel("");
		lblNewLabel_5_4_5.setIcon(new ImageIcon(VentanaAsistencia.class.getResource("/Imagenes/personas.png")));
		lblNewLabel_5_4_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_4_5.setBounds(33, 21, 194, 153);
		panComunidad.add(lblNewLabel_5_4_5);
		
		JLabel lblNewLabel_4_5 = new JLabel("COMUNIDAD");
		lblNewLabel_4_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4_5.setBounds(33, 184, 194, 40);
		panComunidad.add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setIcon(new ImageIcon(VentanaAsistencia.class.getResource("/ImgFondos/fondoWeb.jpg")));
		lblNewLabel_3.setBounds(1035, 0, 485, 654);
		panelInicio.add(lblNewLabel_3);
		
		panelCovid = new JPanel();
		panelCovid.setBackground(Color.WHITE);
		layeredPane_1.add(panelCovid, "name_82817595900000");
		panelCovid.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("QUE ES EL COVID-19");
		lblNewLabel_5.setForeground(new Color(50, 205, 50));
		lblNewLabel_5.setBounds(63, 10, 363, 45);
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		panelCovid.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("PRECAUCI\u00D3N CONTRA COVID-19");
		lblNewLabel_5_1.setForeground(new Color(50, 205, 50));
		lblNewLabel_5_1.setBounds(825, 299, 363, 45);
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_1.setFont(new Font("Arial", Font.PLAIN, 20));
		panelCovid.add(lblNewLabel_5_1);
		
		JTextPane txtTextoCovid = new JTextPane();
		txtTextoCovid.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtTextoCovid.setText("La enfermedad por coronavirus (COVID\u201119) es una enfermedad infecciosa provocada por el virus SARS-CoV-2.\r\n\r\nLa mayor\u00EDa de las personas que padecen COVID\u201119 sufren s\u00EDntomas de intensidad leve a moderada y se recuperan sin necesidad de tratamientos especiales. \r\nSin embargo, algunas personas desarrollan casos graves y necesitan atenci\u00F3n m\u00E9dica.\r\n\r\nEn este caso nuestra tienda tiene varias medidas al respecto para as\u00ED evitar problemas futuros");
		txtTextoCovid.setBounds(35, 65, 427, 187);
		panelCovid.add(txtTextoCovid);
		
		JTextPane txtpnPrecaucionCovid = new JTextPane();
		txtpnPrecaucionCovid.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtpnPrecaucionCovid.setText("-L\u00E1vate las manos minuciosa y frecuentemente durante al menos 20 segundos para eliminar los virus. Nuestros productos est\u00E1n perfextamente controlados y desinfectados para que no llegue ning\u00FAn tipo de germen al cliente.\r\n\r\n-Evita tocarte la cara. De esta manera, reduces las posibilidades de que el virus se transfiera de tus manos a tus ojos, nariz o boca. \r\n\r\n-T\u00E1pate la nariz y la boca con un pa\u00F1uelo cuando tosas o estornudes, y t\u00EDralo y l\u00E1vate las manos inmediatamente despu\u00E9s. Tambi\u00E9n puedes taparte con la manga o la parte interior del codo, pero no uses las manos para evitar propagar el virus.\r\n\r\n-Mant\u00E9n una distancia de seguridad de al menos 2 metros, especialmente si alguien tose o estornuda; as\u00ED tendr\u00E1s menos probabilidades de contagiarte. Presta especial atenci\u00F3n si vives con alguien de un grupo de riesgo.\r\n\r\n-Si no te sientes bien, qu\u00E9date en casa.\r\n\r\n-Si empiezas a tener fiebre y tos o te cuesta respirar, solicita asistencia m\u00E9dica.\r\n\r\n-Da prioridad a tu salud y la de tu comunidad y sigue las recomendaciones de las autoridades locales e internacionales.\r\nNuestra tienda intenta en todo lo posible que te contagies as\u00ED que toma varias medidas de precauci\u00F3n al respecto.");
		txtpnPrecaucionCovid.setBounds(673, 340, 515, 237);
		panelCovid.add(txtpnPrecaucionCovid);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(VentanaAsistencia.class.getResource("/Imagenes/33. COVID-19.png")));
		lblNewLabel_7.setBounds(692, 28, 427, 260);
		panelCovid.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(VentanaAsistencia.class.getResource("/Imagenes/icono-manos-limpias.png")));
		lblNewLabel_8.setBounds(109, 299, 368, 267);
		panelCovid.add(lblNewLabel_8);
		
		// panelVender
		
		panelVender = new JPanel();
		layeredPane_1.setLayer(panelVender, 0);
		layeredPane_1.add(panelVender, "name_82817623405600");
		panelVender.setLayout(null);
		
		JLabel lblNewLabel_12 = new JLabel("Vende tus articulos ");
		lblNewLabel_12.setForeground(Color.BLUE);
		lblNewLabel_12.setFont(new Font("Calibri", Font.PLAIN, 25));
		lblNewLabel_12.setBounds(57, 0, 268, 63);
		panelVender.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Actualiza tu anuncio");
		lblNewLabel_13.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_13.setBounds(63, 220, 212, 38);
		panelVender.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Creaci\u00F3n del perfil");
		lblNewLabel_14.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_14.setBounds(510, 34, 232, 38);
		panelVender.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Destaca entre la gente");
		lblNewLabel_15.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_15.setBounds(524, 220, 218, 38);
		panelVender.add(lblNewLabel_15);
		
		JTextPane txtpnEstEsUna = new JTextPane();
		txtpnEstEsUna.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtpnEstEsUna.setText("\u00C9sta es una secci\u00F3n en la cual no muchas tiendas tienen ya que es novedad en el mercado.\r\n\r\nY es que te ofrecen la posibilidad de vender tus productos de formas r\u00E1pida y sencilla,mucho m\u00E1s f\u00E1cil que cualquier otra tienda del mercado.");
		txtpnEstEsUna.setBounds(53, 57, 232, 157);
		panelVender.add(txtpnEstEsUna);
		
		JTextPane txtpnactualizaLasFotos = new JTextPane();
		txtpnactualizaLasFotos.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtpnactualizaLasFotos.setText("-Actualiza las fotos de tu anuncio para asegurarte de que el art\u00EDculo se ve claramente para la gente que entre en la tienda y se pueda ver claramente una variedad de fotos de los art\u00EDculos.\r\n\r\n-Mejora el t\u00EDtulo y la descripci\u00F3n. Esto facilitar\u00E1 que los dem\u00E1s miembros encuentren tu art\u00EDculo a trav\u00E9s de la funci\u00F3n de b\u00FAsqueda,  de manera que al buscar los art\u00EDculos relacionados con los tuyos salgan de manera m\u00E1s r\u00E1pida y lleguen a verlo muchos m\u00E1s miembros.\r\n\r\n-Haz un descuento para lotes de art\u00EDculos y anima a los dem\u00E1s miembros a comprar m\u00E1s art\u00EDculos de tu armario, de manera que as\u00ED los miembros est\u00E9n mas pendientes de tus art\u00EDculos debido a tus ofertas.");
		txtpnactualizaLasFotos.setBounds(52, 269, 333, 254);
		panelVender.add(txtpnactualizaLasFotos);
		
		JTextPane txtpnVerificaTuCuenta = new JTextPane();
		txtpnVerificaTuCuenta.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtpnVerificaTuCuenta.setText("Verifica tu cuenta para ganarte la confianza de otros miembros, y as\u00ED que no sospechen si les est\u00E1s timando de alguna forma. \r\n\r\nDestaca un poco sobre ti en tu perfil de manera que los miembros sepan de ti algo. \r\nEsta descripci\u00F3n ser\u00E1 visible para toda la comunidad.");
		txtpnVerificaTuCuenta.setBounds(467, 68, 380, 146);
		panelVender.add(txtpnVerificaTuCuenta);
		
		JTextPane txtpnDestacaTusArtculos = new JTextPane();
		txtpnDestacaTusArtculos.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtpnDestacaTusArtculos.setText("Destaca tus art\u00EDculos y pon tu armario en escaparate para que vean tus mejores articulos para aumentar la visibilidad de tu armario.\r\n\r\nSube art\u00EDculos nuevos con frecuencia; es decir no seas ausente, te empezar\u00E1n a seguir posibles compradores que recibir\u00E1n una notificaci\u00F3n cuando publiques algo nuevo. Si no tus miembros perder\u00E1n inter\u00E9s en ti y perder\u00E1s fama.\r\n\r\nBaja el precio de tus art\u00EDculos, con un descuento especi\u00EDfico. \r\nLos miembros que te sigan o que hayan incluido tus art\u00EDculos en sus favoritos recibir\u00E1n una notificaci\u00F3n acerca del descuento. ");
		txtpnDestacaTusArtculos.setBounds(479, 269, 368, 207);
		panelVender.add(txtpnDestacaTusArtculos);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(VentanaAsistencia.class.getResource("/Imagenes/dCXUCQz6_400x400.png")));
		lblNewLabel_9.setBounds(901, 68, 350, 239);
		panelVender.add(lblNewLabel_9);
		
		// panelComprar
		
		panelComprar = new JPanel();
		layeredPane_1.add(panelComprar, "name_82817648632900");
		panelComprar.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setBounds(666, 10, 46, 14);
		panelComprar.add(lblNewLabel_11);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setBounds(717, 10, 46, 14);
		panelComprar.add(lblNewLabel_10);
		
		JLabel lblMtodosDePago = new JLabel("M\u00E9todos de pago");
		lblMtodosDePago.setFont(new Font("Arial", Font.PLAIN, 20));
		lblMtodosDePago.setBounds(36, 39, 196, 32);
		panelComprar.add(lblMtodosDePago);
		
		JLabel lblCupones = new JLabel("Cupones");
		lblCupones.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCupones.setBounds(36, 268, 196, 28);
		panelComprar.add(lblCupones);
		
		JLabel lblCancelarPedido = new JLabel("Cancelar pedido");
		lblCancelarPedido.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCancelarPedido.setBounds(372, 28, 205, 54);
		panelComprar.add(lblCancelarPedido);
		
		JTextPane txtpnTrasUsarEl = new JTextPane();
		txtpnTrasUsarEl.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtpnTrasUsarEl.setText("Tras usar el bot\u00F3n Comprar , podr\u00E1s elegir el m\u00E9todo de pago para tu pedido. Los m\u00E9todos de pago disponibles en nuestra tienda son:\r\n\r\n1. Tarjeta de cr\u00E9dito/d\u00E9bito\r\nAceptamos todas las tarjetas principales de cr\u00E9dito o d\u00E9bito.\r\n\r\n2. PayPal\r\n");
		txtpnTrasUsarEl.setBounds(28, 80, 278, 177);
		panelComprar.add(txtpnTrasUsarEl);
		
		JTextPane txtpnSimplementeEncuentraUn = new JTextPane();
		txtpnSimplementeEncuentraUn.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtpnSimplementeEncuentraUn.setText("Simplemente encuentra un art\u00EDculo que te guste y haz clic en Comprar.\r\nEl cup\u00F3n se aplicar\u00E1 a la compra autom\u00E1ticamente, teniendo en cuenta si tiene cup\u00F3n o no.\r\n\r\n Lo podr\u00E1s comprobar a la hora de ver los detalles de pago y ver si se ha aplicado el descuento del cup\u00F3n.");
		txtpnSimplementeEncuentraUn.setBounds(36, 308, 306, 162);
		panelComprar.add(txtpnSimplementeEncuentraUn);
		
		JTextPane txtpnSiSeHa = new JTextPane();
		txtpnSiSeHa.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtpnSiSeHa.setText("Si se ha hecho la compra de un pedido, y finalmente se quiere cancelar,\r\nexiste esa opci\u00F3n de poder hacerlo de manera sencilla.\r\n\r\nSolamente tendr\u00E1 que seleccionar los pedidos que haya hecho y tendr\u00E1 la opci\u00F3n de hacerlo sin gasto alguno en el plaz antes de que llegue al cliente en cuesti\u00F3n.");
		txtpnSiSeHa.setBounds(368, 80, 230, 177);
		panelComprar.add(txtpnSiSeHa);
		
		// panelEnvios
		
		panelEnvios = new JPanel();
		layeredPane_1.add(panelEnvios, "name_82817672869900");
		
		// panelSeguridad
		
		panelSeguridad = new JPanel();
		layeredPane_1.add(panelSeguridad, "name_82817696383300");
		
		// panelComunidad
		
		panelComunidad = new JPanel();
		layeredPane_1.add(panelComunidad, "name_82817719712100");
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(0, 182, 297, 81);
		contentPane.add(textPane);
	}
}
