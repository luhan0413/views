import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;

public class accountdeletion {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					accountdeletion window = new accountdeletion();
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
	public accountdeletion() {
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
		
		JLabel label = new JLabel("�b��R��");
		label.setFont(new Font("�s�ө���", Font.PLAIN, 20));
		label.setBounds(10, 10, 83, 31);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("�o�N�|�q�ڭ̪��t�Τ��ä[�R���z���ӤH��ơC");
		lblNewLabel.setFont(new Font("�s�ө���", Font.PLAIN, 15));
		lblNewLabel.setBounds(20, 58, 346, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("�b��@���R���Y�L�k��_�A�z�T�w�n�R���ܡH");
		lblNewLabel_1.setFont(new Font("�s�ө���", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(20, 83, 406, 43);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("\u78BA\u5B9A");
		btnNewButton.setFont(new Font("�s�ө���", Font.PLAIN, 14));
		btnNewButton.setBounds(315, 151, 83, 27);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u53D6\u6D88");
		btnNewButton_1.setFont(new Font("�s�ө���", Font.PLAIN, 14));
		btnNewButton_1.setBounds(222, 151, 83, 27);
		frame.getContentPane().add(btnNewButton_1);
	}

}
