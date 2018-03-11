package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Frame;
import java.awt.Color;
import rojerusan.RSMaterialButtonRectangle;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Inicio() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1380, 785);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 204, 255), 3, true));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 274, 712);
		contentPane.add(panel);
		panel.setLayout(null);
		
		RSMaterialButtonRectangle mtrlbtnrctnglVentas = new RSMaterialButtonRectangle();
		mtrlbtnrctnglVentas.setText("Articulos");
		mtrlbtnrctnglVentas.setForeground(Color.WHITE);
		mtrlbtnrctnglVentas.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 17));
		mtrlbtnrctnglVentas.setBackground(new Color(0, 204, 255));
		mtrlbtnrctnglVentas.setBounds(10, 322, 254, 62);
		panel.add(mtrlbtnrctnglVentas);
		
		RSMaterialButtonRectangle materialButtonRectangle = new RSMaterialButtonRectangle();
		materialButtonRectangle.setText("Ventas");
		materialButtonRectangle.setForeground(Color.WHITE);
		materialButtonRectangle.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 17));
		materialButtonRectangle.setBackground(new Color(0, 204, 255));
		materialButtonRectangle.setBounds(10, 422, 254, 62);
		panel.add(materialButtonRectangle);
		
		RSMaterialButtonRectangle mtrlbtnrctnglCompras = new RSMaterialButtonRectangle();
		mtrlbtnrctnglCompras.setText("Compras");
		mtrlbtnrctnglCompras.setForeground(Color.WHITE);
		mtrlbtnrctnglCompras.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 17));
		mtrlbtnrctnglCompras.setBackground(new Color(0, 204, 255));
		mtrlbtnrctnglCompras.setBounds(10, 516, 254, 62);
		panel.add(mtrlbtnrctnglCompras);
		
		RSMaterialButtonRectangle mtrlbtnrctnglReportes = new RSMaterialButtonRectangle();
		mtrlbtnrctnglReportes.setText("Reportes");
		mtrlbtnrctnglReportes.setForeground(Color.WHITE);
		mtrlbtnrctnglReportes.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 17));
		mtrlbtnrctnglReportes.setBackground(new Color(0, 204, 255));
		mtrlbtnrctnglReportes.setBounds(10, 613, 254, 62);
		panel.add(mtrlbtnrctnglReportes);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\punto de ventas\\src\\Img\\logo.gif"));
		label.setBounds(10, 53, 254, 163);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 204, 255), 3, true));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(294, 11, 1060, 712);
		contentPane.add(panel_1);
	}
}
