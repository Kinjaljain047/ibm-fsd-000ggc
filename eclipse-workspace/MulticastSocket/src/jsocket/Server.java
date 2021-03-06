package jsocket;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

import javax.swing.Action;

public class Server extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Server frame = new Server();
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
	public Server() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnStart = new JButton("start");
		btnStart.setAction(action);
		btnStart.setBounds(164, 30, 89, 23);
		contentPane.add(btnStart);
		
		textField = new JTextField();
		textField.setBounds(167, 85, 151, 51);
		contentPane.add(textField);
		textField.setColumns(10);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Start");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			try {
				 int portNumber=6064;
				   
				   MulticastSocket serverMulticastSocket= new MulticastSocket(portNumber);
				   
				   System.out.println("MulticastSocket is created...");
			       
			       // Determine the IP address of a host, given the host name
			       InetAddress group =
			               InetAddress.getByName("225.0.0.1");
			       
			       // getByName- returns IP address of given host
			       serverMulticastSocket.joinGroup(group);
			       System.out.println("joinGroup method is called...");
			       boolean infinite = true;
			       
			       // Continually receives data and prints them 
			       while(infinite) {
			           byte buf[] = new byte[1024];
			           DatagramPacket data =
			                   new DatagramPacket(buf, buf.length);
			           serverMulticastSocket.receive(data);
			           String msg =
			                   new String(data.getData()).trim();
			           System.out.println("Message received from client = " + msg);
			           textField.setText(msg);
			           BufferedWriter writer= new BufferedWriter(new FileWriter("outputFile.txt"));
			           writer.write(group.getByName("225.0.0.1")+ " "+ msg);
			           writer.close();
			       }
			       serverMulticastSocket.close();
			   }catch(IOException e2) {
				   e2.printStackTrace();
			}
		}
	}
}
