import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.ImageIcon;

public class AboutmePage extends Portfolio {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public AboutmePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 639);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Button for going back to the main page
		JButton AboutmeBackButton = new JButton("Back");
		AboutmeBackButton.setForeground(Color.LIGHT_GRAY);
		AboutmeBackButton.setBackground(Color.BLACK);
		AboutmeBackButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		AboutmeBackButton.setBounds(674, 472, 149, 48);
		contentPane.add(AboutmeBackButton);
		
		// Label for displaying the name
		JLabel NameLabel = new JLabel("Name: Renche Isaiah C. Dalida");
		NameLabel.setFont(new Font("Agency FB", Font.PLAIN, 23));
		NameLabel.setForeground(new Color(255, 255, 255));
		NameLabel.setBounds(229, 161, 236, 48);
		contentPane.add(NameLabel);
		
		// Label for displaying the age
		JLabel AgeLabel = new JLabel("Age: 20 Years old");
		AgeLabel.setFont(new Font("Agency FB", Font.PLAIN, 23));
		AgeLabel.setForeground(new Color(255, 255, 255));
		AgeLabel.setBounds(229, 205, 181, 36);
		contentPane.add(AgeLabel);
		
		// Label for displaying the birthdate
		JLabel BirthdateLabel = new JLabel("Birthdate: March 21, 2003");
		BirthdateLabel.setFont(new Font("Agency FB", Font.PLAIN, 23));
		BirthdateLabel.setForeground(new Color(255, 255, 255));
		BirthdateLabel.setBounds(229, 255, 206, 24);
		contentPane.add(BirthdateLabel);
		
		// Text area for displaying the introduction
		JEditorPane IntroductionEditorPane = new JEditorPane();
		IntroductionEditorPane.setEditable(false);
		IntroductionEditorPane.setForeground(Color.WHITE);
		IntroductionEditorPane.setFont(new Font("Agency FB", Font.PLAIN, 23));
		IntroductionEditorPane.setBackground(Color.GRAY);
		IntroductionEditorPane.setText("       Hi, I'm Renche Isaiah C. Dalida you can call me sai/saia, I'm the youngest of the siblings and I live in Bacoor, Cavite. The course I chose is BSIT - MULTI MEDIA ARTS AND ANIMATION and I am studying at the National University - Manila. I chose this course because I want to learn more, especially in the design and animations that can be \r\ntaught to me.");
		IntroductionEditorPane.setBounds(37, 339, 767, 123);
		contentPane.add(IntroductionEditorPane);
		
		// Label for displaying the profile picture
		JLabel PicLabel = new JLabel("");
		PicLabel.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\339821106_568795795079890_5705703222917606223_n (3).jpg"));
		PicLabel.setBounds(45, 94, 272, 240);
		contentPane.add(PicLabel);
		
		// Label for decorative design
		JLabel Design1Label = new JLabel("");
		Design1Label.setFont(new Font("Agency FB", Font.PLAIN, 15));
		Design1Label.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\pngtree-golden-line-png-image_2455685-removebg-preview (1) (1).png"));
		Design1Label.setBounds(44, 47, 819, 72);
		contentPane.add(Design1Label);
		
		// Label for the heading "About me"
		JLabel AboutmeTextLabel = new JLabel("About me");
		AboutmeTextLabel.setFont(new Font("Agency FB", Font.PLAIN, 50));
		AboutmeTextLabel.setBounds(341, 10, 236, 48);
		contentPane.add(AboutmeTextLabel);
		
		// Label for displaying the email address
		JLabel EmailLabel = new JLabel("Email: isaiahdalida@gmail.com");
		EmailLabel.setFont(new Font("Agency FB", Font.PLAIN, 23));
		EmailLabel.setForeground(Color.WHITE);
		EmailLabel.setBounds(490, 173, 242, 24);
		contentPane.add(EmailLabel);
		
		// Label for displaying the contact number
		JLabel ContactLabel = new JLabel("Contact: 09923105471");
		ContactLabel.setFont(new Font("Agency FB", Font.PLAIN, 23));
		ContactLabel.setForeground(Color.WHITE);
		ContactLabel.setBounds(490, 205, 218, 36);
		contentPane.add(ContactLabel);
		AboutmeBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Create an instance of the MainPage class	
				MainPage jf2 = new MainPage();
				jf2.show(); // Show the main page
				dispose(); // Close the current frame
			}

		});
	}
}
