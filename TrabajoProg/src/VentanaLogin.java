import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class VentanaLogin extends JFrame {
	
	private JPanel contentPane;
	


	
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,300);
		setSize(800,400);
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
		
		
		

		
		
	}
}
