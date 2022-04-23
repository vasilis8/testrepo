package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.KeyEvent;


public class App extends JFrame implements ActionListener {

	
	JFrame frame = new JFrame();
	JButton button =  new JButton();

	JLayeredPane lay = new JLayeredPane();
	ImageIcon board = new ImageIcon("/Users/vasilisk/Desktop/efde.png");
	JLabel label1=new JLabel(board);
	ImageIcon imageIcon = new ImageIcon(new ImageIcon(App.class.getResource("TucTacToe-2.png")).getImage().getScaledInstance(180, 180, Image.SCALE_DEFAULT));
	ImageIcon br = new ImageIcon(new ImageIcon(App.class.getResource("Board.png")).getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT));

	Image brd=board.getImage();

	JPanel panel1 = new JPanel();
 
	JMenu[] menu = new JMenu[4];
	JButton btnNewButton_1 = new JButton("Dashboard",board);
	JButton btnNewButton_1_1 = new JButton("Single Player", null);
	JButton btnNewButton_1_2 = new JButton("Multiplayer", null);
	JButton btnNewButton_1_3 = new JButton("HallOfFame", null);
	JLabel lblNewLabel = new JLabel(new ImageIcon(App.class.getResource("/gui/TucTacToe-logos_white.png")));
	JLabel lblNewLabel_1 = new JLabel(imageIcon);
	JLabel lblNewLabel_2 = new JLabel(br);
	JLabel lblNewLabel_3 = new JLabel(br);

	
	public App() {
		button.setBounds(400,100,200,200);
		button.addActionListener(this);
		
		label1.setBackground(Color.magenta);
		label1.setOpaque(true);
		label1.setBounds(0,0,800,800);
		panel1.setToolTipText("geia");
		panel1.setForeground(new Color(0, 255, 0));
		
		panel1.setBackground(Color.decode("#030B24"));
		panel1.setBounds(0,0,800,800);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(App.class.getResource("/gui/Backround.png")));

		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1920,1080);
		frame.setContentPane(panel1);
		panel1.setLayout(null);
		
		panel1.add(lblNewLabel);
		btnNewButton_1.setForeground(new Color(245, 245, 245));
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnNewButton_1.setAutoscrolls(true);
		btnNewButton_1.setBackground(new Color(0, 102, 204));
		btnNewButton_1.setBounds(0, 229, 133, 29);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		
		panel1.add(btnNewButton_1);
		btnNewButton_1_1.setVerticalTextPosition(SwingConstants.TOP);
		btnNewButton_1_1.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setOpaque(false);
		btnNewButton_1_1.setForeground(new Color(245, 245, 245));
		btnNewButton_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton_1_1.setContentAreaFilled(false);
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBackground(new Color(0, 102, 204));
		btnNewButton_1_1.setAutoscrolls(true);
		btnNewButton_1_1.setBounds(0, 270, 144, 29);
		
		panel1.add(btnNewButton_1_1);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2.setOpaque(false);
		btnNewButton_1_2.setForeground(new Color(245, 245, 245));
		btnNewButton_1_2.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton_1_2.setContentAreaFilled(false);
		btnNewButton_1_2.setBorderPainted(false);
		btnNewButton_1_2.setBackground(new Color(0, 102, 204));
		btnNewButton_1_2.setAutoscrolls(true);
		btnNewButton_1_2.setBounds(0, 311, 133, 29);
		
		panel1.add(btnNewButton_1_2);
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_3.setOpaque(false);
		btnNewButton_1_3.setForeground(new Color(245, 245, 245));
		btnNewButton_1_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnNewButton_1_3.setContentAreaFilled(false);
		btnNewButton_1_3.setBorderPainted(false);
		btnNewButton_1_3.setBackground(new Color(0, 102, 204));
		btnNewButton_1_3.setAutoscrolls(true);
		btnNewButton_1_3.setBounds(0, 352, 133, 29);
		
		panel1.add(btnNewButton_1_3);
		lblNewLabel_1.setBounds(29, 16, 133, 153);
		
		panel1.add(lblNewLabel_1);
		panel1.add(lblNewLabel_2);
		lblNewLabel_3.setBounds(347, 163, 406, 429);
		
		panel1.add(lblNewLabel_3);
		

		
		validate();

	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
