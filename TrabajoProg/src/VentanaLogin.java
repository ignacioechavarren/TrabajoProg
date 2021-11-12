import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class VentanaLogin extends JFrame {
	
	private Image img_user = new ImageIcon(VentanaLogin.class.getResource("imagenes/gente.png")).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
	private Image img_lock = new ImageIcon(VentanaLogin.class.getResource("imagenes/candado.png")).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
	private Image img_eye = new ImageIcon(VentanaLogin.class.getResource("imagenes/eye.png")).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
	
	//las imagenes que vamos a utilizar
	
	
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtPass;
	


	
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
		
		JLabel lblTitule = new JLabel("INICIAR SESI\u00D3N");
		lblTitule.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblTitule.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitule.setFont(new Font("Arial Black", Font.PLAIN, 30));
		lblTitule.setBounds(425, 89, 328, 51);
		contentPane.add(lblTitule);
		
		JLabel lblUser = new JLabel("USUARIO");
		lblUser.setFont(new Font("Arial Black", Font.PLAIN, 17));
		lblUser.setBounds(454, 220, 101, 30);
		contentPane.add(lblUser);
		
		JLabel lblContraseña = new JLabel("CONTRASE\u00D1A");
		lblContraseña.setForeground(Color.BLACK);
		lblContraseña.setBackground(Color.WHITE);
		lblContraseña.setFont(new Font("Arial Black", Font.PLAIN, 17));
		lblContraseña.setBounds(454, 310, 142, 30);
		contentPane.add(lblContraseña);
		
		txtUsuario.setBorder(null);
		txtUsuario.setToolTipText("");
		txtUsuario.setBackground(Color.WHITE);
		txtUsuario.setFont(new Font("Arial Black", Font.PLAIN, 13));
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
		txtPass.setFont(new Font("Arial Black", Font.PLAIN, 13));
		txtPass.setHorizontalAlignment(SwingConstants.LEFT);
		txtPass.setBackground(Color.WHITE);
		txtPass.setForeground(Color.LIGHT_GRAY);
		txtPass.setBounds(454, 350, 270, 30);
		contentPane.add(txtPass);
		
		JPanel btnEntrar = new JPanel();
		btnEntrar.setForeground(new Color(153, 204, 204));
		btnEntrar.setBackground(new Color(153, 204, 204));
		btnEntrar.setBounds(568, 425, 156, 51);
		contentPane.add(btnEntrar);
		btnEntrar.setLayout(null);
		
		JLabel lblEntrar = new JLabel("ENTRAR");
		lblEntrar.setBounds(0, 0, 156, 51);
		btnEntrar.add(lblEntrar);
		lblEntrar.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		
		
		
		
		
	}
}
