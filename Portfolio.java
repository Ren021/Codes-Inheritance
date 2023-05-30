import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class Portfolio extends JFrame{

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Portfolio frame = new Portfolio();
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
	public Portfolio() {
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(320, 180, 655, 380);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Create a text field for email input
		textField = new JTextField();
		textField.setBounds(51, 121, 239, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		// Label for email field
		JLabel txtEmail = new JLabel("Email:");
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtEmail.setForeground(Color.BLACK);
		txtEmail.setBounds(51, 99, 61, 22);
		contentPane.add(txtEmail);
		
		// Label for password field
		JLabel txtPassword = new JLabel("Password:");
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPassword.setForeground(Color.BLACK);
		txtPassword.setBounds(52, 168, 88, 13);
		contentPane.add(txtPassword);
		
		// Label for account title
		JLabel txtPersonalAcc = new JLabel("Personal Account");
		txtPersonalAcc.setFont(new Font("Agency FB", Font.PLAIN, 30));
		txtPersonalAcc.setForeground(Color.BLACK);
		txtPersonalAcc.setBounds(31, 29, 239, 37);
		contentPane.add(txtPersonalAcc);
		
		// Button for login
		JButton Login = new JButton("Login");
		Login.setForeground(Color.LIGHT_GRAY);
		Login.setBackground(Color.BLACK);
		Login.setFont(new Font("Agency FB", Font.PLAIN, 18));
		Login.setBounds(51, 246, 108, 27);
		contentPane.add(Login);
		
		// Create a password field for password input
		passwordField = new JPasswordField();
		passwordField.setBounds(51, 182, 239, 37);
		contentPane.add(passwordField);
		
		// Label for login design 1
		JLabel LoginDesign1Label = new JLabel("");
		LoginDesign1Label.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\513c1e831d4ea3ee341799c05c18131f-removebg-preview (1).png"));
		LoginDesign1Label.setBounds(471, 0, 182, 176);
		contentPane.add(LoginDesign1Label);
		
		// Label for login design 2
		JLabel LoginDesign2Label = new JLabel("");
		LoginDesign2Label.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\214-2145041_corner-designs-cliparts-simple-decorative-line-border-removebg-preview (1) (1).png"));
		LoginDesign2Label.setBounds(5, 153, 285, 208);
		contentPane.add(LoginDesign2Label);
		
		// Label for login picture
		JLabel LoginPicLabel = new JLabel("");
		LoginPicLabel.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\337484949_980093932924782_9026805197294577699_n (3).jpg"));
		LoginPicLabel.setBounds(388, 61, 193, 188);
		contentPane.add(LoginPicLabel);
		
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Perform login action
				
				MainPage jf2 = new MainPage();
				jf2.show();
				dispose(); // Close the current frame
			}
				
			
		});
	}
	
}

