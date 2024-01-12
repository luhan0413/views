import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;

public class permissionsettingschange {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					permissionsettingschange window = new permissionsettingschange();
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
	public permissionsettingschange() {
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
		
		JLabel lblNewLabel = new JLabel("\u6B0A\u9650\u66F4\u6539\u70BA");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel.setBounds(25, 10, 167, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\u73A9\u5BB6");
		rdbtnNewRadioButton.setFont(new Font("新細明體", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBounds(25, 52, 105, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\u7BA1\u7406\u54E1");
		rdbtnNewRadioButton_1.setFont(new Font("新細明體", Font.PLAIN, 15));
		rdbtnNewRadioButton_1.setBounds(25, 86, 105, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("\u5EE3\u544A\u5546");
		rdbtnNewRadioButton_2.setFont(new Font("新細明體", Font.PLAIN, 15));
		rdbtnNewRadioButton_2.setBounds(25, 122, 105, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
	}
}
