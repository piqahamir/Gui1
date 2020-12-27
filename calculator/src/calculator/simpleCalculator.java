package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class simpleCalculator {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					simpleCalculator window = new simpleCalculator();
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
	public simpleCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 506, 327);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(47, 34, 96, 19);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(319, 34, 96, 19);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					ans = num1+num2;
					textFieldAns.setText(Integer.toString(ans));
					
				} catch(Exception c) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number:");
				}
			}
		});
		btnNewButton.setBounds(101, 97, 108, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MINUS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					ans = num1-num2;
					textFieldAns.setText(Integer.toString(ans));
					
				} catch(Exception c1) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number:");
				}
			}
		});
		btnNewButton_1.setBounds(300, 97, 101, 19);
		frame.getContentPane().add(btnNewButton_1);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(251, 229, 96, 19);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("The Answer is");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		lblNewLabel.setBounds(116, 230, 125, 16);
		frame.getContentPane().add(lblNewLabel);
		
		btnNewButton_2 = new JButton("MULTIPLY");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					ans = num1*num2;
					textFieldAns.setText(Integer.toString(ans));
					
				} catch(Exception c2) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number:");
				}
			}
		});
		btnNewButton_2.setBounds(101, 155, 108, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("DIVIDE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					ans = num1/num2;
					textFieldAns.setText(Integer.toString(ans));
					
				} catch(Exception c3) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number:");
				}
			}
		});
		btnNewButton_3.setBounds(300, 155, 101, 21);
		frame.getContentPane().add(btnNewButton_3);
	}
}
