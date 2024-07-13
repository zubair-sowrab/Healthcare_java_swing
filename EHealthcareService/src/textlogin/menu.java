package textlogin;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class menu extends JFrame {
	private JLabel menu;
	private JButton login,hrecords,pmethods,brooms,presdiet,covid19;
	private Container c;
	private Font f;
	
	menu(){
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.white);
		f = new Font("Times New Roman",Font.BOLD,30);
		Font fr = new Font("Times New Roman",Font.BOLD,23);	
		
		menu=new JLabel();
		menu.setText("Welcome to Main Menu");
		
		menu.setBounds(150,10,500,50);
		menu.setFont(f);
		menu.setForeground(Color.BLACK);
		menu.setOpaque(true);
		menu.setBackground(Color.white);

		c.add(menu);
		login=new JButton();
		login.setText("Login");
		login.setBounds(70,100,170,50);
		login.setFont(fr);
		login.setForeground(Color.BLACK);
		login.setOpaque(true);
		login.setBackground(Color.white);

		c.add(login);
		
	login.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				login obj;
				dispose();
				
				try {
					obj = new login();
					obj.setVisible(true);
				} catch (Exception e){
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}});
				
		hrecords=new JButton();
		hrecords.setText("Store Health Records");
		hrecords.setBounds(280,100,250,50);
		hrecords.setFont(fr);
		hrecords.setForeground(Color.BLACK);
		hrecords.setOpaque(true);
		hrecords.setBackground(Color.white);

		c.add(	hrecords);
		
		presdiet=new JButton();
		presdiet.setText("Save Prescriptions and Diets");
		presdiet.setBounds(100,180,400,50);
		presdiet.setFont(fr);
		presdiet.setForeground(Color.BLACK);
		presdiet.setOpaque(true);
		presdiet.setBackground(Color.white);

		c.add(	presdiet);
		covid19=new JButton();
		covid19.setText("Covid19 Page");
		covid19.setBounds(180,250,250,50);
		covid19.setFont(fr);
		covid19.setForeground(Color.BLACK);
		covid19.setOpaque(true);
		covid19.setBackground(Color.white);

		c.add(covid19);
		
		covid19.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					covid19 obj;
					dispose();
					
					try {
						obj = new covid19();
						obj.setVisible(true);
					} catch (Exception e){
						// TODO Auto-generated catch block
						e.printStackTrace();
					}}});
		brooms=new JButton();
		brooms.setText("Book Hospital Rooms");
		brooms.setBounds(80,320,400,50);
		brooms.setFont(fr);
		brooms.setForeground(Color.BLACK);
		brooms.setOpaque(true);
		brooms.setBackground(Color.white);

		c.add(brooms);
	

	}
	
	public static void main(String[] args) throws IOException {
		menu f=new menu();
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	f.setBounds(300,300,600,500);
	f.setTitle("Main Menu");
	f.setBackground(Color.RED);
	

	}

}
