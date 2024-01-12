import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class userdatamanagement {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userdatamanagement window = new userdatamanagement();
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
	public userdatamanagement() {
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
		
		JLabel lblNewLabel = new JLabel("\u641C\u5C0B\u7528\u6236");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 19, 123, 24);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(101, 19, 213, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(50);
		
		JButton btnNewButton = new JButton("\u7528\u6236\u5E33\u865F\u5BC6\u78BC");
		btnNewButton.setFont(new Font("新細明體", Font.PLAIN, 12));
		btnNewButton.setBounds(10, 65, 119, 34);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u7528\u6236\u500B\u4EBA\u4FE1\u606F");
		btnNewButton_1.setFont(new Font("新細明體", Font.PLAIN, 12));
		btnNewButton_1.setBounds(138, 65, 119, 34);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u7DE8\u8F2F\u8A72\u7528\u6236\u4E4B\u8CC7\u8A0A");
		btnNewButton_2.setFont(new Font("新細明體", Font.PLAIN, 12));
		btnNewButton_2.setBounds(267, 65, 147, 34);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u78BA\u5B9A");
		btnNewButton_3.setFont(new Font("新細明體", Font.PLAIN, 15));
		btnNewButton_3.setBounds(337, 15, 65, 34);
		frame.getContentPane().add(btnNewButton_3);
	}
}
