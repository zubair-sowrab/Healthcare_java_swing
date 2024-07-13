package textlogin;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class signup extends JFrame {
private String username,password,name,email,bgroup;
private String age;
private String mobile;
private JTextField names,ages,bgrps,emails,mobiles,unames,pwords;
private JLabel namer,ager,bgrpr,emailr,mobiler,unamer,pwordr;
private JButton register;
private Font f;
private Container c;
private JPasswordField password1;
File fo;


signup() throws IOException{
	
c=this.getContentPane();
c.setLayout(null);
c.setBackground(Color.white);
f = new Font("Times New Roman",Font.BOLD,16);
	
		names=new JTextField();
		names.setBounds(230,50,90,30);
		names.setFont(f);
		names.setForeground(Color.black);
		names.setOpaque(true);
		names.setBackground(Color.white);
		name=names.getText();
		name=names.getText();

		c.add(names);

		ages=new JTextField();
		ages.setBounds(230,100,90,30);
		ages.setFont(f);
		ages.setForeground(Color.black);
		ages.setOpaque(true);
		ages.setBackground(Color.white);
	    age=ages.getText();
	 age=ages.getText();

		c.add(ages);

		bgrps=new JTextField();
		bgrps.setBounds(230,140,90,30);
		bgrps.setFont(f);
		bgrps.setForeground(Color.black);
		bgrps.setOpaque(true);
		bgrps.setBackground(Color.white);
		bgroup=bgrps.getText();
		
		c.add(bgrps);

		emails=new JTextField();
		emails.setBounds(230,190,90,30);
		emails.setFont(f);
		emails.setForeground(Color.black);
		emails.setOpaque(true);
		emails.setBackground(Color.white);
             email=emails.getText();
		c.add(emails);

		mobiles=new JTextField();
		mobiles.setBounds(230,230,90,30);
		mobiles.setFont(f);
		mobiles.setForeground(Color.black);
		mobiles.setOpaque(true);
		mobiles.setBackground(Color.white);
		mobile=mobiles.getText();
		c.add(mobiles);


		unames=new JTextField();
		unames.setBounds(230,266,90,30);
		unames.setFont(f);
		unames.setForeground(Color.black);
		unames.setOpaque(true);
		unames.setBackground(Color.white);
		unames.setText(username);
		c.add(unames);


		pwords=new JTextField();
		pwords.setBounds(230,310,90,30);
		pwords.setFont(f);
		pwords.setForeground(Color.black);
		pwords.setOpaque(true);
		pwords.setBackground(Color.white);
		password=pwords.getText();
		pwords.setText(password);
		c.add(pwords);
	
			
		
	


namer=new JLabel();
namer.setText("Enter Name:");
namer.setBounds(50,50,100,40);
namer.setFont(f);
namer.setForeground(Color.black);
namer.setOpaque(true);
namer.setBackground(Color.white);

c.add(namer);


ager=new JLabel();
ager.setText("Enter age:");
ager.setBounds(50,80,80,70);
ager.setFont(f);
ager.setForeground(Color.black);
ager.setOpaque(true);
ager.setBackground(Color.white);

c.add(ager);

bgrpr=new JLabel();
bgrpr.setText("Enter blood group:");
bgrpr.setBounds(50,120,160,70);
bgrpr.setFont(f);
bgrpr.setForeground(Color.black);
bgrpr.setOpaque(true);
bgrpr.setBackground(Color.white);

c.add(bgrpr);

emailr=new JLabel();
emailr.setText("Enter e-mail:");
emailr.setBounds(50,160,140,70);
emailr.setFont(f);
emailr.setForeground(Color.black);
emailr.setOpaque(true);
emailr.setBackground(Color.white);

c.add(emailr);

mobiler=new JLabel();
mobiler.setText("Enter contact number:");
mobiler.setBounds(50,200,160,70);
mobiler.setFont(f);
mobiler.setForeground(Color.black);
mobiler.setOpaque(true);
mobiler.setBackground(Color.white);

c.add(mobiler);


unamer=new JLabel();
unamer.setText("Enter username:");
unamer.setBounds(50,240,160,70);
unamer.setFont(f);
unamer.setForeground(Color.black);
unamer.setOpaque(true);
unamer.setBackground(Color.white);

c.add(unamer);


pwordr=new JLabel();
pwordr.setText("Enter password:");
pwordr.setBounds(50,290,160,70);
pwordr.setFont(f);
pwordr.setForeground(Color.black);
pwordr.setOpaque(true);
pwordr.setBackground(Color.white);

c.add(pwordr);


register=new JButton();
register.setText("SIGNUP");
register.setBounds(90,500,170,50);
register.setFont(f);
register.setForeground(Color.BLACK);
register.setOpaque(true);
register.setBackground(Color.white);

c.add(register);



register.addActionListener(new ActionListener(){

	@Override
	public void actionPerformed(ActionEvent arg0) {
		menu obj;
		try {
		BufferedWriter fw=new BufferedWriter(new FileWriter("heal.txt"));
			fw.write(names.getText()+" "+ages.getText()+" "+pwords.getText()+" "+unames.getText()+" "+mobiles.getText()+" "+emails.getText()+" "+bgrps.getText());
			fw.close();
			JOptionPane.showMessageDialog(null, "Success!!");
			setVisible(false);
			new signup().setVisible(true);
		}
		
	catch(Exception e){
		JOptionPane.showMessageDialog(null, "ERROR!!!","Error",2);
	}
		dispose();
		menu obj1;
		try {
			obj1 = new menu();
			obj1.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}});
	
}


public static void main(String[] args) throws IOException {
	signup f=new signup();

	f.setVisible(true);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
f.setBounds(300,200,800,800);
f.setTitle("SIGNUP");
f.setBackground(Color.cyan);

}


}
