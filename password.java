import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class password {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					password window = new password();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public password() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u66F4\u6539\u5BC6\u78BC");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 10, 135, 30);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("新細明體", Font.PLAIN, 18));
		textField.setBounds(128, 61, 284, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(20);
		
		JLabel lblNewLabel_1 = new JLabel("\u76EE\u524D\u7684\u5BC6\u78BC");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 58, 108, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u65B0\u5BC6\u78BC");
		lblNewLabel_2.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(10, 116, 108, 34);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("新細明體", Font.PLAIN, 18));
		textField_1.setBounds(128, 124, 284, 30);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(20);
		
		JLabel lblNewLabel_3 = new JLabel("\u518D\u6B21\u8F38\u5165\u65B0\u5BC6\u78BC");
		lblNewLabel_3.setFont(new Font("新細明體", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(10, 181, 123, 45);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("新細明體", Font.PLAIN, 18));
		textField_2.setBounds(143, 189, 284, 30);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(20);
		
		JButton btnNewButton = new JButton("\u78BA\u5B9A");
		btnNewButton.setFont(new Font("新細明體", Font.PLAIN, 15));
		btnNewButton.setBounds(332, 240, 95, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u53D6\u6D88");
		btnNewButton_1.setFont(new Font("新細明體", Font.PLAIN, 15));
		btnNewButton_1.setBounds(217, 240, 95, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
