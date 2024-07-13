package textlogin;


	import java.awt.Color;
	import java.awt.Container;
	import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
	import javax.swing.JLabel;
	public class main extends JFrame{
	private Container c;
	private JButton signup,login;
	private JLabel intro;
	private Font f;



	main() throws IOException {
		 c=this.getContentPane();
		 c.setLayout(null);
		 c.setBackground(Color.cyan);
		
		
		 
		 f=new Font("Times New Roman",Font.BOLD,20);
		
		 intro=new JLabel();
		 intro.setText("Welcome to E-HealthCare Service");
		intro.setBounds(140,50,300,80);
		intro.setFont(f);
		intro.setForeground(Color.red);
		intro.setOpaque(true);
		intro.setBackground(Color.white);	
		 c.add(intro);
		 
		 
		 signup=new JButton();
		 signup.setText("SIGNUP");
		 signup.setBounds(90,200,170,50);
		 signup.setFont(f);
		 signup.setForeground(Color.BLACK);
		 signup.setOpaque(true);
		 signup.setBackground(Color.white);		
		 c.add(signup);
		 
		 
		 login=new JButton();
		 login.setText("LOGIN");
		 login.setBounds(300,200,170,50);
		 login.setFont(f);
		 login.setForeground(Color.BLACK);
		 login.setOpaque(true);
		 login.setBackground(Color.white);	
		 c.add(login);
		 
		 login obj=new login();
		 signup obj1=new signup();
		 
		 
		signup.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				signup obj8;
				try {
					obj8 = new signup();
					obj8.setVisible(true);
				} catch (IOException e) {
			
					e.printStackTrace();
				}	
			}		
		});
		 	
		 
		login.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				login obj;
				try {
					obj = new login();
					obj.setVisible(true);
				} catch (Exception e){
					e.printStackTrace();
				}	
			}
		});}
		 	

		public void main(String[] args) throws IOException  {
			main f=new main();
			f.setVisible(true);
			f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setBounds(300,300,600,400);
		f.setTitle("Main Page");
		f.setBackground(Color.cyan);
		}
	}

