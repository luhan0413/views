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
		
		JLabel alliancesettingword = new JLabel("�p���]�w"); //�p���]�w���r
		alliancesettingword.setFont(new Font("�s�ө���", Font.PLAIN, 25));
		alliancesettingword.setBounds(25, 10, 151, 73);
		frame.getContentPane().add(alliancesettingword);
		
		JLabel modifyAllianceName = new JLabel("�ק��p���W��"); //�ק��p���W�٪��r
		modifyAllianceName.setFont(new Font("�s�ө���", Font.PLAIN, 20));
		modifyAllianceName.setBounds(25, 93, 151, 46);
		frame.getContentPane().add(modifyAllianceName);
		
		textField = new JTextField(); //�ק��p���W�٪����r��
		textField.setBounds(171, 93, 302, 46);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton confirmChanges = new JButton("�T�w���"); //�T�w�����s
		confirmChanges.setBounds(813, 612, 93, 36);
		frame.getContentPane().add(confirmChanges);
		
		JLabel modifyLogo = new JLabel("�ק��p���лx"); //�ק��p���лx���r
		modifyLogo.setFont(new Font("�s�ө���", Font.PLAIN, 20));
		modifyLogo.setBounds(25, 180, 191, 46);
		frame.getContentPane().add(modifyLogo);
		
		JLabel logo1img = new JLabel("allianceimg1"); //�p���лx1
		logo1img.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\alliance1.png"));
		logo1img.setBounds(210, 180, 110, 104);
		frame.getContentPane().add(logo1img);
		
		JLabel logo2img = new JLabel("allianceimg2"); //�p���лx2
		logo2img.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\alliance2.png"));
		logo2img.setBounds(377, 180, 110, 104);
		frame.getContentPane().add(logo2img);
		
		JLabel logo3img = new JLabel("allianceimg3"); //�p���лx3
		logo3img.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\alliance3.png"));
		logo3img.setBounds(544, 180, 110, 104);
		frame.getContentPane().add(logo3img);
		
		JRadioButton logo1button = new JRadioButton(""); //�p���лx1�U����s
		logo1button.setBounds(249, 290, 105, 23);
		frame.getContentPane().add(logo1button);
		
		JRadioButton logo2button = new JRadioButton("");//�p���лx2�U����s
		logo2button.setBounds(416, 290, 105, 23);
		frame.getContentPane().add(logo2button);
		
		JRadioButton logo3button = new JRadioButton("");//�p���лx3�U����s
		logo3button.setBounds(587, 290, 105, 23);
		frame.getContentPane().add(logo3button);
		
		JTextArea textArea = new JTextArea();//�p��²����textArea�A�i�Ψӭק�²��
		textArea.setBounds(171, 374, 603, 183);
		frame.getContentPane().add(textArea);
		
		JLabel allianceIntroduction = new JLabel("�p�W²��"); //�p��²������
		allianceIntroduction.setFont(new Font("�s�ө���", Font.PLAIN, 20));
		allianceIntroduction.setBounds(25, 374, 191, 46);
		frame.getContentPane().add(allianceIntroduction);
		

	}
}
