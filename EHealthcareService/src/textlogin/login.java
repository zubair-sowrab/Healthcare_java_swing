package textlogin;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class login extends JFrame  {
private JLabel unamer,pwordr;
private JTextField unames,pwords;
private Font f;
private Container c;
private String username,password;
private JButton login1;



void checkData()  {
	try {
		RandomAccessFile raf = new RandomAccessFile(f+"lol.txt", "rw");
		String line=raf.readLine();
		username=line.substring(9);
		password=raf.readLine().substring(9);
		if(unames.getText().equals(username) && pwords.equals(password)) {
			JOptionPane.showMessageDialog(null,"SUCCESS!!" );
		}
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}

login(){
	c=this.getContentPane();
	c.setLayout(null);
	c.setBackground(Color.white);
	f = new Font("Calibri",Font.BOLD,25);
		
unamer=new JLabel();
unamer.setText("Enter username:");
unamer.setBounds(50,240,210,70);
unamer.setFont(f);
unamer.setForeground(Color.black);
unamer.setOpaque(true);
unamer.setBackground(Color.white);

c.add(unamer);


pwordr=new JLabel();
pwordr.setText("Enter password:");
pwordr.setBounds(50,290,210,70);
pwordr.setFont(f);
pwordr.setForeground(Color.black);
pwordr.setOpaque(true);
pwordr.setBackground(Color.white);

c.add(pwordr);

unames=new JTextField();
unames.setBounds(300,266,90,30);
unames.setFont(f);
unames.setForeground(Color.black);
unames.setOpaque(true);
unames.setBackground(Color.white);

c.add(unames);


pwords=new JTextField();
pwords.setBounds(300,310,90,30);
pwords.setFont(f);
pwords.setForeground(Color.black);
pwords.setOpaque(true);
pwords.setBackground(Color.white);

c.add(pwords);

login1=new JButton();
login1.setText("Login");
login1.setBounds(90,500,170,50);
login1.setFont(f);
login1.setForeground(Color.BLACK);
login1.setOpaque(true);
login1.setBackground(Color.white);

c.add(login1);





login1.addActionListener(new ActionListener(){

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			BufferedReader fr=new BufferedReader(new FileReader("heal.txt"));
			Scanner input=new Scanner(System.in);
			String line=fr.readLine();
			String username = null,password;
			
			while(input.hasNext())
		username=input.next();
			password=input.next();
			if(unames.getText().equals(username) && pwords.getText().equals(password)) {
				JOptionPane.showMessageDialog(null,"SUCCESS!!" );
			}
			else {
				JOptionPane.showMessageDialog(null,"ERROR!!" );
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	

		
	}});

}











public static void main(String[] args) throws IOException {
	login f=new login();

	f.setVisible(true);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
f.setBounds(300,200,800,800);
f.setTitle("LOGIN");
f.setBackground(Color.cyan);

}
}
