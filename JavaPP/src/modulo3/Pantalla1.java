package modulo3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla1 {

	private JFrame frmPromedioDeNotas;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla1 window = new Pantalla1();
					window.frmPromedioDeNotas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pantalla1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPromedioDeNotas = new JFrame();
		frmPromedioDeNotas.setForeground(Color.BLACK);
		frmPromedioDeNotas.setFont(new Font("Calisto MT", Font.BOLD, 14));
		frmPromedioDeNotas.setTitle("Promedio de Notas");
		frmPromedioDeNotas.setBounds(100, 100, 387, 270);
		frmPromedioDeNotas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPromedioDeNotas.getContentPane().setLayout(null);
		
		JLabel lblPromedio = new JLabel("Promedio");
		lblPromedio.setBounds(141, 12, 96, 37);
		lblPromedio.setForeground(Color.BLUE);
		lblPromedio.setBackground(Color.BLUE);
		lblPromedio.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmPromedioDeNotas.getContentPane().add(lblPromedio);
		
		JLabel lblNota1 = new JLabel("Nota 1");
		lblNota1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblNota1.setBounds(10, 60, 72, 19);
		frmPromedioDeNotas.getContentPane().add(lblNota1);
		
		txtNota1 = new JTextField();
		txtNota1.setHorizontalAlignment(SwingConstants.CENTER);
		txtNota1.setBounds(92, 60, 52, 20);
		frmPromedioDeNotas.getContentPane().add(txtNota1);
		txtNota1.setColumns(10);
		
		JLabel lblNota2 = new JLabel("Nota 2");
		lblNota2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblNota2.setBounds(10, 100, 72, 19);
		frmPromedioDeNotas.getContentPane().add(lblNota2);
		
		txtNota2 = new JTextField();
		txtNota2.setHorizontalAlignment(SwingConstants.CENTER);
		txtNota2.setColumns(10);
		txtNota2.setBounds(92, 100, 52, 20);
		frmPromedioDeNotas.getContentPane().add(txtNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3");
		lblNota3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblNota3.setBounds(10, 140, 72, 19);
		frmPromedioDeNotas.getContentPane().add(lblNota3);
		
		txtNota3 = new JTextField();
		txtNota3.setHorizontalAlignment(SwingConstants.CENTER);
		txtNota3.setColumns(10);
		txtNota3.setBounds(92, 140, 52, 20);
		frmPromedioDeNotas.getContentPane().add(txtNota3);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float nota1 = Float.parseFloat(txtNota1.getText());
				float nota2 = Float.parseFloat(txtNota2.getText());
				float nota3 = Float.parseFloat(txtNota3.getText());
				float promedio = (nota1 + nota2 + nota3) / 3;
				txtResultado.setText(Float.toString(promedio));
				if (promedio >= 7)
					txtResultado.setBackground(Color.GREEN);
				else
					txtResultado.setBackground(Color.RED);
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCalcular.setBounds(272, 138, 89, 23);
		frmPromedioDeNotas.getContentPane().add(btnCalcular);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setForeground(Color.BLACK);
		lblResultado.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblResultado.setBounds(10, 190, 77, 14);
		frmPromedioDeNotas.getContentPane().add(lblResultado);
		
		txtResultado = new JTextField();
		txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultado.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtResultado.setForeground(Color.BLACK);
		txtResultado.setColumns(10);
		txtResultado.setBounds(92, 190, 72, 20);
		frmPromedioDeNotas.getContentPane().add(txtResultado);
	}
}
