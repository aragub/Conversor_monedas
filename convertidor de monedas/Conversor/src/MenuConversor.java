import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MenuConversor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuConversor frame = new MenuConversor();
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
	public MenuConversor() {
		setTitle("Conversor de Moneda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 300, 450, 350);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("De:");
		lblNewLabel.setBounds(21, 69, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("A:");
		lblNewLabel_1.setBounds(210, 69, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(59, 67, 130, 18);
		contentPane.add(comboBox);
		comboBox.setFocusable(false);
		
		comboBox.addItem("Pesos Méxicanos");
		comboBox.addItem("Dolar");
		comboBox.addItem("Euros");
		comboBox.addItem("Libra Esterlina");
		comboBox.addItem("Yen Japonés");
		comboBox.addItem("Won sul-coreano");
		
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(259, 67, 152, 18);
		contentPane.add(comboBox_1);
		comboBox_1.setFocusable(false);
		
		comboBox_1.addItem("Pesos Méxicanos");
		comboBox_1.addItem("Dolar");
		comboBox_1.addItem("Euros");
		comboBox_1.addItem("Libra Esterlina");
		comboBox_1.addItem("Yen Japonés");
		comboBox_1.addItem("Won sul-coreano");
		
		textField = new JTextField();
		textField.setText("0.0");
		textField.setToolTipText("$");
		textField.setBounds(157, 120, 122, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if (c < '0' || c > '9') {
					e.consume();
				}
			}
		});
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(157, 222, 122, 23);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Convertir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conversor conversor = new Conversor();
				
				if (textField.getText().length() == 0)
					JOptionPane.showMessageDialog(null, "Debe ingresar un valor valido");
				else
					textField_1.setText(conversor.Convertir(Double.parseDouble(textField.getText()), comboBox.getSelectedIndex(), comboBox_1.getSelectedIndex()));
			}
		});
		btnNewButton.setBounds(174, 172, 89, 23);
		contentPane.add(btnNewButton);
		
	}
}
