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
	private final JLabel lblNewLabel = new JLabel("聯盟"); //聯盟標籤
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
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 25));
		lblNewLabel.setBounds(10, 10, 128, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(255, 255, 255));
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textArea.setBounds(291, 40, 747, 615);
		frame.getContentPane().add(textArea);
		
		JButton members = new JButton("聯盟成員"); //聯盟成員按鈕按下產生成員名單
		members.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				JOptionPane.showMessageDialog(null,"聯盟長-梅川醫福\r\n"
													+"副盟長-銅鑼灣扛報紙\r\n"
													+"指揮官-額阿尖\r\n"
													+"成員：\r\n"
													+"頭蚊子叮\r\n"
													+"拿佛珠砸耶穌\r\n"
													+"蒙奇D能兒\r\n"
													+"轉角遇到怪\r\n"
													+"善解人衣\r\n"
													+"汗味戰警\r\n"
													+"九頭龍閃到腰\r\n"
													+"苗栗小五郎\r\n"
													+"AI人工智障\r\n"
													+"你看不見我\r\n"
													+"打死我也不說\r\n"
													+"剛好五個字\r\n"
													+"左青龍右胖虎\r\n"
													+"乞丐中的霸主\r\n"
													+"三重劉德華\r\n"
													+"遙控電流香蕉\r\n"
													+"紅燒雞翅膀\r\n");
			}
			}
		);
		
		members.setFont(new Font("新細明體", Font.PLAIN,20)); //聯盟成員按鈕
		members.setBounds(10, 137, 128, 47);
		frame.getContentPane().add(members);
		
		JButton assignment = new JButton("聯盟任務"); //聯盟任務按鈕 功能是按下產生任務清單
		assignment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				textArea.setFont(new Font("Monospaced", Font.PLAIN, 17));
				String assignmentlist = "\r\n"+"\r\n"+"\r\n"+"\r\n"+"\r\n"+"\r\n"+"\r\n"
										+ "主線任務 - "
										+"守衛要塞 \r\n"
										+"支線任務 - "
										+"1.團隊副本挑戰\r\n"
										+"2.新兵訓練\r\n"
										+"3.資源採集\r\n"
										+"4.建造新設施(研究所)\r\n"
										+"5.尋找(完成1/6)\r\n"
										+"6.聯盟競賽(冠軍賽)";
				textArea.append(assignmentlist);
			}
		});
		assignment.setFont(new Font("新細明體", Font.PLAIN, 20));
		assignment.setBounds(10, 197, 128, 47);
		frame.getContentPane().add(assignment);
		
		JButton resource = new JButton("聯盟資源"); //聯盟資源按鈕 功能是按下產生聯盟資金、物品等財產
		resource.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				String resourcelist ="\r\n\r\n\r\n\r\n\r\n\r\n"
						+"目前聯盟之資產：\r\n"
						+"金幣：500000\r\n"
						+"建材水晶：600542\r\n"
						+"聯盟幣：65981\r\n"
						+"聯盟經驗值829845：\r\n"
						+"友盟：星辰之盟\r\n";
				textArea.append(resourcelist);
			}
		});
		resource.setFont(new Font("新細明體", Font.PLAIN, 20));
		resource.setBounds(10, 437, 128, 47);
		frame.getContentPane().add(resource);
		
		JButton information = new JButton("聯盟通知與訊息"); //聯盟通知與訊息按鈕 功能是按下產生通知與訊息
		information.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				String informationlist = "\r\n\r\n\r\n\r\n\r\n\r\n"
						+"公會長信息：\r\n\r\n"
						+ "親愛的公會成員們，\r\n"
						+ "我們將在本週末進行一場重要的公會活動。請準時參加，我們需要大家的支持和合作。活動時間和詳情已經在\r\n"
						+ "公會頻道公佈。謝謝大家的配合！\r\n"
						+ "聯盟長-梅川醫福\r\n\r\n\r\n"
						+"緊急通知！！！\r\n\r\n"
						+"緊急！緊急！\r\n"
						+ "我們需要你的幫助！我們的領地正在遭受入侵，請所有能夠上線的成員立即回來支援！\r\n"
						+ "詳情已在公會頻道發布，請速速前來！\r\n"
						+ "指揮官-額阿尖\r\n"
						;
				textArea.append(informationlist);
			}
		});
		information.setFont(new Font("新細明體", Font.PLAIN, 13));
		information.setBounds(10, 377, 128, 47);
		frame.getContentPane().add(information);
		
		JButton ranking = new JButton("公會排名與統計"); //聯盟排名與統計按鈕 功能是按下產生各聯盟的排名
		ranking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				String assignmentlist = "\r\n"+"\r\n"+"\r\n"+"\r\n"+"\r\n"+"\r\n"+"\r\n"
						+"					聯盟團體比賽勝場數										                          聯盟個人比賽勝場數總和\r\n"
						+"第一名：影之盟		  	35				  星辰之盟	                                20\r\n"
						+"第二名：天幻聯盟		  	20				  奇蹟聯合						15\r\n"
						+"第三名：永恆之誓		  	15				  暗黑革命者						10\r\n";
				textArea.append(assignmentlist);
				
			}
		});
		ranking.setFont(new Font("新細明體", Font.PLAIN, 13));
		ranking.setBounds(10, 257, 128, 47);
		frame.getContentPane().add(ranking);
		
		JButton apply = new JButton("招募與申請"); //招募與申請按鈕
		apply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				textArea.setFont(new Font("Monospaced", Font.PLAIN, 18));
				String applylist = "\r\n\r\n\r\n"+"入會條件：要求成員活躍參與公會活動、尊重他人、合作團隊、每週至少登入一次。\r\n"
						+ "期待成員熱愛遊戲、願意助人、共同追求公會目標。\r\n\r\n"
									+"申請名單：\r\n"
									+"1.說好不打臉\r\n"
									+"2.轉角遇到怪\r\n"
									+"3.不要問 你會怕\r\n"
									+"4.差一元買多多\r\n"
									+"5.拉鍊裡的猛獸\r\n"
									+"6.綠油精點眼睛\r\n"
									+"7.善解人衣\r\n"
									+"8.被冰塊燙傷\r\n"
									+"9.遙控電流香蕉\r\n"
									+"10.餓老的人\r\n";
				textArea.append(applylist);
			}
		});
		apply.setFont(new Font("新細明體", Font.PLAIN, 18));
		apply.setBounds(10, 317, 128, 47);
		frame.getContentPane().add(apply);
		
		JButton setting = new JButton("聯盟設定"); //聯盟設定按鈕
		setting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		setting.setFont(new Font("新細明體", Font.PLAIN, 20));
		setting.setBounds(10, 497, 128, 47);
		frame.getContentPane().add(setting);
		
		
		
		
		
	}
}
