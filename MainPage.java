import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MainPage extends Portfolio {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public MainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 639);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Label for the heading
		JLabel HiImSaiaLabel = new JLabel("Hi, Im Saia");
		HiImSaiaLabel.setForeground(Color.WHITE);
		HiImSaiaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		HiImSaiaLabel.setFont(new Font("Agency FB", Font.PLAIN, 40));
		HiImSaiaLabel.setBounds(318, 41, 217, 71);
		contentPane.add(HiImSaiaLabel);
		
		// Button for About Me page
		JButton AboutmeBtn = new JButton("About me");
		AboutmeBtn.setForeground(Color.LIGHT_GRAY);
		AboutmeBtn.setBackground(Color.BLACK);
		AboutmeBtn.setFont(new Font("Agency FB", Font.PLAIN, 30));
		AboutmeBtn.setBounds(318, 122, 217, 70);
		contentPane.add(AboutmeBtn);
		AboutmeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AboutmePage jf3 = new AboutmePage(); // Create an instance of the AboutmePage class
				jf3.show(); // Show the About Me page
				dispose(); // Close the current frame
			}
				
			
		});
		
		// Button for Skills page
		JButton SkillsBtn = new JButton("Skills");
		SkillsBtn.setForeground(Color.LIGHT_GRAY);
		SkillsBtn.setBackground(Color.BLACK);
		SkillsBtn.setFont(new Font("Agency FB", Font.PLAIN, 30));
		SkillsBtn.setBounds(318, 220, 217, 70);
		contentPane.add(SkillsBtn);
		SkillsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SkillsPage jf4 = new SkillsPage(); // Create an instance of the SkillsPage class
				jf4.show(); // Show the Skills page
				dispose(); // Close the current frame
			}

		});
		
		// Button for Hobbies page
		JButton HobbiesBtn = new JButton("Hobbies");
		HobbiesBtn.setForeground(Color.LIGHT_GRAY);
		HobbiesBtn.setBackground(Color.BLACK);
		HobbiesBtn.setFont(new Font("Agency FB", Font.PLAIN, 30));
		HobbiesBtn.setBounds(318, 318, 217, 70);
		contentPane.add(HobbiesBtn);
		HobbiesBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HobbiesPage jf5 = new HobbiesPage();// Create an instance of the HobbiesPage class
				jf5.show(); // Show the Hobbies page
				dispose(); // Close the current frame
			}

		});
		
		// Button for Works page
		JButton WorksBtn = new JButton("Works");
		WorksBtn.setForeground(Color.LIGHT_GRAY);
		WorksBtn.setBackground(Color.BLACK);
		WorksBtn.setFont(new Font("Agency FB", Font.PLAIN, 30));
		WorksBtn.setBounds(318, 415, 217, 70);
		contentPane.add(WorksBtn);
		
		// Label for the border image
		JLabel BorderLabel = new JLabel("");
		BorderLabel.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\images-removebg-preview (3).png"));
		BorderLabel.setBounds(0, 10, 834, 587);
		contentPane.add(BorderLabel);
		WorksBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				WorksPage jf6 = new WorksPage(); // Create an instance of the WorksPage class
				jf6.show(); // Show the Works page
				dispose(); // Close the current frame
			}


		});
		
	}
}
