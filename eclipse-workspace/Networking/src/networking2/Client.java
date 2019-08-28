package networking2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
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
import javax.swing.JTextArea;

public class Client extends JFrame {

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
					Client frame = new Client();
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
	public Client() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterNumber = new JLabel("enter number");
		lblEnterNumber.setBounds(30, 30, 118, 29);
		contentPane.add(lblEnterNumber);
		
		textField = new JTextField();
		textField.setBounds(262, 34, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnGetFactorial = new JButton("get factorial");
		btnGetFactorial.setAction(action);
		btnGetFactorial.setBounds(157, 92, 89, 23);
		contentPane.add(btnGetFactorial);
		
		textField_1 = new JTextField();
		textField_1.setBounds(168, 138, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Socket client = null;
			
			int portnumber=6034;
		
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
	                
	                msg= Integer.parseInt(textField.getText());
	                pw.println(msg);
	               // System.out.println("Message returned from the server = " + br.readLine());
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

