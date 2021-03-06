package jsocket;

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
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

import javax.swing.Action;

public class MultiSocket extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final Action action = new SwingAction();
	private JButton btnLoadData;
	private final Action action_1 = new SwingAction_1();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultiSocket frame = new MultiSocket();
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
	public MultiSocket() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterMessage = new JLabel("enter message");
		lblEnterMessage.setBounds(31, 26, 87, 40);
		contentPane.add(lblEnterMessage);
		
		textField = new JTextField();
		textField.setBounds(284, 36, 95, 51);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSend = new JButton("send");
		btnSend.setAction(action);
		btnSend.setBounds(160, 126, 89, 23);
		contentPane.add(btnSend);
		
		btnLoadData = new JButton("load data");
		btnLoadData.setAction(action_1);
		btnLoadData.setBounds(284, 126, 89, 23);
		contentPane.add(btnLoadData);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Send");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			try {
				        
				        
				        // Default port number we are going to use
				        int portnumber = 6064;
				       
				        
				        // Create a MulticastSocket
				        MulticastSocket chatMulticastSocket = new MulticastSocket(portnumber);
				        
				        // Determine the IP address of a host, given the host name
				        InetAddress group =
				                InetAddress.getByName("225.0.0.1");
				        
				        // Joins a multicast group
				        chatMulticastSocket.joinGroup(group);
				        
				        // Prompt a user to enter a message
				        String msg = "";
				        //System.out.println("Type a message for the server:");
				        BufferedReader br =
				                new BufferedReader(new InputStreamReader(System.in));
				        msg = textField.getText();
				        
				        
				        // Send the message to Multicast address
				        DatagramPacket data = new
				                DatagramPacket(msg.getBytes(), 0,
				                msg.length(), group, portnumber);
				        chatMulticastSocket.send(data);
				        
				        // Close the socket
				        chatMulticastSocket.close();
				    }catch(IOException e1) {
				    	e1.printStackTrace();
				    }
		}
		
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Load");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			
			
		}
	}
}
