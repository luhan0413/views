package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class alliance {

	private JFrame frame;
	private final JLabel lblNewLabel = new JLabel("�p��"); //�p������
	private Object getClass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					alliance window = new alliance();
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
	public alliance() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBackground(new Color(255, 255, 255));
		frame.setBounds(350, 150, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		lblNewLabel.setFont(new Font("�s�ө���", Font.PLAIN, 25));
		lblNewLabel.setBounds(10, 10, 128, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(255, 255, 255));
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textArea.setBounds(291, 40, 747, 615);
		frame.getContentPane().add(textArea);
		
		JButton members = new JButton("�p������"); //�p���������s���U���ͦ����W��
		members.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				JOptionPane.showMessageDialog(null,"�p����-���t���\r\n"
													+"�Ʒ���-���r�W������\r\n"
													+"�����x-�B���y\r\n"
													+"�����G\r\n"
													+"�Y�A�l�m\r\n"
													+"����]�{�C�q\r\n"
													+"�X�_D���\r\n"
													+"�ਤ�J���\r\n"
													+"���ѤH��\r\n"
													+"������ĵ\r\n"
													+"�E�Y�s�{��y\r\n"
													+"�]�ߤp����\r\n"
													+"AI�H�u����\r\n"
													+"�A�ݤ�����\r\n"
													+"�����ڤ]����\r\n"
													+"��n���Ӧr\r\n"
													+"���C�s�k�D��\r\n"
													+"�^�������Q�D\r\n"
													+"�T���B�w��\r\n"
													+"�����q�y����\r\n"
													+"���N���ͻH\r\n");
			}
			}
		);
		
		members.setFont(new Font("�s�ө���", Font.PLAIN,20)); //�p���������s
		members.setBounds(10, 137, 128, 47);
		frame.getContentPane().add(members);
		
		JButton assignment = new JButton("�p������"); //�p�����ȫ��s �\��O���U���ͥ��ȲM��
		assignment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				textArea.setFont(new Font("Monospaced", Font.PLAIN, 17));
				String assignmentlist = "\r\n"+"\r\n"+"\r\n"+"\r\n"+"\r\n"+"\r\n"+"\r\n"
										+ "�D�u���� - "
										+"�u�ín�� \r\n"
										+"��u���� - "
										+"1.�ζ��ƥ��D��\r\n"
										+"2.�s�L�V�m\r\n"
										+"3.�귽�Ķ�\r\n"
										+"4.�سy�s�]�I(��s��)\r\n"
										+"5.�M��(����1/6)\r\n"
										+"6.�p���v��(�a�x��)";
				textArea.append(assignmentlist);
			}
		});
		assignment.setFont(new Font("�s�ө���", Font.PLAIN, 20));
		assignment.setBounds(10, 197, 128, 47);
		frame.getContentPane().add(assignment);
		
		JButton resource = new JButton("�p���귽"); //�p���귽���s �\��O���U�����p������B���~���]��
		resource.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				String resourcelist ="\r\n\r\n\r\n\r\n\r\n\r\n"
						+"�ثe�p�����겣�G\r\n"
						+"�����G500000\r\n"
						+"�ا������G600542\r\n"
						+"�p�����G65981\r\n"
						+"�p���g���829845�G\r\n"
						+"�ͷ��G�P������\r\n";
				textArea.append(resourcelist);
			}
		});
		resource.setFont(new Font("�s�ө���", Font.PLAIN, 20));
		resource.setBounds(10, 437, 128, 47);
		frame.getContentPane().add(resource);
		
		JButton information = new JButton("�p���q���P�T��"); //�p���q���P�T�����s �\��O���U���ͳq���P�T��
		information.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				String informationlist = "\r\n\r\n\r\n\r\n\r\n\r\n"
						+"���|���H���G\r\n\r\n"
						+ "�˷R�����|�����̡A\r\n"
						+ "�ڭ̱N�b���g���i��@�����n�����|���ʡC�зǮɰѥ[�A�ڭ̻ݭn�j�a������M�X�@�C���ʮɶ��M�Ա��w�g�b\r\n"
						+ "���|�W�D���G�C���¤j�a���t�X�I\r\n"
						+ "�p����-���t���\r\n\r\n\r\n"
						+"���q���I�I�I\r\n\r\n"
						+"���I���I\r\n"
						+ "�ڭ̻ݭn�A�����U�I�ڭ̪���a���b�D���J�I�A�ЩҦ�����W�u�������ߧY�^�Ӥ䴩�I\r\n"
						+ "�Ա��w�b���|�W�D�o���A�гt�t�e�ӡI\r\n"
						+ "�����x-�B���y\r\n"
						;
				textArea.append(informationlist);
			}
		});
		information.setFont(new Font("�s�ө���", Font.PLAIN, 13));
		information.setBounds(10, 377, 128, 47);
		frame.getContentPane().add(information);
		
		JButton ranking = new JButton("���|�ƦW�P�έp"); //�p���ƦW�P�έp���s �\��O���U���ͦU�p�����ƦW
		ranking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				String assignmentlist = "\r\n"+"\r\n"+"\r\n"+"\r\n"+"\r\n"+"\r\n"+"\r\n"
						+"					�p��������ɳӳ���										                          �p���ӤH���ɳӳ����`�M\r\n"
						+"�Ĥ@�W�G�v����		  	35				  �P������	                                20\r\n"
						+"�ĤG�W�G�Ѥ��p��		  	20				  �_���p�X						15\r\n"
						+"�ĤT�W�G�ë��}		  	15				  �t�­��R��						10\r\n";
				textArea.append(assignmentlist);
				
			}
		});
		ranking.setFont(new Font("�s�ө���", Font.PLAIN, 13));
		ranking.setBounds(10, 257, 128, 47);
		frame.getContentPane().add(ranking);
		
		JButton apply = new JButton("�۶һP�ӽ�"); //�۶һP�ӽЫ��s
		apply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				textArea.setFont(new Font("Monospaced", Font.PLAIN, 18));
				String applylist = "\r\n\r\n\r\n"+"�J�|����G�n�D�������D�ѻP���|���ʡB�L���L�H�B�X�@�ζ��B�C�g�ܤֵn�J�@���C\r\n"
						+ "���ݦ������R�C���B�@�N�U�H�B�@�P�l�D���|�ؼСC\r\n\r\n"
									+"�ӽЦW��G\r\n"
									+"1.���n�����y\r\n"
									+"2.�ਤ�J���\r\n"
									+"3.���n�� �A�|��\r\n"
									+"4.�t�@���R�h�h\r\n"
									+"5.����̪��r�~\r\n"
									+"6.��o���I����\r\n"
									+"7.���ѤH��\r\n"
									+"8.�Q�B���S��\r\n"
									+"9.�����q�y����\r\n"
									+"10.�j�Ѫ��H\r\n";
				textArea.append(applylist);
			}
		});
		apply.setFont(new Font("�s�ө���", Font.PLAIN, 18));
		apply.setBounds(10, 317, 128, 47);
		frame.getContentPane().add(apply);
		
		JButton setting = new JButton("�p���]�w"); //�p���]�w���s
		setting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		setting.setFont(new Font("�s�ө���", Font.PLAIN, 20));
		setting.setBounds(10, 497, 128, 47);
		frame.getContentPane().add(setting);
		
		
		
		
		
	}
}
