package Practicum;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Store extends JFrame implements ActionListener {

	public final static String BUY_PRESSED = "BUY_PRESSED";
	public final static String REFRESH_PRESSED = "REFRESH_PRESSED";

	private JPanel panel4;
	private JPanel panel3;
	
	public Store() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		JPanel p = new JPanel();
		setContentPane(p);
		p.setLayout(new GridLayout(1, 2));
		leftPanel();
		rightPanel();

		p.add(panel4);
		p.add(panel3);
		setSize(700, 350);
		setVisible(true);
	}

	public void leftPanel() {
		panel4 = new JPanel();
		panel4.setLayout(null);

		panel4.setSize(350, 350);

		JLabel inventory = new JLabel("Inventory:");
		inventory.setBounds(40, 10, 100, 100);
		panel4.add(inventory);

		JLabel money = new JLabel("Money:");
		money.setBounds(40, 140, 100, 100);
		panel4.add(money);

		DefaultListModel<String> listModel = new DefaultListModel<String>();
		JList<String> list = new JList<String>(listModel);
		JScrollPane scroll = new JScrollPane(list);
		scroll.setBounds(40, 80, 250, 100);
		panel4.add(scroll);
	}

	public void rightPanel() {
		panel3 = new JPanel();
		panel3.setLayout(null);
		panel4.setSize(350, 350);

		JLabel winkel = new JLabel("Winkel:");
		winkel.setBounds(40, 10, 100, 100);
		panel3.add(winkel);
		
		JButton btn3 = new JButton("Refresh");
		btn3.setBounds(210, 185, 80, 23);
		panel3.add(btn3);
		btn3.addActionListener(this);
		btn3.setActionCommand(REFRESH_PRESSED);
		
		JButton btn4 = new JButton("Buy");
		btn4.setBounds(120, 185, 80, 23);
		panel3.add(btn4);
		btn4.addActionListener(this);
		btn4.setActionCommand(BUY_PRESSED);

		DefaultListModel<String> listModel = new DefaultListModel<String>();
		JList<String> list = new JList<String>(listModel);
		JScrollPane scroll = new JScrollPane(list);
		scroll.setBounds(40, 80, 250, 100);
		panel3.add(scroll);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals(REFRESH_PRESSED)) {
			JOptionPane.showMessageDialog(null, "Test", "Success", 1);
		} else if (e.getActionCommand().equals(BUY_PRESSED)) {
			// listModel.addElement("new");
		}

	}

	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Store window = new Store();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
