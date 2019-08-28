package networking3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

import javax.swing.Action;

public class Employeedata extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final Action action = new SwingAction();
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employeedata frame = new Employeedata();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Employeedata() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterId = new JLabel("Enter id");
		lblEnterId.setBounds(30, 25, 46, 14);
		contentPane.add(lblEnterId);
		
		textField = new JTextField();
		textField.setBounds(264, 22, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnGetData = new JButton("Get data");
		btnGetData.setAction(action);
		btnGetData.setBounds(154, 67, 89, 23);
		contentPane.add(btnGetData);
		
		textField_1 = new JTextField();
		textField_1.setBounds(45, 168, 365, 41);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Load data");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
Socket client = null;
			
			int portnumber=7022;
		
			 try {
	                int msg ;
	                
	                
	                
	                client = new Socket(InetAddress.getLocalHost(), portnumber);
	                System.out.println("Client socket is created " + client);
	                
	           
	                OutputStream clientOut = client.getOutputStream();
	                PrintWriter pw = new PrintWriter(clientOut, true);
	                
	                
	                InputStream clientIn = client.getInputStream();
	                BufferedReader br = new BufferedReader(new
	                        InputStreamReader(clientIn));
	                
	               
	                BufferedReader stdIn = new BufferedReader(new
	                        InputStreamReader(System.in));
	                
	                int id= Integer.parseInt(textField.getText());
	                pw.println(id);
	               //System.out.println("Message returned from the server = " + br.readLine());
	                textField_1.setText(br.readLine());
	                
	                
	                pw.close();
	                br.close();
	                client.close();
	                
	               
	             
	                
	            } catch (IOException ie) {
	                System.out.println("I/O error - Start server and turn off Firewall" + ie);
	            }
		}
	}
		
		
	}

