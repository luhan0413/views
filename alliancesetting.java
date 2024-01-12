package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class alliancesetting {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					alliancesetting window = new alliancesetting();
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
	public alliancesetting() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(350, 150, 1280,720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel alliancesettingword = new JLabel("聯盟設定"); //聯盟設定的字
		alliancesettingword.setFont(new Font("新細明體", Font.PLAIN, 25));
		alliancesettingword.setBounds(25, 10, 151, 73);
		frame.getContentPane().add(alliancesettingword);
		
		JLabel modifyAllianceName = new JLabel("修改聯盟名稱"); //修改聯盟名稱的字
		modifyAllianceName.setFont(new Font("新細明體", Font.PLAIN, 20));
		modifyAllianceName.setBounds(25, 93, 151, 46);
		frame.getContentPane().add(modifyAllianceName);
		
		textField = new JTextField(); //修改聯盟名稱的打字格
		textField.setBounds(171, 93, 302, 46);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton confirmChanges = new JButton("確定更改"); //確定更改按鈕
		confirmChanges.setBounds(813, 612, 93, 36);
		frame.getContentPane().add(confirmChanges);
		
		JLabel modifyLogo = new JLabel("修改聯盟標誌"); //修改聯盟標誌的字
		modifyLogo.setFont(new Font("新細明體", Font.PLAIN, 20));
		modifyLogo.setBounds(25, 180, 191, 46);
		frame.getContentPane().add(modifyLogo);
		
		JLabel logo1img = new JLabel("allianceimg1"); //聯盟標誌1
		logo1img.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\alliance1.png"));
		logo1img.setBounds(210, 180, 110, 104);
		frame.getContentPane().add(logo1img);
		
		JLabel logo2img = new JLabel("allianceimg2"); //聯盟標誌2
		logo2img.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\alliance2.png"));
		logo2img.setBounds(377, 180, 110, 104);
		frame.getContentPane().add(logo2img);
		
		JLabel logo3img = new JLabel("allianceimg3"); //聯盟標誌3
		logo3img.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\alliance3.png"));
		logo3img.setBounds(544, 180, 110, 104);
		frame.getContentPane().add(logo3img);
		
		JRadioButton logo1button = new JRadioButton(""); //聯盟標誌1下的選鈕
		logo1button.setBounds(249, 290, 105, 23);
		frame.getContentPane().add(logo1button);
		
		JRadioButton logo2button = new JRadioButton("");//聯盟標誌2下的選鈕
		logo2button.setBounds(416, 290, 105, 23);
		frame.getContentPane().add(logo2button);
		
		JRadioButton logo3button = new JRadioButton("");//聯盟標誌3下的選鈕
		logo3button.setBounds(587, 290, 105, 23);
		frame.getContentPane().add(logo3button);
		
		JTextArea textArea = new JTextArea();//聯盟簡介的textArea，可用來修改簡介
		textArea.setBounds(171, 374, 603, 183);
		frame.getContentPane().add(textArea);
		
		JLabel allianceIntroduction = new JLabel("聯名簡介"); //聯盟簡介標籤
		allianceIntroduction.setFont(new Font("新細明體", Font.PLAIN, 20));
		allianceIntroduction.setBounds(25, 374, 191, 46);
		frame.getContentPane().add(allianceIntroduction);
		

	}
}
