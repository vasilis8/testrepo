package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TicTacToeApp extends JFrame implements ActionListener {

	
	JFrame frame = new JFrame();
	JButton button =  new JButton();

	JLayeredPane lay = new JLayeredPane();
	ImageIcon board = new ImageIcon("/Users/vasilisk/Desktop/efde.png");
	JLabel label1=new JLabel(board);
	
	Image brd=board.getImage();

	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel border1 = new JPanel();
	JPanel border2 = new JPanel();

	JLabel picLabel = new JLabel();
 
	JMenu[] menu = new JMenu[4];
	private JMenuBar menuBar = new JMenuBar();
	
	public TicTacToeApp() {
		button.setBounds(400,100,200,200);
		button.addActionListener(this);
		
		label1.setBackground(Color.magenta);
		label1.setOpaque(true);
		label1.setBounds(0,0,800,800);
		
		panel1.setBackground(Color.decode("#030B24"));
		panel1.setBounds(0,0,800,800);
		
		border1.setBackground(Color.decode("#5D24A5"));
		border1.setBounds(0,0,200,200);
		
		border2.setBackground(Color.decode("#5D24A5"));
		border2.setBounds(0,0,200,200);
		
		
		JMenu mfile = new JMenu("File");
		JMenu moption = new JMenu("Option");

		menuBar.add(mfile);
		menuBar.add(moption);


		
		picLabel.setIcon(board);
		panel2.add(picLabel); 

		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.setVisible(true);
		frame.setContentPane(panel1);
		frame.add(panel2);
		frame.add(menuBar);
		frame.add(border1);
		frame.add(border2);

		
		validate();

	}

	


	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	

	}
