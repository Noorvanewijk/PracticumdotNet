package Practicum;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener {

	public final static String REGISTER_PRESSED = "REGISTER_PRESSED";
	public final static String LOGIN_PRESSED = "LOGIN_PRESSED";
	
	private	JPanel	panel1;
	private	JPanel	panel2;
	
	public GUI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 287);
		setTitle("Beginscherm");
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		getContentPane().add(mainPanel);
		
		itemTabPanel1();
		itemTabPanel2();

		JTabbedPane tabPane = new JTabbedPane();
		tabPane.addTab( "Login", panel1);
		tabPane.addTab( "Registreer", panel2);
		mainPanel.add(tabPane);
	}
	
	public void itemTabPanel1()
	{
		panel1 = new JPanel();
		panel1.setLayout(null);
		
		JLabel welcome = new JLabel("Hallo, login aub (:");
		welcome.setBounds(170,10,150,60);
		panel1.add(welcome);
		
		JTextField txuser = new JTextField(15);
		txuser.setBounds(140,65,150,20);
		panel1.add(txuser);
		
		JPasswordField pass = new JPasswordField(15);
		pass.setBounds(140,100,150,20);
		panel1.add(pass);
		
		JButton btn1 = new JButton("Login");
		btn1.setBounds(170, 125, 89, 23);
		panel1.add(btn1);
		btn1.addActionListener(this);
		btn1.setActionCommand(LOGIN_PRESSED);
	}

	public void itemTabPanel2()
	{
		panel2 = new JPanel();
		panel2.setLayout(null);
		
		JLabel regi = new JLabel("Geef een username pls");
		regi.setBounds(150,10,150,60);
		panel2.add(regi);
		
		JTextField newuser = new JTextField(15);
		newuser.setBounds(140,65,150,20);
		panel2.add(newuser);
		
		JLabel regi2 = new JLabel("Dan krijg je wachtwoord");
		regi2.setBounds(150,70,150,60);
		panel2.add(regi2);
		
		JButton btn2 = new JButton("Registreer");
		btn2.setBounds(160, 125, 100, 23);
		panel2.add(btn2);
		btn2.addActionListener(this);
		btn2.setActionCommand(REGISTER_PRESSED);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals(REGISTER_PRESSED)) {
			JOptionPane.showMessageDialog(null, "Registratie succesvol!", "Success", 1);
		} else if (e.getActionCommand().equals(LOGIN_PRESSED)) {
			Store store = new Store();
			store.NewScreen();
		}
		
	}
}

