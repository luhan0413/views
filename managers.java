package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractListModel;

public class managers {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					managers window = new managers();
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
	public managers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(255, 255, 255));
		frame.setTitle("�޲z��");
		frame.setBounds(350, 150, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JList functionList = new JList(); //�޲z�̥i�ϥΪ��\��M��
		functionList.setBackground(new Color(255, 255, 255));
		functionList.setFont(new Font("�s�ө���", Font.BOLD, 25));
		functionList.setModel(new AbstractListModel() {
			String[] values = new String[] {"�C���W�h�ק�", "", "", "", "", "", "", 
					"�b����U", "", "", "", "", "", "", "�ʸT/�ѫʥΤ�", "", "", "", "", "", "", "�Τ�ʱ�", "", "", "", "", "", "", "�K�X�޲z", "", "", "", "", "", "", "�Τ�έp�M���R", "", "", "", "", "", "�Τ��ƺ޲z", "", "", "", "", "", "", "�v���]�m"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		functionList.setBounds(10, 148, 199, 397);
		frame.getContentPane().add(functionList);
		
		JLabel selectLabel = new JLabel("��ܡG"); //��ܼ���
		selectLabel.setFont(new Font("�s�ө���", Font.BOLD, 25));
		selectLabel.setBounds(10, 101, 186, 37);
		frame.getContentPane().add(selectLabel);
		
		JList userlist = new JList(); //�Τ�M����ܪ�list
		userlist.setBounds(252, 113, 481, 535);
		frame.getContentPane().add(userlist);
		
		JList alliancelist = new JList(); //�p���M����ܪ�list
		alliancelist.setBounds(758, 113, 481, 535);
		frame.getContentPane().add(alliancelist);
		
		JLabel userListLabel = new JLabel("�Τ�M��G"); //�Τ�M�����
		userListLabel.setFont(new Font("�s�ө���", Font.BOLD, 25));
		userListLabel.setBounds(262, 72, 176, 42);
		frame.getContentPane().add(userListLabel);
		
		JLabel lblNewLabel = new JLabel("�{���p���M��G");
		lblNewLabel.setFont(new Font("�s�ө���", Font.BOLD, 25));
		lblNewLabel.setBounds(771, 72, 199, 42);
		frame.getContentPane().add(lblNewLabel);
	}
}
